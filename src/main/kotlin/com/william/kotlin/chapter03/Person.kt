package com.william.kotlin.chapter03

open class Person(val name: String) {
    open fun introduce() = println("저는 $name 입니다.")
}