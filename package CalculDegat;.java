package CalculDegat;
import java.util.Scanner;

public class calcul {
	
	public static void main(String[] args)
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
		
		
}
	
