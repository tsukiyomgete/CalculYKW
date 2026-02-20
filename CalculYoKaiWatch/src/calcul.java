import java.util.Scanner;
import yokai.*;

public class Calcul {
	
	public static void calculDegat()
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

	public static void calculStats(YokaiGeneral rorigoon)
	{
		StatA StatA = rorigoon.yokai.statInit;
		StatB StatB = rorigoon.yokai.statEnd;
		IV IV = rorigoon.ivYokai;
		int Level = rorigoon.level;
		int UncorrectedNumber;

		int HP;
		int STR;
		int SPR;
		int DEF;
		int SPE;


		Scanner sc = new Scanner(System.in);
		System.out.println("On va afficher les stats");

		HP = StatA.BaseHP+(StatB.finalHP-StatA.BaseHP)*(Level-1)/98;
		STR = StatA.BaseSTR+(StatB.finalSTR-StatA.BaseSTR)*(Level-1)/98;
		SPR = StatA.BaseSPR+(StatB.finalSPR-StatA.BaseSPR)*(Level-1)/98;
		DEF = StatA.BaseDEF+(StatB.finalDEF-StatA.BaseDEF)*(Level-1)/98;
		SPE = StatA.BaseSPE+(StatB.finalSPE-StatA.BaseSPE)*(Level-1)/98;

		System.out.println("HP" + HP);
		System.out.println("STR" + STR);
		System.out.println("SPR" + SPR);
		System.out.println("DEF" + DEF);
		System.out.println("SPE" + SPE);

		/*

		System.out.println("What's the stats of your yokai at level 1?");
		String str = sc.nextLine();
		StatA= Integer.parseInt(str);

		System.out.println("What's the stats of your yokai at level 99?");
		str = sc.nextLine();
		StatB= Integer.parseInt(str);

		System.out.println("What's the number of IV of your Yokai?");
		str = sc.nextLine();
		IV= Integer.parseInt(str);

		System.out.println("What's the level of your yokai?");
		str = sc.nextLine();
		Level= Integer.parseInt(str);

		UncorrectedNumber = (int)(StatA+(StatB-StatA+IV)*(Level-1)/98);

		System.out.println("Your yokai's base stats is: " + UncorrectedNumber);
		*/
	}

	public static void calculStatsCorrected()
	{
		int StatA;
		int StatB;
		int IV;
		int Level;
		int CorrectedNumber;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's the stats of your yokai at level 1?");
		String str = sc.nextLine();
		StatA= Integer.parseInt(str);

		System.out.println("What's the stats of your yokai at level 99?");
		str = sc.nextLine();
		StatB= Integer.parseInt(str);

		System.out.println("What's the number of IV of your Yokai?");
		str = sc.nextLine();
		IV= Integer.parseInt(str);

		System.out.println("What's the level of your yokai?");
		str = sc.nextLine();
		Level= Integer.parseInt(str);

		System.out.println("What's the attitude of your yokai?");
		str = sc.nextLine();

/*
		switch(str.toLowerCase()) {

    		case "gentle":
        		attitudes = gentle;
        		break;

    		case "rough":
        		attitudeChoisie = rough;
        		break;

    		case "logical":
        		attitudeChoisie = logical;
        		break;

    		case "brainy":
        		attitudeChoisie = brainy;
        		break;

    		case "calm":
        		attitudeChoisie = calm;
        		break;

    		case "careful":
        		attitudeChoisie = careful;
        		break;

    		case "twisted":
        		attitudeChoisie = twisted;
        		break;

    		case "cruel":
        		attitudeChoisie = cruel;
        		break;

    		case "helpful":
        		attitudeChoisie = helpful;
        		break;

    		case "devoted":
        		attitudeChoisie = devoted;
        		break;

    		case "tender":
        		attitudeChoisie = tender;
        		break;

    		case "grouchy":
        		attitudeChoisie = grouchy;
        		break;

    		default:
     		System.out.println("Unknown attitude");

			
}



		CorrectedNumber = (int)(StatA+(StatB-StatA+IV)*(Level-1)/98);
		


		System.out.println("Your yokai's base stats is: " + CorrectedNumber);
*/	
	}
}
	
