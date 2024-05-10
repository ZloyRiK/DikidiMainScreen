package com.example.dikidimainscreen.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("blocks")
    val blocks: Blocks,
    @SerializedName("catalog_count")
    val catalogCount: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("order")
    val order: List<String>,
    @SerializedName("title")
    val title: String
)