package init;

import yokai.*;

public class Init {
    		
			public static Tribe Brave = new Tribe("Brave");
			public static Tribe Mysterious = new Tribe("Mysterious");
			public static Tribe Tough = new Tribe("Tough");
			public static Tribe Charming = new Tribe("Charming");
			public static Tribe Heartful = new Tribe("Heartful");
			public static Tribe Shady = new Tribe("Shady");
			public static Tribe Eerie = new Tribe("Eerie");
			public static Tribe Slippery = new Tribe("Slippery");
			public static Tribe Wicked = new Tribe("Wicked");
			public static Tribe Enma = new Tribe("Enma");
			
			public static Attitude unknown = new Attitude("null", 0, 0, 0, 0, 0);
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
				new Stat(42,27,2,4,19),
				new Stat(47,26,4,15,9),
				new Stat(36, 35, 3, 9, 11),
				new Stat(41,46,4,14,14),
				new Stat(39,46,4,15,15),
				new Stat(48,28,3,10,13),
				new Stat(53,37,4,15,16),
				new Stat(54,41,5,17,18),
				new Stat(38,18,2,11,20),
				new Stat(52,29,6,20,26),
				new Stat(40,25,5,11,13),
				new Stat(51,46,7,19,32),
				
			
			
			
			};

			public static Stat[] statEndTotal =
			{	
				new Stat(341,192,37,54,176),
				new Stat(374,178,43,145,96),
				new Stat(290,212,38,115,115),
				new Stat(324,241,41,124,134),
				new Stat(317,208,87,102,125),
				new Stat(305,212,30,117,125),
				new Stat(358,245,41,134,124),
				new Stat(371,252,45,139,140),
				new Stat(284,190,37,112,132),
				new Stat(348,221,56,148,149),
				new Stat(288,183,44,110,119),
				new Stat(419,361,43,148,250),
				

			
			
			};

			public static Stat unknownStat = new Stat(0,0,0,0,0);
			public static Yokai unknownYokai = new Yokai("???", 0, E, Wicked, false, unknownStat, unknownStat, Fire, Fire, Fire, 1);
			public static Equipement unknowEquipement = new Equipement(0, 0, 0, 0, 0, 0, false, false);
			public static Yokai[] medaillum = {
				new Yokai("Sigh-Durr", 1, E, Brave,false, statFirstTotal[0], statEndTotal[0], Earth ,Wind, Earth, 1),
				new Yokai("Flippit", 2, E, Brave,false, statFirstTotal[1], statEndTotal[1], Earth ,Wind, Earth, 1),
				new Yokai("Pandle", 3, E, Brave ,false, statFirstTotal[2], statEndTotal[2], Fire ,Water, Fire, 1 ),
			
			};

			public static Equipement InvertedSpearOfHeaven = new Equipement(1, 0, 0, 0, 0, 0,false, false);


			public static void printYokai()
    		{
        		System.out.printf("%-20s %-5s %-5s %10s%n", "Yo-kai", "Rang", "N° Medaillum", "Tribu");
				for(Yokai y : medaillum)
				{
					System.out.printf("%-20s %-5s %-5s %17s%n", y.GetName(), y.GetRank(), y.GetID(), y.GetTribe());
				}
    		}
		}

