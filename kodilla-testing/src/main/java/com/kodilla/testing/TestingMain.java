package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,5);

        //pierwszy test jednostkowy
        if (calculator.add() == 15) {
            System.out.println("FIRST TEST OK!");
        } else {
            System.out.println("ERROR!");
        }

        //drugi test jednostkowy
        if (calculator.substract() == 5) {
            System.out.println("SECOND TEST OK!");
        } else {
            System.out.println("Error!");
        }
    }
}
