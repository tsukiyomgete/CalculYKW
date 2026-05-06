package com.ykwshowdown.yokai;

import com.google.gson.annotations.SerializedName;
import com.ykwshowdown.fightingdata.*;

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

    double _baseAttackPerC;
    double _baseTechniquePerC;
    double _baseInspiritPerC;
    double _baseGuardPerC;

    @SerializedName("statA")
    int statAId;
    Stat statInit;

    @SerializedName("statB")
    int statBId;
    Stat statEnd;

    @SerializedName("technique")
    Technique technique;

    PhysicalAttack attack;

    @SerializedName("talent")
    String talent;

    @SerializedName("faiblesseElementaire")
    Elemental weakness;
    @SerializedName("faiblesseMultipliers")
    double weakMultipliers;

    @SerializedName("resistanceElementaire")
    Elemental resistance;
    @SerializedName("resistanceMultipliers")
    double resMultipliers;

    Inspirit inspiritYokai;

    double chanceOfBeingInspirited;

    public Equipement[] HoldingEquipement;

    public Yokai(String nom, int idMedallium, Rank rangYokai, Tribe tribuYokai, boolean isLegendary,
            PhysicalAttack attack, Technique tech, String talent, Inspirit inspirit,
            Elemental weak, double wkMultipliers, Elemental rest, double resMultipliers,
            double baseAtk, double baseTech, double baseInspirit, double baseGuard,
            double chanceInspirited, int maxItem) 
    {
        this.nom = nom;
        this.idMedallium = idMedallium;
        this.rangYokai = rangYokai;
        this.tribuYokai = tribuYokai;
        this.isLegendary = isLegendary;
        this.yokaiTier = Tier.NU;
        this.attack = attack;
        this.technique = tech;
        this.talent = talent;
        this.inspiritYokai = inspirit;
        this.weakness = weak;
        this.weakMultipliers = wkMultipliers;
        this.resistance = rest;
        this.resMultipliers = resMultipliers;
        this._baseAttackPerC = baseAtk;
        this._baseTechniquePerC = baseTech;
        this._baseInspiritPerC = baseInspirit;
        this._baseGuardPerC = baseGuard;
        this.chanceOfBeingInspirited = chanceInspirited;
        this.HoldingEquipement = new Equipement[maxItem];
    }

    public String GetName() {
        return nom;
    }

    public String GetTierString() {
        return yokaiTier.getTier();
    }

    public Tier GetTier() {
        return yokaiTier;
    }

    public char GetRank() {
        return rangYokai.GetRank();
    }

    public int GetID() {
        return idMedallium;
    }

    public String GetTribe() {
        return tribuYokai.GetTribe();
    }

    public Technique GetTechnique() {
        return technique;
    }

    public String GetWkElementString() {
        return weakness.getElement();
    }

    public String GetWkElement() {
        return weakness.getElement();
    }

    public String GetResElementString() {
        return resistance.getElement();
    }

    public int getStatAId() {
        return statAId;
    }

    public int getStatBId() {
        return statBId;
    }

    public Stat getStatA() {
        return statInit;
    }

    public Stat getStatB() {
        return statEnd;
    }

    public void setStatA(Stat sA) {
        statInit = sA;
    }

    public void setStatB(Stat sB) {
        statEnd = sB;
    }

    public String getTalent() {
    return talent;
}

public double getWeakMultipliers() {
    return weakMultipliers;
}

public double getResMultipliers() {
    return resMultipliers;
}

public PhysicalAttack getAttack() {
    return attack;
}

public Inspirit getInspirit() {
    return inspiritYokai;
}

public double getBaseAttackPerC() {
    return _baseAttackPerC;
}

public double getBaseTechniquePerC() {
    return _baseTechniquePerC;
}

public double getBaseInspiritPerC() {
    return _baseInspiritPerC;
}

public double getBaseGuardPerC() {
    return _baseGuardPerC;
}

public double getChanceInspirited() {
    return chanceOfBeingInspirited;
}

public int getMaxItem() {
    return HoldingEquipement.length;
}

}
