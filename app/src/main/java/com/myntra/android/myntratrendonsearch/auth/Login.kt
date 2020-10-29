package com.myntra.android.myntratrendonsearch.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myntra.android.myntratrendonsearch.R

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction().replace(R.id.container, LoginOption()).commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        moveTaskToBack(true)
    }
}