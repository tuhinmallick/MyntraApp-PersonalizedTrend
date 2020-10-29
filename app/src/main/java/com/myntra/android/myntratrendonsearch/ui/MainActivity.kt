package com.myntra.android.myntratrendonsearch.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.auth.Login

class MainActivity : AppCompatActivity() {
    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
        var selectedFragment: Fragment? = null
        when (item.itemId) {
            R.id.nav_home -> selectedFragment = HomeFragment()
            R.id.nav_doc -> selectedFragment = HomeFragment()
            R.id.nav_favorites -> {
                selectedFragment = HomeFragment()
            }
            R.id.nav_media -> selectedFragment = HomeFragment()
            R.id.nav_search -> selectedFragment = HomeFragment()
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                selectedFragment!!).commit()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)
        val pref = getPreferences(MODE_PRIVATE)
        val id = pref.getString("user", null)
        if (FirebaseAuth.getInstance().currentUser == null) {
            startActivity(Intent(this, Login::class.java))
            finish()
        } else {
            Toast.makeText(this, FirebaseAuth.getInstance().currentUser!!.phoneNumber, Toast.LENGTH_SHORT).show()
        }
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                    HomeFragment()).commit()
        }
    }
}