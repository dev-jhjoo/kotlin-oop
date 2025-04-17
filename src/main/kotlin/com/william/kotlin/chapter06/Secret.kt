package com.william.kotlin.chapter06

class Secret {
    private val password: String = "1234"

    fun checkPassword(input: String): Boolean {
        return input == password
    }
}