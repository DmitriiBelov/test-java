package com.example.test1;

/**
 * Created by Дима on 12.10.2016.
 */

public class Cat implements Sound {
    String type;
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void getSound() {
        System.out.println("Мяу-мяу");
    }
}
