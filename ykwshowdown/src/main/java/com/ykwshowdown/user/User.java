package com.ykwshowdown.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.google.gson.annotations.SerializedName;
import com.ykwshowdown.menu.*;

public class User {
    private Scanner sc = new Scanner(System.in);
    private static int nbUser=0;

    private WatchBuilder equippedTeam;
    
    @SerializedName("id")
    private int ID;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("joinedDate")
    private Date joinedDate;
    @SerializedName("lastLog")
    private Date lastLogged;
    @SerializedName("elo")
    private int ELO;

    private ArrayList<WatchList> userTeam;
    private ArrayList<User> friends;

    
    public User()
    {
        ID=0;
        username = "Anonyme";
    }
    
    public User(String username, String password)
    {
        ID=nbUser+1;
        this.username = username;
        this.password = password;
        joinedDate = new Date();
        lastLogged = joinedDate;
    }


    public static void setNbUser(int nbUser)
    {
        User.nbUser = nbUser;
    }

    public void setLoggedDate(Date today)
    {
        lastLogged = today;
    }

    public Date getLoggedDate()
    {
        return lastLogged;
    }

    public void setTeam(WatchBuilder yt)
    {
        equippedTeam = yt;
    }

    public int getID()
    {
        return ID;
    }

    public void addElo()
    {
        Random rand = new Random();
        int nombre = rand.nextInt(40) + 10;
        ELO+=nombre;
    }

    public void looseElo()
    {
        Random rand = new Random();
        int nombre = rand.nextInt(40) + 10;
        if((ELO-=nombre) < 1000)
        {
            ELO = 1000;
        }
        else
        {
            ELO-=nombre;
        }
    }

    public String getUser()
    {
        return username;
    }
    public String getPassWord()
    {
        return password;
    }
    public Date getDate()
    {
        return joinedDate;
    }
    public int getELO()
    {
        return ELO;
    }

    public WatchBuilder getEquippedTeam()
    {
        return equippedTeam;
    }
}
