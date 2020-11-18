package com.myntra.android.myntratrendonsearch.ui.model

data class TrendingProduct(
    val productName: String,
    val productPriority: Int,
    val productImage: String,
    val influencerList: List<Influencer>
)