package com.william.kotlin.chapter08

fun main() {
    println(isWeekend(Day.SATURDAY))
    println(isWeekend(Day.WEDNESDAY))
}

fun isWeekend(day: Day): Boolean {
    return when (day) {
        Day.SATURDAY, Day.SUNDAY -> true
        else -> false
    }
}
