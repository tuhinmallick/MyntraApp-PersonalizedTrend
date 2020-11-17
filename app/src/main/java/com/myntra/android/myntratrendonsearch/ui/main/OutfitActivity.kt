package com.myntra.android.myntratrendonsearch.ui.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
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
        initData()
        initRecycler()

    }

    private fun initData() {
        val products1 = arrayListOf<OutfitProduct>(
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
        val outfit1 = Outfit(products1, "200", "399")

        val products2 = arrayListOf<OutfitProduct>(
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
        val outfit2 = Outfit(products2, "150", "699")

        val products3 = arrayListOf<OutfitProduct>(
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
        val outfit3 = Outfit(products2, "150", "699")

        val products4 = arrayListOf<OutfitProduct>(
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
        val outfit4 = Outfit(products2, "150", "699")

        val products5 = arrayListOf<OutfitProduct>(
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
        val outfit5 = Outfit(products2, "150", "699")

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
        val outfit6 = Outfit(products2, "150", "699")

        outfits = arrayListOf(outfit1, outfit2, outfit3, outfit4, outfit5, outfit6)
    }

    private fun initRecycler() {
        rvOutfitsAct.visibility = View.VISIBLE
        pbOutfitAct.visibility = View.GONE
        rvOutfitsAct.adapter = OutfitAdapter(this, outfits!!)
        rvOutfitsAct.layoutManager = GridLayoutManager(this, 2)
    }

}