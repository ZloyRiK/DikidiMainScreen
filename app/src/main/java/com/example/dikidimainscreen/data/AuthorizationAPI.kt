package com.example.dikidimainscreen.data

import com.example.dikidimainscreen.domain.model.DikidiServerResponse
import io.reactivex.Single
import retrofit2.http.GET

interface AuthorizationAPI {

@GET("/home/info")
//fun getExampleData(@Header("Authorization") token: String): Call<DikidiServerResponse>
fun getExampleData(): Single<DikidiServerResponse>
}