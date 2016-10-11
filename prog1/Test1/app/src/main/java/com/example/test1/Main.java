package com.example.test1;

import java.util.Scanner;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void main(String[] args) {
        int a = 4;
        try {
            System.out.println(a/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(a);
        }

        // усложнённая обработка исключений
        /*int[] m= {-1,0,1};
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            m[a] = 4/a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) {
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (Exception e) {
            System.out.println("Произошло ещё какое-то исключение");
        }*/

        // простая обработка исключений
        /*int a = 4;
        try {
            System.out.println(a/0);
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя!");
        }*/
    }
}
