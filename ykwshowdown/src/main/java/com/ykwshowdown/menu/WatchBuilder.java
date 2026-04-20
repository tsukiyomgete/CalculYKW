package com.ykwshowdown.menu;

import java.util.Scanner;

import com.ykwshowdown.init.calcul;
import com.ykwshowdown.yokai.Tier;
import com.ykwshowdown.yokai.Yokai;
import com.ykwshowdown.yokai.YokaiGeneral;

public class WatchBuilder {
    String nomTeam;
    final int MAXYOKAI = 6;
    YokaiGeneral[] WatchTeam;
    Tier formatTeam;

    String strValid;
    int nbYokai;

    Scanner sc = new Scanner(System.in);

    public WatchBuilder() {
        this.nomTeam = "";
        this.WatchTeam = new YokaiGeneral[MAXYOKAI];
        formatTeam = null;
    }

    public WatchBuilder(String nomTeam) {
        this.nomTeam = nomTeam;
        this.WatchTeam = new YokaiGeneral[MAXYOKAI];
        formatTeam = null;
    }

    public int addYokai(int rang, String nomYokai) {
        if (nbYokai < MAXYOKAI) {
            if (rang < 1 || rang > 6) {
                throw new IllegalArgumentException("Rang pas compris entre 1 et 6");
            }
            rang -= 1;
            WatchTeam[rang] = new YokaiGeneral();
            WatchTeam[rang].addYokai(nomYokai);
            System.out.println(WatchTeam[rang].GetName() + " ajouté au rang " + (rang + 1));
            nbYokai++;
            return rang;
        } else {
            throw new IllegalArgumentException("Tu as déjà atteint la limite max de Yokai");
        }
    }

    public void replaceYokai(int rang, String str) {
        if (rang < 1 || rang > 6) {
            throw new IllegalArgumentException("Rang pas compris entre 1 et 6");
        }
        rang -= 1;
        String s = WatchTeam[rang].GetName();
        WatchTeam[rang].replaceYokai(str);
        System.out.println(s + " a été remplacé par " + WatchTeam[rang] + " au rang " + (rang + 1));
    }

    public void print() {
        System.out.println(nomTeam);
        for (int i = 0; i < WatchTeam.length; i++) {
            YokaiGeneral yk = WatchTeam[i];

            if (yk == null)
                continue;

            System.out.println(yk.GetName() + " Level: " + yk.GetLevel());
            System.out.println("Rang : " + (i + 1));

            if (yk.GetEquipement() != null || yk.GetAttitude() != null) {
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

    public String toString() {
        String result = "Nom de l'equipe : " + nomTeam + "\n";
        for (int i = 0; i < WatchTeam.length; i++) {
            if (WatchTeam[i] == null) {
                result += "Rang " + (i + 1) + " : (vide)\n";
            } else {
                result += "Rang numero : " + (i + 1) + "\n";
                result += WatchTeam[i].GetName() + "\n";
                result += "Lvl : " + WatchTeam[i].GetLevel() + "\n";
                result += "IVS : ";
                result += WatchTeam[i].GetIvHP() + " HP " + "/ ";
                result += WatchTeam[i].GetIvSTR() + " STR " + "/ ";
                result += WatchTeam[i].GetIvSPR() + " SPR " + "/ ";
                result += WatchTeam[i].GetIvDEF() + " DEF " + "/ ";
                result += WatchTeam[i].GetIvSPE() + " SPE " + "\n";
                result += "Attitude : " + WatchTeam[i].GetAttitude() + "\n";
                result += "\n";
            }
        }
        return result;
    }

    public void importTeam(String teamStr) {
        String[] ligne = teamStr.split("\n");
        String[] ligneEquipe = ligne[0].split(" : ", 2);
        String nomEquipe = ligneEquipe[1].trim();

        for (int i = 0; i < 6; i++) {
            int base = 1 + i * 6;
            if(base + 4 >= ligne.length) break;

            String[] ligneRang = ligne[base].split(" : ");
            int rang = Integer.parseInt(ligneRang[1].trim());

            String nomYokai = ligne[base + 1].trim();

            String[] ligneLvl = ligne[base + 2].split(" : ");
            int level = Integer.parseInt(ligneLvl[1].trim());

            String[] ligneIvs = ligne[base + 3].split(" : ");
            String[] ivParts = ligneIvs[1].split("/");
            int ivHP = Integer.parseInt(ivParts[0].replace("HP", "").trim());
            int ivSTR = Integer.parseInt(ivParts[1].replace("STR", "").trim());
            int ivSPR = Integer.parseInt(ivParts[2].replace("SPR", "").trim());
            int ivDEF = Integer.parseInt(ivParts[3].replace("DEF", "").trim());
            int ivSPE = Integer.parseInt(ivParts[4].replace("SPE", "").trim());

            String[] ligneAttitude = ligne[base + 4].split(" :");
            String attitude = ligneAttitude[1];

            YokaiGeneral yg = new YokaiGeneral();
            yg.addYokai(nomYokai);
            yg.setLevel(level);
            yg.setIv(ivHP, ivSTR, ivSPR, ivDEF, ivSPE);
            if (!attitude.trim().equalsIgnoreCase("null")) {
                yg.setAttitude(attitude);
            }
            WatchTeam[rang - 1] = yg;
            nbYokai++;
        }
        this.nomTeam = nomEquipe;
    }

    public void setIV(int rang, String name) {
        WatchTeam[rang].setIV(name);
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

    public YokaiGeneral getYokaiIndex(int rang) {
        return WatchTeam[rang];
    }

}
