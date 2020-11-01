package com.myntra.android.myntratrendonsearch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.util.Constants
import kotlinx.android.synthetic.main.fragment_trending.view.*

class TrendingFragment(val item: TrendingProduct) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_trending, container, false)
        v.rvTrending.layoutManager = LinearLayoutManager(context)
        v.rvTrending.adapter = TrendingPostsAdapter(context!!, Constants.postList1)
        return v
    }

}