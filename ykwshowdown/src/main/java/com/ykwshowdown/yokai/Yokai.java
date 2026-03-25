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
    @SerializedName("nomTribu")
    Tribe tribuYokai;
    @SerializedName("idMedaillum")
    int idMedallium;


    @SerializedName("statA")
    int statAId;
    Stat statInit;

    @SerializedName("statB")
    int statBId;
    Stat statEnd;
    
    @SerializedName("typeElementaire")
    Elemental type;
    @SerializedName("faiblesseElementaire")
    Elemental weakness;
    @SerializedName("resistanceElementaire")
    Elemental resistance;


    public Equipement[] HoldingEquipement;

    public Yokai(String nom, int idMedallium, Rank rangYokai, Tribe tribuYokai, boolean isLegendary, Elemental Type, Elemental weak, Elemental rest, int maxItem)
    {
        this.nom = nom;
        this.idMedallium = idMedallium;
        this.rangYokai = rangYokai;
        this.tribuYokai = tribuYokai;
        this.isLegendary = isLegendary;
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

    public int getStatAId() { return statAId; }
    public int getStatBId() { return statBId; }

    public Stat getStatA() {return statInit;}
    public Stat getStatB() {return statEnd;}

    public void setStatA(Stat sA)
    {
        statInit = sA;
    }

    public void setStatB(Stat sB)
    {
        statEnd = sB;
    }


}
