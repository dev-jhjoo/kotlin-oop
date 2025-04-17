package com.william.kotlin.chapter02

class Car {
    var model: String
    var year: Int

    constructor(model: String, year: Int) {
        this.model = model
        this.year = year
    }

    fun printSpec() {
        println("모델: $model / 연식: $year")
    }
}
