package com.myntra.android.myntratrendonsearch.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.util.Constants

class ItemsListAdapter(val context: Context) : RecyclerView.Adapter<ItemsListAdapter.ViewHolder>() {
    val trendingWear = Constants.trendingWear

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivInfluencerImage)
        val influencerName: TextView = itemView.findViewById(R.id.tvInflName)
        val productName: TextView = itemView.findViewById(R.id.productName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.trending_list_item, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(trendingWear[position].influencerList[0].image).into(holder.imageView)
        holder.influencerName.text = trendingWear[position].influencerList[0].name
        holder.productName.text = trendingWear[position].productName
    }

    override fun getItemCount(): Int {
        return trendingWear.size
    }
}