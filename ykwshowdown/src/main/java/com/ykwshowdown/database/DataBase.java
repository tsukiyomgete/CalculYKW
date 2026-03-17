package com.ykwshowdown.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.ykwshowdown.user.*;
import com.ykwshowdown.yokai.*;
import com.ykwshowdown.init.*;



public class DataBase {

    private static Connection link;

    private DataBase() {}

    public static void init() throws SQLException {
    if(link == null) 
    {
        String url = "jdbc:mysql://root:ZPmMfFOoCvMCVtrxahcLRAmcAqVoHHMA@mainline.proxy.rlwy.net:43528/railway";
        link = DriverManager.getConnection(url);
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

    private static void customCMD() throws SQLException {
        if(link == null) init();
        Statement requete = link.createStatement();
        requete.execute("ALTER TABLE Yokai ADD COLUMN IF NOT EXISTS Attitude1 VARCHAR(20)");
        requete.execute("ALTER TABLE Yokai ADD CONSTRAINT fk_Attitude1 FOREIGN KEY(Attitude1) REFERENCES Attitude(nomAttitude)");
        requete.execute("ALTER TABLE Yokai ADD COLUMN IF NOT EXISTS Attitude2 VARCHAR(20)");
        requete.execute("ALTER TABLE Yokai ADD CONSTRAINT fk_Attitude2 FOREIGN KEY(Attitude2) REFERENCES Attitude(nomAttitude)");
        requete.execute("ALTER TABLE Yokai ADD COLUMN IF NOT EXISTS Attitude3 VARCHAR(20)");
        requete.execute("ALTER TABLE Yokai ADD CONSTRAINT fk_Attitude3 FOREIGN KEY(Attitude3) REFERENCES Attitude(nomAttitude)");
        requete.execute("ALTER TABLE Yokai ADD COLUMN IF NOT EXISTS Attitude4 VARCHAR(20)");
        requete.execute("ALTER TABLE Yokai ADD CONSTRAINT fk_Attitude4 FOREIGN KEY(Attitude4) REFERENCES Attitude(nomAttitude)");
    }

    private static void initTables() throws SQLException {
    if(link == null) init();
    Statement requete = link.createStatement();

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Users (
            id              INTEGER PRIMARY KEY AUTO_INCREMENT,
            username        VARCHAR(20) NOT NULL UNIQUE,
            password        VARCHAR(255) NOT NULL,
            joined_date     DATE NOT NULL,
            last_connected  DATE NOT NULL,
            elo             INTEGER DEFAULT 1000
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Tribu (
            nomTribu        VARCHAR(20) PRIMARY KEY
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Elemental (
            nomElement      VARCHAR(20) PRIMARY KEY
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Rang (
            nomRang         VARCHAR(1) PRIMARY KEY,
            CONSTRAINT check_Rang CHECK (nomRang IN ('S', 'A', 'B', 'C', 'D', 'E'))
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Tier (
            nomTier         VARCHAR(8) PRIMARY KEY,
            CONSTRAINT check_Tier CHECK (nomTier IN ('Ubers', 'OUBL', 'OU', 'UU', 'RU', 'NU', 'ZU', 'PU'))
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS StatB (
            idStatB         INTEGER PRIMARY KEY AUTO_INCREMENT,
            HPStatB         INTEGER NOT NULL,
            STRStatB        INTEGER NOT NULL,
            SPRStatB        INTEGER NOT NULL,
            DEFStatB        INTEGER NOT NULL,
            SPEStatB        INTEGER NOT NULL
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS StatA (
            idStatA         INTEGER PRIMARY KEY AUTO_INCREMENT,
            HPStatA         INTEGER NOT NULL,
            STRStatA        INTEGER NOT NULL,
            SPRStatA        INTEGER NOT NULL,
            DEFStatA        INTEGER NOT NULL,
            SPEStatA        INTEGER NOT NULL
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS StatActu (
            idStatActu      INTEGER PRIMARY KEY AUTO_INCREMENT,
            HPStatActu      INTEGER NOT NULL,
            STRStatActu     INTEGER NOT NULL,
            SPRStatActu     INTEGER NOT NULL,
            DEFStatActu     INTEGER NOT NULL,
            SPEStatActu     INTEGER NOT NULL
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Equipement (
            idEquipement    INTEGER PRIMARY KEY AUTO_INCREMENT,
            nomEquipement   VARCHAR(20) NOT NULL
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Yokai (
            idMedaillum             INTEGER PRIMARY KEY AUTO_INCREMENT,
            nomYokai                VARCHAR(20) NOT NULL,
            nomTribu                VARCHAR(20) NOT NULL,
            rangYokai               VARCHAR(1)  NOT NULL,
            tierYokai               VARCHAR(20) NOT NULL,
            typeElementaire         VARCHAR(20) NOT NULL,
            faiblesseElementaire    VARCHAR(20) NOT NULL,
            resistanceElementaire   VARCHAR(20) NOT NULL,
            statB                   INTEGER NOT NULL,
            statA                   INTEGER NOT NULL,
            FOREIGN KEY(nomTribu)               REFERENCES Tribu(nomTribu),
            FOREIGN KEY(rangYokai)              REFERENCES Rang(nomRang),
            FOREIGN KEY(typeElementaire)        REFERENCES Elemental(nomElement),
            FOREIGN KEY(faiblesseElementaire)   REFERENCES Elemental(nomElement),
            FOREIGN KEY(resistanceElementaire)  REFERENCES Elemental(nomElement),
            FOREIGN KEY(statB)                  REFERENCES StatB(idStatB),
            FOREIGN KEY(statA)                  REFERENCES StatA(idStatA)
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS YokaiGeneral (
            idYokaiGeneral  INTEGER PRIMARY KEY AUTO_INCREMENT,
            nomYokai        VARCHAR(20) NOT NULL,
            surnomYokai     VARCHAR(20),
            niveau          INTEGER NOT NULL CHECK(niveau BETWEEN 1 AND 99),
            nomElement      VARCHAR(20) NOT NULL,
            nomTribu        VARCHAR(20) NOT NULL,
            nomRang         VARCHAR(1) NOT NULL,
            nomTier         VARCHAR(8) NOT NULL,
            idStatB         INTEGER NOT NULL,
            idStatA         INTEGER NOT NULL,
            idStatActu      INTEGER NOT NULL,
            idEquipement    INTEGER,
            FOREIGN KEY (nomElement)    REFERENCES Elemental(nomElement),
            FOREIGN KEY (nomTribu)      REFERENCES Tribu(nomTribu),
            FOREIGN KEY (nomRang)       REFERENCES Rang(nomRang),
            FOREIGN KEY (nomTier)       REFERENCES Tier(nomTier),
            FOREIGN KEY (idStatB)       REFERENCES StatB(idStatB),
            FOREIGN KEY (idStatA)       REFERENCES StatA(idStatA),
            FOREIGN KEY (idStatActu)    REFERENCES StatActu(idStatActu),
            FOREIGN KEY (idEquipement)  REFERENCES Equipement(idEquipement)
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Equipe (
            idEquipe        INTEGER PRIMARY KEY AUTO_INCREMENT,
            idUser          INTEGER NOT NULL,
            nomEquipe       VARCHAR(25) NOT NULL,
            FOREIGN KEY (idUser) REFERENCES Users(id)
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Equipe_Yokai (
            idEquipe        INTEGER NOT NULL,
            idYokaiGeneral  INTEGER NOT NULL,
            position        INTEGER NOT NULL CHECK (position BETWEEN 1 AND 6),
            PRIMARY KEY (idEquipe, position),
            FOREIGN KEY (idEquipe)          REFERENCES Equipe(idEquipe),
            FOREIGN KEY (idYokaiGeneral)    REFERENCES YokaiGeneral(idYokaiGeneral)
        )
    """);

    requete.execute("""
        CREATE TABLE IF NOT EXISTS Attitude (
            nomAttitude     VARCHAR(20) PRIMARY KEY
        )
    """);
}
    public static void delTables() throws SQLException {
        Statement requete = link.createStatement();
        requete.execute("DROP TABLE IF EXISTS Equipe_Yokai");
        requete.execute("DROP TABLE IF EXISTS Equipe");
        requete.execute("DROP TABLE IF EXISTS YokaiGeneral");
        requete.execute("DROP TABLE IF EXISTS Yokai");
        requete.execute("DROP TABLE IF EXISTS Equipement");
        requete.execute("DROP TABLE IF EXISTS StatActu");
        requete.execute("DROP TABLE IF EXISTS StatA");
        requete.execute("DROP TABLE IF EXISTS StatB");
        requete.execute("DROP TABLE IF EXISTS Tier");
        requete.execute("DROP TABLE IF EXISTS Rang");
        requete.execute("DROP TABLE IF EXISTS Elemental");
        requete.execute("DROP TABLE IF EXISTS Tribu");
        requete.execute("DROP TABLE IF EXISTS Users");
}

    public static void addUser(User userTest) throws SQLException
    {
        if(link == null) init();
        java.util.Date dateUser = userTest.getDate();
        java.util.Date connectedUser = userTest.getLoggedDate();
        java.sql.Date sqlDate = new java.sql.Date(dateUser.getTime());
        java.sql.Date sqlLogged = new java.sql.Date(connectedUser.getTime());

        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Users (username, password, joined_date, last_connected) VALUES (?, ?, ?, ?)"
        );
        uS.setString(1, userTest.getUser());
        uS.setString(2, userTest.getPassWord());
        uS.setDate(3, sqlDate);
        uS.setDate(4, sqlLogged);
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
    public static void setLoggedDate(User userTest) throws SQLException
    {
        if(link == null) init();
        java.util.Date dateUser = userTest.getDate();
        java.sql.Date sqlDate = new java.sql.Date(dateUser.getTime());
        PreparedStatement uS = link.prepareStatement("UPDATE Users SET last_connected = ? WHERE id = ?");
        uS.setDate(1, sqlDate);
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

    public static void insertTribe(Tribe tribu) throws SQLException
    {
		if(link == null) init();
        String nomTribu = tribu.GetTribe();
        

        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Tribu (nomTribu) VALUES (?)"
        );
        uS.setString(1, nomTribu);
        uS.executeUpdate();
    }

    public static void insertElemental(Elemental element) throws SQLException
    {
		if(link == null) init();
        String nomElement = element.getElement();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Elemental (nomElement) VALUES (?)"
        );
        uS.setString(1, nomElement);
        uS.executeUpdate();
    }
    public static void insertRank(Rank rang) throws SQLException
    {
		if(link == null) init();
        char nomRang = rang.GetRank();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Rang (nomRang) VALUES (?)"
        );
        uS.setString(1, String.valueOf(nomRang));
        uS.executeUpdate();
    }
    public static void insertTier(Tier tier) throws SQLException
    {
		if(link == null) init();
        String nomtier = tier.getTier();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Tier (nomTier) VALUES (?)"
        );
        uS.setString(1, nomtier);
        uS.executeUpdate();
    }
    public static void insertAttitude(Attitude behavior) throws SQLException
    {
        if(link == null) init();
        String attitudeString = behavior.getAttitude();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Attitude (nomAttitude) VALUES (?)"
        );
        uS.setString(1, attitudeString);
        uS.executeUpdate();  
    }
    
    public static void insertStatA(Stat statA) throws SQLException
    {
        if(link == null) init();
        int HPA = statA.GetHP();
        int STRA = statA.GetSTR();
        int SPRA = statA.GetSPR();
        int DEFA = statA.GetDEF();
        int SPEA = statA.GetSPE();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO StatA (HPStatA, STRStatA, SPRStatA, DEFStatA, SPEStatA) VALUES (?, ?, ?, ?, ?)"
        );
        uS.setInt(1, HPA);
        uS.setInt(2, STRA);
        uS.setInt(3, SPRA);
        uS.setInt(4, DEFA);
        uS.setInt(5, SPEA);
        uS.executeUpdate();  
    }



    public static void closeLink() throws SQLException {
        if(link != null)
        {
            link.close();
            link = null;
        }
    }
}