package com.ykwshowdown.yokai;

public enum Tier {
    Ubers("Ubers"),
    OUBL("OUBL"),
    OU("OU"),
    UU("UU"),
    RU("RU"),
    NU("NU"),
    PU("PU"),
    ZU("ZU");

    private final String nomTier;

    Tier(String tier)
    {
        nomTier = tier;
    }

    public String getTier()
    {
        return nomTier;
    }
    
}
