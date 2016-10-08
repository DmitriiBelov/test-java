package com.example.test1;

/**
 * Created by Дима on 08.10.2016.
 */

public class Advice extends Thought {
    public void message() {
        System.out.println("Hello from Advice!");
        super.message();
    }
}
