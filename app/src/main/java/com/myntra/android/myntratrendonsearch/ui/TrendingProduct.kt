package com.myntra.android.myntratrendonsearch.ui

import java.io.Serializable

data class TrendingProduct(
    val productName: String,
    val influencerList: List<Influencer>
)