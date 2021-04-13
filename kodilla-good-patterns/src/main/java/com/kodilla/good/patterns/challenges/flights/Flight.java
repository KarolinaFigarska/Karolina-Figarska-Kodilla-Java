package com.kodilla.good.patterns.challenges.flights;

public class Flight {

    private String departure;
    private String arrival;
    private String transfer;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Flight(String departure, String arrival, String transfer) {
        this.departure = departure;
        this.arrival = arrival;
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        if (transfer == null) {
            return "Flight: " +
                    "departure ='" + departure + '\'' +
                    ", arrival ='" + arrival + '\'';
        } else {
            return "Flight: " +
                    "departure='" + departure + '\'' +
                    ", arrival='" + arrival + '\'' +
                    ", transfer='" + transfer + '\'';
        }
    }
}
