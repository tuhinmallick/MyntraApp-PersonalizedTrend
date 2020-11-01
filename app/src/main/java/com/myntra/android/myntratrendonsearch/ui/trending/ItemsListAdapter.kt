package com.myntra.android.myntratrendonsearch.ui.trending

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.TrendingProduct
import com.myntra.android.myntratrendonsearch.util.Constants

class ItemsListAdapter(val context: Context, val type: String) :
    RecyclerView.Adapter<ItemsListAdapter.ViewHolder>() {
    private var trendingWear: List<TrendingProduct> = Constants.trendingWear

    init {
        trendingWear = if (type == "women")
            Constants.trendingWear
        else
            Constants.trendingWearMen

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivInfluencerImage)
        val influencerName: TextView = itemView.findViewById(R.id.tvInflName)
        val productName: TextView = itemView.findViewById(R.id.productName)
        val number: TextView = itemView.findViewById(R.id.tvTrendNum)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.trending_list_item, parent, false)
        return ViewHolder(item)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(trendingWear[position].influencerList[0].image)
            .into(holder.imageView)
        holder.influencerName.text = trendingWear[position].influencerList[0].name
        holder.productName.text = trendingWear[position].productName
        holder.itemView.setOnClickListener {
            val intent = Intent(context, ItemDetailsActivity::class.java)
            intent.putExtra("catDetails", type)
            intent.putExtra("details", Gson().toJson(trendingWear[position]))
            context.startActivity(intent)
        }
        holder.number.text = "# ${position + 1}"
    }

    override fun getItemCount(): Int {
        return trendingWear.size
    }
}