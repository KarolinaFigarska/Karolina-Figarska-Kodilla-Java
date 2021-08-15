package com.kodilla.exception.test1;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    Map<String, Boolean> mapOfAirport;

    public FlightSearch() {
        this.mapOfAirport = new HashMap<>();
        mapOfAirport.put("Atlanta", true);
        mapOfAirport.put("Los Angeles", true);
        mapOfAirport.put("Dubai", true);
        mapOfAirport.put("Tokyo", true);
        mapOfAirport.put("Seoul", false);
        mapOfAirport.put("Frankfurt", false);
        mapOfAirport.put("Paris", false);
        mapOfAirport.put("Warsaw", false);
    }

    /**
     * Metoda powinna zwracać boolean czy da się polecieć na docelowe lotnisko.
     * Metoda nie powinna zawierać drukowania na konsoli.
     * Wyjątek tylko jeśli docelowego lotniska nie ma wogóle w mapie.
     */
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        boolean value = true;
        if (mapOfAirport.containsKey(flight.getArrivalAirport())) {
            for (String key : mapOfAirport.keySet()) {
                value = mapOfAirport.get(flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException("The flight is not available");
        }
        return value;
    }
}