package com.william.kotlin.chapter08

enum class CoffeeType(val price:Int) {
    AMERICANO(4100),
    LATTE(4600),
    ESPRESSO(1800);

    fun isCheap() = price < 2000
}