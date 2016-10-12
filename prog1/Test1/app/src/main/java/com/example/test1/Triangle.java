package com.example.test1;

/**
 * Created by Дима on 12.10.2016.
 */

public class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        return a * b / 2;
    }
}
