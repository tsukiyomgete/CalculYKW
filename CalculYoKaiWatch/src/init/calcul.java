package init;
import java.util.Random;
import java.util.Scanner;
import yokai.*;



public class calcul {
	

	static Random r = new Random();

	public static int randomGenerate(int max)
	{
		return r.nextInt(max);
	}

	public static int min(int valeurMax, int valeur)
	{
		if(valeur < valeurMax) 
		{
			return valeur;
		}
		else 
		{
			return valeurMax;
		}
	}

	public void calculDegat()
	{
		final int YokaiNumber = 6;
		final int maxDamage = 999;
		final int minDamage = 1;
		
		double damageRoll = 0.9 + Math.random() * 0.2;
		int CorrectedSTRSPR;
		int BasePower;
		int Def;
		double EM;
		double SkillVal;
		float GuardInt=1;
		int valeur=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is your yokai receiving physical or special damage?");
		String str = sc.nextLine();
		if(str.equals("P")) 
		{
			EM = 1;
			System.out.println("Insert the physical damage of the enemy's attack ");
			 str = sc.nextLine();
			CorrectedSTRSPR= Integer.parseInt(str);
		}
		else
		{
			System.out.println("Insert the special damage of the enemy's attack ");
			 str = sc.nextLine();
			CorrectedSTRSPR= Integer.parseInt(str);
			
			System.out.println("Is your yokai weak or resistant to the magic attack? Respond with W or R");
			str = sc.nextLine();
			if(str.equals("W"))
			{
				EM= 1.2f;
			}
			else
			{
				EM= 0.8f;
			}
		}
		
		
		System.out.println("Now insert the base power of the attack");
		str = sc.nextLine();
		BasePower= Integer.parseInt(str);
		
		System.out.println("Insert the defense of your yokai");
		str = sc.nextLine();
		Def= Integer.parseInt(str);
		
		System.out.println("Does your ennemi got any SkillMultiplier active?");
		str = sc.nextLine();
		if(str.equals("N"))
		{
			SkillVal = 1;
		}
		else
		{
			System.out.println("How many yo kai in the enemy teams got a skill multiplier compatible with the spell's types?");
			str = sc.nextLine();
			while(Integer.parseInt(str) >YokaiNumber)
			{
				System.out.println("Error, max yokai number can only be 6");
				str = sc.nextLine();
			}
			SkillVal = (int)Math.pow(1.2f, Integer.parseInt(str));
			
		}
		System.out.println("Are you guarding?");
		str = sc.nextLine();
		if(str.equals("Y"))
		{
			GuardInt = 0.5f; 
		}
		
		//THE ENTIRE FORMULA
		
		valeur = (int)((((CorrectedSTRSPR)/2)+(BasePower/2)-(Def/4))*1*EM*SkillVal*GuardInt);
		System.out.println("Your yokai is dealing: " + valeur);
	}

	public static Stat calculStatsUncorrected(YokaiGeneral yg)
	{
		Stat StatA = yg.GetYokai().statInit;
		Stat StatB = yg.GetYokai().statEnd;
		IV IV = yg.GetIv();
		int Level = yg.GetLevel();
	
		int uHP;
		int uSTR;
		int uSPR;
		int uDEF;
		int uSPE;


		Scanner sc = new Scanner(System.in);
		System.out.println("On va afficher les stats");
		double niv = (Level - 1)/98.0;

		uHP  = (int) Math.floor(StatA.GetHP()+(StatB.GetHP()-StatA.GetHP()+IV.GetIvHP())*niv);
		uSTR = (int) Math.floor(StatA.GetSTR()+(StatB.GetSTR()-StatA.GetSTR()+IV.GetIvSTR())*niv);
		uSPR = (int) Math.floor(StatA.GetSPR()+(StatB.GetSPR()-StatA.GetSPR()+IV.GetIvSPR())*niv);
		uDEF = (int) Math.floor(StatA.GetDEF()+(StatB.GetDEF()-StatA.GetDEF()+IV.GetIvDEF())*niv);
		uSPE = (int) Math.floor(StatA.GetSPE()+(StatB.GetSPE()-StatA.GetSPE()+IV.GetIvSPE())*niv);

		System.out.println("HP" + uHP);
		System.out.println("STR" + uSTR);
		System.out.println("SPR" + uSPR);
		System.out.println("DEF" + uDEF);
		System.out.println("SPE" + uSPE);

		Stat UncoStatActu = new Stat(uHP,uSTR,uSPR,uDEF,uSPE);

		return UncoStatActu;
	}

	

	public static Stat calculStatsCorrected(YokaiGeneral yg)
	{
		Stat StatA = yg.GetYokai().statInit;
		Stat StatB = yg.GetYokai().statEnd;
		IV IV = yg.GetIv();
		int Level = yg.GetLevel();
		Attitude atYG = yg.GetAttitude();
		Equipement ItemYG = yg.GetEquipement();
		SportsClub nbYG = yg.GetSportsClub();
		
		int aHP = atYG.GetHP();
		int aSTR = atYG.GetSTR();
		int aSPR = atYG.GetSPR();
		int aDEF = atYG.GetDEF();
		int aSPE = atYG.GetSPE();

		int iHP=ItemYG.GetHP();
		int iSTR=ItemYG.GetSTR();
		int iSPR=ItemYG.GetSPR();
		int iDEF=ItemYG.GetDEF();
		int iSPE=ItemYG.GetSPE();

		int nbSTR= nbYG.nbGetSPR();
		int nbSPR= nbYG.nbGetSPR();
		int nbDEF= nbYG.nbGetDEF();
		int nbSPE= nbYG.nbGetSPE();

		int cHP;
		int cSTR;
		int cSPR;
		int cDEF;
		int cSPE;

		System.out.println("On va afficher les stats corrigés");
		double niv = (Level - 1)/98.0;

		cHP  = (int) Math.floor(StatA.GetHP()+(StatB.GetHP()-StatA.GetHP()+IV.GetIvHP())*niv+aHP*(1+Level/198)+iHP);
		cSTR = (int) Math.floor(StatA.GetSTR()+(StatB.GetSTR()-StatA.GetSTR()+IV.GetIvSTR())*niv+aSTR*(1+Level/198)+nbSTR*5+iSTR);
		cSPR = (int) Math.floor(StatA.GetSPR()+(StatB.GetSPR()-StatA.GetSPR()+IV.GetIvSPR())*niv+aSPR*(1+Level/198)+nbSPR*5+iSPR);
		cDEF = (int) Math.floor(StatA.GetDEF()+(StatB.GetDEF()-StatA.GetDEF()+IV.GetIvDEF())*niv+aDEF*(1+Level/198)+nbDEF*5+iDEF);
		cSPE = (int) Math.floor(StatA.GetSPE()+(StatB.GetSPE()-StatA.GetSPE()+IV.GetIvSPE())*niv+aDEF*(1+Level/198)+nbSPE*5+iSPE);

		System.out.println("HP" + cHP);
		System.out.println("STR" + cSTR);
		System.out.println("SPR" + cSPR);
		System.out.println("DEF" + cDEF);
		System.out.println("SPE" + cSPE);

		Stat CoStatActu = new Stat(cHP,cSTR,cSPR,cDEF,cSPE);

		return CoStatActu;	
	}

	



}
	
