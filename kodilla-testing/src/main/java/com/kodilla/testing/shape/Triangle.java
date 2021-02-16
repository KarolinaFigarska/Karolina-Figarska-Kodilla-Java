package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double sideTriangle;
    private double heightTriangle;
    private String shapeName;

    public Triangle(double sideTriangle, double heightTriangle) {
        this.sideTriangle = sideTriangle;
        this.heightTriangle = heightTriangle;
        this.shapeName = "Triangle";
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return (sideTriangle * heightTriangle)/2;
    }
}
