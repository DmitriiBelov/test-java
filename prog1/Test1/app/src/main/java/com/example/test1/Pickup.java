package com.example.test1;

/**
 * Created by Дима on 12.10.2016.
 */

public class Pickup implements PassengersAuto, CargoAuto {
    @Override
    public void transportCargo() {
        System.out.println("Везу груз.");
    }

    @Override
    public void transportPassengers() {
        System.out.println("Везу пассажиров.");

    }
}
