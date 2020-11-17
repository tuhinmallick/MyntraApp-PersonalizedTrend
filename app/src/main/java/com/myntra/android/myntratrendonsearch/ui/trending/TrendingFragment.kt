package com.myntra.android.myntratrendonsearch.ui.trending

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.TrendingProduct
import com.myntra.android.myntratrendonsearch.util.Constants
import kotlinx.android.synthetic.main.fragment_trending.view.*

class TrendingFragment(
    val item: TrendingProduct,
    val type: String
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_trending, container, false)
        v.rvTrending.layoutManager = LinearLayoutManager(context)
        val handler = Handler()
        handler.postDelayed({
            v.pb.visibility = View.GONE
            v.rvTrending.visibility = View.VISIBLE
            v.loader.visibility = View.GONE
            if (type == "women")
                v.rvTrending.adapter = TrendingPostsAdapter(context!!, Constants.postList1)
            else
                v.rvTrending.adapter = TrendingPostsAdapter(context!!, Constants.postList2)

        }, 100)

        return v
    }

}