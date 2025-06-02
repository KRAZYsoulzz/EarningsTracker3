package com.example.earningstracker.data.model // Adjusted package name

/**
 * Data class representing the billable service information for a specific insurance carrier.
 * Values are typically "Y" (Yes), "N" (No), a specific condition/note, or null if unspecified.
 */
data class CarrierServiceInfo(
    val carrierName: String,
    val itelSample: String? = null,
    val fence: String? = null,
    val interior1to3Rooms: String? = null,
    val interiorOver3Rooms: String? = null,
    val interior360: String? = null,
    val steepAssist: String? = null,
    val buildingAddon: String? = null,
    val installTarp: String? = null,
    val resetTarp: String? = null,
    val replaceTarp: String? = null,
    val tripCancelFee: String? = null
)