package com.william.kotlin.chapter08

sealed class Result

class Success(val data:String): Result()
class Fail(val message:String): Result()

