package com.example.dikidimainscreen.domain.model


import com.google.gson.annotations.SerializedName

data class Catalog(
    @SerializedName("award")
    val award: String,
    @SerializedName("backgrounds")
    val backgrounds: List<String>,
    @SerializedName("categories")
    val categories: List<Any>,
    @SerializedName("categories_catalog")
    val categoriesCatalog: List<Any>,
    @SerializedName("currency")
    val currency: Currency,
    @SerializedName("house")
    val house: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("isMaster")
    val isMaster: Boolean,
    @SerializedName("lat")
    val lat: String,
    @SerializedName("lng")
    val lng: String,
    @SerializedName("master_id")
    val masterId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("rating")
    val rating: Double,
    @SerializedName("reviewCount")
    val reviewCount: String,
    @SerializedName("schedule")
    var schedule: Any?,
    @SerializedName("street")
    val street: String,
    @SerializedName("vip_tariff")
    val vipTariff: Boolean
)