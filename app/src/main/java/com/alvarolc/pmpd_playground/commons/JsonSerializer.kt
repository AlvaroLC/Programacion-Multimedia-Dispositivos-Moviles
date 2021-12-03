package com.alvarolc.pmpd_playground.commons

interface JsonSerializer {
    fun <T> toJson(obj: T, typeClass: Class<T>): String
    fun <T> fromJson(json: String, typeClass: Class<T>): T
}