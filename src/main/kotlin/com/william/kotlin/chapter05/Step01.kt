package com.william.kotlin.chapter05

fun main() {
    val user1 = User("william", 35)
    val user2 = User("william", 35)

    println(user1)                   // toString 자동 출력
    println(user1 == user2)          // equals 값 비교

    val user3 = user1.copy(age = 36) // 나이만 변경한 복사본
    println(user3)

    val (name, age) = user1          // 구조 분해 선언
    println("$name 님의 나이는 $age 살")
}