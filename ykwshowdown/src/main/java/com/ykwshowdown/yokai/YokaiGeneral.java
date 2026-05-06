package com.ykwshowdown.yokai;

import java.io.Serial;
import java.util.Scanner;

import com.ykwshowdown.battle.YokaiFight;
import com.ykwshowdown.database.DataBase;
import com.google.gson.annotations.SerializedName;

import com.ykwshowdown.fightingdata.*;

public class YokaiGeneral {

    Yokai yokai;
    @SerializedName("surnomYokai")
    String surnom;

    Stat StatActu;
    @SerializedName("IdEquipement")
    Equipement ItemYokai;
    @SerializedName("niveau")
    int level;

    Attitude attitudeYoKai;
    int LoafLevel;
    int TrainingCount;
    IV ivYokai;
    SportsClub SportsClub;

    public YokaiGeneral() {
        yokai = null;
        surnom = "???";
        StatActu = new Stat(0, 0, 0, 0, 0);
        ItemYokai = null;
        level = 0;
        attitudeYoKai = null;
        ivYokai = new IV(0, 0, 0, 0, 0);
        SportsClub = new SportsClub(0, 0, 0, 0);
        ItemYokai = null;
    }

    public YokaiGeneral(Yokai yokai, String surnom, int level, IV ivYokai) {

        this.yokai = yokai;
        this.surnom = surnom;
        this.level = level;
    }

    public YokaiGeneral(Yokai yokai, String surnom, int level, Attitude attitudeYoKai, Equipement EquipYokai) {

        this.yokai = yokai;
        this.surnom = surnom;
        this.ItemYokai = EquipYokai;
        this.level = level;

        this.attitudeYoKai = attitudeYoKai;

        this.SportsClub = new SportsClub(0, 0, 0, 0);
        this.StatActu = new Stat(0, 0, 0, 0, 0);
        this.ivYokai = new IV(0, 0, 0, 0, 0);
    }

    public Yokai GetYokai() {
        return yokai;
    }

    public String GetYokaiName() {
        return yokai.GetName();
    }

    public Tier GetTier() {
        return yokai.GetTier();
    }

    public IV GetIv() {
        return ivYokai;
    }

    public void setLevel(int level) {
        if (level < 0 || level > 99) {
            throw new IllegalArgumentException("Impossible, valeur de niveau non comprise");
        } else {
            this.level = level;
        }
    }

    public void addYokai(String str) {
        // Scanner sc = new Scanner(System.in);
        Yokai y = rechercheYokai(str);
        if (y != null) {
            this.yokai = y;
            setLevel(60);
        } else {
            System.out.println("Yokai non trouvé!");
        }
    }

    public void replaceYokai(String str) {
        Yokai y = rechercheYokai(str);

        if (y != null) {
            this.yokai = y;
            setLevel(60);
        } else {
            System.out.println("Yokai non trouvé!");
        }
    }

    public Yokai rechercheYokai(String nomRecherche) {
        try {
            Yokai y = DataBase.getYokai(nomRecherche);
            System.out.println(y.GetName());
            return y;
        } catch (Exception e) {
            System.out.println("Erreur de connexion au serveur, réessayez. (Methode Recherche Yokai)");
            System.out.println("Détail : " + e.getMessage());
            return null;
        }
    }

    public YokaiFight toYokaiFight(int teamNumber) {
        return new YokaiFight(
                this.GetName(),
                this.GetHP(),
                this.GetSTR(),
                this.GetSPR(),
                this.GetDEF(),
                this.GetSPE(),
                teamNumber);
    }

    public void setStat(Stat stat) {
        this.StatActu.HP = stat.HP;
        this.StatActu.STR = stat.STR;
        this.StatActu.SPR = stat.SPR;
        this.StatActu.DEF = stat.DEF;
        this.StatActu.SPE = stat.SPE;
    }

    public void setName() {
        final int MAXNAMESIZE = 26;
        Scanner sc = new Scanner(System.in);
        System.out.println("What will be the nickname of your yokai?");
        String str = sc.nextLine();
        if (str.length() > 26 || str.length() < 0) {
            System.out.println("The name of your yokai isn't correct, max limit is 26 caracter");
        } else {
            surnom = str;
        }
    }

    public void setIV(String name) {
        System.out.println("On va générer les IV de " + name);
        ivYokai.setIV();
    }

    public void setIv(int ivHP, int ivSTR, int ivSPR, int ivDEF, int ivSPE) {
        ivYokai.setIV(ivHP, ivSTR, ivSPR, ivDEF, ivSPE);
    }

    public void setAttitude(String str) {
        this.attitudeYoKai = new Attitude(str, 0, 0, 0, 0, 0);
    }

    public void setLevel(String str) {
        int level = Integer.parseInt(str);
        if (level < 0 || level > 99) {
            throw new IllegalArgumentException("Impossible, valeur de niveau non comprise");
        } else {
            this.level = level;
        }
    }

    public String GetTribe() {
        return yokai.GetTribe();
    }

    public Technique GetTechnique() {
        return yokai.GetTechnique();
    }

    public String GetElementWeak() {
        return yokai.GetWkElementString();
    }

    public String GetElementRes() {
        return yokai.GetResElementString();
    }

    public Attitude GetAttitude() {
        return this.attitudeYoKai;
    }

    public Equipement GetEquipement() {
        return ItemYokai;
    }

    public SportsClub GetSportsClub() {
        return SportsClub;
    }

    public int GetIvHP() {
        return ivYokai.GetIvHP();
    }

    public int GetIvSTR() {
        return ivYokai.GetIvSTR();
    }

    public int GetIvSPR() {
        return ivYokai.GetIvSPR();
    }

    public int GetIvDEF() {
        return ivYokai.GetIvDEF();
    }

    public int GetIvSPE() {
        return ivYokai.GetIvSPE();
    }

    public int GetHP() {
        return StatActu.HP;
    }

    public int GetSTR() {
        return StatActu.STR;
    }

    public int GetSPR() {
        return StatActu.SPR;
    }

    public int GetDEF() {
        return StatActu.DEF;
    }

    public int GetSPE() {
        return StatActu.SPE;
    }

    public String GetName() {
        return yokai.GetName();
    }

    public int GetLevel() {
        return level;
    }

}