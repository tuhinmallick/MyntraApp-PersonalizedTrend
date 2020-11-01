package com.myntra.android.myntratrendonsearch.auth

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.alimuzaffar.lib.pin.PinEntryEditText
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.TaskExecutors
import com.google.firebase.FirebaseException
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken
import com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.main.MainActivity
import com.myntra.android.myntratrendonsearch.util.Constants
import java.util.concurrent.TimeUnit


class VerifyFragment : Fragment() {
    private var verificationId: String? = null
    private var mAuth: FirebaseAuth? = null
    private var phoneNumber: String? = null
    private lateinit var pinEntryEditText: PinEntryEditText
    private val mCallBack: OnVerificationStateChangedCallbacks =
        object : OnVerificationStateChangedCallbacks() {
            override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
                val code = phoneAuthCredential.smsCode
                if (code != null) {
                    pinEntryEditText.setText(code)
                    verifyCode(code)
                }
            }

            override fun onVerificationFailed(e: FirebaseException) {
                Toast.makeText(context, "Error : " + e.message, Toast.LENGTH_LONG).show()
            }

            override fun onCodeSent(s: String, forceResendingToken: ForceResendingToken) {
                super.onCodeSent(s, forceResendingToken)
                verificationId = s
                Toast.makeText(context, "Verification Code Sent", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAuth = FirebaseAuth.getInstance()
    }

    private fun verifyCode(code: String) {
        val credential = PhoneAuthProvider.getCredential(verificationId!!, code)
        signInWithCredential(credential)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_verify, container, false)
        val verify = view.findViewById<Button>(R.id.btnVerify)
        pinEntryEditText = view.findViewById(R.id.etCode)
        val bundle = arguments
        if (bundle != null) {
            phoneNumber = bundle.getString(Constants.PHONE_NUMBER)
            val phn_no = "+91$phoneNumber"
            sendVerificationCode(phn_no)
        }
        verify.setOnClickListener(View.OnClickListener {
            pinEntryEditText.isError = false
            val code = pinEntryEditText.text.toString()
            if (code.isEmpty() || code.length < 6) {
                pinEntryEditText.isError = true
                pinEntryEditText.requestFocus()
                return@OnClickListener
            }
            verifyCode(code)
        })
        return view
    }

    private fun sendVerificationCode(number: String) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
            number,
            60,
            TimeUnit.SECONDS,
            TaskExecutors.MAIN_THREAD,
            mCallBack
        )
    }

    private fun signInWithCredential(credential: PhoneAuthCredential) {
        mAuth!!.signInWithCredential(credential)
            .addOnCompleteListener { task: Task<AuthResult?> ->
                val pref =
                    activity!!.getPreferences(Context.MODE_PRIVATE)
                val id = pref.getString("user", null)
                if (task.isSuccessful) {
                    startActivity(Intent(context, MainActivity::class.java))
                    activity!!.finish()
                }
                if (task.isSuccessful && id == "admin") {
                    Toast.makeText(context, "admin", Toast.LENGTH_SHORT).show()
//                    startActivity(Intent(context, SurveillanceActivity::class.java))
//                    activity!!.finish()
                }
            }
    }
}