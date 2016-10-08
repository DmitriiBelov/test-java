package com.example.test1;

/**
 * Created by Дима on 08.10.2016.
 */

public class Circle extends Shape {
    public static final double PI = Math.PI;
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }
    public double area() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}
