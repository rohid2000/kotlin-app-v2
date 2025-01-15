package com.example.kotlin_app_v2.api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call
import retrofit2.awaitResponse

interface ApiService {
    @GET("/user/all")
    fun getUsers(): Call<List<User>>

    @GET("/user/{id}")fun getUser(@Path("id") id: Int): Call<User>
}