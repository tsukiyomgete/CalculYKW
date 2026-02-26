package yokai;

import static init.Init.medaillum;
import static init.Init.unknowEquipement;
import static init.Init.unknown;
import static init.Init.unknownYokai;

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
        yokai = unknownYokai;
        surnom = "???";
        StatActu = new Stat(0,0,0,0,0);
        ItemYokai = null;
        level = 0;
        attitudeYoKai = unknown;
        ivYokai = new IV(0,0,0,0,0);
        SportsClub = new SportsClub(0, 0, 0, 0);
        ItemYokai = unknowEquipement;
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

    public void addYokai(String str)
    {
        Scanner sc = new Scanner(System.in);
        int trouve=-1;
        
        if(yokai == null && yokai == unknownYokai)
        {
            
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

    public void modifYokai()
    {
        System.out.println("    ");
        System.out.println("Veuillez Insérez le niveau de votre yokai");
        System.out.println("    ");
        String strLevel = sc.nextLine();
        setLevel(strLevel);
        System.out.println("    ");
        System.out.println("Lancement de méthode setIV");
        System.out.println("    ");
        setIV();
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
            //System.out.println("The yokai " + medaillum[trouve].GetName() + " has been found!");
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

    public void setIV()
    {
        System.out.println("On va générer les IV de ce yokai");
        ivYokai.setIV();
    }

    public void setLevel(String str)
    {
        int level=Integer.parseInt(str);
        if(level < 0 || level > 99)
        {
            throw new IllegalArgumentException("Impossible, valeur de niveau non comprise");
        }
        else
        {
            this.level = level;
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