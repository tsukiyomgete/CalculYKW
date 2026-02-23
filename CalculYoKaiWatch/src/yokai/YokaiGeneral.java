package yokai;

import static init.Init.medaillum;
import java.util.Scanner;

public class YokaiGeneral {
    Yokai yokai;
    String surnom;

    Stat StatActu;
    Equipement ItemYokai;

    int level;
    public int AttackLevel;
    public int TechniqueLevel;
    public int SoultimateLevel;
    Attitude attitudeYoKai;
    public int LoafLevel;
    public int TrainingCount;
    IV ivYokai;
    SportsClub SportsClub;

    
    public YokaiGeneral()
    {
        
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

public void addYokai(Yokai y)
{
    if(yokai == null)
    {
    Scanner sc = new Scanner(System.in);
    int trouve=-1;

    System.out.println("What yokai do you want to add?");
    String str = sc.nextLine();
        
    for(int i=0; i<medaillum.length; i++)
    {
        if(str.equalsIgnoreCase(medaillum[i].GetName()))
        {
        trouve = i;
        }
    }

    if(trouve != -1)
    {
        yokai = medaillum[trouve];
        System.out.println("The yokai " + medaillum[trouve].GetName() + " has been added!");
    }
    else
    {
        System.out.println("Yokai non-trouvé");
    }

    }
    else
    {
        throw new IllegalArgumentException("You can't have 2 souls of a yokai in one");
    }       
}

    




    public String GetName()
    {
        return yokai.GetName();
    }

    public int GetLevel()
    {
        return level;
    }



    public void setStat(Stat stat)
    {
        this.StatActu.HP = stat.HP;
        this.StatActu.STR = stat.STR;
        this.StatActu.SPR = stat.SPR;
        this.StatActu.DEF = stat.DEF;
        this.StatActu.SPE = stat.SPE;
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
    

}