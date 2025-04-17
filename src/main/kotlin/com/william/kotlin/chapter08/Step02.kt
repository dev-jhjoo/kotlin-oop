package com.william.kotlin.chapter08

fun main() {
    responseHandle(Success("created"))
}

fun responseHandle(result: Result) {
    when (result) {
        is Success -> println(result.data)
        is Fail -> println(result.message)
        // else 불필요! sealed class 덕분에 exhaustiveness 보장
    }
}