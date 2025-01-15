package com.example.kotlin_app_v2.api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.awaitResponse

suspend fun fetchUsers(): List<User>? {
    return withContext(Dispatchers.IO) {
        try {
            val response = RetrofitClient.apiService.getUsers().awaitResponse()
            if (response.isSuccessful) {
                response.body()
            } else {
                // Handle error
                null
            }
        } catch (e: Exception) {
            // Handle exception
            null
        }
    }
}