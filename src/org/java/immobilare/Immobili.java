package org.java.immobilare;

public abstract class Immobili {
    private String code;
    private String Address;
    private String cap;
    private String city;
    private int surfaceSM;

    private int interestedUser;


    //Costruttori

    public Immobili(String code, String address, String cap, String city, int surfaceSM) {
        this.code = code;
        this.Address = address;
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
        return Address;
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
                "Address: " + Address + " | " +
                "cap: " + cap + " | " +
                "city: " + city + " | " +
                "surfaceSM: " + surfaceSM + " | " +
                "interestedUser: " + interestedUser +
                " | ";
    }
}
