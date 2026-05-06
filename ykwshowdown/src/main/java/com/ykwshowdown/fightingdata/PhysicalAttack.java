package com.ykwshowdown.fightingdata;

import com.ykwshowdown.yokai.*;

public class PhysicalAttack extends Attack{
    
    public PhysicalAttack(int _idAttack,String nomAttack, int BasePower1, int BasePower10, int numberOfHit, Elemental elemental)
    {
        super(_idAttack,nomAttack, BasePower1, BasePower10, numberOfHit, elemental);
    }

    public String getElementalTypeStringTechnique()
    {
        return _elementalType.getElement();
    }
}
