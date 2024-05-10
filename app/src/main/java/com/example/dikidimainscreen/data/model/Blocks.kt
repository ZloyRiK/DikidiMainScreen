package com.example.dikidimainscreen.data.model


import com.google.gson.annotations.SerializedName

data class Blocks(
    @SerializedName("catalog")
    val catalog: List<Catalog>,
    @SerializedName("examples")
    val examples: String,
    @SerializedName("examples2")
    val examples2: String,
)