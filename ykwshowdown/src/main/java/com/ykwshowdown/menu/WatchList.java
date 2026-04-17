package com.ykwshowdown.menu;

import java.util.*;
import com.ykwshowdown.yokai.*;
import com.ykwshowdown.user.*;

public class WatchList {
    final int MAXTEAM = 20;
    ArrayList<WatchBuilder> yourTeam;
    int nbTeam;
    User userActuel;

    Scanner sc = new Scanner(System.in);

    public WatchList() {
        yourTeam = new ArrayList<WatchBuilder>();
        nbTeam = 0;

    }

    public void menu(User userx) {
        int choix = -1;
        userActuel = userx;

        while (choix != 4) {
            System.out.println("    MENU DES EQUIPES    ");
            System.out.println("1) Crée une équipe");
            System.out.println("2) Afficher les équipes");
            System.out.println("3) Selectionner une équipe");
            System.out.println("4) Quitter");
            choix = sc.nextInt();
            sc.nextLine();

            if (choix == 1) {
                addTeam();
            }
            if (choix == 2) {
                printTeam();
            }
            if (choix == 3) {
                selectTeam();
            }
            if (choix == 4) {
                System.out.println("Bye !");
            }

        }

    }

    public User selectTeam() {
        System.out.println("Selectionne ton équipe");
        String nomTeam = sc.nextLine();
        for (int i = 0; i < yourTeam.size(); i++) {
            if (yourTeam.get(i) != null && nomTeam.equalsIgnoreCase(yourTeam.get(i).GetTeamName())) {
                userActuel.setTeam(yourTeam.get(i));
                return userActuel;
            }
        }
        System.out.println("Aucune équipe trouvée");
        return null;
    }

    public void addTeam() {
        if (nbTeam < MAXTEAM) {
            System.out.println("Choisissez le nom de votre équipe :");
            String nomTeam = sc.nextLine();

            yourTeam.add(nbTeam, new WatchBuilder(nomTeam));
            nbTeam++;
            System.out.println("L'équipe " + nomTeam + " a été crée! ");
            // ← supprime printTeam() ici
        } else {
            System.out.println("Nombre maximum d'équipe atteintes !");
        }
    }

    public void printTeam() {
        int choix = -1;
        while (choix != 3) {
            if (nbTeam == 0) {
                System.out.println("Aucune équipe n'est encore disponible");
                return;
            }
            System.out.println("    TES EQUIPES     ");
            System.out.printf("%-10s %-5s%n", "Nom de l'équipe", "Nombre de yokai");
            for (int i = 0; i < nbTeam; i++) {
                WatchBuilder wT = yourTeam.get(i);
                System.out.printf("%-10s %-5d%n", wT.GetTeamName(), wT.GetTeamSize());
            }
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");

            System.out.println("Veux-tu quitter où modifier tes équipes ?");
            System.out.println("1) Modifier");
            System.out.println("2) Afficher");
            System.out.println("3) Quitter");
            choix = Integer.parseInt(sc.nextLine());
            if (choix == 1) {
                modifyTeam();
                break;
            }
            if (choix == 2) {
                System.out.println("Quel équipe souhaitez vous observez ?");
                String nomTeam = sc.nextLine();
                for (int i = 0; i < yourTeam.size(); i++) {
                    if (yourTeam.get(i) != null && nomTeam.equalsIgnoreCase(yourTeam.get(i).GetTeamName())) {
                        yourTeam.get(i).print();
                        return;
                    }
                }
                System.out.println("Aucune équipe trouvée");
            } else if (choix == 3) {
                break;
            }
        }
    }

    public void modifyTeam() {
        System.out.println("Quel équipe souhaitez vous modifier ?");
        String nomTeam = sc.nextLine();
        for (int i = 0; i < yourTeam.size(); i++) {
            if (yourTeam.get(i) != null && nomTeam.equalsIgnoreCase(yourTeam.get(i).GetTeamName())) {
                yourTeam.get(i).addYokai(); 
                return;
            }
        }
        System.out.println("Aucune équipe trouvée");
    }

}