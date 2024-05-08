package com.example.dikidimainscreen.domain.model


import com.google.gson.annotations.SerializedName

data class DikidiServerResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("error")
    val serverError: ServerError
)