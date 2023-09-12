package com.example.test001

// 데이터를 담는 클래스

data class Ticket(val companyName : String , val name : String , var date : String, var seatNumber : Int )
// toSTring(), hashCode(), equals(), copy()

class TicketNomal(val companyName : String , val name : String , var date : String, var seatNumber : Int )

fun main(){
    val ticketA = Ticket("KoreanAir" , "gyu", "2023-10-07",14)
    val ticketB = TicketNomal("KoreanAir" , "gyu", "2023-10-07",14)

    println(ticketA)
    println(ticketB)
}