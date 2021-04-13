package com.kodilla.good.patterns.challenges.flights;


public class MainFlights {
    public static void main(String[] args) {

        FlightSearch flightSearchNr1 = new FlightSearch();

        Flight flightNr1 = flightSearchNr1.flightFrom(Cities.getKATOWICE());
        System.out.println(flightNr1);

        Flight flightNr2 = flightSearchNr1.flightTo(Cities.getKATOWICE());
        System.out.println(flightNr2);

        Flight flightNr3 = flightSearchNr1.flightTransfer(Cities.getKATOWICE(), Cities.getWROCLAW());
        System.out.println(flightNr3);
    }
}
