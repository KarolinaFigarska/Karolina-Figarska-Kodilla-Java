package com.kodilla.exception.test1;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Dubai", "Warsaw");
        FlightSearch flightSearch = new FlightSearch();
        try {
            boolean isFlightAvailable = flightSearch.findFlight(flight1);
            if (isFlightAvailable) {
                System.out.println("The flight is available");
            } else {
                System.out.println("The flight is not available now");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("I am sorry. The flight is not available.");
        }
    }
}
