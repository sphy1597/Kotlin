package com.example.test001

// 오브젝트

// 실행할 때 객체는 딱 한번만 만들어짐 Singleton Pattern >> 불필요한 메모리 누수 방지
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main (){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)

    println(CarFactory.cars.size.toString())
}