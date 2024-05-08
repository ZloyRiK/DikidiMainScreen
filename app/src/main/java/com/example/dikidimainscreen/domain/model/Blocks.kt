package com.example.dikidimainscreen.domain.model


import com.google.gson.annotations.SerializedName

data class Blocks(
    @SerializedName("catalog")
    val catalog: List<Catalog>,
    @SerializedName("examples")
    val examples: String,
    @SerializedName("examples2")
    val examples2: String,
    @SerializedName("shares")
    val shares: Shares
)