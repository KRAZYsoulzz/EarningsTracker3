package com.example.earningstracker.data.repository // Adjusted package name

import com.example.earningstracker.data.model.PredefinedService // Import the moved PredefinedService

/**
 * Provides the master list of predefined services offered.
 * This list is used to populate the "Add Service" dropdown menu.
 */
object ServiceRepository {

    // Definitive list based on user's provided lists and modifications
    val predefinedServices: List<PredefinedService> = listOf(
        PredefinedService("Accuserve Windows (First 60 mins)", 100.00),
        PredefinedService("Engineer Assist", 100.00), // MODIFIED: Simplified name, base price for logic
        PredefinedService("Ladder Assist", 90.00),
        PredefinedService("Ladder Lean", 55.00),
        PredefinedService("Marketing", 125.00),
        PredefinedService("Move Out Essential", 125.00),
        PredefinedService("Move Out Premium", 175.00),
        PredefinedService("Non-Weather Water", 80.00),
        PredefinedService("Shortstop", 30.00),
        PredefinedService("Solo - Exterior", 80.00),
        PredefinedService("Solo - Exterior & Roof", 125.00),
        PredefinedService("Solo - Interior", 80.00),
        PredefinedService("Solo - Interior & Exterior", 125.00),
        PredefinedService("Solo - Interior & Roof", 125.00),
        PredefinedService("Solo - Interior, Exterior, & Roof", 150.00),
        PredefinedService("Solo - Roof", 115.00),
        PredefinedService("Solo Post Construction - Exterior", 25.00),
        PredefinedService("Solo Post Construction - Exterior & Roof", 75.00),
        PredefinedService("Solo Post Construction - Roof", 50.00),
        PredefinedService("Solo Pre-Loss - Exterior", 130.00),
        PredefinedService("Solo Pre-Loss - Exterior & Roof", 130.00),
        PredefinedService("Solo Pre-Loss - Roof", 130.00),
        PredefinedService("Solo Virtual Assist - Exterior", 80.00),
        PredefinedService("Solo Virtual Assist - Exterior & Roof", 125.00),
        PredefinedService("Solo Virtual Assist - Roof", 115.00),
        PredefinedService("Surge vs Wind Evaluation", 150.00),
        PredefinedService("Trip Charge", 50.00)
        // Ensure any old "Engineer Assist (First 60 mins)" is removed if this replaces it
    ).distinctBy { it.name } // Ensure no duplicates by name
        .sortedBy { it.name } // Sort alphabetically for consistency in the dropdown
}