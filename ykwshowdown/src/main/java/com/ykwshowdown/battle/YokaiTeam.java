package com.ykwshowdown.battle;

import com.ykwshowdown.user.User;

public class YokaiTeam {
    YokaiFight[] playerTeam;
    User userTeam;

    YokaiTeam(User userTeam)
    {
        this.playerTeam = new YokaiFight[6];
        this.userTeam = userTeam;
    }

    YokaiTeam(int nbYokai)
    {
        this.playerTeam = new YokaiFight[nbYokai];
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
}
