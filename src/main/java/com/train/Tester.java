package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int tickets = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int roundTickets = scanner.nextInt();

        getMoney totalmoney = new getMoney(tickets,roundTickets);

        System.out.println("Total tickets:"+tickets+"Round-trip:"+roundTickets+"Total:"+totalmoney.getMoney());

    }


}
