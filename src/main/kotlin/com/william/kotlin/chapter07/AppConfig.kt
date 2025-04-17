package com.william.kotlin.chapter07

object AppConfig {
    val appName:String = "MyApp"
    var version:String = "1.0.0"

    fun printInfo() = println("$appName v$version")
}