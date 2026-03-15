package com.ykwshowdown.user;

import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import com.ykwshowdown.menu.*;

public class User {
    private Scanner sc = new Scanner(System.in);
    private static int nbUser=0;
    private int ID;
    private String username;
    private String password;
    private Date joinedDate;
    private Date lastLogged;
    private int ELO;
    private ArrayList<WatchList> userTeam;
    private ArrayList<User> friends;

    public User(String username, String password)
    {
        ID=nbUser+1;
        this.username = username;
        this.password = password;
        joinedDate = new Date();
    }


    public static void setNbUser(int nbUser)
    {
        User.nbUser = nbUser;
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
}
