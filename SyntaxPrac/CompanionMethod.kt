package com.example.test001

// 컴페니언 오브젝트

class Book private constructor (val id : Int, val name : String){
    companion object BookFactory : IdProvider{ // 이름 생략 가능, 상속 가능

        override fun getId() : Int{
            return 444
        }

        val myBook = "name"
        fun create() : Book = Book(getId(), myBook)
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main (){
//    val book = Book() >> private이라 안됨
    val book = Book.create()
    println("${book.id}, ${book.name}")

}