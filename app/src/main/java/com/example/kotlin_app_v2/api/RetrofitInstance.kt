package com.example.kotlin_app_v2.api

import com.example.kotlin_app_v2.models.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun createRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://localhost:8080/user/all")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun getAllUsers() {
    val retrofit = createRetrofit()
    val apiService = retrofit.create(ApiService::class.java)

    val call = apiService.getAllUsers()

    call.enqueue(object : Callback<List<User>> {
        override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
            if (response.isSuccessful) {
                val users = response.body()
                println("Users: $users")
            } else {
                println("Error: ${response.errorBody()}")
            }
        }

        override fun onFailure(call: Call<List<User>>, t: Throwable) {
            println("Failed to fetch data: ${t.message}")
        }
    })
}
