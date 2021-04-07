package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class CreateUser {

//    public UserRecord createUserDonald() {
//
//        User user = new User("Donald", "Trump");
//
//        LocalDateTime rentFrom = LocalDateTime.of(2021, 8, 1,11,25);
//        LocalDateTime rentTo = LocalDateTime.of(2021, 8, 2, 8, 21);
//
//        return new UserRecord(user, rentFrom, rentTo);
//    }

//    public UserRecord createUserJoe() {
//
//        User user = new User("Joe", "Biden");
//
//        LocalDateTime rentFrom = LocalDateTime.of(2021, 5, 1,13,00);
//        LocalDateTime rentTo = LocalDateTime.of(2021, 5, 1, 12, 05);
//
//        return new UserRecord(user, rentFrom, rentTo);
//    }


    public UserRecord createUserDonald() {

        User user = new User("Donald", "Trump");

        return new UserRecord(user);
    }


    public UserRecord createUserJoe() {

        User user = new User("Joe", "Biden");

        return new UserRecord(user);
    }

    public void setOrderDate(UserRecord userRecord) {
        LocalDateTime orderDate = LocalDateTime.of(1, 1, 1, 1, 1);
        if (userRecord.getUser().getSurname() == "Trump" && userRecord.getUser().getName() == "Donald") {
            orderDate = LocalDateTime.of(2021, 8, 1, 11, 25);
        }
        if (userRecord.getUser().getSurname() == "Biden" && userRecord.getUser().getName() == "Joe") {
            orderDate = LocalDateTime.of(2021, 5, 1, 13, 00);
        }

        userRecord.setOrderDate(orderDate);
    }

    public void setPaymentDate(UserRecord userRecord) {
        LocalDateTime paymentDate = LocalDateTime.of(1, 1, 1, 1, 1);
        if (userRecord.getUser().getSurname() == "Trump" && userRecord.getUser().getName() == "Donald") {
            paymentDate = LocalDateTime.of(2021, 8, 2, 8, 21);
        }
        if (userRecord.getUser().getSurname() == "Biden" && userRecord.getUser().getName() == "Joe") {
            paymentDate = LocalDateTime.of(2021, 5, 1, 12, 05);
        }

        userRecord.setPaymentDate(paymentDate);
    }
}
