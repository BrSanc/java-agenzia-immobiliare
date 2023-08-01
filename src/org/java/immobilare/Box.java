package org.java.immobilare;

import java.util.Scanner;

public class Box extends Immobili{

    int parkingSpaces;

    public Box(String code, String address, String cap, String city, int surfaceSM, int parkingSpaces) {
        super(code, address, cap, city, surfaceSM);
        this.parkingSpaces = parkingSpaces;
    }

    public Box(){

    }

    //getter-------------------------

    //Metodi

    @Override
    public String toString() {
        return "Box{" + super.toString() +
                "parkingSpaces: " + parkingSpaces + '}';
    }

}
