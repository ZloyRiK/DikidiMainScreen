package com.example.dikidimainscreen.domain.model


import com.google.gson.annotations.SerializedName

data class Currency(
    @SerializedName("abbr")
    val abbr: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String
)