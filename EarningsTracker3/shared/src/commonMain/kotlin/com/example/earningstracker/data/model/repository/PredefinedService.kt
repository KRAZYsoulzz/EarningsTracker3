package com.example.earningstracker.data.model // Adjusted package name

/**
 * Data class representing a service that can be pre-loaded into the app.
 * It contains the name and default price for the service.
 * For Engineer Assist, the price represents the base pay for the first hour.
 */
data class PredefinedService(
    val name: String,
    val price: Double
)