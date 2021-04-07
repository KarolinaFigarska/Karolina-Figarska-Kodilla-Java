package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public final class FlightBase {

    private final Map<String, List<String>> mapOfFlights;

    public FlightBase() {
        mapOfFlights = new HashMap<>();

        mapOfFlights.put(Flight.getKATOWICE(), new ArrayList<>(
                Arrays.asList(
                        Flight.getGDANSK(),
                        Flight.getBYDGOSZCZ()
                )
        ));

        mapOfFlights.put(Flight.getWROCLAW(), new ArrayList<>(
                Arrays.asList(
                        Flight.getSZCZECIN(),
                        Flight.getGDANSK(),
                        Flight.getBYDGOSZCZ()
                )
        ));

        mapOfFlights.put(Flight.getGDANSK(), new ArrayList<>(
                Arrays.asList(
                        Flight.getKATOWICE(),
                        Flight.getWROCLAW()
                )
        ));

        mapOfFlights.put(Flight.getBYDGOSZCZ(), new ArrayList<>(
                Arrays.asList(
                        Flight.getKATOWICE()
                )
        ));

        mapOfFlights.put(Flight.getSZCZECIN(), new ArrayList<>(
                Arrays.asList(
                        Flight.getWROCLAW()
                )
        ));
    }

    public Map<String, List<String>> getMapOfFlights() {
        return mapOfFlights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightBase)) return false;

        FlightBase that = (FlightBase) o;

        return mapOfFlights.equals(that.mapOfFlights);
    }

    @Override
    public int hashCode() {
        return mapOfFlights.hashCode();
    }

}
