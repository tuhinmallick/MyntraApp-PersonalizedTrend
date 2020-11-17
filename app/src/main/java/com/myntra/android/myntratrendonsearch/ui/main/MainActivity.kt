package com.myntra.android.myntratrendonsearch.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.auth.Login

class MainActivity : AppCompatActivity() {
    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> selectedFragment = HomeFragment()
                R.id.nav_categories -> selectedFragment = CategoriesFragment()
                R.id.nav_outfit -> selectedFragment = OutfitFragment()
                R.id.nav_profile -> selectedFragment = ProfileFragment()
            }
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                selectedFragment!!
            ).commit()
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
            Toast.makeText(
                this,
                FirebaseAuth.getInstance().currentUser!!.phoneNumber,
                Toast.LENGTH_SHORT
            ).show()
        }
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                HomeFragment()
            ).commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_search -> {
                return true
            }
            R.id.nav_wishlist -> {
                return true
            }
            R.id.nav_cart -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        if (menu != null)
            inflater.inflate(R.menu.menu_home, menu)
        return true
    }
}