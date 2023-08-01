package org.java.immobilare;

import java.util.Scanner;

public class MainScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgenziaImmobilare agenziaImmobilare = new AgenziaImmobilare();

        boolean exit = false;

        while(!exit){
            System.out.println("1-Aggiungi Immobile | 2-Mostra Lista | 3-Exit");
            String choiceMenu = scanner.nextLine();
            switch (choiceMenu){
                case "1":
                    System.out.println("1-Box | 2-Abitazione | 3-Ville");
                    String choiceAdd = scanner.nextLine();
                    if (choiceAdd.equalsIgnoreCase("1")){
                        System.out.println("Insert Code: ");
                        String codeBox = scanner.nextLine();
                        System.out.println("Insert Address: ");
                        String addressBox = scanner.nextLine();
                        System.out.println("Insert CAP: ");
                        String capBox = scanner.nextLine();
                        System.out.println("Insert City: ");
                        String cityBox = scanner.nextLine();
                        System.out.println("Insert Surface SM: ");
                        int surfaceSMBox = scanner.nextInt();
                        System.out.println("Insert parking Space: ");
                        int parkingSpaceBox = scanner.nextInt();
                        Box box = new Box(codeBox,addressBox,capBox,cityBox,surfaceSMBox,parkingSpaceBox);
                        agenziaImmobilare.addList(box);
                    }
                    if (choiceAdd.equalsIgnoreCase("2")){
                        System.out.println("Insert Code: ");
                        String codeAbitazione = scanner.nextLine();
                        System.out.println("Insert Address: ");
                        String addressAbitazione = scanner.nextLine();
                        System.out.println("Insert CAP: ");
                        String capAbitazione = scanner.nextLine();
                        System.out.println("Insert City: ");
                        String cityAbitazione = scanner.nextLine();
                        System.out.println("Insert Surface SM: ");
                        int surfaceSMAbitazione = scanner.nextInt();
                        System.out.println("Insert Rooms: ");
                        int roomsAbitazione = scanner.nextInt();
                        System.out.println("Insert Bathrooms: ");
                        int bathroomsAbitazione = scanner.nextInt();
                        Abitazione abitazione = new Abitazione(codeAbitazione,addressAbitazione,capAbitazione,cityAbitazione,surfaceSMAbitazione,roomsAbitazione,bathroomsAbitazione);
                        agenziaImmobilare.addList(abitazione);
                    }
                    if (choiceAdd.equalsIgnoreCase("3")){
                        System.out.println("Insert Code: ");
                        String codeVille = scanner.nextLine();
                        System.out.println("Insert Address: ");
                        String addressVille = scanner.nextLine();
                        System.out.println("Insert CAP: ");
                        String capVille = scanner.nextLine();
                        System.out.println("Insert City: ");
                        String cityVille = scanner.nextLine();
                        System.out.println("Insert Surface SM: ");
                        int surfaceSMVille = scanner.nextInt();
                        System.out.println("Insert Rooms: ");
                        int roomsVille = scanner.nextInt();
                        System.out.println("Insert Bathrooms: ");
                        int bathroomsVille = scanner.nextInt();
                        System.out.println("Insert Garden Size SM: ");
                        int gardensizeSMVille = scanner.nextInt();

                        Ville ville = new Ville(codeVille,addressVille,capVille,cityVille,surfaceSMVille,roomsVille,bathroomsVille,gardensizeSMVille);
                        agenziaImmobilare.addList(ville);
                    }
                    break;
                case "2":
                    for (Immobili i : agenziaImmobilare.getImmobiliList()) {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    exit = true;
                    break;
            }
        }
    }
}
