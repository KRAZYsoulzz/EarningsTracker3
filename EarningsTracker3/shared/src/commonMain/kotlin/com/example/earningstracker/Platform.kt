package com.example.earningstracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform