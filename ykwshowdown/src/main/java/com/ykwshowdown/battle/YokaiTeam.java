package com.ykwshowdown.battle;

import com.ykwshowdown.user.User;

public class YokaiTeam {

    YokaiFight[] frontRow;
    YokaiFight[] backRow;
    User userTeam;
    private int teamNumber;

    public YokaiTeam(User userTeam, int nbTeam, int nbYokai)
    {
        this.frontRow = new YokaiFight[3];
        this.backRow = new YokaiFight[3];

        this.userTeam = userTeam;
        this.teamNumber = nbTeam;
    }

    public YokaiTeam(int nbYokai, int nbTeam)
    {
        this.frontRow = new YokaiFight[nbYokai];

        this.teamNumber = nbTeam;
    }

    public YokaiTeam(int nbTeam)
    {
        this.frontRow = new YokaiFight[3];
        this.backRow = new YokaiFight[3];


        this.teamNumber = nbTeam;
    }

    public int getTeamNumber()
    {
        return teamNumber;
    }

    public void setYokaiIndex(int i, YokaiFight y)
    {
        if(i <= 2)
        {
            frontRow[i] = y;
        }
        else
        {
            backRow[i-3] = y;
        }
    }

    public YokaiFight getYokaiFrontRowIndex(int i)
    {
        return frontRow[i];
    }

    public YokaiFight getYokaiBackRowIndex(int i)
    {
        return backRow[i];
    }

    
    public int getFrontRowSize()
    {
        return frontRow.length;
    }

    public int getBackRowSize()
    {
        return backRow.length;
    }
    
    public YokaiFight[] getFrontTeamArray()
    {
        return frontRow;
    }

    public int getTeamSize()
    {
        return frontRow.length + backRow.length;
    }
    
}
