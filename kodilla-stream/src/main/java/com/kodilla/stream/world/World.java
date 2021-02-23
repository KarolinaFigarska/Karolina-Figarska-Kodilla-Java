package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public List<Continent> getListOfContinent() {
        return new ArrayList<>(continentList);
    }

    public BigDecimal getAllPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getListOfCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}