package com.example.dikidimainscreen.data.model


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("origin")
    val origin: String,
    @SerializedName("thumb")
    val thumb: String
)