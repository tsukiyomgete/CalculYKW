package com.ykwshowdown.menu;
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
        customCMD();
        System.out.println("Possèdez vous un compte showdown chez nous ?");
        str = sc.nextLine();
        User userConnected;
        if (str.equalsIgnoreCase("Oui")) {
            userConnected = logIn();
        } else {
        System.out.println("Voulez vous crée un compte ou restez anonyme?");
        str = sc.nextLine();
        if(str.equalsIgnoreCase("Oui"))
        {
            userConnected = createUserData();
            try {
                DataBase.addUser(userConnected);
                System.out.println("Utilisateur ajouté à la base de données !");
            } catch (Exception e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        else
        {
            userConnected = new User();
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

    public void customCMD()
    {
        
    }

    public void delBaseDeDonnee()
    {

    }

    public void initBaseDeDonnee() {
        
    }

    public User logIn() {
    String strUser = "";
    String strMdp = "";
    boolean connected = false;

    while (!connected) {
        System.out.println("Veuillez insérer votre nom d'utilisateur");
        strUser = sc.nextLine();
        System.out.println("Veuillez insérer votre mdp");
        strMdp = sc.nextLine();
            try {
                connected = DataBase.getMdp(strUser, strMdp);
            if (!connected) {
                System.out.println("Identifiants incorrects, réessayez.");
            }
            } catch (Exception e) {
            System.out.println("Erreur de connexion au serveur, réessayez.");
            System.out.println("Détail : " + e.getMessage());
            }
        }
        System.out.println("Bon retour " + strUser);
        return new User(strUser, strMdp);
    }

}

 