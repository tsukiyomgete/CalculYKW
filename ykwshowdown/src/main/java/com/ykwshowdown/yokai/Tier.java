package com.ykwshowdown.yokai;

public enum Tier {
    Ubers("Ubers",1),
    OUBL("OUBL",2),
    OU("OU",3),
    UU("UU",4),
    RU("RU",5),
    NU("NU",6),
    PU("PU",7),
    ZU("ZU",8);

    private final String nomTier;
    private final int ordre;

    Tier(String tier, int ordre)
    {
        nomTier = tier;
        this.ordre = ordre;
    }

    public String getTier()
    {
        return nomTier;
    }

    public Tier getTierEnum()
    {
        return this;
    }

    public boolean estSuperieur(Tier tierTest)
    {
        return tierTest.ordre < this.ordre;
    }
    
}
