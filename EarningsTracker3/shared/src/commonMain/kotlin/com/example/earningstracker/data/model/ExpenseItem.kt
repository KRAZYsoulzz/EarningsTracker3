package com.example.earningstracker.data.model

data class ExpenseItem(
    val id: Long = 0L,    // Changed to Long
    val date: String,
    val name: String,
    val amount: Double
)