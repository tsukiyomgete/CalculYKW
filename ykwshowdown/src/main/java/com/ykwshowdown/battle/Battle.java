package com.ykwshowdown.battle;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Battle {

    YokaiTeam player1;
    YokaiTeam player2;
    boolean isMatchFinished;
    YokaiTeam orderBattle;

    public Battle(YokaiTeam player1, YokaiTeam player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void DebutCombat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DEBUT DU COMBAT !");
        while (!isMatchFinished) {
            player1 = YokaiAlive(player1);
            player2 = YokaiAlive(player2);

            SetOrderingBattle();
            triInsertionOrderingBattle(orderBattle);
            attackTurn();
            showYoKaiStatus();
            System.out.println("Would you like to turn your wheel? no/yes");
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("yes")) {
                System.out.println("Right or left? R/L");
                str = sc.nextLine();
                System.out.println("How many times do you want to turn the wheel?");
                int nbCrans = Integer.parseInt(sc.nextLine());

                if (str.equalsIgnoreCase("R")) {
                    tournerRoue(player1, true, nbCrans);
                }
                if (str.equalsIgnoreCase("L")) {
                    tournerRoue(player1, false, nbCrans);
                }
            }

            boolean player1Loose = playerLoose(player1);
            boolean player2Loose = playerLoose(player2);
            isMatchFinished = (player1Loose || player2Loose);

            if (player1Loose) {
                System.out.println("Pas de bol t'as perdu !");
            }
            if (player2Loose) {
                System.out.println("Bravo t'as gagné !");
            }

        }
    }

    public void SetOrderingBattle() {
        int compte = 0;
        orderBattle = new YokaiTeam(player1.getFrontRowSize() + player2.getFrontRowSize());
        for (int i = 0; i < player1.getFrontRowSize(); i++) {
            orderBattle.setYokaiIndex(i, player1.getYokaiFrontRowIndex(i));
        }
        for (int j = player1.getFrontRowSize(); j < player1.getFrontRowSize() + player2.getFrontRowSize(); j++) {
            orderBattle.setYokaiIndex(j, player2.getYokaiFrontRowIndex(compte));
            compte++;
        }
    }

    public void triInsertionOrderingBattle(YokaiTeam yt) {
        for (int i = 1; i < yt.getFrontRowSize(); i++) {
            YokaiFight y = yt.getYokaiFrontRowIndex(i);
            int j = i - 1;

            while (j >= 0 && yt.getYokaiFrontRowIndex(j).getSPE() < y.getSPE()) {
                yt.setYokaiIndex(j + 1, yt.getYokaiFrontRowIndex(j));
                j--;
            }

            yt.setYokaiIndex(j + 1, y);
        }
    }

    public void attackTurn() {
        for (int i = 0; i < orderBattle.getFrontRowSize(); i++) {
            if (orderBattle.getYokaiFrontRowIndex(i).getTeam() == player1.getTeamNumber()) {
                YokaiFight target = getRandTarget(YokaiAlive(player2));
                orderBattle.getYokaiFrontRowIndex(i).attack(target);
            }
            if (orderBattle.getYokaiFrontRowIndex(i).getTeam() == player2.getTeamNumber()) {
                YokaiFight target = getRandTarget(YokaiAlive(player1));
                orderBattle.getYokaiFrontRowIndex(i).attack(target);
            }
        }
    }

    public YokaiFight getRandTarget(YokaiTeam enemyTeam) {
        Random rand = new Random();
        return enemyTeam.getYokaiFrontRowIndex(rand.nextInt(enemyTeam.getFrontRowSize()));
    }

    public YokaiTeam YokaiAlive(YokaiTeam yt) {
        ArrayList<YokaiFight> aliveYokai = new ArrayList<YokaiFight>();
        for (int i = 0; i < yt.getFrontRowSize(); i++) {
            if (yt.getYokaiFrontRowIndex(i).isAlive()) {
                aliveYokai.add(yt.getYokaiFrontRowIndex(i));
            }
        }
        if (aliveYokai.size() == 0) {
            for (int i = 0; i < yt.getBackRowSize(); i++) {
                aliveYokai.add(yt.getYokaiBackRowIndex(i));
            }
        }

        YokaiTeam aliveTeam = new YokaiTeam(aliveYokai.size(), yt.getTeamNumber()); // ← passe le teamNumber

        for (int j = 0; j < aliveYokai.size(); j++) {
            aliveTeam.setYokaiIndex(j, aliveYokai.get(j));
        }
        return aliveTeam;
    }

    public void showYoKaiStatus() {
        System.out.println("        ETAT DU COMBAT          ");
        System.out.println("");
        System.out.println("LA FRONT LANE ALLIE");
        for (int i = 0; i < player1.getFrontRowSize(); i++) {
            System.out.println("[ALLIEE] " + player1.getYokaiFrontRowIndex(i).getName() + " PV: "
                    + player1.getYokaiFrontRowIndex(i).getHP());
        }
        System.out.println("");
        System.out.println("LA BACK LANE ALLIE");
        for (int i = 0; i < player1.getBackRowSize(); i++) {
            System.out.println("[ALLIEE] " + player1.getYokaiBackRowIndex(i).getName() + " PV: "
                    + player1.getYokaiBackRowIndex(i).getHP());
        }

        System.out.println("");
        System.out.println("LA FRONT LANE ENEMI");
        for (int y = 0; y < player2.getFrontRowSize(); y++) {
            System.out.println("[ENEMIE] " + player2.getYokaiFrontRowIndex(y).getName() + " PV: "
                    + player2.getYokaiFrontRowIndex(y).getHP());
        }

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean playerLoose(YokaiTeam p) {
        for (int i = 0; i < p.getFrontRowSize(); i++) {
            if (p.getYokaiFrontRowIndex(i).isAlive())
                return false;
        }
        for (int i = 0; i < p.getBackRowSize(); i++) {
            if (p.getYokaiBackRowIndex(i).isAlive())
                return false;
        }
        return true;
    }

    public void tournerRoue(YokaiTeam yt, boolean droite, int nbCrans) {
        YokaiFight[] roue = new YokaiFight[6]; // tableau temporaire
        for (int i = 0; i < yt.getFrontRowSize(); i++) {
            roue[i] = yt.getYokaiFrontRowIndex(i);
        }
        for (int i = yt.getFrontRowSize(); i < yt.getTeamSize(); i++) {
            roue[i] = yt.getYokaiBackRowIndex(i - yt.getFrontRowSize());
        }
        if (droite) {
            for (int j = 0; j < nbCrans; j++) {
                YokaiFight tempY = roue[roue.length - 1]; // sauvegarder le dernier
                for (int i = roue.length - 1; i > 0; i--) {
                    roue[i] = roue[i - 1];
                }
                roue[0] = tempY;
            }
        }
        if (!droite) {
            for (int j = 0; j < nbCrans; j++) {
                YokaiFight tempY = roue[0]; // sauvegarder le dernier
                for (int i = 0; i < roue.length - 1; i++) {
                    roue[i] = roue[i + 1];
                }
                roue[5] = tempY;
            }
        }

        for (int i = 0; i < yt.getFrontRowSize(); i++) {
            yt.setYokaiIndex(i, roue[i]);
        }
        for (int i = 0; i < yt.getBackRowSize(); i++) {
            yt.setYokaiIndex(i + yt.getFrontRowSize(), roue[i + yt.getFrontRowSize()]);
        }
    }

}
