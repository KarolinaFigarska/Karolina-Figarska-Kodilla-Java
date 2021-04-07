package com.kodilla.good.patterns.challenges.orderService;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Sending e-mail to: " + user.getName() + " " + user.getSurname());
        System.out.println();
    }
}
