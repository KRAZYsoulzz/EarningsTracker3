package com.example.earningstracker.data.model // Adjusted package name

/**
 * Holds the results of a tarping calculation.
 * @param area The calculated area.
 * @param userEarning The calculated earning for the user.
 */
data class TarpCalculationResult(
    val area: Double,
    val userEarning: Double
)