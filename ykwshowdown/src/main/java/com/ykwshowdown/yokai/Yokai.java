package com.ykwshowdown.yokai;

import com.google.gson.annotations.SerializedName;

public class Yokai {
    
    @SerializedName("nomYokai")
    String nom;
    @SerializedName("rangYokai")
    Rank rangYokai;
    @SerializedName("tierYokai")
    Tier yokaiTier;
    
    face_icon faceYoKai;
    
    boolean isLegendary;
    @SerializedName("tribuYokai")
    Tribe tribuYokai;
    @SerializedName("idMedaillum")
    int idMedallium;
    @SerializedName("statA")
    Stat statInit;
    @SerializedName("statB")
    Stat statEnd;
    
    @SerializedName("typeElementaire")
    Elemental type;
    @SerializedName("faiblesseElementaire")
    Elemental weakness;
    @SerializedName("resistanceElementaire")
    Elemental resistance;


    public Equipement[] HoldingEquipement;

    public Yokai(String nom,int idMedallium, Rank rangYokai, Tribe tribuYokai,boolean isLegendary,Stat statInit, Stat statEnd, Elemental Type,Elemental weak, Elemental rest, int maxItem)
    {
        this.nom = nom;
        this.idMedallium = idMedallium;
        this.rangYokai = rangYokai;
        this.tribuYokai = tribuYokai;
        this.isLegendary = isLegendary;
        this.statInit = statInit;
        this.statEnd = statEnd;
        this.yokaiTier = Tier.NU;
        
        this.type = Type;
        this.resistance = rest;
        this.weakness = weak;
        
        this.HoldingEquipement = new Equipement[maxItem];
    }



    public String GetName()
    {
        return nom;
    }

    public String GetTierString()
    {
        return yokaiTier.getTier();
    }

    public Tier GetTier()
    {
        return yokaiTier;
    }
    
    public char GetRank()
    {
        return rangYokai.GetRank();
    }

    public int GetID()
    {
        return idMedallium;
    }
    public String GetTribe()
    {
        return tribuYokai.GetTribe();
    }

    public String GetTypeElement()
    {
        return type.getElement();
    }

    public String GetWkElement()
    {
        return weakness.getElement();
    }

    public String GetResElement()
    {
        return resistance.getElement();
    }

    public Stat GetStatInit()
    {
        return statInit;
    }

    public Stat GetStatEnd()
    {
        return statEnd;
    }



}
