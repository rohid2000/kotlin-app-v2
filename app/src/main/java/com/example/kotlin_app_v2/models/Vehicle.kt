package com.example.kotlin_app_v2.models

data class Vehicle(
    val type: String,
    val id: Int,
    val brand: String?,
    val build_year: Int,
    val color: String?,
    val engine_type: Int?,
    val fuel_type: Int?,
    val horse_power: Int,
    val latitude: Double,
    val license_plate: String?,
    val longitude: Double,
    val model: String?,
    val transmission: Int?,
    val seats: Int?,
    val has_passenger_seat: Int,
    val owner_id: Int
)