package com.ykwshowdown.database;

import com.ykwshowdown.user.*;
import java.sql.*;

public class DataBase {

    private static final String URL = "jdbc:sqlite:db/ykwShowdown.db";
    private static Connection link;

    private DataBase() {}

    public static void init() throws SQLException {
        if(link == null) {
            link = DriverManager.getConnection(URL);
            initTables();
        }
    }

    public static void initTables() throws SQLException {
        if(link == null) init();
        Statement requete = link.createStatement();
        requete.execute("""
        CREATE TABLE IF NOT EXISTS Users (
            id          INTEGER PRIMARY KEY AUTOINCREMENT,
            username    TEXT NOT NULL UNIQUE,
            password    TEXT NOT NULL,
            joined_date TEXT NOT NULL,
            elo         INTEGER DEFAULT 1000
        )      
        """);
    }

    public static void addUser(User userTest) throws SQLException
    {
        if(link == null) init();
        java.util.Date dateUser = userTest.getDate();
        java.sql.Date sqlDate = new java.sql.Date(dateUser.getTime());

        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO users (username, password, joined_date) VALUES (?, ?, ?)"
        );
        uS.setString(1, userTest.getUser());
        uS.setString(2, userTest.getPassWord());
        uS.setDate(3, sqlDate);
        uS.executeUpdate();
    }

    public static void addElo(User userTest) throws SQLException
    {
        if(link == null) init();
        userTest.addElo();
        PreparedStatement uS = link.prepareStatement(
            "UPDATE users SET elo = ? WHERE id = ?"
        );
        uS.setInt(1, userTest.getELO());
        uS.setInt(2, userTest.getID());
        uS.executeUpdate();
    }

    public static boolean userExists(String username) throws SQLException
    {
        if(link == null) init();
        PreparedStatement rS = link.prepareStatement(
            "SELECT id FROM users WHERE username = ?"
        );
        rS.setString(1, username);
        ResultSet result = rS.executeQuery();
        return result.next();
    }

    public static boolean mdpExist(String username, String mdp) throws SQLException
    {
        if(link == null) init();
        PreparedStatement rS = link.prepareStatement(
            "SELECT password FROM users WHERE username = ?"
        );
        rS.setString(1, username);
        ResultSet result = rS.executeQuery();
        if(result.next())
        {
            return result.getString("password").equals(mdp);
        }
        return false;
    }

    public static int getNbUser() throws SQLException
    {
        if(link == null) init();
        PreparedStatement rS = link.prepareStatement(
            "SELECT COUNT(*) AS total FROM users"
        );
        ResultSet result = rS.executeQuery();
        if(result.next())
        {
            return result.getInt("total");
        }
        return 0;
    }

    public static void closeLink() throws SQLException {
        if(link != null)
        {
            link.close();
            link = null;
        }
    }
}