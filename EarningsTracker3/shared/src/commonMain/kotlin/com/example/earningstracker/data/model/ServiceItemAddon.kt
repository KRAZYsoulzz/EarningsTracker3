package com.example.earningstracker.data.model // Adjusted package name

// Room-specific annotations (@Entity, @ForeignKey, @Index, @PrimaryKey) have been removed.
// These database-specific details (like foreign keys and indexing)
// will be defined in your KMP database schema (e.g., within SQLDelight .sq files).

/**
 * Represents a single add-on applied to a specific ServiceItem instance.
 */
data class ServiceItemAddon(
    val id: Long = 0,         // Primary key in the old Room entity.
    val serviceItemId: Long,  // This linked to ServiceItem's ID.
    val addonName: String,
    val addonPrice: Double
)