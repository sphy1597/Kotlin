package com.example.test001



// open을 해야 상속가능
open class Human(_name : String = "ㅁㄴㅇ "){ // 생성자 대신 옆에 써서 객체 생성시 필요한 값을 받아옴
                    // (val name : String) 처럼 사용 가능 (val name : sTring = "asd" ) >> 디폴트 값을 주어줘서 객체생성시 값 안넣도 됨
    val name : String = _name

    constructor(name : String, age:Int):this(name){
        println("My name is ${name}, ${age} yaers old")

    }

    init{ // 주생성자, 객체 생성시 자동으로 돌아가는 함수
        println("init")
    }

    fun eatingCake(){
        println(" This is so YUUMMMYYY ~~~ ")
    }

    open fun singASong(){ // open해야 오버라이딩 가능
        println("lalala")
    }

}


class Korean : Human(){
    override fun singASong(){
        super.singASong() //부모의 함수 사용 가능
        println("라라라")
    }
}



fun main(){

}