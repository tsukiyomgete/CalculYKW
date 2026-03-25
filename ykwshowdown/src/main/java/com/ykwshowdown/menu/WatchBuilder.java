package com.ykwshowdown.menu;

import java.util.Scanner;

import com.ykwshowdown.init.calcul;
import com.ykwshowdown.yokai.Tier;
import com.ykwshowdown.yokai.YokaiGeneral;

public class WatchBuilder {
    String nomTeam;
    final int MAXYOKAI = 6;
    YokaiGeneral[] WatchTeam;
    Tier formatTeam;

    String strValid;
    int nbYokai;

    Scanner sc = new Scanner(System.in);

    public WatchBuilder(String nomTeam) {
        this.nomTeam = nomTeam;
        this.WatchTeam = new YokaiGeneral[MAXYOKAI];
        formatTeam = null;
    }

    public int addYokai() {
        if (nbYokai < MAXYOKAI) {
            int rang = -1;
            System.out.println("A quel rang voulez vous ajouter un yokai? (1-6)");
            String rangNum = sc.nextLine();
            rang = Integer.parseInt(rangNum);
            if (rang < 1 || rang > 6) {
                throw new IllegalArgumentException("Faux pas compris entre 1 et 6");
            } else {
                rang -= 1;
                System.out.println("Avec quel yokai souhaites tu le remplacer?");
                String yokaiString = sc.nextLine();
                YokaiGeneral yk = new YokaiGeneral();

                WatchTeam[rang] = new YokaiGeneral();
                WatchTeam[rang].addYokai(yokaiString);

                System.out.println(WatchTeam[rang].GetName());
                nbYokai++;
                return rang;
            }
        } else {
            throw new IllegalArgumentException("Tu as déjà atteint la limite max de Yokai");
        }

    }

    public void modifYokai(int rang) {
        System.out.println("    ");
        System.out.println("Veuillez Insérez le niveau de votre yokai");
        System.out.println("    ");
        String strLevel = sc.nextLine();
        WatchTeam[rang].setLevel(strLevel);
        System.out.println("    ");
        System.out.println("Lancement de méthode setIV");
        System.out.println("    ");
        WatchTeam[rang].setIV();
    }

    public void print() {
        System.out.println(nomTeam);
        for (int i = 0; i < WatchTeam.length; i++) {
            YokaiGeneral yk = WatchTeam[i]; 

            if (yk == null)
                continue;

            System.out.println(yk.GetName() + " Level: " + yk.GetLevel());
            System.out.println("Rang : " + (i + 1));

            if (yk.GetEquipement() != null || yk.GetAttitude() != null) { // ✅ null vérifié avant
                yk.setStat(calcul.calculStatsCorrected(yk));
            } else {
                yk.setStat(calcul.calculStatsUncorrected(yk));
            }

            System.out.println("        ");
            System.out.println("        ");
        }
    }

    public boolean isTeamValid() {
        String strNonValide = "Votre Equipe n'est pas valide pour ces raisons là :\n";
        String strValide = "Votre Equipe est valide pour ce Format";
        boolean isValid = true;
        for (int i = 0; i < WatchTeam.length; i++) {
            if (WatchTeam[i] == null) {
                strNonValide += "Il n'y a pas de yokai au rang : " + (i + 1) + "\n";
                isValid = false;
            } else if (WatchTeam[i].GetTier() == null) {
                // Le yokai existe mais n'a pas de tier
                strNonValide += "Le Yokai " + WatchTeam[i].GetYokaiName() + " n'a pas de tier attribué\n";
                isValid = false;
            } else if (!WatchTeam[i].GetTier().estSuperieur(formatTeam)) {
                // Le yokai a un tier mais il est banni
                strNonValide += WatchTeam[i].GetYokaiName() + " est banni dans le tier " + WatchTeam[i].GetTier()
                        + "\n";
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println(strValide);
            return true;
        } else {
            System.out.println(strNonValide);
            return false;
        }
    }

    public void setFormat(Tier format) {
        formatTeam = format;
    }

    public String GetName(int rang) {
        return WatchTeam[rang].GetName();
    }

    public String GetTeamName() {
        return nomTeam;
    }

    public int GetTeamSize() {
        return nbYokai;
    }

}
