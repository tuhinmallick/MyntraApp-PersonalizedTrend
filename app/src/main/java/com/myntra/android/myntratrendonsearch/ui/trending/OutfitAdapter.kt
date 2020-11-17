package com.myntra.android.myntratrendonsearch.ui.trending

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.Outfit

class OutfitAdapter(private val context: Context, private val outfit: Outfit) :
    RecyclerView.Adapter<OutfitAdapter.OutfitViewHolder>() {
    class OutfitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutfitViewHolder {
        return OutfitViewHolder(
            LayoutInflater.from(context).inflate(R.layout.outfit_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: OutfitViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return outfit.list.size
    }
}