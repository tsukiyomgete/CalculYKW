package menu;
import java.util.Scanner;


public class WatchMenu {
    final int MAXTEAM=20;
    WatchBuilder[] yourTeam;
    int nbTeam;
    Scanner sc = new Scanner(System.in);
    
    public WatchMenu()
    {
        yourTeam = new WatchBuilder[MAXTEAM];
        nbTeam=0;
    }

    public void menu()
    {
        int choix=-1;

        while(choix!=3)
        {
            System.out.println("    MENU DES EQUIPES    ");
            System.out.println("1) Crée une équipe");
            System.out.println("2) Afficher les équipes");
            System.out.println("3) Quitter");
            choix = sc.nextInt();
            sc.nextLine();

            if(choix == 1)
            {
                addTeam();
            }
            if(choix == 2)
            {
                printTeam();
            }
            if(choix == 3)
            {
                System.out.println("Bye !"); 
            }

        }

    }

    public void addTeam()
    {
        if(nbTeam < MAXTEAM)
        {
            System.out.println("Choisissez le nom de votre équipe :");
            String nomTeam = sc.nextLine();
            yourTeam[nbTeam] = new WatchBuilder(nomTeam);
            nbTeam++;
        }
        else
        {
            System.out.println("Nombre maximum d'équipe atteintes !");
            return; 
        }
    }

    public void printTeam()
    {
        if(nbTeam == 0)
        {
            System.out.println("Aucune équipe n'est encore disponible");
        }
        System.out.println("    TES EQUIPES     ");
        System.out.printf("%-10s %-5s%n", "Nom de l'équipe", "Nombre de yokai");
		for(WatchBuilder wT : yourTeam)
		{
			System.out.printf("%-10s %-5d%n", wT.GetTeamName(), wT.GetTeamSize());
		}
    }

}