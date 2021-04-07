package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Supply {

    Order order = new Order();

    public void deliveryOfGoods() {
        order.addToOrderList(new HealthyShop(1, 2));
        order.addToOrderList(new ExtraFoodShop(8, 9, 4));
        order.addToOrderList(new GlutenFreeShop(5, 1, 5));
    }

    public void printDeliveryOfGoods() {
        List<ProducentOrder> producentOrderList = order.getOrderList();
        for (int i = 0; i < producentOrderList.size(); i++) {
            producentOrderList.get(i).printProducentOrder();
        }
    }
}
