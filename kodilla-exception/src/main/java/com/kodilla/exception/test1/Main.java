package com.kodilla.exception.test1;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Tokyo");
        FlightSearch flightSearch = new FlightSearch();
        try {
          flightSearch.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("I am sorry. The flight is not available.");
        }
    }
}
