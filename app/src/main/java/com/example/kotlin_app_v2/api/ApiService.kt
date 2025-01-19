package com.example.kotlin_app_v2.api

import com.example.kotlin_app_v2.models.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("user/all")
    fun getAllUsers(): Call<List<User>>
}

