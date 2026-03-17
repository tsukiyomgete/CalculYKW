package com.ykwshowdown.menu;
import com.ykwshowdown.init.*;
import java.sql.SQLException;
import java.util.Scanner;

import com.ykwshowdown.database.DataBase;
import com.ykwshowdown.user.User;

public class HomeMenu {
    Scanner sc = new Scanner(System.in);
    String str;
    private WatchList watchList = new WatchList();

    public void menu() {

        int choix = -1;
        initBaseDeDonnee();
        Init.insererLesAttitudes();

        System.out.println("Possèdez vous un compte showdown chez nous ?");
        str = sc.nextLine();

        User userConnected;
        if (str.equalsIgnoreCase("Oui")) {
            userConnected = logIn();
        } else {
            userConnected = createUserData();
            try {
                DataBase.addUser(userConnected);
                System.out.println("Utilisateur ajouté à la base de données !");
            } catch (SQLException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        

        while (choix != 4) {
            System.out.println("    HOME MENU    ");
            System.out.println("1) Equipe");
            System.out.println("2) Tier Actuel");
            System.out.println("3) Ladder");
            System.out.println("4) Quitter");
            choix = sc.nextInt();
            sc.nextLine();

            if (choix == 1) {
                watchList.menu();
            }
            if (choix == 2) {
                System.out.println("(Tier Actuel - à implémenter)");
            }
            if (choix == 3) {
                System.out.println("(Ladder - à implémenter)");
            }
            if (choix == 4) {
                System.out.println("Bye !");
                try {
                    DataBase.closeLink();
                } catch (SQLException e) {
                    System.out.println("Erreur fermeture BDD : " + e.getMessage());
                }
                System.exit(0);
            }
        }
    }

    public User createUserData() {
        String strUser = "";
        String strMdp = "";
        do {
            System.out.println("Veuillez insérez votre nom d'utilisateur (20 caractères max)");
            strUser = sc.nextLine();
            System.out.println("Veuillez insérez votre mdp (8 caractères min)");
            strMdp = sc.nextLine();
        } while (strUser.length() > 20 || strMdp.length() < 8);

        return new User(strUser, strMdp);
    }

    public void delBaseDeDonnee()
    {
        try {
             DataBase.delTables();
            } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
            }
        System.out.println("Suppression de la Table users");
    }

    public void initBaseDeDonnee() {
        try {
            DataBase.init();
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
    }

    public User logIn() {
        String strUser = "";
        String strMdp = "";
        try {
            boolean connected = false;
            while (!connected) {
                System.out.println("Veuillez insérez votre nom d'utilisateur");
                strUser = sc.nextLine();

                if (DataBase.userExists(strUser)) {
                    System.out.println("Veuillez insérez votre mdp");
                    strMdp = sc.nextLine();

                    if (DataBase.mdpExist(strUser, strMdp)) {
                        connected = true;
                    } else {
                        System.out.println("Mot de passe incorrect !");
                    }
                } else {
                    System.out.println("Nom d'utilisateur introuvable !");
                }
            }
            System.out.println("Bon retour " + strUser);
            return new User(strUser, strMdp);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
        return null;
    }
}