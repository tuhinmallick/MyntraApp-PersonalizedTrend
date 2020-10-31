package com.myntra.android.myntratrendonsearch.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.myntra.android.myntratrendonsearch.R
import kotlinx.android.synthetic.main.activity_items_list.*


class ItemsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_list)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvInventory.layoutManager = LinearLayoutManager(this)
        rvInventory.adapter = ItemsListAdapter(this )
    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}