package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.flights.MainFlights;
import com.kodilla.good.patterns.challenges.Food2Door.*;
import com.kodilla.good.patterns.challenges.orderService.*;
import com.kodilla.good.patterns.challenges.movieStore.MainMovieStore;



public class Main {
    public static void main(String[] args) {

        // Zadanie 13.5
        MainFlights mainFlights = new MainFlights();
        mainFlights.run();

        // Zadanie 13.4
        MainFood2Door mainFood2Door = new MainFood2Door();
        // mainFood2Door.run();

        // Zadanie 13.2
        MainOrderService mainOrderService = new MainOrderService();
        // mainOrderService.run();

        // Zadanie 13.1
        MainMovieStore mainMovieStore = new MainMovieStore();
        // mainMovieStore.run();

    }
}
