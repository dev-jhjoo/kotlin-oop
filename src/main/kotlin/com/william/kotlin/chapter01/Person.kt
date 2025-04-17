package com.william.kotlin.chapter01

class Person {
    var name: String = "Unknown"
    var age: Int = 0

    fun introduce() {
        println("안녕하세요, 저는 $name 이고 나이는 $age 입니다.")
    }
}
