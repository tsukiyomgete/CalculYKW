package menu;
import init.calcul;
import yokai.*;
import java.util.Scanner;


public class WatchBuilder {
    String nomTeam;
    final int MAXYOKAI=6;
    YokaiGeneral[] WatchTeam;
    int nbYokai;

    Scanner sc = new Scanner(System.in);

    public WatchBuilder(String nomTeam)
    {
        this.nomTeam = nomTeam;
        this.WatchTeam = new YokaiGeneral[MAXYOKAI];
        for(int i=0; i<WatchTeam.length;i++)
        {
            WatchTeam[i]= new YokaiGeneral();
            nbYokai++;
        }
    }
    
    public int addYokai()
    {
        int rang=0;
        System.out.println("A quel rang voulez vous ajouter un yokai? (1-6)");
        String rangNum = sc.nextLine();
        rang=Integer.parseInt(rangNum);
        if(rang < 1 || rang > 6)
        {
            throw new IllegalArgumentException("Faux pas compris entre 1 et 6");
        }
        else
        {
            rang -= 1;
            System.out.println("Avec quel yokai souhaites tu le remplacer?");
            String yokaiString = sc.nextLine();
            WatchTeam[rang] = new YokaiGeneral();
            WatchTeam[rang].addYokai(yokaiString);
            System.out.println(WatchTeam[rang].GetName());
            return rang;
        }
    }

    public void modifYokai(int rang)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("    ");
        System.out.println("Veuillez Insérez le niveau de votre yokai");
        System.out.println("    ");
        String strLevel = sc.nextLine();
        WatchTeam[rang].setLevel(strLevel);
        System.out.println("    ");
        System.out.println("Lancement de méthode setIV");
        System.out.println("    ");
        WatchTeam[rang].setIV();
    }



    public void print()
    {
        System.out.println(nomTeam);
        for(int i=0; i<nbYokai; i++)
        {  
            if((WatchTeam[i].GetEquipement() != null) || (WatchTeam[i].GetAttitude() != null))
            {
                System.out.println(WatchTeam[i].GetName()+ " Level: " + WatchTeam[i].GetLevel());
                WatchTeam[i].setStat(calcul.calculStatsCorrected(WatchTeam[i]));
                System.out.println("        ");
                System.out.println("        ");
            }
            else
            {
                System.out.println(WatchTeam[i].GetName()+ " Level: " + WatchTeam[i].GetLevel());
                WatchTeam[i].setStat(calcul.calculStatsUncorrected(WatchTeam[i]));
                System.out.println("        ");
                System.out.println("        ");
            }
            
        }
    }

    public String GetName(int rang)
    {
        return WatchTeam[rang].GetName();
    }

    public String GetTeamName()
    {
        return nomTeam;
    }

    public int GetTeamSize()
    {
        return WatchTeam.length;
    }



}
