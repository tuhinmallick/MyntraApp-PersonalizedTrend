package com.myntra.android.myntratrendonsearch.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputLayout
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.util.Constants

class phoneNumberFragment : Fragment() {
    lateinit var textInputLayout: TextInputLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_phone_number, container, false)
        textInputLayout = view.findViewById(R.id.tilPhoneNumber)
        val submit = view.findViewById<Button>(R.id.btnGetCode)
        submit.setOnClickListener {
            val phn_no = textInputLayout.editText!!.text.toString()
            if (phn_no.length != 10) {
                textInputLayout.error = "Valid number is required"
                textInputLayout.requestFocus()
            } else {
                val bundle = Bundle()
                bundle.putString(Constants.PHONE_NUMBER, phn_no)
                val verifyFragment = VerifyFragment()
                verifyFragment.arguments = bundle
                val fr = activity!!.supportFragmentManager.beginTransaction()
                fr.replace(R.id.container, verifyFragment)
                fr.addToBackStack(null).commit()
            }
        }
        return view
    }
}