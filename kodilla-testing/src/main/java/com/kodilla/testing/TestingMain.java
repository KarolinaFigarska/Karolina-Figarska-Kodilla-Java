package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //pierwszy test jednostkowy
        if (calculator.add(10,5) == 15) {
            System.out.println("FIRST TEST OK!");
        } else {
            System.out.println("ERROR!");
        }

        //drugi test jednostkowy
        if (calculator.substract(10,4) == 5) {
            System.out.println("SECOND TEST OK!");
        } else {
            System.out.println("Error!");
        }
    }
}
