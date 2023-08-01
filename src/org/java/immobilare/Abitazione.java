package org.java.immobilare;

public class Abitazione extends Immobili{
    int rooms;
    int bathrooms;

    public Abitazione(String code, String address, String cap, String city, int surfaceSM, int rooms, int bathrooms) {
        super(code, address, cap, city, surfaceSM);
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    //Metodi

    @Override
    public String toString() {
        return "Abitazione{" + super.toString() +
                "rooms: " + rooms + " | " +
                "bathrooms: " + bathrooms + '}';

    }
}
