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
import com.myntra.android.myntratrendonsearch.ui.model.Priority
import com.myntra.android.myntratrendonsearch.util.Constants
import com.myntra.android.myntratrendonsearch.util.DataProcessor
import com.myntra.android.myntratrendonsearch.util.FunctionUtils

class OutfitAdapter(private val context: Context) :
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
        val listMenTop = arrayListOf<Priority>(
            Priority(0, DataProcessor.getInt(context, "mentop0"), Constants.trendingWearMenTop[0]),
            Priority(1, DataProcessor.getInt(context, "mentop1"), Constants.trendingWearMenTop[1]),
            Priority(2, DataProcessor.getInt(context, "mentop2"), Constants.trendingWearMenTop[2]),
            Priority(3, DataProcessor.getInt(context, "mentop3"), Constants.trendingWearMenTop[3]),
            Priority(4, DataProcessor.getInt(context, "mentop4"), Constants.trendingWearMenTop[4])
        )
        val listMenBot = arrayListOf<Priority>(
            Priority(
                0,
                DataProcessor.getInt(context, "menbot0"),
                Constants.trendingWearMenBottom[0]
            ),
            Priority(
                1,
                DataProcessor.getInt(context, "menbot1"),
                Constants.trendingWearMenBottom[1]
            ),
            Priority(
                2,
                DataProcessor.getInt(context, "menbot2"),
                Constants.trendingWearMenBottom[2]
            ),
            Priority(
                3,
                DataProcessor.getInt(context, "menbot3"),
                Constants.trendingWearMenBottom[3]
            ),
            Priority(
                4,
                DataProcessor.getInt(context, "menbot4"),
                Constants.trendingWearMenBottom[4]
            )
        )
        val sortedTop = sort(listMenTop)
        val sortedBot = sort(listMenBot)
        Glide.with(context).load(sortedTop[position].prod.productImage)
            .into(holder.prod1)
        Glide.with(context).load(sortedBot[position].prod.productImage)
            .into(holder.prod2)
        Glide.with(context).load(Constants.other0[position].productImage).into(holder.prod3)
        Glide.with(context).load(Constants.other[position].productImage).into(holder.prod4)
        holder.title.text =
            Constants.trendingWearMenTop[position].productName + " and " + Constants.trendingWearMenTop[position].productName

        holder.views.text = FunctionUtils().getRandomNumber(10, 300).toString()
        holder.price.text = "₹" + FunctionUtils().getRandomNumber(3000, 6000).toString()

    }

    private fun sort(listMenTop: ArrayList<Priority>): ArrayList<Priority> {
        val temp = arrayListOf<Priority>()
        while (listMenTop.isNotEmpty()) {
            var max = -1
            var maxPriority: Priority? = null
            for (i in 0 until listMenTop.size) {
                if (max < listMenTop[i].value) {
                    max = listMenTop[i].value
                    maxPriority = listMenTop[i]
                }
            }
            temp.add(maxPriority!!)
            listMenTop.remove(maxPriority)
        }
        return temp
    }

    override fun getItemCount(): Int {
        return Constants.trendingWearMenTop.size
    }
}