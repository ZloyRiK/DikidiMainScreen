package com.example.dikidimainscreen.data.api

import com.example.dikidimainscreen.data.model.DikidiServerResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthorizationAPI {

    @GET("/home/info")
    suspend fun getExampleData(): DikidiServerResponse

    @POST("/home/info")
    suspend fun getExampleDataByCity(@Body cityId: String): DikidiServerResponse


}

