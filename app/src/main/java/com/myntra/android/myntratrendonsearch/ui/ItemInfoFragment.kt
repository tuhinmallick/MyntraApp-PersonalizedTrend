package com.myntra.android.myntratrendonsearch.ui

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.myntra.android.myntratrendonsearch.R
import kotlinx.android.synthetic.main.fragment_item_info.view.*
import kotlin.math.abs


class ItemInfoFragment(val item: TrendingProduct) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_item_info, container, false)
        val colToolbar = v.findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
//        colToolbar.setCollapsedTitleTextColor(resources.getColor(R.color.colorTitle))
        colToolbar.setExpandedTitleColor(Color.TRANSPARENT)
        v.toolbar.setNavigationOnClickListener { activity!!.onBackPressed() }
        val appBarLayout: AppBarLayout = v.findViewById(R.id.app_bar_layout)
        appBarLayout.addOnOffsetChangedListener(OnOffsetChangedListener { appBarLayout1: AppBarLayout, verticalOffset: Int ->
            when {
                abs(verticalOffset) == appBarLayout1.totalScrollRange -> {
                    // If collapsed, then do this
                    colToolbar.title = "SASSAFRAS Women Maroon Solid Semi-Sheer Tiered Maxi Top"
                }
                verticalOffset == 0 -> {
                    // If expanded, then do this
                }
                else -> {
                    // Somewhere in between
                    // Do according to your requirement
                }
            }
        })
        v.addcart.setOnClickListener {
            v.pb.visibility = View.VISIBLE
            val handler = Handler()
            handler.postDelayed({
                Toast.makeText(context, "Item added to cart", Toast.LENGTH_SHORT).show()
                v.addcart.text = "GO TO CART"
                v.pb.visibility = View.GONE
            }, 800)
        }
        v.buynow.setOnClickListener {
            v.pb.visibility = View.VISIBLE
            val handler = Handler()
            handler.postDelayed({
                Toast.makeText(context, "Added to Buying list", Toast.LENGTH_SHORT).show()
                v.pb.visibility = View.GONE
            }, 800)
        }

        return v
    }
}