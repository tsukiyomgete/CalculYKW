package com.ykwshowdown.menu;
import java.sql.SQLException;
import java.util.*;
import com.ykwshowdown.user.*;
import com.ykwshowdown.database.*;

public class HomeMenu
{
    Scanner sc = new Scanner(System.in);
    String str;
    private WatchList watchList = new WatchList(); // ← instance de WatchList

    public void menu() { // ← retiré "static" pour pouvoir utiliser watchList
        
        int choix = -1;
        InitBaseDeDonnee();
        System.out.println("Possèdez vous un compte showdown chez nous ?");
        str = sc.nextLine();
        if(str.equalsIgnoreCase("Oui"))
        {
            User userlogged = logIn();
        }
        else
        {
            User userTest =createUserData();

            try {
            DataBase baseDeDonnee = new DataBase();
            baseDeDonnee.addUser(userTest);
            System.out.println("Utilisateur ajouté à la base de données !");
            } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
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
                watchList.menu(); // ← ouvre le menu équipe complet
            }
            if (choix == 2) {
                System.out.println("(Tier Actuel - à implémenter)");
            }
            if (choix == 3) {
                System.out.println("(Ladder - à implémenter)");
            }
            if (choix == 4) {
                System.out.println("Bye !");
            }
        }
    }

    public User createUserData()
    {
        String strUser = "";
        String strMdp = "";
        do 
        {
            System.out.println("Veuillez insérez votre nom d'utilisateur");
            strUser =sc.nextLine();
            System.out.println("Veuillez insérez votre mdp");
            strMdp = sc.nextLine();
        }while(strUser.length() > 20 || strMdp.length() < 8);
        User userdata = new User(strUser, strMdp);
        return userdata;
         
    }

    public void InitBaseDeDonnee()
    {
        try {
        DataBase baseDeDonnee = new DataBase();
        } catch (SQLException e) {
        System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
    }


    public User logIn()
    {
        String strUser = "";
        String strMdp = "";
        try {
        DataBase baseDeDonnee = new DataBase();
        System.out.println("Veuillez insérez votre nom d'utilisateur");
        strUser =sc.nextLine();
        if(baseDeDonnee.userExists(strUser))
        {
            System.out.println("Veuillez insérez votre mdp");
            strMdp = sc.nextLine();
            if(baseDeDonnee.mdpExist(strUser, strMdp))
            {
                System.out.println("Bon retour " + strUser);
                User userLogged = new User(strUser, strMdp);
                return userLogged;
            }
            else
            {
                throw new IllegalArgumentException("Le mdp est incorrect");
            }
        }
        else
        {
            throw new IllegalArgumentException("Le nom d'utilisateur n'existe pas");
        }
        }
        catch (SQLException e) {
        System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
        return null;
        
    }

    public static void main(String[] args) {
        new HomeMenu().menu(); // ← point d'entrée
    }
}
