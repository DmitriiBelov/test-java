package com.example.test1;

import java.util.Scanner;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

        someClass.registerCallBack(myClass);
        someClass.doSomething();
    }
}
