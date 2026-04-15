package com.ykwshowdown.battle;

import java.util.ArrayList;
import java.util.Random;

public class YokaiFight{
    private String _nomYokai;
    private String _surnomYokai;
    private int _hp;
    private int _atk;
    private int _spr;
    private int _def;
    private int _spe;

    public YokaiFight(String nomYokai, String surnomYokai, int pv, int atk, int spr, int def, int spe)
    {
        _nomYokai = nomYokai;
        _surnomYokai = surnomYokai;
        _hp = pv;
        _atk = atk;
        _spr = spr;
        _def = def;
        _spe = def;
    }

    public boolean isAlive()
    {
        return (this.getHP()> 0);
    }

    public void attack(YokaiFight target)
    {
        int damage = 8;
        target._hp -= 8;
        System.out.println(this._nomYokai + " a infligé " + damage + " au " + target._nomYokai  + " enemie !");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
    }

    public YokaiFight getRandTarget(YokaiFight[] enemyTeam)
    {
        ArrayList<YokaiFight> enemyAlive = new ArrayList<>();
        for(int i=0; i<enemyTeam.length; i++)
        {
            if(enemyTeam[i].isAlive())
            {
                enemyAlive.add(enemyTeam[i]);
            }            
        }
        Random rand = new Random();
        return enemyAlive.get(rand.nextInt(enemyAlive.size()));
    } 

    public int getHP()
    {
        return _hp;
    }

    public int getSPE()
    {
        return _spe;
    }

    public String getName()
    {
        return _nomYokai;
    }

}
