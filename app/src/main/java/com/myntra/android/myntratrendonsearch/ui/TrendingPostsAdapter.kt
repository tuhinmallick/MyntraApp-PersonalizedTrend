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

class TrendingPostsAdapter(val context: Context, val instaPosts: List<InstaPost>) :
    RecyclerView.Adapter<TrendingPostsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById<ImageView>(R.id.image)
        val text: TextView = itemView.findViewById<TextView>(R.id.title)
        val websiteId: TextView = itemView.findViewById<TextView>(R.id.website_id)
        val link: TextView = itemView.findViewById<TextView>(R.id.link)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflated = LayoutInflater.from(context).inflate(R.layout.insta_item, parent, false)
        return ViewHolder(inflated)
    }

    override fun getItemCount(): Int {
        return instaPosts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(instaPosts[position].image).into(holder.image)
        holder.text.text = instaPosts[position].title
        holder.link.text = instaPosts[position].url
        holder.websiteId.text = instaPosts[position].website
    }

}