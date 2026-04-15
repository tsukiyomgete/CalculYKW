package com.ykwshowdown.database;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.ykwshowdown.user.User;
import com.ykwshowdown.yokai.Elemental;
import com.ykwshowdown.yokai.Rank;
import com.ykwshowdown.yokai.Stat;
import com.ykwshowdown.yokai.Tier;
import com.ykwshowdown.yokai.Tribe;
import com.ykwshowdown.yokai.Yokai;

public class DataBase {

    private static final String link = "https://spring-boot-production-1d8d.up.railway.app/api";

    private DataBase() {
    }

    public static void addUser(User userTest) throws Exception {

        // 1. On formate les dates en String YYYY-MM-DD
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String joinedDate = sdf.format(userTest.getDate());
        String lastConnected = sdf.format(userTest.getLoggedDate());

        String url = link + "/users"
                + "?username=" + userTest.getUser()
                + "&password=" + userTest.getPassWord()
                + "&joinedDate=" + joinedDate
                + "&lastConnected=" + lastConnected
                + "&elo=1000";

        // 2. On construit l'URL avec les paramètres
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

    public static Yokai getYokai(String nom) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link + "/yokai/nomYokai/" + URLEncoder.encode(nom, StandardCharsets.UTF_8)))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println("Réponse: " + response.body());
        if (response.body() == null) {
            return null;
        }
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Rank.class, (JsonDeserializer<Rank>) (json, type, ctx) -> {
                    return new Rank(json.getAsString().charAt(0));
                })
                .registerTypeAdapter(Tier.class, (JsonDeserializer<Tier>) (json, type, ctx) -> {
                    String value = json.getAsString();
                    for (Tier t : Tier.values()) {
                        if (t.getTier().equals(value)) {
                            return t;
                        }
                    }
                    return null;
                })
                .registerTypeAdapter(Elemental.class, (JsonDeserializer<Elemental>) (json, type, ctx) -> {
                    return new Elemental(json.getAsString());
                })
                .registerTypeAdapter(Tribe.class, (JsonDeserializer<Tribe>) (json, type, ctx) -> {
                    return new Tribe(json.getAsString());
                })
                .create();

        Yokai y = gson.fromJson(response.body(), Yokai.class);
        
        y.setStatA(getStatA(y.getStatAId()));
        y.setStatB(getStatB(y.getStatBId()));

        return y;
    }

    public static Stat getStatA(int id) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link + "/statA/" + id))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        //System.out.println("StatA réponse: " + response.body());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Stat.class);
    }

    public static Stat getStatB(int id) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link + "/statB/" + id))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        // System.out.println("StatB réponse: " + response.body());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Stat.class);
    }

    public static User getUser(String username) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link + "/users/" + username))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        // Si l'utilisateur n'existe pas l'API retourne null ou ""
        if (response.body() == null) {
            return null;
        }

        Gson gson = new Gson();
        return gson.fromJson(response.body(), User.class);
    }

    public static boolean getMdp(String username, String password) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        String encodedUsername = URLEncoder.encode(username, StandardCharsets.UTF_8);
        String encodedPassword = URLEncoder.encode(password, StandardCharsets.UTF_8);

        String url = link + "/users/login"
                + "?username=" + encodedUsername
                + "&password=" + encodedPassword;

        // System.out.println("URL: " + url); 

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        //System.out.println("Status: " + response.statusCode()); // debug
        //System.out.println("Réponse: " + response.body());  debug

        return Boolean.parseBoolean(response.body());
    }

    public static void setDate(User userTest, Date loggedDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String joinedDate = sdf.format(loggedDate);

        String url = link + "/users"
                + "?username=" + userTest.getUser()
                + "&lastConnected=" + joinedDate;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link + "/users/updateDate"
                        + "?username=" + userTest.getUser()
                        + "&Date=" + joinedDate))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new Exception("Erreur API : " + response.body());
        }
    }

    /*
     * public static void insertYokai(Yokai y) throws SQLException
     * {
     * if(link == null) init();
     * int idMedaillum = y.GetID();
     * String nomYokai = y.GetName();
     * String nomTribu = y.GetTribe();
     * String rangYokai = String.valueOf(y.GetRank());
     * String typeElement = y.GetTypeElement();
     * String weakElement = y.GetWkElement();
     * String resElement = y.GetResElement();
     * String tierYokai = y.GetTier();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO Yokai (nomYokai, nomTribu, rangYokai, typeElementaire, faiblesseElementaire, resistanceElementaire, statB, statA, tierYokai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
     * );
     * uS.setString(1, nomYokai);
     * uS.setString(2, nomTribu);
     * uS.setString(3, rangYokai);
     * uS.setString(4, typeElement);
     * uS.setString(5, weakElement);
     * uS.setString(6, resElement);
     * uS.setInt(7, idMedaillum);
     * uS.setInt(8, idMedaillum);
     * uS.setString(9, tierYokai);
     * uS.executeUpdate();
     * }
     * 
     * 
     * public static void addElo(User userTest) throws SQLException
     * {
     * if(link == null) init();
     * userTest.addElo();
     * PreparedStatement uS = link.prepareStatement(
     * "UPDATE Users SET elo = ? WHERE id = ?"
     * );
     * uS.setInt(1, userTest.getELO());
     * uS.setInt(2, userTest.getID());
     * uS.executeUpdate();
     * }
     * public static void setLoggedDate(User userTest) throws SQLException
     * {
     * if(link == null) init();
     * java.util.Date dateUser = userTest.getDate();
     * java.sql.Date sqlDate = new java.sql.Date(dateUser.getTime());
     * PreparedStatement uS =
     * link.prepareStatement("UPDATE Users SET last_connected = ? WHERE id = ?");
     * uS.setDate(1, sqlDate);
     * uS.setInt(2, userTest.getID());
     * uS.executeUpdate();
     * }
     * 
     * public static void viderStat() throws SQLException
     * {
     * Statement requete = link.createStatement();
     * requete.execute("SET FOREIGN_KEY_CHECKS = 0");
     * requete.execute("TRUNCATE TABLE StatA");
     * requete.execute("TRUNCATE TABLE StatB");
     * requete.execute("SET FOREIGN_KEY_CHECKS = 1");
     * }
     * 
     * 
     * public static boolean userExists(String username) throws SQLException
     * {
     * if(link == null) init();
     * PreparedStatement rS = link.prepareStatement(
     * "SELECT id FROM Users WHERE username = ?"
     * );
     * rS.setString(1, username);
     * ResultSet result = rS.executeQuery();
     * return result.next();
     * }
     * 
     * public static boolean mdpExist(String username, String mdp) throws
     * SQLException
     * {
     * if(link == null) init();
     * PreparedStatement rS = link.prepareStatement(
     * "SELECT password FROM Users WHERE username = ?"
     * );
     * rS.setString(1, username);
     * ResultSet result = rS.executeQuery();
     * if(result.next())
     * {
     * return result.getString("password").equals(mdp);
     * }
     * return false;
     * }
     * 
     * public static int getNbUser() throws SQLException
     * {
     * if(link == null) init();
     * PreparedStatement rS = link.prepareStatement(
     * "SELECT COUNT(*) AS total FROM Users"
     * );
     * ResultSet result = rS.executeQuery();
     * if(result.next())
     * {
     * return result.getInt("total");
     * }
     * return 0;
     * }
     * 
     * public static void insertTribe(Tribe tribu) throws SQLException
     * {
     * if(link == null) init();
     * String nomTribu = tribu.GetTribe();
     * 
     * 
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO Tribu (nomTribu) VALUES (?)"
     * );
     * uS.setString(1, nomTribu);
     * uS.executeUpdate();
     * }
     * 
     * public static void insertElemental(Elemental element) throws SQLException
     * {
     * if(link == null) init();
     * String nomElement = element.getElement();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO Elemental (nomElement) VALUES (?)"
     * );
     * uS.setString(1, nomElement);
     * uS.executeUpdate();
     * }
     * public static void insertRank(Rank rang) throws SQLException
     * {
     * if(link == null) init();
     * char nomRang = rang.GetRank();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO Rang (nomRang) VALUES (?)"
     * );
     * uS.setString(1, String.valueOf(nomRang));
     * uS.executeUpdate();
     * }
     * public static void insertTier(Tier tier) throws SQLException
     * {
     * if(link == null) init();
     * String nomtier = tier.getTier();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO Tier (nomTier) VALUES (?)"
     * );
     * uS.setString(1, nomtier);
     * uS.executeUpdate();
     * }
     * public static void insertAttitude(Attitude behavior) throws SQLException
     * {
     * if(link == null) init();
     * String attitudeString = behavior.getAttitude();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO Attitude (nomAttitude) VALUES (?)"
     * );
     * uS.setString(1, attitudeString);
     * uS.executeUpdate();
     * }
     * 
     * public static void insertStatA(Stat statA) throws SQLException
     * {
     * if(link == null) init();
     * int HPA = statA.GetHP();
     * int STRA = statA.GetSTR();
     * int SPRA = statA.GetSPR();
     * int DEFA = statA.GetDEF();
     * int SPEA = statA.GetSPE();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO StatA (HPStatA, STRStatA, SPRStatA, DEFStatA, SPEStatA) VALUES (?, ?, ?, ?, ?)"
     * );
     * uS.setInt(1, HPA);
     * uS.setInt(2, STRA);
     * uS.setInt(3, SPRA);
     * uS.setInt(4, DEFA);
     * uS.setInt(5, SPEA);
     * uS.executeUpdate();
     * }
     * 
     * public static void insertStatB(Stat statB) throws SQLException
     * {
     * if(link == null) init();
     * 
     * int HPB = statB.GetHP();
     * int STRB = statB.GetSTR();
     * int SPRB = statB.GetSPR();
     * int DEFB = statB.GetDEF();
     * int SPEB = statB.GetSPE();
     * PreparedStatement uS = link.prepareStatement(
     * "INSERT INTO StatB (HPStatB, STRStatB, SPRStatB, DEFStatB, SPEStatB) VALUES (?, ?, ?, ?, ?)"
     * );
     * uS.setInt(1, HPB);
     * uS.setInt(2, STRB);
     * uS.setInt(3, SPRB);
     * uS.setInt(4, DEFB);
     * uS.setInt(5, SPEB);
     * uS.executeUpdate();
     * }
     * 
     * 
     * 
     * public static void closeLink() throws SQLException {
     * if(link != null)
     * {
     * link.close();
     * link = null;
     * }
     * }
     */
}