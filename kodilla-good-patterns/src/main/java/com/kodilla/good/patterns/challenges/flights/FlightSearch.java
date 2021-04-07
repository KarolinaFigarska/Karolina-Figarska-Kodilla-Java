package com.kodilla.good.patterns.challenges.flights;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {

    public static void flightFrom(String city) {

        FlightBase flightBase = new FlightBase();
        String availableFlightTo = "a";

        for (Map.Entry<String, List<String>> entry : flightBase.getMapOfFlights().entrySet()) {

            if (entry.getKey().contains(city)) {
                availableFlightTo = entry.getValue().stream()
                        .collect(Collectors.joining(", ", " there are available fly to: ", "."));
            }
        }
        System.out.println("From: " + city + availableFlightTo);
    }

    public static void flightTo(String city) {
        FlightBase flightBase = new FlightBase();

        String availableFlightFrom = flightBase.getMapOfFlights().entrySet().stream()
                .filter(a -> a.getValue().contains(city))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", ", " there are available fly from: ", "."));

        System.out.println("To: " + city + availableFlightFrom);
    }
    public static List<String> getDestination(String arrivalCity){
        FlightBase flightBase = new FlightBase();
        List<String> listOfCity = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : flightBase.getMapOfFlights().entrySet()) {

            if (entry.getKey().contains(arrivalCity)) {
                listOfCity = entry.getValue().stream()
                        .collect(Collectors.toList());
            }
        }
        return listOfCity;
    }

    public static void flightTransfer(String arrivalCity, String departureCity) {

        List<String> listOfCity = new ArrayList<>();
        List<String> listOfCity2 = new ArrayList<>();

        listOfCity = getDestination(arrivalCity);

        for (int i = 0; i < listOfCity.size(); i++) {
            listOfCity2 = getDestination(listOfCity.get(i));
            for (int j = 0; j < listOfCity2.size(); j++) {
                if(listOfCity2.get(j)==departureCity){
                    System.out.println("We find the flight from: " + arrivalCity + "->" + listOfCity.get(i) + "->" + listOfCity2.get(j));
                }
            }
        }
    }

}

