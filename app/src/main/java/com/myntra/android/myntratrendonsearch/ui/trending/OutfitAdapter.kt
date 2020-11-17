package com.myntra.android.myntratrendonsearch.ui.trending

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.Outfit
import com.myntra.android.myntratrendonsearch.util.FunctionUtils

class OutfitAdapter(private val context: Context, private val outfit: ArrayList<Outfit>) :
    RecyclerView.Adapter<OutfitAdapter.OutfitViewHolder>() {
    class OutfitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val prod1: ImageView = itemView.findViewById(R.id.outfitImg1)
        val prod2: ImageView = itemView.findViewById(R.id.outfitImg2)
        val prod3: ImageView = itemView.findViewById(R.id.outfitImg3)
        val prod4: ImageView = itemView.findViewById(R.id.outfitImg4)
        val title: TextView = itemView.findViewById(R.id.imgTitle)
        val price: TextView = itemView.findViewById(R.id.tvPrice)
        val views: TextView = itemView.findViewById(R.id.tvViews)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutfitViewHolder {
        return OutfitViewHolder(
            LayoutInflater.from(context).inflate(R.layout.outfit_item, parent, false)
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: OutfitViewHolder, position: Int) {
        Glide.with(context).load(outfit[position].list[0].image).into(holder.prod1)
        Glide.with(context).load(outfit[position].list[1].image).into(holder.prod2)
        Glide.with(context).load(outfit[position].list[2].image).into(holder.prod3)
        Glide.with(context).load(outfit[position].list[3].image).into(holder.prod4)
        holder.title.text =
            outfit[position].list[0].name + " and " + outfit[position].list[1].name + " along with " + outfit[position].list[2].name

        holder.views.text = FunctionUtils().getRandomNumber(10, 300).toString()
        holder.price.text = "₹" + FunctionUtils().getRandomNumber(3000, 5000).toString()

    }

    override fun getItemCount(): Int {
        return outfit.size
    }
}