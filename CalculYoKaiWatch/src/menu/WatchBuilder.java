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
        WatchTeam[0] = new YokaiGeneral();
        nbYokai=1;
    }
    
    public void addYokai()
    {
        if(nbYokai<MAXYOKAI)
        {
            System.out.println("Veuillez saisir un yokai à ajouter !");
            String yokaiString = sc.nextLine();
            
            WatchTeam[nbYokai] = new YokaiGeneral();
            WatchTeam[nbYokai].addYokai(yokaiString);
            System.out.println(WatchTeam[nbYokai].GetName());
            //WatchTeam[nbYokai]
            nbYokai++;
        }
        
    }

    public void print()
    {
        System.out.println(nomTeam);
    }


    public void printLN()
    {
        System.out.println(nomTeam);
        for(int i=0; i<WatchTeam.length; i++)
        {  
            System.out.println(WatchTeam[i].GetName()+ " Level: " + WatchTeam[i].GetLevel());
            WatchTeam[i].setStat(calcul.calculStatsCorrected(WatchTeam[i]));
            System.out.println("HP: " + WatchTeam[i].GetHP());
            System.out.println("STR: " + WatchTeam[i].GetSTR());
            System.out.println("SPR: " + WatchTeam[i].GetSPR());
            System.out.println("DEF: " + WatchTeam[i].GetDEF());
            System.out.println("SPE: " + WatchTeam[i].GetSPE());
            System.out.println(" ");
        }
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
