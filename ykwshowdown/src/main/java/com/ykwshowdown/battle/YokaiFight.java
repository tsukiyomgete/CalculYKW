package com.ykwshowdown.battle;

import com.ykwshowdown.yokai.*;
import com.ykwshowdown.fightingdata.*;
import com.ykwshowdown.Talent.Talent;

public class YokaiFight {
    private String _nomYokai;
    private String _surnomYokai;

    private String _elementWeak;
    private String _elementRes;
    private Technique _technique;
    private Talent _talent;

    private int _hpT;
    private int _strT;
    private int _sprT;
    private int _defT;
    private int _speT;

    private int _hpC;
    private int _strC;
    private int _sprC;
    private int _defC;
    private int _speC;

    private float _hpTribeBonus;
    private float _strTribeBonus;

    private float _tribeBonus;
    private float _adjacentBoost;
    private float _inspiritBoost;

    private int _team;

    public YokaiFight(String nomYokai, String surnomYokai, int pv, int atk, int spr, int def, int spe, int team) {
        _nomYokai = nomYokai;
        _surnomYokai = surnomYokai;
        _hpC = pv;
        _strC = atk;
        _sprC = spr;
        _defC = def;
        _speC = spe;
        _team = team;
    }

    public YokaiFight(String nomYokai, int pv, int atk, int spr, int def, int spe, int team) {
        _nomYokai = nomYokai;
        _hpC = pv;
        _strC = atk;
        _sprC = spr;
        _defC = def;
        _speC = spe;
        _team = team;
    }

    public YokaiFight(YokaiGeneral yg, int team) {
        _nomYokai = yg.GetName();
        _hpC = yg.GetHP();
        _strC = yg.GetSTR();
        _sprC = yg.GetSPR();
        _defC = yg.GetDEF();
        _speC = yg.GetSPE();

        _elementWeak = yg.GetElementWeak();
        _elementRes = yg.GetElementRes();
        _technique = yg.GetTechnique();

        _team = team;
    }

    public void setYokaiFight(YokaiGeneral yg) {
        _nomYokai = yg.GetName();
        _hpC = yg.GetHP();
        _strC = yg.GetSTR();
        _sprC = yg.GetSPR();
        _defC = yg.GetDEF();
        _speC = yg.GetSPE();
    }

    public boolean isAlive() {
        return (this.getHPC() > 0);
    }

    public void attack(YokaiFight target) {
        int damage = 40;
        if (target._hpT < damage) {
            target._hpT = 0;
        } else {
            target._hpT -= 40;
        }
        System.out.println(this._nomYokai + " a infligé " + damage + " au " + target._nomYokai + " enemie !");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Talent getTalent() {
        return _talent;
    }

    public void setTalent(Talent talent) {
        this._talent = talent;
    }

    public String getWeak() {
        return _elementWeak;
    }

    public String getRes() {
        return _elementRes;
    }

    public Technique getTechnique() {
        return _technique;
    }

    public int getHPC() {
        return _hpC;
    }

    public int getSPRC() {
        return _sprC;
    }

    public int getStrC() {
        return _strC;
    }

    public int getSPEC() {
        return _speC;
    }

    public String getName() {
        return _nomYokai;
    }

    public int getTeam() {
        return _team;
    }

}
