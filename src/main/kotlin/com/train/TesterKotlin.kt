package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
print("Please enter number of tickets:")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets::")
    var roundTicket = scanner.nextInt()
    var money =  TesterKotlin(ticket,roundTicket)

    println("Total tickets:"+ticket+"Round-trip:"+roundTicket+"Total:"+money.total())



}
class TesterKotlin(var ticket:Int,var roundTicket:Int) {

    fun total(): Int {
        var money = (1000*(ticket-roundTicket)+1800*(roundTicket))
        return money;
    }




}