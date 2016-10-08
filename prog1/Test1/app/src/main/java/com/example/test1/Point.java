package com.example.test1;

/**
 * Created by Дима on 08.10.2016.
 */

public class Point {
    int x;
    int y;

    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void PrintPoint() {
        System.out.println("("+x+","+y+")");
    }

    Point center(Point other) {
        return new Point((x+other.x)/2,(y+other.y)/2);
    }
}
