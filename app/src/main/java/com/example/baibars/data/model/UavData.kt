package com.example.baibars.data.model

import android.annotation.SuppressLint

data class UavData(
    val batteryVoltage: Float,
    val altitude: Int,
    val latitude: Double,
    val longitude: Double,
    val flightTimeSeconds: Int
) {
    val flightTimeFormatted: String
        @SuppressLint("DefaultLocale")
        get() {
            val minutes = (flightTimeSeconds % 3600) / 60
            val seconds = flightTimeSeconds % 60
            val hours = flightTimeSeconds / 3600
            return String.format("%02d:%02d:%02d", hours, minutes, seconds)
        }
}
