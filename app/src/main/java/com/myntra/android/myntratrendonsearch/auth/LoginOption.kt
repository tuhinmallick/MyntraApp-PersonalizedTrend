package com.myntra.android.myntratrendonsearch.auth

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.myntra.android.myntratrendonsearch.R


class LoginOption : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_option, container, false)
        val user = view.findViewById<Button>(R.id.btn_user)
        val admin = view.findViewById<Button>(R.id.btn_admin)
        admin.setOnClickListener {
            val preferences = activity!!.getPreferences(Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("user", "admin")
            editor.apply()
            val phoneNumberFragment = phoneNumberFragment()
            activity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.container, phoneNumberFragment).addToBackStack(null).commit()
        }
        user.setOnClickListener {
            val phoneNumberFragment = phoneNumberFragment()
            activity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.container, phoneNumberFragment).addToBackStack(null).commit()
        }
        return view
    }
}