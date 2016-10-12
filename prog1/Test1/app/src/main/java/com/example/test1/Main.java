package com.example.test1;

import java.util.Scanner;

/**
 * Created by Дима on 06.10.2016.
 */

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pickup pickup = new Pickup();
        cat.getSound();
        pickup.transportCargo();
        pickup.transportPassengers();
    }
}
