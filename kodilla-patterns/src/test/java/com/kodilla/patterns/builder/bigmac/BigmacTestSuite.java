package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .burgers(Burgers.BEEF_CHOPS_2)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredients.BACON)
                .ingredient(Ingredients.CHEESE)
                .build();

        //When
        int quantityOfIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, quantityOfIngredients);

    }
}
