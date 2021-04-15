package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Supply {

    OrderService orderService = new OrderService();

    public void deliveryOfGoods() {
        orderService.addToOrderList(new HealthyShop(1, 2));
        orderService.addToOrderList(new ExtraFoodShop(8, 9, 4));
        orderService.addToOrderList(new GlutenFreeShop(5, 1, 5));
    }

    public void printDeliveryOfGoods() {
        List<ProducentOrder> producentOrderList = orderService.getOrderList();
        for (int i = 0; i < producentOrderList.size(); i++) {
            producentOrderList.get(i).printProducentOrder();
        }
    }
}