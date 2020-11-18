package com.myntra.android.myntratrendonsearch.ui.main

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.Outfit
import com.myntra.android.myntratrendonsearch.ui.model.OutfitProduct
import com.myntra.android.myntratrendonsearch.ui.trending.OutfitAdapter
import com.myntra.android.myntratrendonsearch.util.FunctionUtils
import kotlinx.android.synthetic.main.activity_outfit.*

class OutfitActivity : AppCompatActivity() {
    var outfits: ArrayList<Outfit>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outfit)

        val handler = Handler()
        handler.postDelayed({
            initRecycler()
        }, 1000)
    }

    private fun initData() {

        val products6 = arrayListOf<OutfitProduct>(
            OutfitProduct(
                "https://cdn.lookastic.com/black-crew-neck-t-shirt/black-cotton-dye-t-shirt-medium-10408706.jpg",
                "Black Crew Neck Tshirt",
                "Tshirt",
                "299",
                423478,
                FunctionUtils().getRandomNumber(0, 15)
            ),
            OutfitProduct(
                "https://cdn.lookastic.com/black-crew-neck-t-shirt/black-cotton-dye-t-shirt-medium-10408706.jpg",
                "Black Crew Neck Tshirt",
                "Tshirt",
                "299",
                423478,
                FunctionUtils().getRandomNumber(0, 15)
            ),
            OutfitProduct(
                "https://cdn.lookastic.com/black-crew-neck-t-shirt/black-cotton-dye-t-shirt-medium-10408706.jpg",
                "Black Crew Neck Tshirt",
                "Tshirt",
                "299",
                423478,
                FunctionUtils().getRandomNumber(0, 15)
            ),
            OutfitProduct(
                "https://cdn.lookastic.com/black-crew-neck-t-shirt/black-cotton-dye-t-shirt-medium-10408706.jpg",
                "Black Crew Neck Tshirt",
                "Tshirt",
                "299",
                423478,
                FunctionUtils().getRandomNumber(0, 15)
            )
        )
        val outfit6 = Outfit(products6, "150", "699")

        outfits = arrayListOf(outfit6)
    }

    private fun initRecycler() {
        rvOutfitsAct.visibility = View.VISIBLE
        pbOutfitAct.visibility = View.GONE
        rvOutfitsAct.adapter = OutfitAdapter(this)
        rvOutfitsAct.layoutManager = GridLayoutManager(this, 2)
    }

}