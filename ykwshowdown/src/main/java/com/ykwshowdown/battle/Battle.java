package com.ykwshowdown.battle;

import java.util.ArrayList;
import java.util.Random;

public class Battle {
    
    YokaiTeam player1;
    YokaiTeam player2;
    boolean isMatchFinished;
    YokaiTeam orderBattle;

    
    public Battle(YokaiTeam player1, YokaiTeam player2)
    {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    
    public void DebutCombat()
    {
        System.out.println("DEBUT DU COMBAT !");
        while(!isMatchFinished)
        {
            player1 = YokaiAlive(player1);
            player2 = YokaiAlive(player2);
            
            SetOrderingBattle();
            triInsertionOrderingBattle(orderBattle);
            attackTurn();
            showYoKaiStatus();
            
            boolean player1Loose = playerLoose(player1);
            boolean player2Loose = playerLoose(player2);
            isMatchFinished = (player1Loose || player2Loose);
            
            if(player1Loose)
            {
                System.out.println("Pas de bol t'as perdu !");
            }
            if (player2Loose)
            {
                System.out.println("Bravo t'as gagné !");
            }

        }
    }


    public void SetOrderingBattle()
    {
        int compte= 0;
        orderBattle = new YokaiTeam(player1.getTeamSize()+player2.getTeamSize());
        for(int i=0; i<player1.getTeamSize(); i++)
        {
            orderBattle.setYokaiIndex(i, player1.getYokaiIndex(i));
        }
        for(int j=player1.getTeamSize(); j<player1.getTeamSize()+player2.getTeamSize(); j++)
        {
            orderBattle.setYokaiIndex(j, player2.getYokaiIndex(compte));
            compte++;
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

    public void attackTurn()
    {
        for(int i=0; i<orderBattle.getTeamSize(); i++)
        {
            if(orderBattle.getYokaiIndex(i).getTeam() == player1.getTeamNumber())
            {
                YokaiFight target = getRandTarget(YokaiAlive(player2));
                orderBattle.getYokaiIndex(i).attack(target);
            }
            if(orderBattle.getYokaiIndex(i).getTeam() == player2.getTeamNumber())
            {
                YokaiFight target = getRandTarget(YokaiAlive(player1));
                orderBattle.getYokaiIndex(i).attack(target);
            }
        }
    }

    public YokaiFight getRandTarget(YokaiTeam enemyTeam)
    {
        Random rand = new Random();
        return enemyTeam.getYokaiIndex(rand.nextInt(enemyTeam.getTeamSize()));
    }

    public YokaiTeam YokaiAlive(YokaiTeam yt)
    {
        ArrayList<YokaiFight> aliveYokai = new ArrayList<YokaiFight>();
        for(int i=0; i<yt.getTeamSize(); i++)
        {
            if(yt.getYokaiIndex(i).isAlive())
            {
                aliveYokai.add(yt.getYokaiIndex(i));
            }
        }
        YokaiTeam aliveTeam = new YokaiTeam(aliveYokai.size(), yt.getTeamNumber()); // ← passe le teamNumber

        for(int j=0; j<aliveYokai.size(); j++)
        {
            aliveTeam.setYokaiIndex(j, aliveYokai.get(j));
        }
        return aliveTeam;
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
            System.out.println("[ENEMIE] " + player2.getYokaiIndex(y).getName() + " PV: " + player2.getYokaiIndex(y).getHP());
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
