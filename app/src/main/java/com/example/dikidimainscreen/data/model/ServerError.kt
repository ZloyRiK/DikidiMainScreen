package com.example.dikidimainscreen.data.model


import com.google.gson.annotations.SerializedName

data class ServerError(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: Any
)