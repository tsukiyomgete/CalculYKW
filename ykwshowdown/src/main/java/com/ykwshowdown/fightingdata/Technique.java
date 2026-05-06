package com.ykwshowdown.fightingdata;

import com.ykwshowdown.yokai.Elemental;
public class Technique extends Attack{
    Elemental _elementalType;

    public Technique(int _idAttack,String nomAttack, int BasePower1, int BasePower10, int numberOfHit, Elemental elementalType)
    {
        super(_idAttack,nomAttack, BasePower1, BasePower10, numberOfHit, elementalType);
    }

    public String showTechniqueElemental()
    {
        return _elementalType.getElement();
    }

    public String getElementalTypeStringTechnique()
    {
        return _elementalType.getElement();
    }

}
