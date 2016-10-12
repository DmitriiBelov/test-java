package com.example.test1;

/**
 * Created by Дима on 12.10.2016.
 */

public abstract class Figure {
    double a;
    double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract double area();
}
