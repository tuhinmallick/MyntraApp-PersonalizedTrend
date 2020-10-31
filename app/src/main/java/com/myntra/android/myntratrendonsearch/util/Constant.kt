package com.myntra.android.myntratrendonsearch.util

import com.myntra.android.myntratrendonsearch.ui.Influencer
import com.myntra.android.myntratrendonsearch.ui.TrendingProduct

object Constants {
    const val PHONE_NUMBER = "phoneNumber"
    val catList: List<String> = arrayListOf(
        "WOMEN",
        "MEN",
        "KIDS",
        "BEAUTY & PERSONAL CARE",
        "HOME & LIVING",
        "GADGETS"
    )
    val cat2List: List<List<String>> = arrayListOf(
        arrayListOf(
            "Saree",
            "Kurta Set",
            "Ethnic Dresses",
            "Kurtis Tunic & Tops",
            "Palazzo & Trousers",
            "Dresses & Jumpsuits",
            "Tops, T-shirts & Shirts",
            "Trousers",
            "Skirts",
            "Sweaters",
            "Jacket"
        ),
        arrayListOf(
            "T-Shirts",
            "Coats",
            "Sneakers",
            "Sports Shoes",
            "Jeans",
            "Shorts",
            "Formal Trousers",
            "Sherwani"
        ),
        arrayListOf(
            "Explore Kids Store",
            "Festive Kids Store",
            "Girls Clothing",
            "Boys Clothing",
            "Girls Footwear",
            "Boys Footwear"
        ),
        arrayListOf(
            "Women",
            "Men",
            "Explore Beauty Store",
            "Explore Premium Beauty Store"
        ),
        arrayListOf(
            "Decor", "Kitchen and Dining",
            "Bed",
            "Furnishing",
            "Storage & Organizers",
            "Bath"
        ),
        arrayListOf(
            "Smart Watches", "Fitness Band",
            "Headphones", "Speakers"
        )
    )

    var trendingWear: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Bandhini Saree From Gujarat", arrayListOf(
                Influencer("Selena", "https://www.looksgud.in/blog/wp-content/uploads/2017/05/oasis-navy-floral-print-cami-top.jpg"),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Benarasi Silk Saree From Uttar Pradesh", arrayListOf(
                Influencer("Kokila", "https://designerethnicstore.weebly.com/uploads/1/0/7/2/107210107/719459372.jpg"),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", "")
            )
        ),
        TrendingProduct(
            "Rare Beauty Top", arrayListOf(
                Influencer("Karina", "https://www.looksgud.in/blog/wp-content/uploads/2017/05/besiva-red-polyester-solid-blouse.jpg"),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Tank Top", arrayListOf(
                Influencer("Karina", "https://www.looksgud.in/blog/wp-content/uploads/2017/05/aeropostale-sea-green-printed-tank-top.jpg"),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Punjabi Suit", arrayListOf(
                Influencer("Parinti", "https://medias.fashionnetwork.com/image/upload/v1/medias/14e548e9a22e164ae16cb5fd97cfa90d2990026.jpg"),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        )
    )

}
