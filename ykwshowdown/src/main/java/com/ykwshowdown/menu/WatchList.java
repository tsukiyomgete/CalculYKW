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
            System.out.println("3) Importer une équipe");
            System.out.println("4) Selectionner une équipe");
            System.out.println("5) Quitter");
            choix = Integer.parseInt(sc.nextLine());

            if (choix == 1) {
                addTeam();
            }
            if (choix == 2) {
                printTeam();
            }
            if (choix == 3) {
                importTeam();
            }
            if (choix == 4) {
                selectTeam();
            }
            if (choix == 5) {
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

    public void importTeam() {
        System.out.println("Veuillez copiez coller votre équipe ci dessous svp (ligne vide pour terminer)");
        StringBuilder sb = new StringBuilder();
        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            sb.append(line).append("\n");
        }
        WatchBuilder yT = new WatchBuilder();
        yT.importTeam(sb.toString());
        yourTeam.add(yT);
        nbTeam++;
        while (sc.hasNextLine() && !sc.nextLine().isEmpty()) {
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

            System.out.println("Voici toutes les options à ta disposition :");
            System.out.println("1) Modifier");
            System.out.println("2) Afficher");
            System.out.println("3) Importer une équipe");
            System.out.println("4) Quitter");
            choix = Integer.parseInt(sc.nextLine());
            if (choix == 1) {
                modifyTeam();
                break;
            }
            if (choix == 2) {
                System.out.println("Quel équipe souhaitez vous observez ?");
                String str = sc.nextLine();
                for (int i = 0; i < yourTeam.size(); i++) {
                    if (yourTeam.get(i) != null && str.equalsIgnoreCase(yourTeam.get(i).GetTeamName())) {
                        System.out.println(yourTeam.get(i));
                        System.out.println("Voulez vous plus de détails sur l'équipe ?");
                        str = sc.nextLine();
                        switch (str) {
                            case "Oui":
                                yourTeam.get(i).print();
                                break;
                            default:
                                return;
                        }
                        return;
                    }
                }
                System.out.println("Aucune équipe trouvée");
            }
            if (choix == 3) {
                importTeam();
            } else if (choix == 4) {
                break;
            }
        }
    }

    public void modifyTeam() {
        System.out.println("Quel équipe souhaitez vous modifier ?");
        String nomTeam = sc.nextLine();
        for (int i = 0; i < yourTeam.size(); i++) {
            if (yourTeam.get(i) != null && nomTeam.equalsIgnoreCase(yourTeam.get(i).GetTeamName())) {
                System.out.println("Quel action souhaitez vous faire ?");
                System.out.println("1) Ajouter des Yokai");
                System.out.println("2) Modifier les IV d'un Yokai");
                System.out.println("3) Remplacer des yokai");
                System.out.println("Sinon Rien");
                int choix = Integer.parseInt(sc.nextLine());

                switch (choix) {
                    case 1:
                        addYokaiToTeam(i);
                        break;
                    case 2:
                        setYokaiIvTeam(i);
                        break;
                    case 3:
                        replaceYokaiTeam(i);
                        break;
                    default:
                        return;
                }
            }

        }
        System.out.println("Aucune équipe trouvée");
        return;
    }

    public void addYokaiToTeam(int x) {
        System.out.println(yourTeam.get(x));
        while (yourTeam.get(x).GetTeamSize() < 6) {

            System.out.println("Slots restants : " + (6 - yourTeam.get(x).GetTeamSize()));
            System.out.println("Commande : add <rang> <nomYokai> | quit pour terminer");
            String cmd = sc.nextLine();

            if (cmd.equalsIgnoreCase("quit")) {
                break;
            }

            String[] parts = cmd.split(" ");
            if (parts[0].equalsIgnoreCase("add")) {
                int rang = Integer.parseInt(parts[1]);
                String nomYokai = String.join(" ", Arrays.copyOfRange(parts, 2, parts.length));
                yourTeam.get(x).addYokai(rang, nomYokai);
            }
        }
        return;
    }

    public void setYokaiIvTeam(int x) {
        System.out.println(yourTeam.get(x));
        String cmd;

        do {
            System.out.println("Commande: setIV <rang> | quit pour arrêter");
            cmd = sc.nextLine();
            if (!cmd.equalsIgnoreCase("quit")) {
                String[] parts = cmd.split(" ");
                if (parts[0].equalsIgnoreCase("setIV")) {
                    int rang = Integer.parseInt(parts[1]);
                    yourTeam.get(x).setIV(rang, yourTeam.get(x).getYokaiIndex(rang - 1).GetName());
                }
            }

        } while (!cmd.equalsIgnoreCase("quit"));
    }

    public void replaceYokaiTeam(int x) {
        System.out.println(yourTeam.get(x));
        String cmd;
        do {
            System.out.println("Commande : replace <rang> <Nom Yokai> | quit pour quitter");
            cmd = sc.nextLine();
            if (!cmd.equalsIgnoreCase("quit")) {
                String[] parts = cmd.split(" ");
                if (parts[0].equalsIgnoreCase("replace")) {
                    int rang = Integer.parseInt(parts[1]);
                    String nomYokai = String.join(" ", Arrays.copyOfRange(parts, 2, parts.length));
                    yourTeam.get(x).replaceYokai(rang, nomYokai);
                }
            }
        } while (!cmd.equalsIgnoreCase("quit"));
    }
}
