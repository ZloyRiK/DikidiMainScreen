package com.example.dikidimainscreen.domain.model


import com.google.gson.annotations.SerializedName

data class Shares(
    @SerializedName("count")
    val count: String,
    @SerializedName("list")
    val list: List<SharesData>
)