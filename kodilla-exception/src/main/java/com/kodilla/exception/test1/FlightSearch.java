package com.kodilla.exception.test1;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    Map<String,Boolean> mapOfAirport = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {

        mapOfAirport.put("Atlanta", true);
        mapOfAirport.put("Los Angeles", true);
        mapOfAirport.put("Dubai", true);
        mapOfAirport.put("Tokyo", true);
        mapOfAirport.put("Seoul", false);
        mapOfAirport.put("Frankfurt", false);
        mapOfAirport.put("Paris", false);
        mapOfAirport.put("Warsaw", false);

        if (mapOfAirport.containsKey(flight.getArrivalAirport())) {
            System.out.println("The flight is available.");
        } else{
            throw new RouteNotFoundException("The flight is not available");
        }
    }
}
