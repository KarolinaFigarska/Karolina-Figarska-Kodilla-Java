package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<ProducentOrder> orderList = new ArrayList<>();

    public void addToOrderList(Producer producer) {
        orderList.add(producer.process());

    }

    public List<ProducentOrder> getOrderList() {
        return orderList;
    }
}

