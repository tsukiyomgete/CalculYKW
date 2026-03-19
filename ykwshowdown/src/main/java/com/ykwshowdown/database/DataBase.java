package com.ykwshowdown.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.ykwshowdown.user.*;
import com.ykwshowdown.yokai.*;
import com.ykwshowdown.init.*;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.text.SimpleDateFormat;



public class DataBase {

    private static Connection link;

    private DataBase() {}

    public static void init() throws SQLException {
    if(link == null) 
    {
        String url = "jdbc:mysql://root:qTltSACuHSypPmZNAjNOZSlOngUlSWeX@autorack.proxy.rlwy.net:59240/railway";
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

    public static void customCMD() throws SQLException {
        if(link == null) init();
        Statement requete = link.createStatement();
        requete.execute("SET FOREIGN_KEY_CHECKS = 0");
        requete.execute("DROP TABLE IF EXISTS StatActu");
        requete.execute("ALTER TABLE YokaiGeneral DROP FOREIGN KEY YokaiGeneral_ibfk_7;");
        requete.execute("SET FOREIGN_KEY_CHECKS = 1");
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

    public static void addUser(User userTest) throws Exception {
    
    // 1. On formate les dates en String YYYY-MM-DD
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String joinedDate = sdf.format(userTest.getDate());
        String lastConnected = sdf.format(userTest.getLoggedDate());

    // 2. On construit l'URL avec les paramètres
        String url = "http://localhost:8080/api/users"
            + "?username=" + userTest.getUser()
            + "&password=" + userTest.getPassWord()
            + "&joinedDate=" + joinedDate
            + "&lastConnected=" + lastConnected
            + "&elo=1000";

    // 3. On crée le client HTTP
        HttpClient client = HttpClient.newHttpClient();

    // 4. On construit la requête POST
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .POST(HttpRequest.BodyPublishers.noBody())
            .build();

    // 5. On envoie la requête
        HttpResponse<String> response = client.send(request,
        HttpResponse.BodyHandlers.ofString());

    // 6. On vérifie que ça a marché
        if (response.statusCode() != 200) {
            throw new Exception("Erreur API : " + response.body());
        }
    }

    public static void insertYokai(Yokai y) throws SQLException
    {
        if(link == null) init();
        int idMedaillum = y.GetID();
        String nomYokai = y.GetName();
        String nomTribu = y.GetTribe();
        String rangYokai = String.valueOf(y.GetRank());
        String typeElement = y.GetTypeElement();
        String weakElement = y.GetWkElement();
        String resElement = y.GetResElement();
        String tierYokai = y.GetTier();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO Yokai (nomYokai, nomTribu, rangYokai, typeElementaire, faiblesseElementaire, resistanceElementaire, statB, statA, tierYokai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
        );
        uS.setString(1, nomYokai);
        uS.setString(2, nomTribu);
        uS.setString(3, rangYokai);
        uS.setString(4, typeElement);
        uS.setString(5, weakElement);
        uS.setString(6, resElement);
        uS.setInt(7, idMedaillum);
        uS.setInt(8, idMedaillum);
        uS.setString(9, tierYokai);
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
    
    public static void viderStat() throws SQLException
    {
        Statement requete = link.createStatement();
        requete.execute("SET FOREIGN_KEY_CHECKS = 0");
        requete.execute("TRUNCATE TABLE StatA");
        requete.execute("TRUNCATE TABLE StatB");
        requete.execute("SET FOREIGN_KEY_CHECKS = 1");
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

    public static void insertStatB(Stat statB) throws SQLException
    {
        if(link == null) init();
        
        int HPB = statB.GetHP();
        int STRB = statB.GetSTR();
        int SPRB = statB.GetSPR();
        int DEFB = statB.GetDEF();
        int SPEB = statB.GetSPE();
        PreparedStatement uS = link.prepareStatement(
            "INSERT INTO StatB (HPStatB, STRStatB, SPRStatB, DEFStatB, SPEStatB) VALUES (?, ?, ?, ?, ?)"
        );
        uS.setInt(1, HPB);
        uS.setInt(2, STRB);
        uS.setInt(3, SPRB);
        uS.setInt(4, DEFB);
        uS.setInt(5, SPEB);
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