package com.example.dikidimainscreen.data.model


import com.google.gson.annotations.SerializedName

data class Catalog(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: Image,
    @SerializedName("name")
    val name: String,

)