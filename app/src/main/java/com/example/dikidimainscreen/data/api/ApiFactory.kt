package com.example.dikidimainscreen.data.api

import com.example.dikidimainscreen.BASE_URL
import com.example.dikidimainscreen.TOKEN
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(BASE_URL)
        .client(
            OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor().apply { level= HttpLoggingInterceptor.Level.BODY })
            .addInterceptor { chain ->
                val request = chain.request()
                val newRequest  = request.newBuilder()
                    .addHeader("Authorization", TOKEN)
                    .build()
                chain.proceed(newRequest)
            }.build())
        .build()

    val apiService = retrofit.create(AuthorizationAPI::class.java)
}