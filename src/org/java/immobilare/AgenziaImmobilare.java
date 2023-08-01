package org.java.immobilare;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobilare {
    private List<Immobili> immobiliList;

    //costruttore

    public AgenziaImmobilare() {
        this.immobiliList = new ArrayList<>();
    }

    //getter


    //Metodi

    public void addList(Immobili immobili){
        String code = immobili.getCode();
        if (searchImmobile(code) != null){
            throw new IllegalArgumentException("Immobile è gia presente nella lista");
        }
        immobiliList.add(immobili);
    }

    public Immobili searchImmobile(String codeNum) throws NullPointerException{
        Immobili immobileSearched = null;

        for (int i = 0; i < immobiliList.size(); i++) {
            if (codeNum.equalsIgnoreCase(immobiliList.get(i).getCode())) {
                immobileSearched = immobiliList.get(i);

            }
        }
        if (immobileSearched == null){
            System.out.print("Immobile non trovato: ");
        }

        return immobileSearched;
    }



    public Immobili returnMostInterestingImmobile() {
        Immobili max= null;
        for (Immobili i: immobiliList) {
            int maxinterested = 0;
            if (i.getInterestedUser() > maxinterested) {
                max = i;
            }
        }
        return max;
    }
}


