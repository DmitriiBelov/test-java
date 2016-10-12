package com.example.test1;

import java.util.Scanner;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void main(String[] args) {
        int iDlina = 3;
        int iShirina = 4;
        Triangle trl = new Triangle(iDlina, iShirina);
        System.out.println("Area triangle: "+trl.area());

    }
}
