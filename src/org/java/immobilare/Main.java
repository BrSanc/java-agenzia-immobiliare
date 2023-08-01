package org.java.immobilare;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box("OP678GH", "Via ciao 123","20160","Milan", 14,4);
        Abitazione a1 = new Abitazione("GHJ23QWE", "Via ciao 98", "20160", "Milan", 90, 2,1);
        Ville v1 = new Ville("EWRT54W", "Via Ciao hola 12", "20600","Milan", 140,6,2,20);


        for (int i = 0; i < 20; i++) {
            b1.addInterestedUser();
        }
        for (int i = 0; i < 15; i++) {
            a1.addInterestedUser();
        }
        for (int i = 0; i < 8; i++) {
            v1.addInterestedUser();
        }

        AgenziaImmobilare agenziaImmobilare = new AgenziaImmobilare();
        agenziaImmobilare.addList(a1);
        agenziaImmobilare.addList(v1);
        agenziaImmobilare.addList(b1);


        System.out.println(b1.toString());
        System.out.println(a1.toString());
        System.out.println(v1.toString());

        System.out.println();
        System.out.println("Immobile Piu Richiesto: ");
        System.out.println(agenziaImmobilare.returnMostInterestingImmobile());
        System.out.println("Interested user: "+(agenziaImmobilare.returnMostInterestingImmobile()).getInterestedUser());

        System.out.println();
        System.out.println(agenziaImmobilare.searchImmobile("EWRT54W"));
        System.out.println(agenziaImmobilare.searchImmobile("OPRE98RE"));

    }
}
