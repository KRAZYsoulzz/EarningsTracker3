package com.example.earningstracker.data.model // Adjusted package name

// Room-specific annotations (@Entity, @PrimaryKey) have been removed.
// The concept of a primary key (which was 'date' in the Room entity)
// will be handled by your KMP database solution like SQLDelight in its schema definition.

/**
 * Represents summary data for a specific day, including mileage and notes.
 */
data class DailySummary(
    val date: String, // Format "YYYY-MM-DD"
    val startMileage: String = "",
    val endMileage: String = "",
    val notes: String = ""
)