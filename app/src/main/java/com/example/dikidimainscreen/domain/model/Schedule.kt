package com.example.dikidimainscreen.domain.model


import com.google.gson.annotations.SerializedName

data class Schedule(
    @SerializedName("day")
    val day: String,
    @SerializedName("work_from")
    val workFrom: String,
    @SerializedName("work_to")
    val workTo: String
)