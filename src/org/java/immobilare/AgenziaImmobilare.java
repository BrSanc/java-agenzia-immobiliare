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
        immobiliList.add(immobili);
    }

    public Immobili searchImmobile(String codeNum) {
        boolean found = false;
        int contatore = 0;
        Immobili immobileSearched = null;

        for (int i = 0; i < immobiliList.size() && !found; i++) {
            if (codeNum.equalsIgnoreCase(immobiliList.get(i).getCode())) {
                immobileSearched = immobiliList.get(i);
                found = true;
            }
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


