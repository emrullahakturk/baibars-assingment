package com.example.baibars.presentation.viewmodel

data class UavUiState(
    val batteryVoltage: String = "Loading...",
    val altitude: String = "Loading...",
    val gpsCoordinates: String = "Loading...",
    val flightTime: String = "Loading..."
)
