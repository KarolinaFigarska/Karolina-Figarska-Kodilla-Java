package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class ProducentOrder {
    private Map<String, Integer> listOfProducts;
    private String nameOfCompany;

    public ProducentOrder(Map<String, Integer> listOfProducts, String nameOfCompany) {
        this.listOfProducts = listOfProducts;
        this.nameOfCompany = nameOfCompany;
    }

    public void printProducentOrder() {
        System.out.println(nameOfCompany);
        for (Map.Entry<String, Integer> entry : listOfProducts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
    }
}
