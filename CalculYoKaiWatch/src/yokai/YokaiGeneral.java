package yokai;

import static init.Init.medaillum;
import static init.Init.unknown;
import java.util.Scanner;

public class YokaiGeneral {
    Yokai yokai;
    String surnom;

    Stat StatActu;
    Equipement ItemYokai;

    int level;
    int AttackLevel;
    int TechniqueLevel;
    int SoultimateLevel;
    Attitude attitudeYoKai;
    int LoafLevel;
    int TrainingCount;
    IV ivYokai;
    SportsClub SportsClub;

    
    public YokaiGeneral()
    {
        yokai = null;
        surnom = null;
        StatActu = new Stat(0,0,0,0,0);
        ItemYokai = null;
        level = 0;
        attitudeYoKai = unknown;
        ivYokai = new IV(0,0,0,0,0);
        SportsClub = new SportsClub(0, 0, 0, 0);
    }



    public YokaiGeneral(Yokai yokai, String surnom, int level, IV ivYokai) {
        
        this.yokai = yokai;
        this.surnom = surnom;
        this.level = level;   
    }

    public YokaiGeneral(Yokai yokai, String surnom,int level, Attitude attitudeYoKai, Equipement EquipYokai) {
        
        this.yokai = yokai;
        this.surnom = surnom;
        this.ItemYokai = EquipYokai;
        this.level = level;

        this.attitudeYoKai = attitudeYoKai;

        this.SportsClub = new SportsClub(0,0,0,0);
        this.StatActu = new Stat(0,0,0,0, 0);
        this.ivYokai = new IV(0, 0, 0, 0,0);
    }

    public Yokai GetYokai()
    {
        return yokai;
    }

    public IV GetIv()
    {
        return ivYokai;
    }

    public void addYokai()
    {
        if(yokai == null)
        {
            Scanner sc = new Scanner(System.in);
            int trouve=-1;

            System.out.println("What yokai do you want to add?");
            String str = sc.nextLine();
            if(rechercheYokai(str)!=0)
            {
                yokai = medaillum[rechercheYokai(str)];
            }
            else
            {
                System.out.println("Yokai non trouvé!");
            }

        }
        else
        {
            Scanner sc = new Scanner(System.in);
            int trouve=-1;

            System.out.println("With what yokai do you want to replace " + yokai.GetName() + " ?");
            String str = sc.nextLine();
            if(rechercheYokai(str)!=0 && medaillum[rechercheYokai(str)]!=yokai)
            {
                yokai = medaillum[rechercheYokai(str)];
            }
            else
            {
                System.out.println("Yokai non trouvé!");
            }
        }         
    }




    
    public int rechercheYokai(String nomRecherche)
	{
		int trouve=0;
		for(int i=0; i<medaillum.length; i++)
        {
            if(nomRecherche.equalsIgnoreCase(medaillum[i].GetName()))
            {
            trouve = i;
            }
        }

        if(trouve != -1)
        {
            yokai = medaillum[trouve];
            System.out.println("The yokai " + medaillum[trouve].GetName() + " has been found!");
            return trouve;
        }
        else
        {
            System.out.println("Yokai non-trouvé");
            return 0;
        }
	}

    

    public void setStat(Stat stat)
    {
        this.StatActu.HP = stat.HP;
        this.StatActu.STR = stat.STR;
        this.StatActu.SPR = stat.SPR;
        this.StatActu.DEF = stat.DEF;
        this.StatActu.SPE = stat.SPE;
    }

    public void setName()
    {
        final int MAXNAMESIZE=26;
        Scanner sc = new Scanner(System.in);
        System.out.println("What will be the nickname of your yokai?");
        String str = sc.nextLine();
        if(str.length()>26 || str.length()<0)
        {
            System.out.println("The name of your yokai isn't correct, max limit is 26 caracter");
        }
        else
        {
            surnom = str;
        }
    }








    public Attitude GetAttitude()
    {
        return this.attitudeYoKai;
    }

    public Equipement GetEquipement()
    {
        return ItemYokai;
    }

    public SportsClub GetSportsClub()
    {
        return SportsClub;
    }

    public int GetHP()
    {
        return StatActu.HP;
    }
    public int GetSTR()
    {
        return StatActu.STR;
    }
    public int GetSPR()
    {
        return StatActu.SPR;
    }
    public int GetDEF()
    {
        return StatActu.DEF;
    }
    public int GetSPE()
    {
        return StatActu.SPE;
    }

    public String GetName()
    {
        return yokai.GetName();
    }

    public int GetLevel()
    {
        return level;
    }
    

}