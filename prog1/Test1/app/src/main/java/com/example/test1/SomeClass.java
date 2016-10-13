package com.example.test1;


/**
 * Created by Дима on 13.10.2016.
 */

public class SomeClass {
    interface Callback{
        void callingBack(String s);
    }

    Callback callback;

    public void registerCallBack(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        System.out.println("Выполняется работа");

        callback.callingBack("Ответ");
    }
}
