package com.ykwshowdown.battle;

import com.ykwshowdown.yokai.*;

public class YokaiFight{
    private String _nomYokai;
    private String _surnomYokai;
    private String _elementWeak;
    private String _elementRes;
    private String _elementType;
    private int _hp;
    private int _atk;
    private int _spr;
    private int _def;
    private int _spe;
    private int _team;

    public YokaiFight(String nomYokai, String surnomYokai, int pv, int atk, int spr, int def, int spe, int team)
    {
        _nomYokai = nomYokai;
        _surnomYokai = surnomYokai;
        _hp = pv;
        _atk = atk;
        _spr = spr;
        _def = def;
        _spe = spe;
        _team = team;
    }

    public YokaiFight(String nomYokai,  int pv, int atk, int spr, int def, int spe, int team)
    {
        _nomYokai = nomYokai;
        _hp = pv;
        _atk = atk;
        _spr = spr;
        _def = def;
        _spe = spe;
        _team = team;
    }

    public YokaiFight(YokaiGeneral yg, int team)
    {
        _nomYokai = yg.GetName();
        _hp = yg.GetHP();
        _atk = yg.GetSTR();
        _spr = yg.GetSPR();
        _def = yg.GetDEF();
        _spe = yg.GetSPE();

        _elementWeak = yg.GetElementWeak();
        _elementRes = yg.GetElementRes();
        _elementType = yg.GetElement();

        _team = team;
    }

    public void setYokaiFight(YokaiGeneral yg)
    {
        _nomYokai = yg.GetName();
        _hp = yg.GetHP();
        _atk = yg.GetSTR();
        _spr = yg.GetSPR();
        _def = yg.GetDEF();
        _spe = yg.GetSPE();
    }

    public boolean isAlive()
    {
        return (this.getHP()> 0);
    }

    public void attack(YokaiFight target)
    {
        int damage = 40;
        if(target._hp < damage)
        {
            target._hp = 0;
        }
        else
        {
            target._hp -= 40;
        }
        System.out.println(this._nomYokai + " a infligé " + damage + " au " + target._nomYokai  + " enemie !");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
    }

    public String getWeak()
    {
        return _elementWeak;
    }

    public String getRes()
    {
        return _elementRes;
    }

    public String getElementAttack()
    {
        return _elementType;
    }

    public int getHP()
    {
        return _hp;
    }

    public int getSPR()
    {
        return _spr;
    }

    public int getAtk()
    {
        return _atk;
    }

    public int getSPE()
    {
        return _spe;
    }

    public String getName()
    {
        return _nomYokai;
    }

    public int getTeam()
    {
        return _team;
    }

}
