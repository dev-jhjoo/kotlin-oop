package com.william.kotlin.chapter04

class Drone : Drivable, Flyable {
    override fun drive() {
        println("드론이 지면을 달린다.")
    }

    override fun fly() {
        println("드론이 하늘을 난다.")
    }

}