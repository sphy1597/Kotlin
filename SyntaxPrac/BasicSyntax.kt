package com.example.test001


fun main () {
    helloWorld()
}

//1. 함수

fun helloWorld():Unit { // fun 이름(파라미터이름 : 타입, ...) : 리턴타입
    println("HelloWorld")
}

fun add(num1:Int, num2:Int ) : Int{

    return num1+num2
}

//2. val vs var
// val = value >> 상수, 변하지 않음
// var = variable >> 변수, 재할당 가능

fun valvar(){
    val a : Int = 10
    var b : Int = 20
    var e : String // 값을 지정하지 않을땐 타입을 써야함
    // a = 100 X
    b = 100

    // var 이름 : 타입 = 값  >> : 타입은 생략가능

}

//3. 문자열
fun str() {
    val name = "Gyucheol"
    val lastname = "Sim"
    println("my name is ${name + lastname}I'm 23 ")
    // ${}로 문자열 사이에 값을 가져다 쓸수 있음
    // $ 문자를 사용하려면 앞에 백슬레쉬 \
}

//4. 조건식
fun maxBy(a:Int, b:Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

// 위랑 같은 기능을 하는 식, 코틀린에 3항연산자가 없음
fun maxBy2(a:Int,b:Int) : Int = if(a>b) a else b

fun checkNum(score : Int) {
    // switch이라고 생각하면 됨
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b = when(score){
        1->1
        2->2
        else -> 3
        // 변수에 넣을 땐 else 필수
    }

    when(score){
        in 90..100 -> print("good")
        in 10..80 -> println("great")

    }
}

// Expression vs Statement

// Expression >> 값을 만드는 >> 코틀린의 모든 함수는 Expression
// Statemnet >> 실행하게 만드는 >> when 처럼 둘다 가능한 경우가 있음



//5. Array and List

// Array는 처음 길이를 지정해야 함
// List >> 수정 불가  MutableList >> 수정가능

fun array(){
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 : Array<Any> = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d", 11L)

    array[0] = 3
    var result : Int = list.get(0)

    var arrayList : ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20


}

// 6. 반복문
// for / while

fun forAndWhile(){
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for ( name in students){
        println("${name}")
    }

    // 같이 쓰기 가능
    for ((index, name ) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for ( i in 1..10 ){ // step 2 2씩 증가    in 10 downTo 1 >> 10부터 거꾸로 1까지
                            // 1..100 >> 1포함 1 until 100 >> 100미포함
        sum += i
    }
    println(sum)

    var index = 0
    while(index <10){
        println("print index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcehck(){
    var name = "joyce" // null 이면 안되는 타입
    var nullName : String? = null // nullable 타입이 됨

    var nameUppercase :String = name.toUpperCase()
    var nillNameInUpperCase : String? = nullName?.toUpperCase() // ?를 붙켜어서 사굥가능 >> null이면 전체가 null 반환, 아니면 정상작동

    print(nameUppercase)

    // ?:

    val lastName : String? = null
    val fullName = name + " " + (lastName?: "NO LastName" )

}

// !! 널이 아니라고 확신을 줄때 사용 왠만하면 사용 x
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!

    //let
    val email : String? = "sgc@naver.com"
    email?.let{ //email이 null아니면 let안을 실행해라

    }

}

