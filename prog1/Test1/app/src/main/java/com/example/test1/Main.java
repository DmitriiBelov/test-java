package com.example.test1;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void main(String[] args) {

        boolean bRes = true;
        String sA = new String("string");
        String sB = new String("string");
        String sA2 = sA;

        bRes = sA == sB;

        if (bRes)
            System.out.println("It's true!");
        else
            System.out.println("It's false!");
    }
}
