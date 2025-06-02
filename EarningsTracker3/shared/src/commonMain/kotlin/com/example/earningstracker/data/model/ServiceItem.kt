package com.example.earningstracker.data.model

/**
 * Represents a single service entry tracked for a specific date.
 */
data class ServiceItem(
    val id: Long = 0L,      // Changed to Long to match SQLDelight's AUTOINCREMENT behavior
    val date: String,
    val name: String,
    val price: Double,
    val quantity: Int
)