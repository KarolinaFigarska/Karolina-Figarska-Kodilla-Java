package com.kodilla.good.patterns.challenges.flights;

public class MainFlights {
    public static void run(){
        FlightSearch.flightFrom(Flight.getKATOWICE());
        FlightSearch.flightFrom(Flight.getBYDGOSZCZ());

        FlightSearch.flightTo(Flight.getKATOWICE());
        FlightSearch.flightTo(Flight.getWROCLAW());

        FlightSearch.flightTransfer(Flight.getKATOWICE(),Flight.getWROCLAW());
    }
}
