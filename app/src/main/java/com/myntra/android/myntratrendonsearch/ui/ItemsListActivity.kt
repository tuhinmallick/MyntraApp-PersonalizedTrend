package com.myntra.android.myntratrendonsearch.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myntra.android.myntratrendonsearch.R


class ItemsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_list)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}