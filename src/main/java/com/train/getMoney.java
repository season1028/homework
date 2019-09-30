package com.train;

public class getMoney {
    int tickets;
    int roundTickets;

    public  getMoney(int tickets, int roundTickets) {
        this.tickets = tickets;
        this.roundTickets = roundTickets;
    }
        public int getMoney(){

            int money = 1000 * (tickets - roundTickets) + 1800 * roundTickets;
            return money;
        }
    }




