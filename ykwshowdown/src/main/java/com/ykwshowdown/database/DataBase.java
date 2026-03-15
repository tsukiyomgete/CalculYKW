package com.ykwshowdown.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ykwshowdown.user.User;

import io.github.cdimascio.dotenv.Dotenv;

public class DataBase {

    private static Connection link;

    private DataBase() {}

    public static void init() throws SQLException {
        createEnvFile();
        if(link == null) 
        {
            Dotenv dotenv = Dotenv.load();
            link = DriverManager.getConnection(dotenv.get("MYSQL_URL"));
            initTables();
        }
    }


    private static void createEnvFile() {
        java.io.File envFile = new java.io.File(".env");
        if(!envFile.exists()) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(envFile);
                fw.write("MYSQL_URL=jdbc:mysql://root:ZPmMfFOoCvMCVtrxahcLRAmcAqVoHHMA@mainline.proxy.rlwy.net:43528/railway?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
                fw.close();
            } catch (Exception e) {
                System.out.println("Erreur création .env : " + e.getMessage());
            }
        }
    }

    public static void initTables() throws SQLException {
        if(link == null) init();
        Statement requete = link.createStatement();
        requete.execute("""
        CREATE TABLE IF NOT EXISTS Users (
            id          INTEGER PRIMARY KEY AUTO_INCREMENT,
            username    VARCHAR(20) NOT NULL UNIQUE,
            password    VARCHAR(255) NOT NULL,
            joined_date DATE NOT NULL,
            elo         INTEGER DEFAULT 1000
            )      
        """);
    }
    public static void delTables() throws SQLException {
        Statement requete = link.createStatement();
        requete.execute("DROP TABLES Users");
    }

    public static void addUser(User userTest) throws SQLException
    {
        if(link == null) init();
        java.util.Date dateUser = userTest.getDate();
        java.sql.Date sqlDate = new java.sql.Date(dateUser.getTime());

        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Users (username, password, joined_date) VALUES (?, ?, ?)"
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
            "UPDATE Users SET elo = ? WHERE id = ?"
        );
        uS.setInt(1, userTest.getELO());
        uS.setInt(2, userTest.getID());
        uS.executeUpdate();
    }

    public static boolean userExists(String username) throws SQLException
    {
        if(link == null) init();
        PreparedStatement rS = link.prepareStatement(
            "SELECT id FROM Users WHERE username = ?"
        );
        rS.setString(1, username);
        ResultSet result = rS.executeQuery();
        return result.next();
    }

    public static boolean mdpExist(String username, String mdp) throws SQLException
    {
        if(link == null) init();
        PreparedStatement rS = link.prepareStatement(
            "SELECT password FROM Users WHERE username = ?"
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
            "SELECT COUNT(*) AS total FROM Users"
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