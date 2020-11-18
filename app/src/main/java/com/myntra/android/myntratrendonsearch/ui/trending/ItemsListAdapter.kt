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
import com.myntra.android.myntratrendonsearch.util.DataProcessor

class ItemsListAdapter(val context: Context, val type: String) :
    RecyclerView.Adapter<ItemsListAdapter.ViewHolder>() {
    private var trendingWear: List<TrendingProduct> = Constants.trendingWear

    init {
        when (type) {
            "women" -> trendingWear = Constants.trendingWear
            "mentop" -> trendingWear = Constants.trendingWearMenTop
            "menbottom" -> trendingWear = Constants.trendingWearMenBottom
        }

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
            if (type == "mentop") {
                if (position == 0) {
                    if (DataProcessor.getInt(context, "mentop0") != 0)
                        DataProcessor.setInt(
                            context,
                            "mentop0",
                            DataProcessor.getInt(context, "mentop0") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "mentop0",
                            1
                        )
                } else if (position == 1) {
                    if (DataProcessor.getInt(context, "mentop1") != 0)
                        DataProcessor.setInt(
                            context,
                            "mentop1",
                            DataProcessor.getInt(context, "mentop1") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "mentop1",
                            1
                        )
                } else if (position == 2) {
                    if (DataProcessor.getInt(context, "mentop2") != 0)
                        DataProcessor.setInt(
                            context,
                            "mentop2",
                            DataProcessor.getInt(context, "mentop2") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "mentop2",
                            1
                        )
                } else if (position == 3) {
                    if (DataProcessor.getInt(context, "mentop3") != 0)
                        DataProcessor.setInt(
                            context,
                            "mentop3",
                            DataProcessor.getInt(context, "mentop3") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "mentop3",
                            1
                        )
                } else if (position == 4) {
                    if (DataProcessor.getInt(context, "mentop4") != 0)
                        DataProcessor.setInt(
                            context,
                            "mentop4",
                            DataProcessor.getInt(context, "mentop4") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "mentop4",
                            1
                        )
                }
//                var map = HashMap<Int, Int>()
//                if (DataProcessor.getStr(context, "mentop") == "DNF") {
//                    map.put(position, 1)
//                } else {
//                    map = Gson().fromJson(
//                        DataProcessor.getStr(context, "mentop"),
//                        HashMap<Int, Int>()::class.java
//                    )
//                    if (map.containsKey(position)) {
//                        map.put(position, map[position]!!.toInt() + 1)
//                    } else
//                        map.put(position, 1)
//                }
//                val mentop = Gson().toJson(map)
//                Log.d(Companion.TAG, "onBindViewHolder: $mentop")
//                DataProcessor.setStr(context, "mentop", mentop)

            } else if (type == "menbottom") {
                if (position == 0) {
                    if (DataProcessor.getInt(context, "menbot0") != 0)
                        DataProcessor.setInt(
                            context,
                            "menbot0",
                            DataProcessor.getInt(context, "menbot0") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "menbot0",
                            1
                        )
                } else if (position == 1) {
                    if (DataProcessor.getInt(context, "menbot1") != 0)
                        DataProcessor.setInt(
                            context,
                            "menbot1",
                            DataProcessor.getInt(context, "menbot1") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "menbot1",
                            1
                        )
                } else if (position == 2) {
                    if (DataProcessor.getInt(context, "menbot2") != 0)
                        DataProcessor.setInt(
                            context,
                            "menbot2",
                            DataProcessor.getInt(context, "menbot2") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "menbot2",
                            1
                        )
                } else if (position == 3) {
                    if (DataProcessor.getInt(context, "menbot3") != 0)
                        DataProcessor.setInt(
                            context,
                            "menbot3",
                            DataProcessor.getInt(context, "menbot3") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "menbot3",
                            1
                        )
                } else if (position == 4) {
                    if (DataProcessor.getInt(context, "menbot4") != 0)
                        DataProcessor.setInt(
                            context,
                            "menbot4",
                            DataProcessor.getInt(context, "menbot4") + 1
                        )
                    else
                        DataProcessor.setInt(
                            context,
                            "menbot4",
                            1
                        )
                }
//                var map = HashMap<Int, Int>()
//                if (DataProcessor.getStr(context, "menbottom") == "DNF") {
//                    map.put(position, 1)
//                } else {
//                    map = Gson().fromJson(
//                        DataProcessor.getStr(context, "menbottom"),
//                        HashMap<Int, Int>()::class.java
//                    )
//                    Log.d(TAG, "onBindViewHolder: ${map.containsKey(position)}")
//                    if (map.containsKey(position)) {
//                        map.put(position, map[position]!!.toInt() + 1)
//                    } else
//                        map.put(position, 1)
//                }
//                val menbottom = Gson().toJson(map)
//                Log.d(Companion.TAG, "onBindViewHolder: $menbottom")
//                DataProcessor.setStr(context, "menbottom", menbottom)
            }
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

    companion object {
        private const val TAG = "ItemsListAdapter"
    }
}