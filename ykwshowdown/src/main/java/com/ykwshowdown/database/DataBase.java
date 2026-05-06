package com.ykwshowdown.database;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.ykwshowdown.fightingdata.PhysicalAttack;
import com.ykwshowdown.fightingdata.Technique;
import com.ykwshowdown.user.User;
import com.ykwshowdown.yokai.Elemental;
import com.ykwshowdown.yokai.Inspirit;
import com.ykwshowdown.yokai.Rank;
import com.ykwshowdown.yokai.Stat;
import com.ykwshowdown.yokai.Tier;
import com.ykwshowdown.yokai.Tribe;
import com.ykwshowdown.yokai.Yokai;
import com.ykwshowdown.Talent.*;

public class DataBase {

    private static final String BASE_URL = "https://spring-boot-production-1d8d.up.railway.app/api";
    private static final String DB_URL = "jdbc:mysql://root:qTltSACuHSypPmZNAjNOZSlOngUlSWeX@autorack.proxy.rlwy.net:59240/railway";

    private static Connection conn = null;

    private DataBase() {
    }

    // =========================================================================
    // CONNEXION SQL
    // =========================================================================

    private static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(DB_URL);
        }
        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            conn = null;
        }
    }

    // =========================================================================
    // USERS (API REST)
    // =========================================================================

    public static void addUser(User userTest) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String joinedDate = sdf.format(userTest.getDate());
        String lastConnected = sdf.format(userTest.getLoggedDate());

        String url = BASE_URL + "/users"
                + "?username=" + URLEncoder.encode(userTest.getUser(), StandardCharsets.UTF_8)
                + "&password=" + URLEncoder.encode(userTest.getPassWord(), StandardCharsets.UTF_8)
                + "&joinedDate=" + joinedDate
                + "&lastConnected=" + lastConnected
                + "&elo=1000";

        HttpResponse<String> response = postRequest(url);

        if (response.statusCode() != 200) {
            throw new Exception("Erreur API addUser : " + response.body());
        }
    }

    public static User getUser(String username) throws Exception {
        String url = BASE_URL + "/users/" + URLEncoder.encode(username, StandardCharsets.UTF_8);
        HttpResponse<String> response = getRequest(url);

        String body = response.body();
        if (body == null || body.isEmpty() || body.equals("null")) {
            return null;
        }

        return new Gson().fromJson(body, User.class);
    }

    public static boolean getMdp(String username, String password) throws Exception {
        String url = BASE_URL + "/users/login"
                + "?username=" + URLEncoder.encode(username, StandardCharsets.UTF_8)
                + "&password=" + URLEncoder.encode(password, StandardCharsets.UTF_8);

        HttpResponse<String> response = postRequest(url);
        return Boolean.parseBoolean(response.body());
    }

    public static void setDate(User userTest, Date loggedDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(loggedDate);

        String url = BASE_URL + "/users/updateDate"
                + "?username=" + URLEncoder.encode(userTest.getUser(), StandardCharsets.UTF_8)
                + "&Date=" + formattedDate;

        HttpResponse<String> response = postRequest(url);

        if (response.statusCode() != 200) {
            throw new Exception("Erreur API setDate : " + response.body());
        }
    }

    // =========================================================================
    // YOKAI (API REST)
    // =========================================================================

    public static Yokai getYokai(String nom) throws Exception {
        String url = BASE_URL + "/yokai/nomYokai/"
                + URLEncoder.encode(nom, StandardCharsets.UTF_8).replace("+", "%20");

        HttpResponse<String> response = getRequest(url);
        String body = response.body();

        if (body == null || body.isEmpty() || body.equals("null")) {
            return null;
        }

        Gson gson = buildYokaiGson();
        Yokai y = gson.fromJson(body, Yokai.class);

        y.setStatA(getStatA(y.getStatAId()));
        y.setStatB(getStatB(y.getStatBId()));

        return y;
    }

    // =========================================================================
    // STATS (API REST)
    // =========================================================================

    public static Stat getStatA(int id) throws Exception {
        HttpResponse<String> response = getRequest(BASE_URL + "/statA/" + id);
        return new Gson().fromJson(response.body(), Stat.class);
    }

    public static Stat getStatB(int id) throws Exception {
        HttpResponse<String> response = getRequest(BASE_URL + "/statB/" + id);
        return new Gson().fromJson(response.body(), Stat.class);
    }

    // =========================================================================
    // INSERTIONS (JDBC)
    // =========================================================================

    public static void insertTribe(Tribe tribu) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Tribu (nomTribu) VALUES (?)")) {
            uS.setString(1, tribu.GetTribe());
            uS.executeUpdate();
        }
    }

    public static void insertElemental(Elemental element) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Elemental (nomElement) VALUES (?)")) {
            uS.setString(1, element.getElement());
            uS.executeUpdate();
        }
    }

    public static void insertRank(Rank rang) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Rang (nomRang) VALUES (?)")) {
            uS.setString(1, String.valueOf(rang.GetRank()));
            uS.executeUpdate();
        }
    }

    public static void insertTier(Tier tier) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Tier (nomTier) VALUES (?)")) {
            uS.setString(1, tier.getTier());
            uS.executeUpdate();
        }
    }

    public static void insertStatA(Stat statA) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO StatA (HPStatA, STRStatA, SPRStatA, DEFStatA, SPEStatA) VALUES (?, ?, ?, ?, ?)")) {
            uS.setInt(1, statA.GetHP());
            uS.setInt(2, statA.GetSTR());
            uS.setInt(3, statA.GetSPR());
            uS.setInt(4, statA.GetDEF());
            uS.setInt(5, statA.GetSPE());
            uS.executeUpdate();
        }
    }

    public static void insertStatB(Stat statB) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO StatB (HPStatB, STRStatB, SPRStatB, DEFStatB, SPEStatB) VALUES (?, ?, ?, ?, ?)")) {
            uS.setInt(1, statB.GetHP());
            uS.setInt(2, statB.GetSTR());
            uS.setInt(3, statB.GetSPR());
            uS.setInt(4, statB.GetDEF());
            uS.setInt(5, statB.GetSPE());
            uS.executeUpdate();
        }
    }

    public static void insertYokai(Yokai y) throws SQLException {
    String sql = """
            INSERT INTO Yokai (
                nomYokai, idMedaillum, rangYokai, nomTribu, isLegendary,
                talent, faiblesseElementaire, faiblesseMultipliers,
                resistanceElementaire, resistanceMultipliers,
                tierYokai, statA, statB,
                idAttaque, idTechnique, idInspirit,
                baseAttackPerC, baseTechniquePerC, baseInspiritPerC, baseGuardPerC,
                chanceInspirited, maxItem
            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            """;
    try (PreparedStatement uS = getConnection().prepareStatement(sql)) {
        uS.setString(1, y.GetName());
        uS.setInt(2, y.GetID());
        uS.setString(3, String.valueOf(y.GetRank()));
        uS.setString(4, y.GetTribe());
        uS.setBoolean(5, y.isLegendary());
        uS.setString(6, y.getTalent());
        uS.setString(7, y.GetWkElementString());
        uS.setDouble(8, y.getWeakMultipliers());
        uS.setString(9, y.GetResElementString());
        uS.setDouble(10, y.getResMultipliers());
        uS.setString(11, y.GetTierString());
        uS.setInt(12, y.getStatAId());
        uS.setInt(13, y.getStatBId());
        uS.setInt(14, y.getAttack().getId());
        uS.setInt(15, y.GetTechnique().getId());
        uS.setString(15, y.getInspirit().getNom());
        uS.setDouble(17, y.getBaseAttackPerC());
        uS.setDouble(18, y.getBaseTechniquePerC());
        uS.setDouble(19, y.getBaseInspiritPerC());
        uS.setDouble(20, y.getBaseGuardPerC());
        uS.setDouble(21, y.getChanceInspirited());
        uS.setInt(22, y.getMaxItem());
        uS.executeUpdate();
    }
}

    public static void createTechniques() throws SQLException {
        try (Statement requete = getConnection().createStatement()) {
            requete.execute("""
                    CREATE TABLE IF NOT EXISTS Techniques (
                        id            INTEGER PRIMARY KEY AUTO_INCREMENT,
                        ElementalName VARCHAR(20) NOT NULL UNIQUE,
                        LV1BP         INT NOT NULL,
                        LV10BP        INT NOT NULL,
                        NUMHIT        INT NOT NULL,
                        Element       VARCHAR(20) NOT NULL,
                        FOREIGN KEY(Element) REFERENCES Elemental(nomElement)
                    )""");
        }
    }

    public static void createAttack() throws SQLException {
        try (Statement requete = getConnection().createStatement()) {
            requete.execute("""
                    CREATE TABLE IF NOT EXISTS Attack (
                        id            INTEGER PRIMARY KEY AUTO_INCREMENT,
                        ElementalName VARCHAR(20) NOT NULL UNIQUE,
                        LV1BP         INT NOT NULL,
                        LV10BP        INT NOT NULL,
                        NUMHIT        INT NOT NULL,
                        Element       VARCHAR(20) NOT NULL,
                        FOREIGN KEY(Element) REFERENCES Elemental(nomElement)
                    )""");
        }
    }

    public static void insertAttack(PhysicalAttack pa) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Attack (id, ElementalName, LV1BP, LV10BP, NUMHIT, Element) VALUES (?, ?, ?, ?, ?, ?)")) {
            uS.setInt(1, pa.getId());
            uS.setString(2, pa.getNomAttack());
            uS.setInt(3, pa.getBP1());
            uS.setInt(4, pa.getBP10());
            uS.setInt(5, pa.getNHIT());
            uS.setString(6, pa.getElementalTypeStringTechnique());
            uS.executeUpdate();
        }
    }

    public static void createTalent() throws SQLException {
        try (Statement requete = getConnection().createStatement()) {
            requete.execute("""
                    CREATE TABLE IF NOT EXISTS Talent (
                        id            INTEGER PRIMARY KEY AUTO_INCREMENT,
                        nomTalent        VARCHAR(20) NOT NULL UNIQUE,
                        TriggerType   VARCHAR(20) NOT NULL
                    )""");
        }
    }

    public static void insertTalent(Talent tal) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Talent (id, nomTalent, TriggerType) VALUES (?, ?, ?)")) {
            uS.setInt(1, tal.getID());
            uS.setString(2, tal.getNom());
            uS.setString(3, tal.getTriggerType().name());
            uS.executeUpdate();
        }
    }

    public static void createYokai() throws SQLException {
    try (Statement requete = getConnection().createStatement()) {
        requete.execute("""
                CREATE TABLE IF NOT EXISTS Yokai (
                    id                    INTEGER      PRIMARY KEY AUTO_INCREMENT,
                    nomYokai              VARCHAR(50)  NOT NULL UNIQUE,
                    idMedaillum           INTEGER      NOT NULL,
                    rangYokai             VARCHAR(1)   NOT NULL,
                    nomTribu              VARCHAR(20)  NOT NULL,
                    talent                VARCHAR(100) NOT NULL,
                    faiblesseElementaire  VARCHAR(20)  NOT NULL,
                    faiblesseMultipliers  DOUBLE       NOT NULL,
                    resistanceElementaire VARCHAR(20)  NOT NULL,
                    resistanceMultipliers DOUBLE       NOT NULL,
                    tierYokai             VARCHAR(10)  NOT NULL DEFAULT 'NU',
                    statA                 INTEGER      NOT NULL,
                    statB                 INTEGER      NOT NULL,
                    idAttaque             INTEGER      NOT NULL,
                    idTechnique           INTEGER      NOT NULL,
                    idInspirit            INTEGER      NOT NULL,
                    baseAttackPerC        DOUBLE       NOT NULL,
                    baseTechniquePerC     DOUBLE       NOT NULL,
                    baseInspiritPerC      DOUBLE       NOT NULL,
                    baseGuardPerC         DOUBLE       NOT NULL,
                    chanceInspirited      DOUBLE       NOT NULL,
                    maxItem               INTEGER      NOT NULL DEFAULT 1,
                    FOREIGN KEY(nomTribu)              REFERENCES Tribu(nomTribu),
                    FOREIGN KEY(faiblesseElementaire)  REFERENCES Elemental(nomElement),
                    FOREIGN KEY(resistanceElementaire) REFERENCES Elemental(nomElement),
                    FOREIGN KEY(statA)                 REFERENCES StatA(id),
                    FOREIGN KEY(statB)                 REFERENCES StatB(id),
                    FOREIGN KEY(idAttaque)             REFERENCES PhysicalAttack(id),
                    FOREIGN KEY(idTechnique)           REFERENCES Technique(id),
                    FOREIGN KEY(idInspirit)            REFERENCES Inspirit(id)
                )""");
    }
}

    public static void createInspirit() throws SQLException {
        try (Statement requete = getConnection().createStatement()) {
            requete.execute("""
                    CREATE TABLE IF NOT EXISTS Inspirit (
                        id                   INTEGER PRIMARY KEY AUTO_INCREMENT,
                        nomInspirit          VARCHAR(20)  NOT NULL,
                        descriptionInspirit  VARCHAR(100) NOT NULL,
                        STREffet             DOUBLE       NOT NULL,
                        SPREffect            DOUBLE       NOT NULL,
                        DEFEffect            DOUBLE       NOT NULL,
                        SPEEffect            DOUBLE       NOT NULL,
                        targetAllies         TINYINT(1)   NOT NULL,
                        disableActing        TINYINT(1)   NOT NULL,
                        confusingEnemy       TINYINT(1)   NOT NULL,
                        canDamageOverTime    TINYINT(1)   NOT NULL
                    )""");
        }
    }

    public static void insertInspirit(Inspirit inspirit) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Inspirit (nomInspirit, descriptionInspirit, STREffet, SPREffect, DEFEffect, SPEEffect, targetAllies, disableActing, confusingEnemy, canDamageOverTime, numberOverTime, canHealAllies) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)")) {
            uS.setString(1, inspirit.getNom());
            uS.setString(2, inspirit.getDescription());
            uS.setDouble(3, inspirit.getSTRInspirit());
            uS.setDouble(4, inspirit.getSPRInspirit());
            uS.setDouble(5, inspirit.getDEFInspirit());
            uS.setDouble(6, inspirit.getSPEInspirit());
            uS.setBoolean(7, inspirit.isTargetAllies());
            uS.setBoolean(8, inspirit.isDisableActing());
            uS.setBoolean(9, inspirit.isConfusingEnemy());
            uS.setBoolean(10, inspirit.canDamageOverTime());
            uS.setDouble(11, inspirit.getNumberOverTime());
            uS.setBoolean(12, inspirit.canHealAllies());
            uS.executeUpdate();
        }
    }

    public static void insertTechnique(Technique tech) throws SQLException {
        try (PreparedStatement uS = getConnection().prepareStatement(
                "INSERT INTO Techniques (id, ElementalName, LV1BP, LV10BP, NUMHIT, Element) VALUES (?, ?, ?, ?, ?, ?)")) {
            uS.setInt(1, tech.getId());
            uS.setString(2, tech.getNomAttack());
            uS.setInt(3, tech.getBP1());
            uS.setInt(4, tech.getBP10());
            uS.setInt(5, tech.getNHIT());
            uS.setString(6, tech.getElementalTypeStringTechnique());
            uS.executeUpdate();
        }
    }

    public static void addElo(User userTest) throws SQLException {
        userTest.addElo();
        try (PreparedStatement uS = getConnection().prepareStatement(
                "UPDATE Users SET elo = ? WHERE id = ?")) {
            uS.setInt(1, userTest.getELO());
            uS.setInt(2, userTest.getID());
            uS.executeUpdate();
        }
    }

    public static void setLoggedDate(User userTest) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(userTest.getDate().getTime());
        try (PreparedStatement uS = getConnection().prepareStatement(
                "UPDATE Users SET last_connected = ? WHERE id = ?")) {
            uS.setDate(1, sqlDate);
            uS.setInt(2, userTest.getID());
            uS.executeUpdate();
        }
    }

    public static void viderStat() throws SQLException {
        try (Statement requete = getConnection().createStatement()) {
            requete.execute("SET FOREIGN_KEY_CHECKS = 0");
            requete.execute("TRUNCATE TABLE StatA");
            requete.execute("TRUNCATE TABLE StatB");
            requete.execute("SET FOREIGN_KEY_CHECKS = 1");
        }
    }

    public static boolean userExists(String username) throws SQLException {
        try (PreparedStatement rS = getConnection().prepareStatement(
                "SELECT id FROM Users WHERE username = ?")) {
            rS.setString(1, username);
            ResultSet result = rS.executeQuery();
            return result.next();
        }
    }

    public static boolean mdpExist(String username, String mdp) throws SQLException {
        try (PreparedStatement rS = getConnection().prepareStatement(
                "SELECT password FROM Users WHERE username = ?")) {
            rS.setString(1, username);
            ResultSet result = rS.executeQuery();
            if (result.next()) {
                return result.getString("password").equals(mdp);
            }
            return false;
        }
    }

    public static int getNbUser() throws SQLException {
        try (PreparedStatement rS = getConnection().prepareStatement(
                "SELECT COUNT(*) AS total FROM Users")) {
            ResultSet result = rS.executeQuery();
            if (result.next()) {
                return result.getInt("total");
            }
            return 0;
        }
    }

    // =========================================================================
    // HELPERS PRIVÉS
    // =========================================================================

    private static HttpResponse<String> getRequest(String url) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    private static HttpResponse<String> postRequest(String url) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    private static Gson buildYokaiGson() {
        return new GsonBuilder()
                .registerTypeAdapter(Rank.class,
                        (JsonDeserializer<Rank>) (json, type, ctx) -> new Rank(json.getAsString().charAt(0)))
                .registerTypeAdapter(Tier.class,
                        (JsonDeserializer<Tier>) (json, type, ctx) -> {
                            String value = json.getAsString();
                            for (Tier t : Tier.values()) {
                                if (t.getTier().equals(value))
                                    return t;
                            }
                            return null;
                        })
                .registerTypeAdapter(Elemental.class,
                        (JsonDeserializer<Elemental>) (json, type, ctx) -> new Elemental(json.getAsString()))
                .registerTypeAdapter(Tribe.class,
                        (JsonDeserializer<Tribe>) (json, type, ctx) -> new Tribe(json.getAsString()))
                .create();
    }
}