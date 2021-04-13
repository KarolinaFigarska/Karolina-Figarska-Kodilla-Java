package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public final class FlightBase {

    private final Map<String, List<String>> mapOfFlights;

    public FlightBase() {
        mapOfFlights = new HashMap<>();

        mapOfFlights.put(Cities.getKATOWICE(), new ArrayList<>(
                Arrays.asList(
                        Cities.getGDANSK(),
                        Cities.getBYDGOSZCZ()
                )
        ));

        mapOfFlights.put(Cities.getWROCLAW(), new ArrayList<>(
                Arrays.asList(
                        Cities.getSZCZECIN(),
                        Cities.getGDANSK(),
                        Cities.getBYDGOSZCZ()
                )
        ));

        mapOfFlights.put(Cities.getGDANSK(), new ArrayList<>(
                Arrays.asList(
                        Cities.getKATOWICE(),
                        Cities.getWROCLAW()
                )
        ));

        mapOfFlights.put(Cities.getBYDGOSZCZ(), new ArrayList<>(
                Arrays.asList(
                        Cities.getKATOWICE()
                )
        ));

        mapOfFlights.put(Cities.getSZCZECIN(), new ArrayList<>(
                Arrays.asList(
                        Cities.getWROCLAW()
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
