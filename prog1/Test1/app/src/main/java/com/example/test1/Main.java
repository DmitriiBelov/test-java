package com.example.test1;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void main(String[] args) {
        Shape crcl = new Circle(5.0f);
        Shape rctn = new Rectangle(5.0, 3.0);
        Shape larger = getLargerShape(crcl, rctn);

        System.out.println("The area: " + larger.area());
    }

    public static Shape getLargerShape(Shape s1, Shape s2)
    {
        if (s1.area() > s2.area())
            return s1;
        else
            return s2;
    }
}
