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

        Advice advice = new Advice();
        advice.message();

        /*double dV = sum(1.2f,1.3f);
        System.out.println(dV);
        int iV = sum(1,3);
        System.out.println(iV);*/

        /*Student s = new Student();
        s.setName("Dima");
        String name = s.getName();
        System.out.println(name);*/
    }
}
