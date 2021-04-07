package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public  class ShoesOrderService implements OrderService {
    public boolean rent(User user,LocalDateTime from,LocalDateTime to) {
        System.out.println("Order Shoes: " + user.getName()+ " " + user.getSurname() + "\n"
                + "Ordered on: " + from.toString() + " Paid the day: " + to.toString());
        return true;
    }
}
