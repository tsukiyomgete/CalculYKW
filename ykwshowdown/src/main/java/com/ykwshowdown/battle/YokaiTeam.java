package com.ykwshowdown.battle;

import com.ykwshowdown.user.User;

public class YokaiTeam {
    YokaiFight[] playerTeam;
    User userTeam;
    private int teamNumber;

    public YokaiTeam(User userTeam, int nbTeam, int nbYokai)
    {
        this.playerTeam = new YokaiFight[6];
        this.userTeam = userTeam;
        this.teamNumber = nbTeam;
    }

    public YokaiTeam(int nbYokai, int nbTeam)
    {
        this.playerTeam = new YokaiFight[nbYokai];
        this.teamNumber = nbTeam;
    }

    public YokaiTeam(int nbYokai)
    {
        this.playerTeam = new YokaiFight[nbYokai];
        teamNumber=0;
    }

    public int getTeamNumber()
    {
        return teamNumber;
    }

    public void setYokaiIndex(int i, YokaiFight y)
    {
        playerTeam[i] = y;
    }

    public YokaiFight getYokaiIndex(int i)
    {
        return playerTeam[i];
    }
    
    public int getTeamSize()
    {
        return playerTeam.length;
    }
    
    public YokaiFight[] getTeamArray()
    {
        return playerTeam;
    }
    
}
