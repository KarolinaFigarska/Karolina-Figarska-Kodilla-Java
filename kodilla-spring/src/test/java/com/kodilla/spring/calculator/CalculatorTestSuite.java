package com.kodilla.spring.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //When
        double result = calculator.add(2, 5);

        //Then
        assertEquals(7, result);
    }

    @Test
    void testSub() {
        //When
        double result = calculator.sub(20, 15);

        //Then
        assertEquals(5, result);
    }

    @Test
    void testMul() {
        //When
        double result = calculator.mul(7, 7);

        //Then
        assertEquals(49, result);
    }

    @Test
    void testDiv() {
        //When
        double result = calculator.div(20, 5);

        //Then
        assertEquals(4, result);
    }
}
