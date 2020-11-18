package com.myntra.android.myntratrendonsearch.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.trending.TryItemActivity
import com.myntra.android.myntratrendonsearch.util.DataProcessor
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_profile, container, false)
        (activity as AppCompatActivity).supportActionBar?.title = "Profile"
        v.clOutfit.setOnClickListener { startActivity(Intent(context, TryItemActivity::class.java)) }
        v.clSize.setOnClickListener { startActivity(Intent(context, OutfitActivity::class.java)) }
        return v
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(requireContext())
        //set title for alert dialog
        builder.setTitle("Size Predicted")
        //set message for alert dialog
        builder.setMessage("LARGE size predicted according to your \n1. Collar Size \n2. Chest Size \n3. Waist \n4. Inside Leg \n5. Chest Depth ")
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

    override fun onResume() {
        val size = DataProcessor.getStr(context!!, "sizeDetails")
        if (size != "DNF") {
            showAlert()
        }
        super.onResume()
    }
}