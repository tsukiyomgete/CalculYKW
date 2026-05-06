package com.ykwshowdown.Talent;

import com.ykwshowdown.battle.*;
import com.ykwshowdown.yokai.*;
import com.ykwshowdown.fightingdata.*;

public abstract class Talent {
    protected int _id;
    protected String _nom;
    protected String _description;
    public abstract TriggerType getTriggerType();
    public abstract void activate(YokaiFight holder, YokaiFight target);
    
    

    // Version pour les talents adjacents, optionnelle
    public void activate(YokaiFight holder, YokaiFight ally1, YokaiFight ally2)
    {
        //nothing
    }

    public void showNomFamilleTalent() {
        System.out.println(_nom);
    }

    public int getID()
    {
        return _id;
    }

    public String getNom()
    {
        return _nom;
    }

    public String getDescription()
    {
        return _description;
    }
}
