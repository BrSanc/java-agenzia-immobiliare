package org.java.immobilare;

import java.util.Scanner;

public abstract class Immobili {
    private String code;
    private String address;
    private String cap;
    private String city;
    private int surfaceSM;

    private int interestedUser;


    //Costruttori

    public Immobili(String code, String address, String cap, String city, int surfaceSM) {
        this.code = code;
        this.address = address;
        this.cap = cap;
        this.city = city;
        this.surfaceSM = surfaceSM;
        this.interestedUser = 0;
    }
    public Immobili() {
        this.code = code;
        this.address = address;
        this.cap = cap;
        this.city = city;
        this.surfaceSM = surfaceSM;
        this.interestedUser = 0;
    }


    //Getter

    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }

    public String getCap() {
        return cap;
    }

    public String getCity() {
        return city;
    }

    public int getSurfaceSM() {
        return surfaceSM;
    }

    public int getInterestedUser() {
        return interestedUser;
    }

    //Setter

    //Metodi

    public void addInterestedUser(){
        interestedUser = interestedUser + 1;
    }

    public void resetSurfaceSM(int surfaceSM) {
        if (surfaceSM <= 0){
            throw new IllegalArgumentException("Devi darmi un numero superiore a 0");
        }
        this.surfaceSM = surfaceSM;
    }




    @Override
    public String toString() {
        return "code: " + code + " | " +
                "Address: " + address + " | " +
                "cap: " + cap + " | " +
                "city: " + city + " | " +
                "surfaceSM: " + surfaceSM + " | " +
                "interestedUser: " + interestedUser +
                " | ";
    }


}
