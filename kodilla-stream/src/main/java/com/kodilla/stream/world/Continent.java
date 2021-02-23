package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameOfContinent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public List<Country> getListOfCountry() {
        return new ArrayList<>(countryList);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "nameOfContinent='" + nameOfContinent + '\'' +
                '}';
    }
}

