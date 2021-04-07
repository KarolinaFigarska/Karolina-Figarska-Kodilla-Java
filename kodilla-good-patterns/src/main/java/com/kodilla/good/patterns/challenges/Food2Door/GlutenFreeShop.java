package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer {

    private static final String CORN_FLOUR = "Corn flour ";
    private static final String BREAD = "Bread ";
    private static final String COOKIES = "Cookies ";
    private static final String COMPANY = "GlutenFreeShop ";
    public Map<String, Integer> listOfProducts = new HashMap<>();
    private int quantityOfCornFlour;
    private int quantityOfBread;
    private int quantityOfCookies;


    public GlutenFreeShop(int quantityOfCornFlour, int quantityOfBread, int quantityOfCookies) {
        this.quantityOfCornFlour = quantityOfCornFlour;
        this.quantityOfBread = quantityOfBread;
        this.quantityOfCookies = quantityOfCookies;
    }

    public int getQuantityOfCornFlour() {
        return quantityOfCornFlour;
    }

    public int getQuantityOfBread() {
        return quantityOfBread;
    }

    public int getQuantityOfCookies() {
        return quantityOfCookies;
    }

    public ProducentOrder process() {
        listOfProducts.put(BREAD, getQuantityOfBread());
        listOfProducts.put(COOKIES, getQuantityOfCookies());
        listOfProducts.put(CORN_FLOUR, getQuantityOfCornFlour());
        return new ProducentOrder(listOfProducts, COMPANY);
    }
}
