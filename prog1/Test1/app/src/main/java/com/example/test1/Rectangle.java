package com.example.test1;


/**
 * Created by Дима on 08.10.2016.
 */

public class Rectangle extends Shape {
    public double dS;
    private double dL;

    public Rectangle(double shirina, double dlina) {
        this.dS = shirina;
        this.dL = dlina;
    }
    public double area() {
        return dL * dS;
    }
}
