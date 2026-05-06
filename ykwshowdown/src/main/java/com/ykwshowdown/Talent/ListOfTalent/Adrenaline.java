package com.ykwshowdown.Talent.ListOfTalent;

import com.ykwshowdown.Talent.*;
import com.ykwshowdown.battle.TriggerType;
import com.ykwshowdown.battle.YokaiFight;

public class Adrenaline extends Talent{
    
    private int _boostAmount;
    private int _currentBoost;


    public TriggerType getTriggerType()
    {
        return TriggerType.ON_DEFEAT_ENEMY;
    }

    Adrenaline(int boostAmount)
    {
        _nom = "Adrenaline";
        _boostAmount = boostAmount;
        _currentBoost = 0;
    }

    public void activate(YokaiFight holder, YokaiFight target)
    {
        /* 
        _currentBoost *= _boostAmount;
        holder.addAtkBoost(_currentBoost);
        System.out.println("Activating " + holder.getName() + "'s skill adrenaline boost");
        */
    }
}
