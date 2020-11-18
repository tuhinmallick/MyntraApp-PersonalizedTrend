package com.myntra.android.myntratrendonsearch.ui.trending

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.TrendingProduct
import com.myntra.android.myntratrendonsearch.util.DataProcessor
import com.myntra.android.myntratrendonsearch.util.FunctionUtils
import kotlinx.android.synthetic.main.fragment_item_info.view.*
import kotlin.math.abs


class ItemInfoFragment(val item: TrendingProduct) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_item_info, container, false)
        val colToolbar = v.findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        colToolbar.setExpandedTitleColor(Color.TRANSPARENT)
        v.toolbar.setNavigationOnClickListener { activity!!.onBackPressed() }
        val appBarLayout: AppBarLayout = v.findViewById(R.id.app_bar_layout)
        appBarLayout.addOnOffsetChangedListener(OnOffsetChangedListener { appBarLayout1: AppBarLayout, verticalOffset: Int ->
            when {
                abs(verticalOffset) == appBarLayout1.totalScrollRange -> {
                    // If collapsed, then do this
                    colToolbar.title = item.productName
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
        Glide.with(context!!).load(item.productImage).into(v.item_image)
        v.title.text = item.productName
        v.price.text = FunctionUtils().getRandomNumber(799, 2000).toString()
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

    override fun onResume() {
        val size = DataProcessor.getStr(context!!, "sizeDetails")
        if (size != "DNF") {
            showAlert()
        }
        super.onResume()
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(requireContext())
        //set title for alert dialog
        builder.setTitle("Size Predicted")
        //set message for alert dialog
        builder.setMessage("LARGE size predicted according to your \n1. Collar Size \n2. Chest Size \n3. Waist \n4. Inside Leg \n5. Chest Depth")
        builder.setIcon(android.R.drawable.ic_dialog_alert)
        //performing positive action
        builder.setPositiveButton("Ok") { _, _ ->
            DataProcessor.setStr(context!!, "sizeDetails", "DNF")
        }

        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

    fun fromHtml(html: String?): Spanned? {
        return if (html == null) {
            // return an empty spannable if the html is null
            SpannableString("")
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            // FROM_HTML_MODE_LEGACY is the behaviour that was used for versions below android N
            // we are using this flag to give a consistent behaviour
            Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(html)
        }
    }

}