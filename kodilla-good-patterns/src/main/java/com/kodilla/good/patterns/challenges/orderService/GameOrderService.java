package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class GameOrderService implements OrderService {
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("Order Game: " + user.getName() + " " + user.getSurname() + "\n"
                + "Ordered on: " + from.toString() + " Paid the day: " + to.toString());
        return true;
    }
}
