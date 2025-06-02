package com.example.earningstracker.data.repository // Adjusted package name

import com.example.earningstracker.data.model.PredefinedAddon // Import for the moved data class

/**
 * Repository object providing the master list of predefined add-ons.
 */
object AddonRepository {

    // List based on user input - simplified pricing for now
    val predefinedAddons: List<PredefinedAddon> = listOf(
        PredefinedAddon("Additional Building/Structure", 50.00),
        PredefinedAddon("Interior Add-On (1-3 Rooms)", 25.00),
        PredefinedAddon("Interior Add'l Room (>3 Rooms)", 15.00),
        // PredefinedAddon("360° Interior Add'l Sq Ft (per sq ft)", 0.05), // Omitted due to per sq ft complexity for now
        PredefinedAddon("Steep Assist", 25.00),
        PredefinedAddon("40' Ladder", 15.00),
        PredefinedAddon("Detach & Reset Original Tarp", 50.00), // Simplified from minimum/sqft
        PredefinedAddon("Detach & Install New Tarp", 100.00), // Simplified from minimum/sqft
        PredefinedAddon("Tarp New Install", 100.00), // Simplified from minimum/sqft
        PredefinedAddon("Tarp Referral", 35.00),
        PredefinedAddon("ITEL Sample", 95.00),
        PredefinedAddon("Fence Inspection", 15.00), // Simplified from per 500 LF
        PredefinedAddon("Engineer Assist Add'l Time", 25.00), // Simplified from per 15 mins
        PredefinedAddon("Accuserve Windows Add'l Time", 25.00), // Simplified from per 15 mins
        PredefinedAddon("Trip/Cancelation Fee", 50.00) // Simplified from 40/50
    ).sortedBy { it.name } // Sort alphabetically
}