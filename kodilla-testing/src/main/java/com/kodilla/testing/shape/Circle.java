package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private String shapeName;

    public Circle(double radius) {
        this.radius = radius;
        this.shapeName = "Circle";
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return Math.PI*radius*radius;
    }
}
