package org.java.immobilare;

public class Ville extends Abitazione{
    int gardenSizeMS;

    public Ville(String code, String address, String cap, String city, int surfaceSM, int rooms, int bathrooms, int gardenSizeMS) {
        super(code, address, cap, city, surfaceSM, rooms, bathrooms);
        this.gardenSizeMS = gardenSizeMS;
    }

    //Metodi


    public void resetSurfaceSM(int surfaceSM, int gardenSizeMS) {
        super.resetSurfaceSM(surfaceSM);
        this.gardenSizeMS = gardenSizeMS;
    }



    @Override
    public String toString() {
        return "Ville{" + super.toString() +
                " gardenSizeMS: " + gardenSizeMS + '}';
    }
}
