package com.example.kotlin_app_v2.models

import java.time.DateTimeException
import java.util.Date

data class DrivingLicense(
    val id: Int,
    val a1: Date?,
    val a2: Date?,
    val am: Date?,
    val b: Date?,
    val b1: Date?,
    val be: Date?,
    val c: Date?,
    val c1: Date?,
    val ce: Date,
    val cie: Date?,
    val d: Date?,
    val d1: Date?,
    val de: Date?,
    val die: Date?,
    val t: Date?,
    val driver_id: Int?
)