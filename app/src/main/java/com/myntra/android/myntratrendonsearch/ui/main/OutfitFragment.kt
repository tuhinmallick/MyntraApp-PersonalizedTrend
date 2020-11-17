package com.myntra.android.myntratrendonsearch.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.Outfit
import com.myntra.android.myntratrendonsearch.ui.trending.OutfitAdapter
import kotlinx.android.synthetic.main.fragment_outfit.*

class OutfitFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_outfit, container, false)

        initData()?.let { initRecycler(it) }
        return v
    }

    private fun initData(): Outfit? {
        return null
    }

    private fun initRecycler(outfit: Outfit) {
        rvOutfits.visibility = View.VISIBLE
        pbOutfit.visibility = View.GONE
        rvOutfits.adapter = OutfitAdapter(context!!, outfit)
        rvOutfits.layoutManager = LinearLayoutManager(context)
    }

}