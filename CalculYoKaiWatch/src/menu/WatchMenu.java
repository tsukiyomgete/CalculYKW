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
        int choix=-1;
        while(choix!=2)
        {
            if(nbTeam == 0)
            {
                System.out.println("Aucune équipe n'est encore disponible");
                return;
            }
            System.out.println("    TES EQUIPES     ");
            System.out.printf("%-10s %-5s%n", "Nom de l'équipe", "Nombre de yokai");
		    for (int i = 0; i < nbTeam; i++) 
            {
                WatchBuilder wT = yourTeam[i];
                System.out.printf("%-10s %-5d%n", wT.GetTeamName(), wT.GetTeamSize());
            }
            System.out.println("        ");
            System.out.println("        "); 
            System.out.println("        ");
            System.out.println("        "); 

            System.out.println("Veux-tu quitter où modifier tes équipes ?");
            System.out.println("1) Modifier");
            System.out.println("2) Afficher");
            System.out.println("3) Quitter");
            choix = Integer.parseInt(sc.nextLine());
            if(choix == 1)
            {
                searchTeam();
                break;
            }
            if(choix == 2)
            {
                System.out.println("Quel équipe souhaitez vous observez ?");
                String nomTeam = sc.nextLine();
                for(int i=0; i<yourTeam.length; i++)
                {
                    if(yourTeam[i] != null && nomTeam.equalsIgnoreCase(yourTeam[i].GetTeamName()))
                    {
                        yourTeam[i].print();
                    }   
                    else
                    {
                        System.out.println("Aucune équipe ont été trouvé");
                        return;  
                    }
                }
            }
            else if(choix == 3)
            {
                break;
            }
        }
    }

    public void searchTeam()
    {
        System.out.println("Quel équipe souhaitez vous modifier ?");
        String nomTeam = sc.nextLine();
        for(int i=0; i<yourTeam.length; i++)
        {
            if(yourTeam[i] != null && nomTeam.equalsIgnoreCase(yourTeam[i].GetTeamName()))
            {
                
                //Si oui, on commence par le level et ensuite par les IV et on recalcule les stats ici    
                yourTeam[i].print();
                yourTeam[i].addYokai();

                System.out.println("Souhaitez vous modifiez les IV et le niveau des Yokai?");
                nomTeam = sc.nextLine();
                if(nomTeam.equalsIgnoreCase("O"))
                {
                    System.out.println("A quel rang souhaitez vous modifier les stats du yokai?");
                    int rang = Integer.parseInt(sc.nextLine()); 
                    //yourTeam[i].modifYokai();
                }
            }
            else
            {
                System.out.println("Aucune équipe ont été trouvé");
                return;  
            }
        }
    }

    public boolean isModifyable(int iTeam, int rang)
    {
        if(yourTeam[iTeam].GetName(rang) != "???")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}