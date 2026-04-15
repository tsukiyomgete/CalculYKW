package com.ykwshowdown.battle;


public class Battle {
    
    YokaiTeam player1;
    YokaiTeam player2;
    boolean isMatchFinished;
    YokaiTeam orderBattle;

    public void DebutCombat()
    {
        while(!isMatchFinished)
        {
            isMatchFinished = (playerLoose(player1) || playerLoose(player2));
            if(playerLoose(player1))
            {
                System.out.println("Pas de bol t'as perdu !");
            }
            else if (playerLoose(player2))
            {
                System.out.println("Bravo t'as gagné !");
            }
        }
    }


    public void SetOrderingBattle()
    {
        int compte= 0;
        orderBattle = new YokaiTeam(12);
        for(int i=0; i<player1.getTeamSize(); i++)
        {
            orderBattle.setYokaiIndex(i, player1.getYokaiIndex(i));
        }
        for(int j=6; j<12; j++)
        {
            orderBattle.setYokaiIndex(j, player2.getYokaiIndex(compte));
        }
    }

    public void triInsertionOrderingBattle(YokaiTeam yt)
    {
        for(int i=1; i<yt.getTeamSize(); i++)
        {
            YokaiFight y = yt.getYokaiIndex(i);
            int j = i-1;

            while(j>=0 && yt.getYokaiIndex(j).getSPE()<y.getSPE())
            {
                yt.setYokaiIndex(j+1, yt.getYokaiIndex(j));
                j--;
            }

            yt.setYokaiIndex(j+1, y);
        }
    }


    public void showYoKaiStatus()
    {
        System.out.println("        ETAT DU COMBAT          ");
        for(int i=0; i< player1.getTeamSize(); i++)
        {
            System.out.println("[ALLIEE] " + player1.getYokaiIndex(i).getName() + " PV: " + player1.getYokaiIndex(i).getHP());
        }
        for(int y=0; y< player2.getTeamSize(); y++)
        {
            System.out.println("[ENEMIE] " + player2.getYokaiIndex(y).getName() + " PV: " + player1.getYokaiIndex(y).getHP());
        }

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
    }

    public boolean playerLoose(YokaiTeam p)
    {
        int compteVie=p.getTeamSize();
        for(int i=0; i< p.getTeamSize(); i++)
        {
            if(!(p.getYokaiIndex(i).isAlive()))
            {
                compteVie--;
            }
        }
        return(compteVie==0);
    }
}
