package init;

import yokai.*;

public class Init {
    		

			public static Attitude gentle = new Attitude("gentle",26,0,13,0,0);
    		public static Attitude tender = new Attitude("tender",52,0,0,0,0);
    		public static Attitude grouchy = new Attitude("grouchy",26,13,0,0,0);
    		public static Attitude rough = new Attitude("rough",0,26,0,0,0);
    		public static Attitude logical = new Attitude("logical",0,0,13,0,13);
    		public static Attitude brainy = new Attitude("brainy",0,0,26,0,0);
    		public static Attitude careful = new Attitude("careful",0,0,13,13,0);
    		public static Attitude calm = new Attitude("calm",0,0,0,26,0);
    		public static Attitude twisted = new Attitude("twisted",0,0,0,0,13);
    		public static Attitude cruel = new Attitude("cruel",0,0,0,0,26);
    		public static Attitude helpful = new Attitude("helpful",26,0,0,0,13);
    		public static Attitude devoted = new Attitude("devoted",0,13,0,13,0);
		
			public static Elemental Fire = new Elemental("Fire");
			public static Elemental Water = new Elemental("Water");
			public static Elemental Wind = new Elemental("Wind");
			public static Elemental Ice = new Elemental("Ice");
			public static Elemental Earth = new Elemental("Earth");
			public static Elemental Thunder = new Elemental("Thunder");
			public static Elemental Heal = new Elemental("Heal");
			public static Elemental Absorb = new Elemental("Absorb");

			public static Rank E = new Rank('E');
			public static Rank D = new Rank('D');
			public static Rank C = new Rank('C');
			public static Rank B = new Rank('B');
			public static Rank A = new Rank('A');
			public static Rank S = new Rank('S');

			public static Stat[] statFirstTotal = 
			{
				new Stat(41,4,26,9,21),
				new Stat(36, 35, 3, 9, 11),
				new Stat(40,18,18,12,17),
				new Stat(65,8,43,30,22),
				new Stat(50, 33, 5, 20, 27),
				new Stat(63,11,17,33,11),
				new Stat(45,4,36,14,25),
				new Stat(51,8,39,13,25),
			
			
			
			};

			public static Stat[] statEndTotal =
			{
				new Stat(343,40,190,102,160),
				new Stat(290,212,38,115,115),
				new Stat(321,155,155,85,112),
				new Stat(508,45,281,180,141),
				new Stat(416,203,39,155,181),
				new Stat(448,90,156,218,86),
				new Stat(301,49,241,117,174),
				new Stat(397, 45, 239, 113, 186),
			
			
			};

			public static IV yourIv = new IV(0,0,0,0,0);

			public static Yokai Komasan = new Yokai("Komasan", 251, D, false, true, true, statFirstTotal[0], statEndTotal[0], Water, Fire, 1);
			public static Yokai Pandle = new Yokai("Pandle", 3, E, false, true, false, statFirstTotal[1], statEndTotal[1], Water, Fire, 1 );
			public static Yokai Draggie = new Yokai("Draggie", 537, D, false, false, true, statFirstTotal[2], statEndTotal[2], Earth, Wind, 1);
			public static Yokai ReQPerate = new Yokai("Re-Q-Perate", 616, S, true, false, false, statFirstTotal[3], statEndTotal[3], Wind, Earth, 1);
			public static Yokai Neighfarious = new Yokai("Neighfarious", 432, A, false, false, false, statFirstTotal[4], statEndTotal[4], Earth, Thunder, 1);
			public static Yokai PrideShrimp = new Yokai("Pride Shrimp", 144, B, false, false, false, statFirstTotal[5], statEndTotal[5], Fire, Ice, 1);
			public static Yokai Grainpa = new Yokai("Grainpa", 318, B, false, false, false,statFirstTotal[6], statEndTotal[6], Wind , Earth, 1);
			public static Yokai Komaous = new Yokai("Komaous", 252, A, false, false, false, statFirstTotal[7], statEndTotal[7], Water, Fire, 1);




			public SportsClub Sports = new SportsClub(0,0,0,0);


			public static Equipement InvertedSpearOfHeaven = new Equipement(1, 0, 0, 0, 0, 0,false, false);
		}

