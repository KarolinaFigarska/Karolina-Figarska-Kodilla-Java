package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class UserRecord {
    private User user;
    private LocalDateTime orderDate;
    private LocalDateTime paymentDate;

    public UserRecord(final User user, final LocalDateTime orderDate, final LocalDateTime paymentDate) {
        this.user = user;
        this.orderDate = orderDate;
        this.paymentDate = paymentDate;
    }

    public UserRecord(final User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
