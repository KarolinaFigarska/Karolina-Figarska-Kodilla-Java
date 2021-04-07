package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {

    private static final String APPLE = "Apple ";
    private static final String LEMON = "Lemon ";
    private static final String COMPANY = "HealthyShop ";
    public Map<String, Integer> listOfProducts = new HashMap<>();

    private int quantityOfApple;
    private int quantityOfLemon;

    public HealthyShop(int quantityOfApple, int quantityOfLemon) {
        this.quantityOfApple = quantityOfApple;
        this.quantityOfLemon = quantityOfLemon;
    }

    public int getQuantityOfApple() {
        return quantityOfApple;
    }

    public int getQuantityOfLemon() {
        return quantityOfLemon;
    }

    public ProducentOrder process() {
        listOfProducts.put(APPLE, getQuantityOfApple());
        listOfProducts.put(LEMON, getQuantityOfLemon());
        return new ProducentOrder(listOfProducts, COMPANY);
    }

}
