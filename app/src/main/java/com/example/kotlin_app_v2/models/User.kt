package com.example.kotlin_app_v2.models

data class User(
    val id: Int,
    val email: String?,
    val first_name: String?,
    val last_name: String?,
    val phone_number: String?
)