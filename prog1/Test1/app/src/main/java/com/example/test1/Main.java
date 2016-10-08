package com.example.test1;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void func() {
        System.out.println("hello from func!");

    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 3;
        point.y = 2;
        point.PrintPoint();
    }
}
