package com.myntra.android.myntratrendonsearch.ui.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.Outfit
import com.myntra.android.myntratrendonsearch.ui.trending.OutfitAdapter
import kotlinx.android.synthetic.main.activity_outfit.*

class OutfitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outfit)
        initRecycler()

    }

    private fun initData(): Outfit? {
        return null
    }

    private fun initRecycler() {
        rvOutfitsAct.visibility = View.VISIBLE
        pbOutfitAct.visibility = View.GONE
//        rvOutfitsAct.adapter = OutfitAdapter(this)
        rvOutfitsAct.layoutManager = LinearLayoutManager(this)
    }

}