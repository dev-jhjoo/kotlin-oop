package com.william.kotlin.chapter04

class Circle : Shape {
    override val name:String = "원"

    override fun drew() {
        print("$name 을 그리다.")
    }
}