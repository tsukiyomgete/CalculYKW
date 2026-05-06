package com.ykwshowdown.fightingdata;

import com.ykwshowdown.yokai.*;


public abstract class Attack
{
    protected int _idAttack;
    protected String _nomAttack;
    protected int _BasePower1;
    protected int _BasePower10;
    protected int _numberOfHit;
    protected Elemental _elementalType;

    Attack(int _idAttack, String nomAttack, int BasePower1, int BasePower10, int numberOfHit, Elemental elementType)
    {
        this._idAttack = _idAttack;
        _nomAttack = nomAttack;
        _BasePower1 = BasePower1;
        _BasePower10 = BasePower10;
        _numberOfHit = numberOfHit;
        _elementalType = elementType;

    }

    public int getId()
    {
        return _idAttack;
    }

    public String getNomAttack()
    {
        return _nomAttack;
    }

    public int getBP1()
    {
        return _BasePower1;
    }

    public int getBP10()
    {
        return _BasePower10;
    }

    public int getNHIT()
    {
        return _numberOfHit;
    }


}