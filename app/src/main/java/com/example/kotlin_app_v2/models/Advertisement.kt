package com.example.kotlin_app_v2.models

import android.icu.text.DecimalFormat
import java.util.Date

data class Advertisement(
    val id: Int,
    val end_time: Date?,
    val price_per_hour: DecimalFormat,
    val start_time: Date?,
    val fk_user: Int,
    val fk_vehicle: Int,
)