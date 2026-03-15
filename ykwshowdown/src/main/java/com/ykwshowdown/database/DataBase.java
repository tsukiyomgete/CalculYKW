package com.ykwshowdown.database;

import com.ykwshowdown.user.*;
import java.util.*;
import java.sql.*;

public class DataBase {

    private static final String URL = "jdbc:sqlite:C:/Users/Tsukiyom/Documents/YKWCalcul/CalculYKW/ykwshowdown/db/ykwShowdown.db";
    private Connection link;
    private static int nbUser=0;

    public DataBase() throws SQLException {
        link = DriverManager.getConnection(URL);
        initTables();
    }
    private void initTables() throws SQLException {
        Statement requete = link.createStatement();
        requete.execute("""
        CREATE TABLE IF NOT EXISTS Users (
            id      INTEGER PRIMARY KEY AUTOINCREMENT,
            username TEXT NOT NULL UNIQUE,
            password TEXT NOT NULL,
            joined_date TEXT NOT NULL,
            elo INTEGER DEFAULT 1000
        )      
        """);
    }
    public void addUser(User userTest) throws SQLException
    {
        java.util.Date  dateUser = userTest.getDate();
        java.sql.Date sqlDate = new java.sql.Date(dateUser.getTime());
        int idUser = userTest.getID();
        
        PreparedStatement uS = link.prepareStatement("INSERT INTO users (username, password, joined_date) VALUES ( ?, ?, ?)");
        uS.setString(1, userTest.getUser());
        uS.setString(2, userTest.getPassWord());
        uS.setDate(3, sqlDate);
        uS.executeUpdate();
    }

    public void addElo(User userTest) throws SQLException
    {
        userTest.addElo();
        PreparedStatement uS = link.prepareStatement("UPDATE users SET elo = ? WHERE id = ?");
        uS.setInt(1, userTest.getELO());
        uS.setInt(2, userTest.getID());
        uS.executeUpdate();
        ResultSet result = uS.executeQuery();
    }

    public boolean userExists(String username) throws SQLException
    {
        PreparedStatement rS = link.prepareStatement("SELECT id FROM users WHERE username = ?");
        rS.setString(1 , username);
        ResultSet result = rS.executeQuery();
        return result.next();
    }

    public boolean mdpExist(String username, String mdp) throws SQLException
    {
        PreparedStatement rS = link.prepareStatement("SELECT password FROM users WHERE username = ?");
        rS.setString(1 , username);
        ResultSet result = rS.executeQuery();
        if(result.next())
        {
            return (result.getString("password").equals(mdp));
        }
        else
        {
            return false;
        }
    }

    public int getNbUser() throws SQLException
    {
        PreparedStatement rS = link.prepareStatement("SELECT COUNT(*) AS total FROM users");
        ResultSet result = rS.executeQuery();
        if(result.next())
        {
            return result.getInt("total");
        }
        return 0;
    }

    public void closeLink() throws SQLException {
        if(link != null)
        {
            link.close();
        }
    }

}

/*public class DatabaseManager {

    // Ajouter un utilisateur
    public void addUser(String username, String password, String joinedDate) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO users (username, password, joined_date) VALUES (?, ?, ?)"
        );
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, joinedDate);
        ps.executeUpdate();
    }

    // Vérifier si un user existe (pour le login)
    public boolean userExists(String username) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
            "SELECT id FROM users WHERE username = ?"
        );
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public void closeConnection() throws SQLException {
        if (conn != null) conn.close();
    }
} */