package com.william.kotlin.chapter02

class User(val name: String, var age: Int) {
    fun introduce() {
        println("이름: $name, 나이: $age ")
    }
}