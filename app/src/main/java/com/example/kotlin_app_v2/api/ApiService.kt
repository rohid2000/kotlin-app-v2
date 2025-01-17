package com.example.kotlin_app_v2.api

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.gson.*

class ApiService {
    private val url = "http://localhost:8080";

    suspend fun SendPostRequest(endpoint: String, jsonBody: String): String? {
        val client = HttpClient {
            install(ContentNegotiation) {
                gson() // or use kotlinx.serialization if preferred
            }
        }

        return try {
            val finalUrl = "$url/$endpoint"
            val response: HttpResponse = client.post(finalUrl) {
                contentType(ContentType.Application.Json)
                setBody(jsonBody)
            }
            response.body<String>()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        } finally {
            client.close()
        }
    }
}