package menu;
import init.calcul;
import yokai.*;


public class WatchBuilder {
    String nomTeam;
    final int MAXYOKAI=6;
    YokaiGeneral[] WatchTeam;

    public WatchBuilder(String nomTeam)
    {
        this.nomTeam = nomTeam;
        this.WatchTeam = new YokaiGeneral[MAXYOKAI];
    }
    
    public void addYokai()
    {
        for(int i=0; i<WatchTeam.length; i++)
        {
            if(WatchTeam[i]==null)
            {
                YokaiGeneral yg = new YokaiGeneral();
                WatchTeam[i] = yg;
            }
            else
            {
                System.out.println("Erreur!, taille maximale remplis");
            }
        }
    }

    public void print()
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
