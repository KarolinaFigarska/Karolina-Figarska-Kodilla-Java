package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideSquare;
    String shapeName;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
        this.shapeName = "Square";
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return sideSquare * sideSquare;
    }
}
