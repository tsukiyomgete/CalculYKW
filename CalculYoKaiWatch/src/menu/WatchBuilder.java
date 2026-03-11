package menu;
import init.calcul;
import java.util.*;
import yokai.*;


public class WatchBuilder {
    String nomTeam;
    final int MAXYOKAI=6;
    //YokaiGeneral[] WatchTeam;
    ArrayList<YokaiGeneral> WatchTeam;
    int nbYokai;

    Scanner sc = new Scanner(System.in);

    public WatchBuilder(String nomTeam)
    {
        this.nomTeam = nomTeam;
        this.WatchTeam = new ArrayList<>(Collections.nCopies(6, null));
        
    }
    
    public int addYokai()
    {
        int rang=-1;
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
            YokaiGeneral yk = new YokaiGeneral();
            yk.addYokai(yokaiString);
            WatchTeam.set(rang, yk);
            
            //WatchTeam[rang] = new YokaiGeneral();
            //WatchTeam[rang].addYokai(yokaiString);

            System.out.println(WatchTeam.get(rang).GetName());
            //System.out.println(WatchTeam[rang].GetName());
            return rang;
        }
    }

    public void modifYokai(int rang)
    {
        System.out.println("    ");
        System.out.println("Veuillez Insérez le niveau de votre yokai");
        System.out.println("    ");
        String strLevel = sc.nextLine();
        WatchTeam.get(rang).setLevel(strLevel);
        System.out.println("    ");
        System.out.println("Lancement de méthode setIV");
        System.out.println("    ");
        WatchTeam.get(rang).setIV();
    }



    public void print() {
    System.out.println(nomTeam);
    for (int i = 0; i < WatchTeam.size(); i++) {
        YokaiGeneral yk = WatchTeam.get(i); // on stocke pour éviter les répétitions

        if (yk == null) continue; // ✅ on saute les emplacements vides

        System.out.println(yk.GetName() + " Level: " + yk.GetLevel());
        System.out.println("Rang : " + (i+1));

        if (yk.GetEquipement() != null || yk.GetAttitude() != null) { // ✅ null vérifié avant
            yk.setStat(calcul.calculStatsCorrected(yk));
        } else {
            yk.setStat(calcul.calculStatsUncorrected(yk));
        }

        System.out.println("        ");
        System.out.println("        ");
    }
}

    public String GetName(int rang)
    {
        return WatchTeam.get(rang).GetName();
    }

    public String GetTeamName()
    {
        return nomTeam;
    }

    public int GetTeamSize()
    {
        return WatchTeam.size();
    }



}
