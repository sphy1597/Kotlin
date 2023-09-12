package com.example.test001

//1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명 함수
// 1) 메소드의 파리미터로 넘겨줄수가 있다. fun maxBy(a:Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : 타입 = { argumetList -> codebody }


val square = { number : Int -> number*number}
val nameAge = {name : String, age : Int ->
    "my Name is ${name}, I'm${age}"
}


fun main(){
    println(square(12))
    println(nameAge("gyu", 25))
    val a = "gyu said"
    val b = "sim said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27 ))
    println(calculateGrade(98))

    val lamda = {number : Double ->
        number == 4.3412}
    println(invokeLamda(lamda))
    invokeLamda({it>3.22}) // 아래와 같은 함수
    invokeLamda { it > 3.22 } // 함수의 마지막 파라미터가 람다함수면 이런식으로 표현가능
}

// 확장 함수
// String 클래스에 추가하기
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"

}

fun extendString(name : String, age : Int) : String {
    val introdyceMySlef : String.(Int) -> String = {
        "I am ${this} and ${it} years old" // 파라미터가 하나면 it으로 생략 가능
    }
    return name.introdyceMySlef(28)
}

// Lamda의 리턴
val calculateGrade: (Int) -> String = { // 입력 파라미터 Int는 여러개 일수도 있어서 괄호 필수 String 은 리턴값이 때문에 하나라 안써도됨
    when(it){
        in 0..40 -> "fail"
        in 40..70 -> "pass"
        in 71..100 -> "perfact"
        else -> "Error"
    }
}

//람다 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{
    return lamda(5.2343)
}

//
// 1) 코틀린 인터페이스가 아닌 자바 인터페이스의 경우
// 2) 그 인터페이스가 딱 하나의 메소드만 가질 경우