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
				new Stat(41,4,26,9,21)
			};

			public static Stat[] statEndTotal =
			{
				new Stat(343,40,190,102,160)
			};

			public static IV yourIv = new IV(0,0,0,0,0);

			public static Yokai Komasan = new Yokai("Komasan", 251, D, false, true, true, statFirstTotal[0], statEndTotal[0], Water, Fire, 1);

		}

