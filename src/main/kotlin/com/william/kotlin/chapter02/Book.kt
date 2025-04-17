package com.william.kotlin.chapter02

class Book(title: String, price: Int) {
    val info: String

    init {
        info = "책 제목: $title, 가격: ${price}원"
    }

    fun printInfo() = println(info)
}
