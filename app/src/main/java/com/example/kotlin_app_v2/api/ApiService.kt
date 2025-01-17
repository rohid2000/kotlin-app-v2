package com.example.kotlin_app_v2.api

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response

class ApiService {
    private val url = "https://localhost:8080";

    fun SendPostRequest(endpoint: String, jsonBody: String): String? {
        val client = OkHttpClient()

        val mediaType = "application/json; charset=utf-8".toMediaTypeOrNull()
        val requestBody = jsonBody.toRequestBody(mediaType)

        val request = Request.Builder()
            .url("$url/$endpoint")
            .post(requestBody)
            .build()

        client.newCall(request).execute().use { response ->
            return if (response.isSuccessful) {
                response.body?.string()
            } else {
                "Error: ${response.code}"
            }
        }
    }
}