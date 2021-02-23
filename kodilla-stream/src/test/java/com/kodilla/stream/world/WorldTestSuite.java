package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    public void testGetAllPeopleQuantity() {
        //Given

        Country country1 = new Country("Poland",new BigDecimal("5"));
        Country country2 = new Country("Spain",new BigDecimal("6"));
        Country country3 = new Country("Italy",new BigDecimal("7"));

        Country country4 = new Country("Armenia",new BigDecimal("8"));
        Country country5 = new Country("Philippines",new BigDecimal("9"));
        Country country6 = new Country("India",new BigDecimal("10"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        //When
        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);

        //Then
        assertEquals(new BigDecimal("45"),world.getAllPeopleQuantity());
    }
}
