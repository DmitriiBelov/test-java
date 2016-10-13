package com.example.test1;

/**
 * Created by Дима on 13.10.2016.
 */

public class MyClass implements SomeClass.Callback {

    @Override
    public void callingBack(String s) {
        System.out.println("Вызов метода обратного вызова."+s);
    }
}
