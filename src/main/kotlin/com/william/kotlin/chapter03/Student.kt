package com.william.kotlin.chapter03

class Student(name: String, val grade: Int) : Person(name) {
    override fun introduce() {
        println("저는 $grade 학년 학생 $name 입니다.")
    }
}