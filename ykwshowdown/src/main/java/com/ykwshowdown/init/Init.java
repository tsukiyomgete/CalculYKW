package com.ykwshowdown.init;

import com.ykwshowdown.yokai.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ykwshowdown.database.*;

public class Init {
    		
	public static void insererTribe(Tribe tribu)
	{
		try {
            DataBase.insertTribe(tribu);;
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
	}
	public static void insererElement(Elemental element)
	{
		try {
            DataBase.insertElemental(element);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
	}

	public static void insererRang(Rank rang)
	{
		try {
            DataBase.insertRank(rang);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
	}

	public static void insererTier(Tier tier)
	{
		try {
            DataBase.insertTier(tier);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
	}

	public static void insererStatA(Stat statA)
	{
		try {
            DataBase.insertStatA(statA);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
	}

	public static void insererStatB(Stat statB)
	{
		try {
            DataBase.insertStatB(statB);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
	}

	public static void insererAttitude(Attitude attitude)
	{
		try {
			DataBase.insertAttitude(attitude);
		} catch(SQLException e){
			System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
		}
	}
	public static void insererLesAttitudes()
	{
		insererAttitude(gentle);
		insererAttitude(tender);
		insererAttitude(grouchy);
		insererAttitude(rough);
		insererAttitude(logical);
		insererAttitude(brainy);
		insererAttitude(careful);
		insererAttitude(calm);
		insererAttitude(twisted);
		insererAttitude(cruel);
		insererAttitude(helpful);
		insererAttitude(devoted);
	}
	public static void insererLesElements()
	{
		insererElement(Fire);
		insererElement(Water);
		insererElement(Wind);
		insererElement(Ice);
		insererElement(Earth);
		insererElement(Thunder);
		insererElement(Heal);
		insererElement(Absorb);
	}
	public static void insererLesTribus()
	{
		insererTribe(Brave);
		insererTribe(Mysterious);
		insererTribe(Tough);
		insererTribe(Charming);
		insererTribe(Heartful);
		insererTribe(Shady);
		insererTribe(Eerie);
		insererTribe(Slippery);
		insererTribe(Wicked);
		insererTribe(Enma);
		insererTribe(Wandroid);
	}
	public static void insererLesRangs()
	{
		insererRang(S);
		insererRang(A);
		insererRang(B);
		insererRang(C);
		insererRang(D);
		insererRang(E);
	}
	public static void insererLesTiers()
	{
		insererTier(Tier.Ubers);
		insererTier(Tier.OUBL);
		insererTier(Tier.OU);
		insererTier(Tier.UU);
		insererTier(Tier.RU);
		insererTier(Tier.NU);
		insererTier(Tier.PU);
		insererTier(Tier.ZU);
	}
	public static void insererStatA(Stat[] statATotal)
	{
		for(int i=0; i<statATotal.length; i++)
		{
			insererStatA(statATotal[i]);
		}
	}

	public static void insererStatATotal()
	{
		insererStatA(statFirstTotal_0());
		insererStatA(statFirstTotal_1());
		insererStatA(statFirstTotal_2());
		insererStatA(statFirstTotal_3());
		insererStatA(statFirstTotal_4());
		insererStatA(statFirstTotal_5());
		insererStatA(statFirstTotal_6());
	}

	public static void insererStatB(Stat[] statBTotal)
	{
		for(int i=0; i<statBTotal.length; i++)
		{
			insererStatB(statBTotal[i]);
		}
	}

	public static void insererStatBTotal()
	{
		insererStatB(statEndTotal_0());
		insererStatB(statEndTotal_1());
		insererStatB(statEndTotal_2());
		insererStatB(statEndTotal_3());
		insererStatB(statEndTotal_4());
		insererStatB(statEndTotal_5());
		insererStatB(statEndTotal_6());
	}

		
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
		public static Tribe Wandroid = new Tribe("Wandroid");
			
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

			// ============================================================
// Stat arrays - split into chunks to avoid 64KB method limit
// ============================================================

private static Stat[] statFirstTotal_0() {
	return new Stat[] {
		new Stat(42,27,2,4,19), // #1 Sigh-Durr
		new Stat(47,26,4,15,9), // #2 Flippit
		new Stat(36,35,3,9,11), // #3 Pandle
		new Stat(41,46,4,14,14), // #4 Undy
		new Stat(39,46,4,15,15), // #5 Tanbo
		new Stat(48,28,3,10,13), // #6 Cutta-nah
		new Stat(53,37,4,15,16), // #7 Cutta-nah-nah
		new Stat(54,41,5,17,18), // #8 Slacka-slash
		new Stat(38,18,2,11,20), // #9 Brushido
		new Stat(52,29,6,20,26), // #10 Washogun
		new Stat(40,25,5,11,13), // #11 Lie-in
		new Stat(51,46,7,19,32), // #12 Lie-in Heart
		new Stat(55,26,3,11,12), // #13 Hissfit
		new Stat(65,43,6,18,20), // #14 Zerberker
		new Stat(51,38,9,30,24), // #15 Snartle
		new Stat(55,60,17,13,8), // #16 Brutle
		new Stat(58,36,4,12,4), // #17 Mochismo
		new Stat(49,26,8,20,4), // #18 Minochi
		new Stat(33,16,3,9,31), // #19 Minimoto
		new Stat(67,55,3,10,4), // #20 Slumberhog
		new Stat(67,55,3,10,4), // #21 Snortlehog
		new Stat(57,34,4,14,5), // #22 Samureel
		new Stat(66,43,6,17,6), // #23 Time Keeler
		new Stat(38,24,6,13,23), // #24 Goofball
		new Stat(48,30,9,17,25), // #25 Slugger
		new Stat(47,34,4,22,4), // #26 Helmsman
		new Stat(65,42,6,30,7), // #27 Reuknight
		new Stat(68,46,7,32,8), // #28 Corptain
		new Stat(47,35,10,5,12), // #29 Slicenrice
		new Stat(54,46,6,17,19), // #30 Flamurice
		new Stat(42,26,4,12,22), // #31 Tublappa
		new Stat(50,40,8,20,22), // #32 Lappinitup
		new Stat(50,33,5,8,14), // #33 El Gutso
		new Stat(58,43,6,12,25), // #34 Gutso Grande
		new Stat(54,35,4,24,6), // #35 Mudmunch
		new Stat(51,36,5,22,7), // #36 BBQvil
		new Stat(40,24,5,11,31), // #37 Liarbird
		new Stat(58,39,4,17,6), // #38 Benkei
		new Stat(65,36,8,19,10), // #39 B3-NK1
		new Stat(60,25,23,10,7), // #40 Blazion
		new Stat(50,25,23,16,16), // #41 Quaken
		new Stat(58,42,6,19,19), // #42 Siro
		new Stat(53,34,4,14,15), // #43 Chansin
		new Stat(59,41,5,18,20), // #44 Sheen
		new Stat(54,37,7,24,18), // #45 Snee
		new Stat(62,44,6,20,22), // #46 Gleam
		new Stat(38,31,4,15,29), // #47 Hovernyan
		new Stat(50,36,5,18,20), // #48 Moximous N
		new Stat(50,5,36,18,20), // #49 Moximous K
		new Stat(75,29,6,20,13), // #50 Hot Air Buffoon
		new Stat(46,39,7,17,20), // #51 Sushiyama
		new Stat(54,47,10,10,22), // #52 Kapunki
		new Stat(49,37,5,22,17), // #53 Beetler
		new Stat(52,40,6,24,19), // #54 Beetall
		new Stat(56,44,7,26,20), // #55 Cruncha
		new Stat(44,43,6,25,20), // #56 Machonyan
		new Stat(51,19,6,32,28), // #57 Momonyan
		new Stat(55,20,7,44,17), // #58 Sir Nyansalot
		new Stat(47,43,5,18,20), // #59 Sgt. Burly
		new Stat(51,36,15,27,20), // #60 Bison Burly
		new Stat(58,49,10,30,7), // #61 Demuncher
		new Stat(50,25,41,28,6), // #62 Devourer
		new Stat(53,33,25,7,31), // #63 Illuminoct
		new Stat(55,43,9,23,23), // #64 Arachnevil
		new Stat(47,31,6,15,41), // #65 Shurikenny
		new Stat(47,34,7,17,39), // #66 Nunchucky
		new Stat(51,35,22,10,28), // #67 Camellia
		new Stat(39,2,24,8,18), // #68 Brokenbrella
		new Stat(30,4,18,7,23), // #69 Pittapatt
		new Stat(45,5,23,15,11), // #70 Zip Unlock
		new Stat(34,3,20,6,25), // #71 Slippup
		new Stat(33,3,33,10,14), // #72 Snotsolong
		new Stat(39,4,35,12,16), // #73 Duchoo
		new Stat(34,5,16,5,28), // #74 D'wanna
		new Stat(39,8,21,9,33), // #75 N'more
		new Stat(39,6,23,8,37), // #76 Q'wit
		new Stat(27,3,14,5,34), // #77 Wazzat
		new Stat(34,10,20,10,36), // #78 Houzzat
		new Stat(21,2,18,3,36), // #79 Dummkap
		new Stat(43,5,32,6,11), // #80 Who-Me
		new Stat(55,10,42,25,11), // #81 2-Much-2-Take
		new Stat(46,5,27,8,12), // #82 Why Naant
		new Stat(50,7,36,19,23), // #83 Naandhi
		new Stat(40,4,30,13,19), // #84 Faysoff
		new Stat(27,7,11,7,40), // #85 Snottle
		new Stat(41,3,18,12,24), // #86 Legsit
		new Stat(44,25,4,14,16), // #87 Chukket
		new Stat(45,7,28,20,8), // #88 Cornfused
		new Stat(50,9,18,26,7), // #89 Unshelltered
		new Stat(37,29,10,15,16), // #90 Lafalotta
		new Stat(39,31,13,11,19), // #91 Blips
		new Stat(36,9,28,11,15), // #92 Tattletell
		new Stat(42,12,35,18,19), // #93 Tattlecast
		new Stat(33,25,27,9,13), // #94 Skranny
		new Stat(40,12,19,12,17), // #95 Cupistol
		new Stat(46,16,35,16,24), // #96 Casanuva
		new Stat(50,10,33,20,26), // #97 Casanono
		new Stat(38,5,26,13,22), // #98 So-Sorree
		new Stat(50,10,35,21,24), // #99 Bowminos
		new Stat(33,2,24,11,24), // #100 Smogling
	};
}

private static Stat[] statFirstTotal_1() {
	return new Stat[] {
		new Stat(40,4,30,16,36), // #101 Smogmella
		new Stat(43,6,28,12,16), // #102 Signibble
		new Stat(58,10,42,25,7), // #103 Signiton
		new Stat(60,7,40,26,10), // #104 Master Oden
		new Stat(64,7,56,23,7), // #105 Statiking
		new Stat(48,5,27,21,18), // #106 Failian
		new Stat(50,10,27,16,17), // #107 Apelican
		new Stat(47,18,19,18,20), // #108 Fuu 2
		new Stat(46,8,25,14,21), // #109 Shrillington
		new Stat(49,5,27,22,17), // #110 House Partay
		new Stat(43,19,22,9,19), // #111 Skulleidoscope
		new Stat(51,5,33,22,10), // #112 Lionguist
		new Stat(45,4,26,14,24), // #113 Illoo
		new Stat(37,3,22,12,31), // #114 Elloo
		new Stat(53,7,41,19,12), // #115 Alloo
		new Stat(54,5,42,18,4), // #116 Espy
		new Stat(57,6,46,23,3), // #117 Infour
		new Stat(52,4,44,16,5), // #118 Mirapo
		new Stat(58,5,46,29,6), // #119 Miradox
		new Stat(62,9,41,26,8), // #120 Mircle
		new Stat(39,11,37,19,20), // #121 Verygoodsir
		new Stat(48,5,32,18,22), // #122 Statikid
		new Stat(45,8,34,12,24), // #123 Prof. Plumage
		new Stat(47,6,29,16,26), // #124 Throne Wiper
		new Stat(44,11,33,12,23), // #125 Imagenius
		new Stat(49,7,32,16,21), // #126 Miss Teri
		new Stat(42,5,41,16,28), // #127 Maginyan
		new Stat(51,6,38,16,25), // #128 Squandeer
		new Stat(46,7,23,26,28), // #129 Tengu
		new Stat(55,9,28,21,22), // #130 Flengu
		new Stat(53,8,42,24,25), // #131 Kyubi
		new Stat(56,10,38,26,23), // #132 Frostail
		new Stat(46,13,43,23,21), // #133 Chymera
		new Stat(42,10,45,21,26), // #134 Kingmera
		new Stat(53,9,43,21,26), // #135 Toadal Demon
		new Stat(46,7,31,20,35), // #136 Thurston
		new Stat(47,6,33,14,39), // #137 Spect-hare
		new Stat(54,3,41,17,32), // #138 Sn. Spect-hare
		new Stat(46,9,3,20,16), // #139 Oh Wheel
		new Stat(50,10,6,22,8), // #140 Dulluma
		new Stat(57,26,8,31,12), // #141 Darumacho
		new Stat(60,30,7,29,10), // #142 Goruma
		new Stat(49,8,8,20,14), // #143 Wotchagot
		new Stat(63,11,17,33,11), // #144 Pride Shrimp
		new Stat(47,10,6,20,15), // #145 No-Go Kart
		new Stat(50,31,7,23,17), // #146 Mistank
		new Stat(56,12,6,23,6), // #147 Terrorpotta
		new Stat(55,18,10,38,12), // #148 Blownhistoppa
		new Stat(50,11,5,27,5), // #149 Noway
		new Stat(63,14,7,43,8), // #150 Impass
		new Stat(68,5,19,46,9), // #151 Walldin
		new Stat(50,14,5,22,7), // #152 Roughraff
		new Stat(56,25,6,28,16), // #153 Badude
		new Stat(58,29,7,30,18), // #154 Bruff
		new Stat(55,24,6,37,11), // #155 Roughgraff
		new Stat(45,16,4,26,7), // #156 Chilled Cowcao
		new Stat(61,27,8,32,18), // #157 Stircrazy Stu
		new Stat(42,13,8,23,10), // #158 Nummskull
		new Stat(53,29,9,37,14), // #159 Skillskull
		new Stat(57,13,7,26,10), // #160 Armsman
		new Stat(60,12,12,24,9), // #161 Mimikin
		new Stat(48,16,6,26,13), // #162 Oh Bah Gah!
		new Stat(53,6,17,32,4), // #163 Sp mountain
		new Stat(58,17,5,27,7), // #164 Blowkade
		new Stat(60,21,6,33,5), // #165 Ledballoon
		new Stat(52,15,10,28,6), // #166 Sumodon
		new Stat(53,19,14,36,10), // #167 Yokozudon
		new Stat(55,5,16,31,6), // #168 Whateverest
		new Stat(63,6,21,39,7), // #169 Whatuption
		new Stat(39,17,3,18,23), // #170 Fidgephant
		new Stat(53,7,13,29,16), // #171 Touphant
		new Stat(56,16,8,45,13), // #172 Enduriphant
		new Stat(42,17,17,14,16), // #173 Zappary
		new Stat(66,19,19,26,18), // #174 Frazzel
		new Stat(43,5,13,25,16), // #175 Ship. Sailor
		new Stat(52,6,15,39,24), // #176 Adm. Admiral
		new Stat(70,8,13,20,9), // #177 Swelton
		new Stat(53,24,5,31,9), // #178 Sing Kong
		new Stat(49,14,5,27,20), // #179 Slippy
		new Stat(55,20,12,30,6), // #180 Repossessor
		new Stat(48,20,8,29,14), // #181 Mr. Blockhead
		new Stat(66,12,5,34,10), // #182 Mad Mountain
		new Stat(63,13,12,37,11), // #183 Lava Lord
		new Stat(60,13,10,32,7), // #184 Castelius III
		new Stat(63,14,11,35,11), // #185 Castelius II
		new Stat(66,15,12,38,14), // #186 Castelius I
		new Stat(73,16,13,44,16), // #187 Castelius Max
		new Stat(42,31,4,13,32), // #188 Puppynyan
		new Stat(54,28,10,30,11), // #189 Rhinoggin
		new Stat(58,31,12,34,12), // #190 Rhinormous
		new Stat(61,34,11,40,13), // #191 Hornaplenty
		new Stat(55,39,5,31,13), // #192 Kintaronyan
		new Stat(56,24,8,35,20), // #193 Steaking
		new Stat(62,21,12,37,14), // #194 Robonyan
		new Stat(56,28,10,38,11), // #195 Robonyan F
		new Stat(53,36,5,28,20), // #196 Showbonyan
		new Stat(63,22,14,39,19), // #197 Goldenyan
		new Stat(88,20,10,31,10), // #198 Dromp
		new Stat(94,11,21,33,13), // #199 Swosh
		new Stat(59,23,11,46,18), // #200 Toadal Dude
	};
}

private static Stat[] statFirstTotal_2() {
	return new Stat[] {
		new Stat(53,12,21,44,22), // #201 Uber Geeko
		new Stat(52,46,7,25,23), // #202 Gargaros
		new Stat(46,30,33,20,21), // #203 Ogralus
		new Stat(59,39,6,38,15), // #204 Orcanos
		new Stat(59,23,13,50,10), // #205 Kabuking
		new Stat(73,35,7,41,6), // #206 Jawsome Kid
		new Stat(79,12,26,38,10), // #207 El Sharkador
		new Stat(58,30,4,46,16), // #208 Silver Lining
		new Stat(29,4,21,5,23), // #209 Leggly
		new Stat(32,15,4,9,24), // #210 Twirly Pie
		new Stat(37,6,21,10,15), // #211 Petty-Cake
		new Stat(40,16,5,7,23), // #212 Hoppy.
		new Stat(37,14,12,11,15), // #213 Dazzabel
		new Stat(45,19,15,14,20), // #214 Rattelle
		new Stat(49,17,21,16,22), // #215 Skelebella
		new Stat(28,18,4,9,23), // #216 Cadin
		new Stat(41,22,6,11,28), // #217 Cadable
		new Stat(47,28,7,14,28), // #218 Singcada
		new Stat(46,23,5,11,13), // #219 Buttered Blue
		new Stat(55,40,5,20,23), // #220 Pch. Baguette
		new Stat(39,4,21,8,18), // #221 Pupsicle
		new Stat(49,7,34,14,31), // #222 Chilhuahua
		new Stat(46,6,28,21,35), // #223 Swelterrier
		new Stat(33,18,2,6,25), // #224 Unbelievaboy!
		new Stat(48,35,5,11,40), // #225 Unbearaboy!
		new Stat(54,42,4,10,37), // #226 Inflammaboy!
		new Stat(48,3,25,9,22), // #227 Jumbelina
		new Stat(46,26,4,13,21), // #228 Boyclops
		new Stat(38,10,23,5,24), // #229 Krystal Fox
		new Stat(37,19,3,14,26), // #230 Runsure
		new Stat(38,3,20,11,28), // #231 Kittylumbus
		new Stat(34,3,24,12,25), // #232 Zest-a-Minute
		new Stat(46,7,19,13,17), // #233 Baku
		new Stat(61,5,26,11,22), // #234 Whapir
		new Stat(51,9,27,15,24), // #235 Bakulia
		new Stat(37,19,5,12,23), // #236 Panja Pupil
		new Stat(45,24,7,14,30), // #237 Panja Pro
		new Stat(40,6,23,9,23), // #238 Cue-Tee
		new Stat(49,8,29,11,28), // #239 Demandi
		new Stat(47,5,20,12,19), // #240 Walkappa
		new Stat(54,7,35,15,25), // #241 Appak
		new Stat(56,8,32,17,26), // #242 Supyo
		new Stat(65,20,5,9,29), // #243 Jibanyan
		new Stat(49,30,4,8,34), // #244 Jibanyan B
		new Stat(54,29,9,11,44), // #245 Jibanyan S
		new Stat(51,28,6,21,35), // #246 Jiban. Liu Bei
		new Stat(47,18,3,9,33), // #247 Rudy
		new Stat(49,22,7,16,33), // #248 Thornyan
		new Stat(53,25,4,17,30), // #249 Baddinyan
		new Stat(40,27,7,20,31), // #250 Buchinyan
		new Stat(41,4,26,9,21), // #251 Komasan
		new Stat(51,8,39,13,25), // #252 Komane
		new Stat(42,24,4,10,34), // #253 Komasan B
		new Stat(60,9,37,15,29), // #254 Komasan S
		new Stat(56,6,37,22,27), // #255 Koma. Sun Ce
		new Stat(48,29,29,10,23), // #256 Jibakoma
		new Stat(46,7,23,15,17), // #257 Komajiro
		new Stat(55,10,33,20,25), // #258 Komiger
		new Stat(67,12,30,24,26), // #259 Komajiro S
		new Stat(42,4,29,12,25), // #260 Drizzelda
		new Stat(36,13,6,14,35), // #261 Nekidspeed
		new Stat(40,24,5,9,30), // #262 Stinkeye
		new Stat(45,8,41,18,6), // #263 Slackoon
		new Stat(47,28,4,7,28), // #264 Puppiccino
		new Stat(50,6,29,21,14), // #265 Ballin
		new Stat(46,10,30,13,17), // #266 Shmoopie
		new Stat(51,12,32,15,21), // #267 Pinkipoo
		new Stat(53,21,28,15,25), // #268 Pookivil
		new Stat(48,22,28,15,16), // #269 Harry Barry
		new Stat(52,27,6,17,24), // #270 Wondernyan
		new Stat(44,7,23,11,34), // #271 Jetnyan
		new Stat(42,24,5,10,37), // #272 Chimpanyan
		new Stat(47,23,7,13,31), // #273 Tomnyan
		new Stat(51,5,34,12,24), // #274 Koma Knomads
		new Stat(43,5,23,16,31), // #275 Frostina
		new Stat(48,6,29,19,37), // #276 Blizzaria
		new Stat(56,9,38,22,28), // #277 Damona
		new Stat(50,24,22,23,21), // #278 Melonyan
		new Stat(42,21,21,21,21), // #279 Oranyan
		new Stat(48,28,6,18,25), // #280 Kiwinyan
		new Stat(48,6,28,15,28), // #281 Grapenyan
		new Stat(39,20,20,6,31), // #282 Strawbnyan
		new Stat(66,20,8,40,14), // #283 Watermelnyan
		new Stat(44,22,21,14,32), // #284 Sapphinyan
		new Stat(32,27,33,19,20), // #285 Emenyan
		new Stat(50,33,10,23,24), // #286 Rubinyan
		new Stat(56,21,8,33,25), // #287 Topanyan
		new Stat(50,25,6,19,35), // #288 Dianyan
		new Stat(48,8,32,25,26), // #289 Robokapp
		new Stat(43,5,28,27,29), // #290 Robokoma
		new Stat(46,10,41,13,24), // #291 Sailornyan
		new Stat(51,31,6,11,37), // #292 Rubeus J
		new Stat(57,40,7,31,9), // #293 Hardy Hound
		new Stat(49,25,19,3,39), // #294 Whirlweasel
		new Stat(46,28,5,9,42), // #295 Chocobonyan
		new Stat(46,7,37,11,33), // #296 Mooglenyan
		new Stat(47,28,13,11,35), // #297 Wobblenyan
		new Stat(45,10,31,15,32), // #298 Wibblekoma
		new Stat(46,31,6,11,35), // #299 Sushinyan
		new Stat(46,5,39,15,29), // #300 Tempurasan
	};
}

private static Stat[] statFirstTotal_3() {
	return new Stat[] {
		new Stat(49,11,26,15,34), // #301 Faux Kappa
		new Stat(43,11,29,22,37), // #302 Tigappa
		new Stat(48,7,31,15,40), // #303 Master Nyada
		new Stat(49,6,34,9,42), // #304 Tenguriginal
		new Stat(49,4,43,10,39), // #305 Tengulightened
		new Stat(35,7,15,13,17), // #306 Pallysol
		new Stat(46,10,14,23,5), // #307 Bumblejack
		new Stat(32,5,21,9,20), // #308 In-Tune
		new Stat(44,14,12,5,22), // #309 Wantston
		new Stat(46,15,11,7,26), // #310 Grubsnitch
		new Stat(40,16,19,7,14), // #311 Wiglin
		new Stat(48,22,25,9,16), // #312 Kelpacabana
		new Stat(44,6,21,12,15), // #313 Steppa
		new Stat(40,4,27,7,24), // #314 Rhyth
		new Stat(36,14,32,2,25), // #315 Seaweed Sns.
		new Stat(33,5,20,11,19), // #316 Hungramps
		new Stat(41,7,34,17,23), // #317 Hungorge
		new Stat(45,4,36,14,25), // #318 Grainpa
		new Stat(61,5,36,14,20), // #319 Supersize G.
		new Stat(34,4,22,5,23), // #320 Tongus
		new Stat(46,6,26,10,32), // #321 Nurse Tongus
		new Stat(29,5,21,11,17), // #322 Sandmeh
		new Stat(49,8,26,18,25), // #323 Mr. Sandmeh
		new Stat(34,3,23,13,15), // #324 Lil Blue Hood
		new Stat(53,5,33,22,24), // #325 Bubble Beth
		new Stat(47,5,29,21,7), // #326 Afronaut
		new Stat(40,8,24,18,15), // #327 Cereal Spiller
		new Stat(38,7,25,12,18), // #328 Tomorrow Gal
		new Stat(42,11,19,9,21), // #329 Swaycorn
		new Stat(32,7,23,9,23), // #330 Push Pup
		new Stat(36,5,24,11,23), // #331 Happycane
		new Stat(46,7,31,15,25), // #332 Starrycane
		new Stat(44,12,19,15,17), // #333 Lodo
		new Stat(53,18,25,18,28), // #334 Supoor Hero
		new Stat(49,19,14,17,21), // #335 Chippa
		new Stat(34,6,25,13,20), // #336 Gnomey
		new Stat(46,8,34,17,29), // #337 High Gnomey
		new Stat(34,7,25,12,18), // #338 Enerfly
		new Stat(42,4,23,10,21), // #339 Enefly
		new Stat(47,8,38,14,27), // #340 Betterfly
		new Stat(51,9,42,15,29), // #341 Peppillon
		new Stat(36,19,25,11,12), // #342 Predictabull
		new Stat(52,31,34,16,19), // #343 Smashibull
		new Stat(43,11,25,13,22), // #344 DON-CHAN
		new Stat(49,7,25,14,20), // #345 Ray O'Light
		new Stat(44,8,25,14,22), // #346 Ol' Saint Trick
		new Stat(50,6,27,17,20), // #347 Ol' Fortune
		new Stat(46,14,21,19,18), // #348 Ponderoo
		new Stat(51,22,27,12,9), // #349 Tongue-Twister
		new Stat(53,4,24,29,12), // #350 Lazy Sundae
		new Stat(55,9,24,21,14), // #351 Got It Maid
		new Stat(43,16,22,17,19), // #352 Greengramps
		new Stat(48,3,28,14,22), // #353 Right Brothers
		new Stat(45,7,32,14,20), // #354 Tattlecakes
		new Stat(48,6,26,21,16), // #355 Happierre
		new Stat(55,8,33,27,20), // #356 Reversa
		new Stat(51,42,6,23,19), // #357 Reversette
		new Stat(40,9,34,16,22), // #358 Pheasanyan
		new Stat(49,14,27,4,31), // #359 Fundango
		new Stat(54,8,35,20,15), // #360 Pearly White
		new Stat(49,10,29,22,19), // #361 Robogramps
		new Stat(49,29,9,17,22), // #362 Rollen
		new Stat(52,31,10,19,25), // #363 Dubbles
		new Stat(56,25,19,30,13), // #364 Scarasol
		new Stat(49,10,40,18,23), // #365 Odysseynyan
		new Stat(59,9,41,17,19), // #366 Ghostess
		new Stat(53,9,46,22,11), // #367 Papa Bolt
		new Stat(58,38,38,14,6), // #368 Uncle Infinite
		new Stat(45,8,45,19,20), // #369 Mama Aura
		new Stat(42,11,48,23,22), // #370 Auntie Heart
		new Stat(46,12,46,20,23), // #371 Kyryn
		new Stat(49,15,45,23,20), // #372 Unikirin
		new Stat(48,16,31,12,27), // #373 Double Time
		new Stat(45,27,20,7,34), // #374 Sonic Bam
		new Stat(43,7,19,16,12), // #375 Neggplant
		new Stat(29,9,16,4,23), // #376 Snitchin
		new Stat(36,15,9,7,22), // #377 Messyrai
		new Stat(39,17,6,10,18), // #378 Leadoni
		new Stat(44,8,20,18,17), // #379 Mynimo
		new Stat(37,19,6,11,15), // #380 Ake
		new Stat(50,28,8,16,17), // #381 Payn
		new Stat(48,35,5,22,18), // #382 Agon
		new Stat(40,4,18,11,18), // #383 Herbiboy
		new Stat(48,29,6,22,24), // #384 Carniboy
		new Stat(39,5,19,9,18), // #385 Wydeawake
		new Stat(49,8,25,12,31), // #386 Allnyta
		new Stat(49,20,7,19,5), // #387 Treetter
		new Stat(55,13,25,33,7), // #388 Retreeter
		new Stat(37,5,21,10,15), // #389 Negatibuzz
		new Stat(44,6,23,12,27), // #390 Moskevil
		new Stat(47,8,24,14,37), // #391 Scritchy
		new Stat(34,19,2,8,22), // #392 Dimmy
		new Stat(43,26,4,10,35), // #393 Blandon
		new Stat(47,34,5,13,35), // #394 Nul
		new Stat(49,7,28,14,12), // #395 Salty Bacon
		new Stat(47,13,24,8,18), // #396 Suspicioni
		new Stat(43,24,13,13,15), // #397 Tantroni
		new Stat(52,10,10,30,25), // #398 Contrarioni
		new Stat(44,25,6,12,20), // #399 Grumpus Khan
		new Stat(50,30,7,21,22), // #400 Groupus Khan
	};
}

private static Stat[] statFirstTotal_4() {
	return new Stat[] {
		new Stat(40,19,9,11,21), // #401 Hidabat
		new Stat(48,27,11,22,26), // #402 Abodabat
		new Stat(49,29,12,13,32), // #403 Belfree
		new Stat(40,22,10,12,20), // #404 Yoink
		new Stat(48,31,15,17,23), // #405 Gimme
		new Stat(45,5,25,20,13), // #406 Indexter
		new Stat(57,8,35,26,18), // #407 Hack King
		new Stat(48,18,30,12,10), // #408 Yoodooit
		new Stat(42,19,7,11,30), // #409 Count Zapaway
		new Stat(39,9,24,13,25), // #410 Tyrat
		new Stat(52,25,9,18,17), // #411 DisliKing
		new Stat(43,11,26,9,23), // #412 Crook-a-doodle
		new Stat(51,29,3,11,22), // #413 Rocky Badboya
		new Stat(55,18,19,15,16), // #414 Injurnalist
		new Stat(47,16,26,9,21), // #415 Misterr Typoo
		new Stat(45,5,28,11,24), // #416 Tengloom
		new Stat(48,14,27,17,22), // #417 Nird
		new Stat(45,28,7,15,22), // #418 K'mon-K'mon
		new Stat(50,19,25,29,7), // #419 Snobetty
		new Stat(45,6,26,14,32), // #420 Dracunyan
		new Stat(50,15,34,9,22), // #421 Lil Kappa
		new Stat(46,34,14,11,19), // #422 Horizontail
		new Stat(54,32,7,14,21), // #423 Usapyon
		new Stat(55,22,6,33,10), // #424 Usapyon Foot.
		new Stat(47,22,24,12,17), // #425 Usapyon Scub.
		new Stat(57,35,4,19,12), // #426 Usapyon G.I.
		new Stat(47,17,7,15,28), // #427 Usapyon Race.
		new Stat(44,33,4,16,26), // #428 Usapyon B
		new Stat(53,8,40,27,24), // #429 Usa. Zhongda
		new Stat(53,28,26,27,15), // #430 Slimamander
		new Stat(44,6,28,15,35), // #431 Negasus
		new Stat(50,33,5,20,27), // #432 Neighfarious
		new Stat(57,37,10,31,9), // #433 Gutsy Bones
		new Stat(47,44,9,15,29), // #434 Timidevil
		new Stat(51,37,10,17,31), // #435 Beelzebold
		new Stat(52,35,7,18,34), // #436 Count Cavity
		new Stat(44,27,27,20,20), // #437 Eyesoar
		new Stat(46,30,30,21,22), // #438 Eyellure
		new Stat(49,9,33,14,30), // #439 Greesel
		new Stat(51,10,35,16,34), // #440 Awevil
		new Stat(55,27,27,23,21), // #441 Wobblewok
		new Stat(46,7,46,25,21), // #442 Darkyubi
		new Stat(55,18,38,10,32), // #443 Dr. E. Raser
		new Stat(59,14,35,20,27), // #444 Dr. Nocturne
		new Stat(46,65,6,12,52), // #445 Tut 'n' K'mon
		new Stat(32,6,15,8,23), // #446 Tie-red
		new Stat(39,7,18,4,22), // #447 Love-Torn
		new Stat(38,22,4,10,16), // #448 Shakey
		new Stat(47,5,27,15,5), // #449 Quagmira
		new Stat(48,11,6,25,9), // #450 Coughkoff
		new Stat(50,17,7,28,8), // #451 Hurchin
		new Stat(34,4,24,7,19), // #452 Droplette
		new Stat(49,6,35,12,28), // #453 Drizzle
		new Stat(39,6,22,10,18), // #454 Slush
		new Stat(52,7,31,17,24), // #455 Alhail
		new Stat(41,4,28,5,23), // #456 Gush
		new Stat(43,5,26,14,10), // #457 Peckpocket
		new Stat(52,7,31,18,24), // #458 Robbinyu
		new Stat(49,30,6,13,13), // #459 Rockabelly
		new Stat(33,15,6,5,24), // #460 Squeeky
		new Stat(41,19,7,13,34), // #461 Rawry
		new Stat(39,4,24,10,18), // #462 Buhu
		new Stat(46,5,28,17,22), // #463 Flumpy
		new Stat(50,6,36,20,28), // #464 Skreek
		new Stat(38,21,3,11,17), // #465 Manjimutt
		new Stat(48,32,4,15,26), // #466 Multimutt
		new Stat(49,6,28,15,32), // #467 Sir Berus
		new Stat(36,4,23,8,18), // #468 Furgus
		new Stat(51,7,30,37,16), // #469 Furdinand
		new Stat(42,6,15,20,13), // #470 Pergushin
		new Stat(55,9,30,25,24), // #471 Percrushionists
		new Stat(45,6,25,11,16), // #472 Nosirs
		new Stat(38,5,27,11,19), // #473 Grubbles
		new Stat(42,25,5,14,16), // #474 Nervous Rex
		new Stat(49,27,5,24,5), // #475 Rinsin Repete
		new Stat(41,25,9,6,21), // #476 Chatalie
		new Stat(45,29,11,14,20), // #477 Nagatha
		new Stat(49,11,22,20,10), // #478 Dismarelda
		new Stat(53,7,33,22,7), // #479 Drenchetta
		new Stat(48,5,21,26,9), // #480 Danke Sand
		new Stat(55,6,25,36,11), // #481 No Sandkyu
		new Stat(45,5,29,14,21), // #482 Papa Windbag
		new Stat(43,24,16,9,21), // #483 Ben Tover
		new Stat(42,10,26,11,23), // #484 Compunzer
		new Stat(47,12,32,16,22), // #485 Lamedian
		new Stat(47,9,30,15,18), // #486 Soloman
		new Stat(40,13,23,5,27), // #487 Rhumbastiltskin
		new Stat(53,33,6,19,11), // #488 Slax
		new Stat(43,24,20,10,16), // #489 Cheeksqueek
		new Stat(49,27,9,11,35), // #490 Cuttincheez
		new Stat(46,8,25,12,23), // #491 Toiletta
		new Stat(49,9,29,14,34), // #492 Foiletta
		new Stat(47,23,5,21,28), // #493 Robomutt
		new Stat(57,24,16,27,10), // #494 Shedwin
		new Stat(46,5,26,9,34), // #495 Glumdango
		new Stat(51,4,35,15,21), // #496 Spewart
		new Stat(46,9,27,12,30), // #497 Grumples
		new Stat(49,10,29,14,43), // #498 Everfore
		new Stat(53,11,34,9,40), // #499 Eterna
		new Stat(68,7,31,21,22), // #500 Sproink
	};
}

private static Stat[] statFirstTotal_5() {
	return new Stat[] {
		new Stat(42,27,7,15,36), // #501 Darknyan
		new Stat(57,38,7,15,27), // #502 Decidevible
		new Stat(59,26,6,43,11), // #503 Hairum Scarum
		new Stat(44,9,25,11,40), // #504 Insomni
		new Stat(47,7,31,10,45), // #505 Sandi
		new Stat(51,11,40,16,35), // #506 Arachnus
		new Stat(49,29,22,12,38), // #507 Arachnia
		new Stat(89,10,25,32,14), // #508 Oridjinn
		new Stat(81,8,36,25,16), // #509 Horridjinn
		new Stat(52,33,4,7,45), // #510 Little Charrmer
		new Stat(38,6,19,12,18), // #511 Cricky
		new Stat(43,22,5,14,13), // #512 Humtea Jumtea
		new Stat(45,7,20,18,8), // #513 Snailspace
		new Stat(34,25,6,9,14), // #514 Putasockinit
		new Stat(51,32,7,14,22), // #515 Snidewinder
		new Stat(23,2,10,4,39), // #516 Noko
		new Stat(31,4,28,9,45), // #517 Bloominoko
		new Stat(40,21,17,11,42), // #518 Pandanoko
		new Stat(1,25,25,9,35), // #519 Starry Noko
		new Stat(41,20,12,7,16), // #520 Snaggly
		new Stat(54,30,20,14,24), // #521 Whinona
		new Stat(44,27,4,12,16), // #522 OMGator
		new Stat(50,14,6,30,10), // #523 Nautaloss
		new Stat(40,6,25,13,17), // #524 Shellebrity
		new Stat(45,5,22,23,13), // #525 Heheheel
		new Stat(48,24,10,18,19), // #526 Croonger
		new Stat(47,6,24,26,16), // #527 Urnaconda
		new Stat(49,19,6,25,11), // #528 Takoyakid
		new Stat(55,23,7,35,13), // #529 Takoyaking
		new Stat(45,29,10,17,7), // #530 Fishpicable
		new Stat(54,39,11,20,8), // #531 Rageon
		new Stat(56,9,47,25,6), // #532 Tunatic
		new Stat(53,5,26,22,6), // #533 Flushback
		new Stat(61,7,37,31,10), // #534 Vacuumory
		new Stat(45,23,10,13,17), // #535 Irewig
		new Stat(55,35,12,18,23), // #536 Firewig
		new Stat(40,18,18,12,17), // #537 Draggie
		new Stat(54,30,30,16,24), // #538 Dragon Lord
		new Stat(58,28,28,14,28), // #539 Azure Dragon
		new Stat(42,10,27,11,16), // #540 Mermaidyn
		new Stat(55,12,39,17,30), // #541 Mermadonna
		new Stat(56,8,45,24,20), // #542 Mermother
		new Stat(47,31,7,12,12), // #543 T-Wrecks
		new Stat(58,48,8,27,13), // #544 D-Stroy
		new Stat(63,43,6,35,10), // #545 Clodzilla
		new Stat(41,24,20,12,19), // #546 Lady Longnek
		new Stat(42,9,18,3,36), // #547 Whisper
		new Stat(46,4,23,4,33), // #548 Whispocrates
		new Stat(42,20,11,12,27), // #549 Snippity Cricket
		new Stat(48,30,5,16,20), // #550 Flocktopus
		new Stat(45,6,27,13,22), // #551 Bitter Batter
		new Stat(45,4,12,3,44), // #552 Daiz
		new Stat(44,11,20,9,35), // #553 Confuze
		new Stat(46,27,5,15,21), // #554 Chummer
		new Stat(65,11,24,21,17), // #555 Shrook
		new Stat(45,21,15,20,17), // #556 Spenp
		new Stat(53,25,12,26,16), // #557 Almi
		new Stat(47,30,6,15,21), // #558 Babblong
		new Stat(53,34,7,16,22), // #559 Bananose
		new Stat(53,38,6,26,19), // #560 Cocobanana
		new Stat(51,7,58,22,13), // #561 Draaagin
		new Stat(53,11,18,35,15), // #562 Robonoko
		new Stat(51,6,33,17,24), // #563 Robodraggie
		new Stat(63,13,21,28,12), // #564 Ooze Zat
		new Stat(48,33,5,16,23), // #565 Copperled
		new Stat(49,9,25,13,29), // #566 Cynake
		new Stat(53,30,16,20,23), // #567 Slitheref
		new Stat(55,8,37,16,27), // #568 SV Snaggerjag
		new Stat(55,8,42,27,11), // #569 Mython
		new Stat(49,31,9,16,37), // #570 Venoct
		new Stat(51,30,33,11,28), // #571 Shadow Venoct
		new Stat(53,10,46,26,17), // #572 Frogetmenot
		new Stat(50,20,20,20,20), // #573 Originyan
		new Stat(49,11,20,35,15), // #574 Sighborg Y
		new Stat(69,10,35,46,15), // #575 Unfairy
		new Stat(47,7,36,11,47), // #576 Unkaind
		new Stat(92,48,7,29,10), // #577 Untidy
		new Stat(55,8,49,20,30), // #578 Unpleasant
		new Stat(55,40,30,22,26), // #579 Unkeen
		new Stat(70,37,5,9,14), // #580 Grublappa
		new Stat(78,45,5,13,8), // #581 Madmunch
		new Stat(66,3,35,12,32), // #582 Badsmella
		new Stat(55,12,29,7,36), // #583 Mad Kappa
		new Stat(49,14,16,6,25), // #584 Shamasol
		new Stat(57,7,30,5,25), // #585 Gnomine
		new Stat(51,23,30,5,17), // #586 Defectabull
		new Stat(51,5,29,4,22), // #587 Feargus
		new Stat(55,11,34,3,20), // #588 Scaremaiden
		new Stat(67,27,23,5,22), // #589 Wrongnek
		new Stat(51,26,4,14,37), // #590 King Jibanyan
		new Stat(47,15,35,19,23), // #591 Qn. Usapyon
		new Stat(48,6,39,17,25), // #592 Jackomasan
		new Stat(53,38,11,17,23), // #593 Komajiro Ten
		new Stat(53,29,5,11,35), // #594 Acenyan
		new Stat(57,36,11,6,29), // #595 Josper
		new Stat(44,4,30,18,42), // #596 Benzaiten
		new Stat(48,6,38,23,30), // #597 Hotei
		new Stat(65,22,6,48,17), // #598 Daikokuten
		new Stat(51,8,37,29,26), // #599 Ebisu
		new Stat(53,44,7,22,26), // #600 Bishamonten
	};
}

private static Stat[] statFirstTotal_6() {
	return new Stat[] {
		new Stat(52,31,16,24,28), // #601 Columbakat
		new Stat(53,12,44,28,20), // #602 T. Energison
		new Stat(46,7,46,34,20), // #603 Starwin
		new Stat(53,32,7,19,41), // #604 Last Nyanmurai
		new Stat(47,6,33,15,43), // #605 Koma Star
		new Stat(69,17,5,45,29), // #606 Platinos
		new Stat(73,6,49,11,28), // #607 Flash T. Cash
		new Stat(50,30,7,18,40), // #608 Shogunyan
		new Stat(48,8,60,23,20), // #609 Komashura
		new Stat(54,50,4,48,18), // #610 Gilgaros
		new Stat(41,7,30,16,46), // #611 Spoilerina
		new Stat(36,15,54,18,30), // #612 Elder Bloom
		new Stat(47,20,34,25,28), // #613 Poofessor
		new Stat(36,15,37,13,42), // #614 Dandoodle
		new Stat(61,34,30,33,20), // #615 Slurpent
		new Stat(65,8,43,30,22), // #616 Re-Q-Perate
		new Stat(51,13,37,19,36), // #617 Princess Pearl
		new Stat(59,45,11,25,25), // #618 Asura
		new Stat(40,28,5,39,29), // #619 Terminyanator
		new Stat(43,28,4,25,37), // #620 Supernyan
		new Stat(41,36,5,20,34), // #621 Hovernyan S
		new Stat(39,36,5,21,31), // #622 Hover. Cao Cao
		new Stat(47,6,26,21,18), // #623 Yoganalisten
		new Stat(65,13,6,45,7), // #624 Judgebrick
		new Stat(10,13,3,100,9), // #625 Urnfulfilled
		new Stat(65,13,6,45,7), // #626 Sad 2 the Bone
		new Stat(62,31,3,47,7), // #627 Venoctobot
		new Stat(60,38,5,39,15), // #628 Orcanos Lu Bu
		new Stat(63,3,31,46,7), // #629 Kyubot
		new Stat(70,33,6,41,27), // #630 Ult. Robonyan
		new Stat(35,8,27,10,15), // #631 Molar Petite
		new Stat(50,5,28,14,29), // #632 Life-is-Parfait
		new Stat(60,12,20,9,20), // #633 Mee 2
		new Stat(48,10,25,19,28), // #634 Koalanyan
		new Stat(46,29,12,12,35), // #635 Jibanyan T
		new Stat(44,9,32,16,32), // #636 Komasan T
		new Stat(60,3,34,36,10), // #637 Eggcelency
		new Stat(47,30,4,13,36), // #638 Deadcool
		new Stat(41,8,31,15,21), // #639 Sweattuce
		new Stat(51,6,25,15,19), // #640 Mr Blue-Shy
		new Stat(45,8,45,19,8), // #641 Amplifly
		new Stat(49,7,33,18,28), // #642 Ulteria
		new Stat(55,7,33,9,10), // #643 My-Baaad
		new Stat(55,3,3,24,24), // #644 Sunk'nsoul
		new Stat(10,30,30,10,10), // #645 Crummy Mum.
		new Stat(49,5,40,16,24), // #646 Kaped Koma.
		new Stat(48,26,26,19,22), // #647 Tofupyon
		new Stat(53,38,18,21,22), // #648 Ed Zoff
		new Stat(36,21,22,27,20), // #649 Gorgeous Amb.
		new Stat(62,17,48,12,4), // #650 Hinozall
		new Stat(55,11,45,27,19), // #651 Zazel
		new Stat(45,13,13,15,25), // #652 Procrastino.
		new Stat(51,21,3,32,19), // #653 Treasure Pest
		new Stat(45,9,33,13,39), // #654 J. Ne-Sais-Quoi
		new Stat(48,5,26,6,35), // #655 Whi. Kongming
		new Stat(43,4,29,18,41), // #656 Jurojin
		new Stat(37,15,55,19,29), // #657 Fukurokuju
		new Stat(63,9,33,33,10), // #658 Sarchopha.
		new Stat(60,33,9,34,12), // #659 King Deadward
		new Stat(53,7,36,9,29), // #660 Pandora
		new Stat(62,9,34,32,11), // #661 Comic Genieus
		new Stat(51,20,25,24,26), // #662 Bastnetnyan
		new Stat(51,19,26,24,26), // #663 Komanubis
		new Stat(52,8,44,22,26), // #664 Gabby
		new Stat(50,20,38,11,31), // #665 Teducator
		new Stat(45,13,40,23,22), // #666 Gentlemutt
		new Stat(62,34,29,34,19), // #667 City Licker
		new Stat(48,6,59,21,8), // #668 Whyvern King
		new Stat(61,41,26,29,29), // #669 Lord Enma
		new Stat(51,31,8,19,41), // #670 Rgt. Zazel
		new Stat(63,19,50,13,5), // #671 Hinozall Awk.
		new Stat(56,61,21,15,5), // #672 Ancient Enma
		new Stat(62,42,27,30,30), // #673 Enma Awk.
		new Stat(58,7,29,21,30), // #674 The Boracle
		new Stat(52,43,8,21,25), // #675 Rampajah
		new Stat(48,7,22,17,19), // #676 Cymbalina
		new Stat(52,15,10,39,23), // #677 Mumbles
		new Stat(52,20,20,20,23), // #678 Roary
		new Stat(47,20,26,21,25), // #679 Letsbifrenz
		new Stat(45,12,20,9,32), // #680 Wack o' Lantern
		new Stat(64,13,10,31,8), // #681 Moolinda
		new Stat(65,13,10,31,7), // #682 Neighthan
		new Stat(70,13,33,34,13), // #683 Big Fish
		new Stat(63,10,34,32,12), // #684 Alpina
		new Stat(48,27,20,8,30), // #685 Lunie
		new Stat(50,6,30,19,37), // #686 Blizzie
		new Stat(57,10,27,20,22), // #687 KJ
		new Stat(63,35,35,30,30), // #688 Solar Enma
		new Stat(62,28,43,30,35), // #689 Infinite Enma
		new Stat(62,43,28,32,30), // #690 Umbral Enma
		new Stat(55,30,12,12,27), // #691 Indiana Jaws
		new Stat(45,3,36,22,25), // #692 Shovulcan
		new Stat(53,30,12,12,29), // #693 Zomboy
		new Stat(49,6,32,17,30), // #694 Nyanses II
		new Stat(50,23,23,19,34), // #695 Meopatra
		new Stat(69,21,18,33,14), // #696 Fitwit
		new Stat(63,43,12,23,25), // #697 El Dorago
		new Stat(78,17,48,0,4), // #698 The Hinix
	};
}

private static Stat[] statEndTotal_0() {
	return new Stat[] {
		new Stat(341,192,37,54,176), // #1 Sigh-Durr
		new Stat(374,178,43,145,96), // #2 Flippit
		new Stat(290,212,38,115,115), // #3 Pandle
		new Stat(324,241,41,124,134), // #4 Undy
		new Stat(317,208,87,102,125), // #5 Tanbo
		new Stat(305,212,30,117,125), // #6 Cutta-nah
		new Stat(358,245,41,134,124), // #7 Cutta-nah-nah
		new Stat(371,252,45,139,140), // #8 Slacka-slash
		new Stat(284,190,37,112,132), // #9 Brushido
		new Stat(348,221,56,148,149), // #10 Washogun
		new Stat(288,183,44,110,119), // #11 Lie-in
		new Stat(419,361,43,148,250), // #12 Lie-in Heart
		new Stat(305,200,44,116,120), // #13 Hissfit
		new Stat(402,310,50,135,140), // #14 Zerberker
		new Stat(457,243,54,158,163), // #15 Snartle
		new Stat(443,401,143,108,100), // #16 Brutle
		new Stat(433,228,45,120,58), // #17 Mochismo
		new Stat(382,210,75,142,40), // #18 Minochi
		new Stat(297,146,36,74,192), // #19 Minimoto
		new Stat(450,285,43,130,46), // #20 Slumberhog
		new Stat(479,289,51,146,49), // #21 Snortlehog
		new Stat(400,241,42,153,43), // #22 Samureel
		new Stat(456,268,48,171,55), // #23 Time Keeler
		new Stat(336,180,53,126,138), // #24 Goofball
		new Stat(405,197,69,138,158), // #25 Slugger
		new Stat(380,250,42,153,43), // #26 Helmsman
		new Stat(488,317,54,183,100), // #27 Reuknight
		new Stat(499,347,64,196,105), // #28 Corptain
		new Stat(325,204,111,74,128), // #29 Slicenrice
		new Stat(402,253,64,136,149), // #30 Flamurice
		new Stat(328,200,40,120,139), // #31 Tublappa
		new Stat(421,248,45,147,153), // #32 Lappinitup
		new Stat(394,216,40,103,122), // #33 El Gutso
		new Stat(452,257,53,106,168), // #34 Gutso Grande
		new Stat(412,253,41,164,62), // #35 Mudmunch
		new Stat(412,229,59,164,65), // #36 BBQvil
		new Stat(339,163,53,106,196), // #37 Liarbird
		new Stat(442,253,52,150,50), // #38 Benkei
		new Stat(453,231,71,160,79), // #39 B3-NK1
		new Stat(412,183,165,90,79), // #40 Blazion
		new Stat(392,180,152,104,127), // #41 Quaken
		new Stat(402,255,62,143,140), // #42 Siro
		new Stat(394,210,46,125,130), // #43 Chansin
		new Stat(411,243,54,136,153), // #44 Sheen
		new Stat(400,230,64,150,145), // #45 Snee
		new Stat(445,250,61,146,159), // #46 Gleam
		new Stat(287,171,55,121,211), // #47 Hovernyan
		new Stat(333,220,51,139,158), // #48 Moximous N
		new Stat(333,51,220,139,158), // #49 Moximous K
		new Stat(510,206,71,160,86), // #50 Hot Air Buffoon
		new Stat(360,191,53,134,150), // #51 Sushiyama
		new Stat(396,271,71,103,159), // #52 Kapunki
		new Stat(388,225,43,157,138), // #53 Beetler
		new Stat(416,238,46,167,143), // #54 Beetall
		new Stat(441,252,50,173,150), // #55 Cruncha
		new Stat(393,253,49,157,133), // #56 Machonyan
		new Stat(425,140,49,205,181), // #57 Momonyan
		new Stat(464,162,59,250,109), // #58 Sir Nyansalot
		new Stat(387,228,46,140,176), // #59 Sgt. Burly
		new Stat(426,192,126,165,128), // #60 Bison Burly
		new Stat(467,286,59,253,100), // #61 Demuncher
		new Stat(406,181,236,234,97), // #62 Devourer
		new Stat(420,226,159,49,184), // #63 Illuminoct
		new Stat(453,270,43,160,150), // #64 Arachnevil
		new Stat(403,191,52,112,235), // #65 Shurikenny
		new Stat(401,218,39,135,230), // #66 Nunchucky
		new Stat(417,207,151,78,180), // #67 Camellia
		new Stat(279,35,189,114,142), // #68 Brokenbrella
		new Stat(228,34,144,94,178), // #69 Pittapatt
		new Stat(360,53,191,145,70), // #70 Zip Unlock
		new Stat(292,39,142,82,182), // #71 Slippup
		new Stat(292,54,193,95,113), // #72 Snotsolong
		new Stat(310,59,202,111,118), // #73 Duchoo
		new Stat(279,71,169,69,166), // #74 D'wanna
		new Stat(307,100,182,84,179), // #75 N'more
		new Stat(297,91,193,76,187), // #76 Q'wit
		new Stat(192,58,114,63,225), // #77 Wazzat
		new Stat(203,63,181,80,234), // #78 Houzzat
		new Stat(171,57,126,63,189), // #79 Dummkap
		new Stat(357,46,235,85,96), // #80 Who-Me
		new Stat(463,73,251,170,86), // #81 2-Much-2-Take
		new Stat(383,33,218,93,110), // #82 Why Naant
		new Stat(428,39,218,144,174), // #83 Naandhi
		new Stat(330,57,185,119,122), // #84 Faysoff
		new Stat(202,67,107,74,243), // #85 Snottle
		new Stat(313,35,142,103,196), // #86 Legsit
		new Stat(314,198,33,119,150), // #87 Chukket
		new Stat(353,67,200,152,85), // #88 Cornfused
		new Stat(400,42,153,220,74), // #89 Unshelltered
		new Stat(300,211,52,120,139), // #90 Lafalotta
		new Stat(323,229,74,82,154), // #91 Blips
		new Stat(226,71,207,108,128), // #92 Tattletell
		new Stat(291,80,233,137,139), // #93 Tattlecast
		new Stat(173,165,187,88,131), // #94 Skranny
		new Stat(296,69,183,113,138), // #95 Cupistol
		new Stat(362,91,224,138,153), // #96 Casanuva
		new Stat(393,60,223,149,164), // #97 Casanono
		new Stat(330,40,202,122,141), // #98 So-Sorree
		new Stat(392,74,226,153,146), // #99 Bowminos
		new Stat(211,34,171,109,184), // #100 Smogling
	};
}

private static Stat[] statEndTotal_1() {
	return new Stat[] {
		new Stat(291,41,193,127,228), // #101 Smogmella
		new Stat(321,48,200,121,133), // #102 Signibble
		new Stat(466,84,245,173,79), // #103 Signiton
		new Stat(488,57,240,186,91), // #104 Master Oden
		new Stat(495,63,341,174,95), // #105 Statiking
		new Stat(344,38,227,158,124), // #106 Failian
		new Stat(349,71,202,106,136), // #107 Apelican
		new Stat(373,117,138,127,145), // #108 Fuu 2
		new Stat(361,74,192,92,160), // #109 Shrillington
		new Stat(386,41,202,163,123), // #110 House Partay
		new Stat(380,140,153,70,152), // #111 Skulleidoscope
		new Stat(431,50,231,155,74), // #112 Lionguist
		new Stat(327,43,207,125,156), // #113 Illoo
		new Stat(267,35,178,107,203), // #114 Elloo
		new Stat(411,50,260,149,102), // #115 Alloo
		new Stat(412,55,265,144,55), // #116 Espy
		new Stat(446,61,273,174,40), // #117 Infour
		new Stat(405,50,255,154,53), // #118 Mirapo
		new Stat(428,52,262,214,57), // #119 Miradox
		new Stat(445,63,245,200,72), // #120 Mircle
		new Stat(340,70,248,119,149), // #121 Verygoodsir
		new Stat(389,42,210,122,172), // #122 Statikid
		new Stat(348,38,225,108,188), // #123 Prof. Plumage
		new Stat(374,45,200,126,180), // #124 Throne Wiper
		new Stat(337,56,218,107,180), // #125 Imagenius
		new Stat(400,45,203,127,169), // #126 Miss Teri
		new Stat(354,49,245,125,178), // #127 Maginyan
		new Stat(441,43,231,114,183), // #128 Squandeer
		new Stat(417,80,164,168,154), // #129 Tengu
		new Stat(476,99,182,141,126), // #130 Flengu
		new Stat(413,60,256,150,164), // #131 Kyubi
		new Stat(448,66,245,168,143), // #132 Frostail
		new Stat(444,70,260,150,143), // #133 Chymera
		new Stat(405,63,263,141,168), // #134 Kingmera
		new Stat(427,45,268,144,174), // #135 Toadal Demon
		new Stat(414,71,178,102,236), // #136 Thurston
		new Stat(428,37,212,84,250), // #137 Spect-hare
		new Stat(457,33,246,123,202), // #138 Sn. Spect-hare
		new Stat(382,82,39,173,143), // #139 Oh Wheel
		new Stat(408,89,66,220,68), // #140 Dulluma
		new Stat(437,166,70,231,86), // #141 Darumacho
		new Stat(441,211,62,206,77), // #142 Goruma
		new Stat(408,78,78,194,96), // #143 Wotchagot
		new Stat(448,90,156,218,86), // #144 Pride Shrimp
		new Stat(390,97,48,194,101), // #145 No-Go Kart
		new Stat(400,204,53,198,111), // #146 Mistank
		new Stat(428,96,52,198,66), // #147 Terrorpotta
		new Stat(461,149,56,255,86), // #148 Blownhistoppa
		new Stat(422,101,47,234,56), // #149 Noway
		new Stat(472,152,53,270,61), // #150 Impass
		new Stat(483,60,159,282,70), // #151 Walldin
		new Stat(388,121,46,189,86), // #152 Roughraff
		new Stat(423,186,55,218,93), // #153 Badude
		new Stat(441,203,59,231,100), // #154 Bruff
		new Stat(452,179,42,228,95), // #155 Roughgraff
		new Stat(362,137,42,201,76), // #156 Chilled Cowcao
		new Stat(487,180,46,226,118), // #157 Stircrazy Stu
		new Stat(338,122,66,186,89), // #158 Nummskull
		new Stat(438,181,67,247,90), // #159 Skillskull
		new Stat(443,101,67,231,85), // #160 Armsman
		new Stat(450,90,90,220,80), // #161 Mimikin
		new Stat(384,136,45,202,106), // #162 Oh Bah Gah!
		new Stat(436,61,128,231,53), // #163 Sp mountain
		new Stat(463,130,42,240,53), // #164 Blowkade
		new Stat(470,148,53,253,47), // #165 Ledballoon
		new Stat(444,110,88,205,63), // #166 Sumodon
		new Stat(450,160,96,218,70), // #167 Yokozudon
		new Stat(461,48,134,219,60), // #168 Whateverest
		new Stat(482,51,170,249,64), // #169 Whatuption
		new Stat(304,147,26,147,179), // #170 Fidgephant
		new Stat(421,53,109,242,114), // #171 Touphant
		new Stat(445,123,79,267,99), // #172 Enduriphant
		new Stat(313,143,134,104,131), // #173 Zappary
		new Stat(504,206,195,128,140), // #174 Frazzel
		new Stat(359,39,89,198,156), // #175 Ship. Sailor
		new Stat(436,41,90,268,171), // #176 Adm. Admiral
		new Stat(523,63,117,176,85), // #177 Swelton
		new Stat(441,176,38,228,70), // #178 Sing Kong
		new Stat(404,68,39,211,190), // #179 Slippy
		new Stat(471,156,83,208,56), // #180 Repossessor
		new Stat(406,130,38,224,130), // #181 Mr. Blockhead
		new Stat(438,104,66,259,70), // #182 Mad Mountain
		new Stat(445,105,87,268,77), // #183 Lava Lord
		new Stat(445,118,80,239,64), // #184 Castelius III
		new Stat(466,128,84,252,70), // #185 Castelius II
		new Stat(491,134,86,269,78), // #186 Castelius I
		new Stat(516,140,88,289,84), // #187 Castelius Max
		new Stat(353,197,40,115,205), // #188 Puppynyan
		new Stat(452,124,66,228,86), // #189 Rhinoggin
		new Stat(478,145,68,240,87), // #190 Rhinormous
		new Stat(492,156,67,256,92), // #191 Hornaplenty
		new Stat(458,222,44,186,130), // #192 Kintaronyan
		new Stat(459,169,43,230,136), // #193 Steaking
		new Stat(465,128,71,234,143), // #194 Robonyan
		new Stat(456,169,63,253,93), // #195 Robonyan F
		new Stat(436,216,43,189,139), // #196 Showbonyan
		new Stat(473,132,72,243,169), // #197 Goldenyan
		new Stat(650,163,69,232,70), // #198 Dromp
		new Stat(695,71,168,238,81), // #199 Swosh
		new Stat(471,197,64,258,102), // #200 Toadal Dude
	};
}

private static Stat[] statEndTotal_2() {
	return new Stat[] {
		new Stat(455,72,165,243,138), // #201 Uber Geeko
		new Stat(460,197,68,158,148), // #202 Gargaros
		new Stat(422,182,245,123,133), // #203 Ogralus
		new Stat(473,264,56,241,106), // #204 Orcanos
		new Stat(480,176,92,254,93), // #205 Kabuking
		new Stat(642,196,78,251,41), // #206 Jawsome Kid
		new Stat(684,60,170,233,90), // #207 El Sharkador
		new Stat(489,160,36,296,120), // #208 Silver Lining
		new Stat(192,40,140,72,184), // #209 Leggly
		new Stat(279,135,42,99,172), // #210 Twirly Pie
		new Stat(311,54,183,86,138), // #211 Petty-Cake
		new Stat(328,156,37,95,168), // #212 Hoppy.
		new Stat(282,127,110,102,135), // #213 Dazzabel
		new Stat(344,144,123,115,152), // #214 Rattelle
		new Stat(361,125,149,123,166), // #215 Skelebella
		new Stat(242,143,35,100,178), // #216 Cadin
		new Stat(313,157,38,112,203), // #217 Cadable
		new Stat(346,188,45,132,201), // #218 Singcada
		new Stat(363,192,40,108,118), // #219 Buttered Blue
		new Stat(442,253,44,140,146), // #220 Pch. Baguette
		new Stat(298,37,179,102,142), // #221 Pupsicle
		new Stat(402,52,218,124,181), // #222 Chilhuahua
		new Stat(366,51,197,122,226), // #223 Swelterrier
		new Stat(282,153,35,79,180), // #224 Unbelievaboy!
		new Stat(405,165,56,96,243), // #225 Unbearaboy!
		new Stat(447,248,34,111,214), // #226 Inflammaboy!
		new Stat(304,43,191,123,145), // #227 Jumbelina
		new Stat(324,184,73,102,123), // #228 Boyclops
		new Stat(340,85,176,53,179), // #229 Krystal Fox
		new Stat(329,179,39,107,172), // #230 Runsure
		new Stat(345,41,167,98,187), // #231 Kittylumbus
		new Stat(312,39,164,128,171), // #232 Zest-a-Minute
		new Stat(323,49,181,120,144), // #233 Baku
		new Stat(370,39,199,124,169), // #234 Whapir
		new Stat(371,52,208,130,167), // #235 Bakulia
		new Stat(305,153,37,98,182), // #236 Panja Pupil
		new Stat(344,171,43,109,211), // #237 Panja Pro
		new Stat(352,54,182,97,156), // #238 Cue-Tee
		new Stat(402,58,203,107,179), // #239 Demandi
		new Stat(343,43,184,108,147), // #240 Walkappa
		new Stat(374,54,239,121,174), // #241 Appak
		new Stat(392,60,213,130,182), // #242 Supyo
		new Stat(332,167,43,104,216), // #243 Jibanyan
		new Stat(404,207,40,80,215), // #244 Jibanyan B
		new Stat(379,235,58,108,229), // #245 Jibanyan S
		new Stat(413,183,31,129,244), // #246 Jiban. Liu Bei
		new Stat(360,160,48,75,217), // #247 Rudy
		new Stat(366,168,59,116,210), // #248 Thornyan
		new Stat(388,185,36,133,194), // #249 Baddinyan
		new Stat(363,178,50,117,223), // #250 Buchinyan
		new Stat(343,40,190,102,160), // #251 Komasan
		new Stat(397,45,239,113,186), // #252 Komane
		new Stat(333,153,36,97,224), // #253 Komasan B
		new Stat(487,46,242,117,194), // #254 Komasan S
		new Stat(451,39,251,128,189), // #255 Koma. Sun Ce
		new Stat(386,161,221,98,143), // #256 Jibakoma
		new Stat(372,53,167,141,137), // #257 Komajiro
		new Stat(426,55,227,156,152), // #258 Komiger
		new Stat(533,60,212,173,156), // #259 Komajiro S
		new Stat(334,47,204,120,158), // #260 Drizzelda
		new Stat(288,108,36,85,270), // #261 Nekidspeed
		new Stat(351,176,38,85,203), // #262 Stinkeye
		new Stat(390,66,249,164,53), // #263 Slackoon
		new Stat(396,196,40,92,188), // #264 Puppiccino
		new Stat(421,45,200,174,104), // #265 Ballin
		new Stat(370,83,191,114,134), // #266 Shmoopie
		new Stat(392,86,208,122,146), // #267 Pinkipoo
		new Stat(400,139,200,104,156), // #268 Pookivil
		new Stat(364,176,190,105,109), // #269 Harry Barry
		new Stat(368,210,49,120,183), // #270 Wondernyan
		new Stat(325,75,157,94,213), // #271 Jetnyan
		new Stat(364,169,47,81,231), // #272 Chimpanyan
		new Stat(378,168,42,101,212), // #273 Tomnyan
		new Stat(404,43,216,113,170), // #274 Koma Knomads
		new Stat(354,37,161,119,212), // #275 Frostina
		new Stat(387,43,182,130,236), // #276 Blizzaria
		new Stat(445,52,239,156,174), // #277 Damona
		new Stat(367,170,142,156,140), // #278 Melonyan
		new Stat(321,147,147,147,147), // #279 Oranyan
		new Stat(346,202,51,137,174), // #280 Kiwinyan
		new Stat(346,51,202,126,185), // #281 Grapenyan
		new Stat(319,150,125,70,200), // #282 Strawbnyan
		new Stat(428,156,51,247,136), // #283 Watermelnyan
		new Stat(359,158,145,102,189), // #284 Sapphinyan
		new Stat(314,169,204,118,133), // #285 Emenyan
		new Stat(370,229,88,141,149), // #286 Rubinyan
		new Stat(390,150,70,225,156), // #287 Topanyan
		new Stat(372,193,48,137,213), // #288 Dianyan
		new Stat(371,59,213,172,163), // #289 Robokapp
		new Stat(352,46,192,159,199), // #290 Robokoma
		new Stat(349,67,228,110,192), // #291 Sailornyan
		new Stat(424,202,39,106,228), // #292 Rubeus J
		new Stat(457,226,75,197,84), // #293 Hardy Hound
		new Stat(418,188,118,40,228), // #294 Whirlweasel
		new Stat(376,174,47,95,240), // #295 Chocobonyan
		new Stat(379,54,221,113,196), // #296 Mooglenyan
		new Stat(389,204,51,103,223), // #297 Wobblenyan
		new Stat(373,63,206,117,200), // #298 Wibblekoma
		new Stat(390,179,43,98,237), // #299 Sushinyan
		new Stat(397,40,241,123,180), // #300 Tempurasan
	};
}

private static Stat[] statEndTotal_3() {
	return new Stat[] {
		new Stat(379,52,193,120,215), // #301 Faux Kappa
		new Stat(407,54,181,156,225), // #302 Tigappa
		new Stat(406,43,184,131,230), // #303 Master Nyada
		new Stat(419,43,188,101,254), // #304 Tenguriginal
		new Stat(411,34,250,98,236), // #305 Tengulightened
		new Stat(317,72,133,106,145), // #306 Pallysol
		new Stat(370,94,138,181,50), // #307 Bumblejack
		new Stat(295,46,172,93,162), // #308 In-Tune
		new Stat(279,127,121,69,163), // #309 Wantston
		new Stat(318,123,103,73,185), // #310 Grubsnitch
		new Stat(330,136,160,65,117), // #311 Wiglin
		new Stat(384,160,177,67,130), // #312 Kelpacabana
		new Stat(363,50,178,100,140), // #313 Steppa
		new Stat(336,45,194,75,188), // #314 Rhyth
		new Stat(144,106,154,33,159), // #315 Seaweed Sns.
		new Stat(283,45,190,113,131), // #316 Hungramps
		new Stat(358,55,223,127,157), // #317 Hungorge
		new Stat(301,49,241,117,174), // #318 Grainpa
		new Stat(498,46,223,102,159), // #319 Supersize G.
		new Stat(291,45,171,83,176), // #320 Tongus
		new Stat(345,49,186,94,203), // #321 Nurse Tongus
		new Stat(274,51,169,112,147), // #322 Sandmeh
		new Stat(385,64,181,143,166), // #323 Mr. Sandmeh
		new Stat(309,37,178,121,133), // #324 Lil Blue Hood
		new Stat(331,39,224,154,183), // #325 Bubble Beth
		new Stat(380,61,206,153,80), // #326 Afronaut
		new Stat(339,40,190,150,133), // #327 Cereal Spiller
		new Stat(314,46,187,105,168), // #328 Tomorrow Gal
		new Stat(350,96,158,64,177), // #329 Swaycorn
		new Stat(291,39,192,75,183), // #330 Push Pup
		new Stat(298,46,188,113,149), // #331 Happycane
		new Stat(373,54,205,126,166), // #332 Starrycane
		new Stat(340,101,156,111,136), // #333 Lodo
		new Stat(393,146,180,113,233), // #334 Supoor Hero
		new Stat(369,144,113,126,153), // #335 Chippa
		new Stat(311,46,184,112,152), // #336 Gnomey
		new Stat(380,58,225,134,173), // #337 High Gnomey
		new Stat(291,58,186,117,139), // #338 Enerfly
		new Stat(343,49,176,98,161), // #339 Enefly
		new Stat(387,59,237,123,173), // #340 Betterfly
		new Stat(412,60,253,131,179), // #341 Peppillon
		new Stat(312,135,173,96,107), // #342 Predictabull
		new Stat(416,250,216,108,136), // #343 Smashibull
		new Stat(343,68,182,103,181), // #344 DON-CHAN
		new Stat(366,49,202,101,172), // #345 Ray O'Light
		new Stat(326,56,182,131,159), // #346 Ol' Saint Trick
		new Stat(374,42,201,145,140), // #347 Ol' Fortune
		new Stat(380,78,180,155,122), // #348 Ponderoo
		new Stat(406,170,208,80,69), // #349 Tongue-Twister
		new Stat(420,38,183,210,92), // #350 Lazy Sundae
		new Stat(435,40,191,186,102), // #351 Got It Maid
		new Stat(349,110,163,129,143), // #352 Greengramps
		new Stat(388,40,215,101,161), // #353 Right Brothers
		new Stat(352,53,229,114,143), // #354 Tattlecakes
		new Stat(364,51,193,176,116), // #355 Happierre
		new Stat(402,58,213,189,142), // #356 Reversa
		new Stat(418,253,48,162,134), // #357 Reversette
		new Stat(333,49,233,126,156), // #358 Pheasanyan
		new Stat(419,127,183,37,192), // #359 Fundango
		new Stat(449,46,231,161,106), // #360 Pearly White
		new Stat(394,68,196,156,150), // #361 Robogramps
		new Stat(405,176,84,118,167), // #362 Rollen
		new Stat(423,188,76,127,182), // #363 Dubbles
		new Stat(401,167,146,182,84), // #364 Scarasol
		new Stat(386,59,253,132,160), // #365 Odysseynyan
		new Stat(357,57,254,133,164), // #366 Ghostess
		new Stat(428,88,262,136,105), // #367 Papa Bolt
		new Stat(446,230,230,102,52), // #368 Uncle Infinite
		new Stat(401,70,255,119,155), // #369 Mama Aura
		new Stat(380,92,276,138,128), // #370 Auntie Heart
		new Stat(435,82,268,118,148), // #371 Kyryn
		new Stat(461,101,249,138,130), // #372 Unikirin
		new Stat(402,144,163,43,291), // #373 Double Time
		new Stat(385,180,114,34,318), // #374 Sonic Bam
		new Stat(361,50,174,152,90), // #375 Neggplant
		new Stat(282,50,147,36,197), // #376 Snitchin
		new Stat(328,152,81,54,175), // #377 Messyrai
		new Stat(333,131,70,84,147), // #378 Leadoni
		new Stat(378,55,173,140,128), // #379 Mynimo
		new Stat(293,169,42,118,131), // #380 Ake
		new Stat(379,207,46,140,144), // #381 Payn
		new Stat(424,235,45,156,123), // #382 Agon
		new Stat(335,42,159,106,151), // #383 Herbiboy
		new Stat(407,210,45,149,158), // #384 Carniboy
		new Stat(307,51,164,95,156), // #385 Wydeawake
		new Stat(392,67,183,102,199), // #386 Allnyta
		new Stat(397,183,56,173,43), // #387 Treetter
		new Stat(441,107,167,230,43), // #388 Retreeter
		new Stat(288,68,169,84,147), // #389 Negatibuzz
		new Stat(354,74,176,88,195), // #390 Moskevil
		new Stat(379,74,174,90,225), // #391 Scritchy
		new Stat(269,143,35,89,180), // #392 Dimmy
		new Stat(344,171,40,111,220), // #393 Blandon
		new Stat(388,198,48,133,208), // #394 Nul
		new Stat(387,52,205,130,111), // #395 Salty Bacon
		new Stat(384,110,160,62,132), // #396 Suspicioni
		new Stat(346,170,110,95,101), // #397 Tantroni
		new Stat(442,84,49,233,171), // #398 Contrarioni
		new Stat(353,173,44,134,143), // #399 Grumpus Khan
		new Stat(406,189,48,159,161), // #400 Groupus Khan
	};
}

private static Stat[] statEndTotal_4() {
	return new Stat[] {
		new Stat(333,134,76,115,167), // #401 Hidabat
		new Stat(384,188,78,150,171), // #402 Abodabat
		new Stat(401,208,68,92,217), // #403 Belfree
		new Stat(337,165,91,106,140), // #404 Yoink
		new Stat(388,201,96,117,173), // #405 Gimme
		new Stat(356,46,189,160,113), // #406 Indexter
		new Stat(462,48,220,186,122), // #407 Hack King
		new Stat(392,140,196,124,56), // #408 Yoodooit
		new Stat(345,130,61,97,215), // #409 Count Zapaway
		new Stat(329,95,152,101,157), // #410 Tyrat
		new Stat(407,195,58,141,128), // #411 DisliKing
		new Stat(351,84,206,57,177), // #412 Crook-a-doodle
		new Stat(404,219,34,91,164), // #413 Rocky Badboya
		new Stat(426,124,164,95,133), // #414 Injurnalist
		new Stat(382,128,205,43,154), // #415 Misterr Typoo
		new Stat(350,59,188,121,156), // #416 Tengloom
		new Stat(381,104,180,147,139), // #417 Nird
		new Stat(366,207,56,114,147), // #418 K'mon-K'mon
		new Stat(410,125,162,199,73), // #419 Snobetty
		new Stat(369,60,178,106,209), // #420 Dracunyan
		new Stat(418,116,231,51,156), // #421 Lil Kappa
		new Stat(384,242,85,44,179), // #422 Horizontail
		new Stat(389,215,62,113,143), // #423 Usapyon
		new Stat(422,172,48,204,99), // #424 Usapyon Foot.
		new Stat(370,152,194,75,117), // #425 Usapyon Scub.
		new Stat(439,235,33,147,102), // #426 Usapyon G.I.
		new Stat(379,134,33,107,220), // #427 Usapyon Race.
		new Stat(356,232,40,127,158), // #428 Usapyon B
		new Stat(433,57,260,163,149), // #429 Usa. Zhongda
		new Stat(391,172,190,150,106), // #430 Slimamander
		new Stat(360,41,182,125,219), // #431 Negasus
		new Stat(416,203,39,155,181), // #432 Neighfarious
		new Stat(467,238,78,193,70), // #433 Gutsy Bones
		new Stat(383,247,80,113,189), // #434 Timidevil
		new Stat(425,235,71,117,194), // #435 Beelzebold
		new Stat(434,226,58,122,207), // #436 Count Cavity
		new Stat(367,176,176,220,130), // #437 Eyesoar
		new Stat(395,184,184,265,138), // #438 Eyellure
		new Stat(407,98,205,102,177), // #439 Greesel
		new Stat(431,113,215,107,180), // #440 Awevil
		new Stat(462,145,145,282,143), // #441 Wobblewok
		new Stat(406,53,288,155,140), // #442 Darkyubi
		new Stat(448,131,251,65,178), // #443 Dr. E. Raser
		new Stat(460,74,234,148,165), // #444 Dr. Nocturne
		new Stat(372,359,37,92,282), // #445 Tut 'n' K'mon
		new Stat(282,53,149,72,179), // #446 Tie-red
		new Stat(334,73,170,42,176), // #447 Love-Torn
		new Stat(316,186,50,88,143), // #448 Shakey
		new Stat(380,53,204,145,58), // #449 Quagmira
		new Stat(408,106,46,211,88), // #450 Coughkoff
		new Stat(428,140,48,230,64), // #451 Hurchin
		new Stat(319,51,179,86,142), // #452 Droplette
		new Stat(403,60,228,116,159), // #453 Drizzle
		new Stat(342,55,155,121,133), // #454 Slush
		new Stat(430,62,204,144,145), // #455 Alhail
		new Stat(364,44,208,54,172), // #456 Gush
		new Stat(357,42,196,135,81), // #457 Peckpocket
		new Stat(409,48,212,147,155), // #458 Robbinyu
		new Stat(387,203,43,120,119), // #459 Rockabelly
		new Stat(275,145,66,52,188), // #460 Squeeky
		new Stat(344,148,68,63,225), // #461 Rawry
		new Stat(351,73,150,80,133), // #462 Buhu
		new Stat(397,50,207,113,156), // #463 Flumpy
		new Stat(436,51,237,130,169), // #464 Skreek
		new Stat(298,178,40,102,142), // #465 Manjimutt
		new Stat(390,229,43,114,166), // #466 Multimutt
		new Stat(395,45,185,106,219), // #467 Sir Berus
		new Stat(299,39,188,93,142), // #468 Furgus
		new Stat(405,43,216,247,91), // #469 Furdinand
		new Stat(355,38,153,182,95), // #470 Pergushin
		new Stat(431,48,216,169,153), // #471 Percrushionists
		new Stat(357,59,186,97,147), // #472 Nosirs
		new Stat(312,59,200,98,149), // #473 Grubbles
		new Stat(348,188,40,106,162), // #474 Nervous Rex
		new Stat(391,181,56,181,79), // #475 Rinsin Repete
		new Stat(337,184,98,55,156), // #476 Chatalie
		new Stat(314,203,102,113,137), // #477 Nagatha
		new Stat(384,96,160,151,88), // #478 Dismarelda
		new Stat(442,66,207,169,65), // #479 Drenchetta
		new Stat(418,40,166,193,75), // #480 Danke Sand
		new Stat(466,43,181,237,78), // #481 No Sandkyu
		new Stat(331,49,210,121,154), // #482 Papa Windbag
		new Stat(352,189,117,65,157), // #483 Ben Tover
		new Stat(321,69,187,98,174), // #484 Compunzer
		new Stat(391,77,202,130,153), // #485 Lamedian
		new Stat(397,46,213,124,142), // #486 Soloman
		new Stat(342,93,163,40,205), // #487 Rhumbastiltskin
		new Stat(421,224,38,167,89), // #488 Slax
		new Stat(334,176,150,81,131), // #489 Cheeksqueek
		new Stat(393,190,56,79,228), // #490 Cuttincheez
		new Stat(372,64,186,83,172), // #491 Toiletta
		new Stat(417,66,199,87,225), // #492 Foiletta
		new Stat(386,156,42,137,213), // #493 Robomutt
		new Stat(459,166,111,189,75), // #494 Shedwin
		new Stat(383,43,177,71,231), // #495 Glumdango
		new Stat(422,40,232,83,183), // #496 Spewart
		new Stat(386,79,182,100,186), // #497 Grumples
		new Stat(417,81,203,103,231), // #498 Everfore
		new Stat(443,84,233,78,216), // #499 Eterna
		new Stat(526,55,228,134,145), // #500 Sproink
	};
}

private static Stat[] statEndTotal_5() {
	return new Stat[] {
		new Stat(359,172,65,99,230), // #501 Darknyan
		new Stat(450,240,44,126,170), // #502 Decidevible
		new Stat(473,191,46,267,69), // #503 Hairum Scarum
		new Stat(363,65,187,83,229), // #504 Insomni
		new Stat(408,71,194,87,239), // #505 Sandi
		new Stat(452,56,259,130,183), // #506 Arachnus
		new Stat(440,212,149,98,170), // #507 Arachnia
		new Stat(654,48,190,224,100), // #508 Oridjinn
		new Stat(576,61,226,180,119), // #509 Horridjinn
		new Stat(427,221,43,78,242), // #510 Little Charrmer
		new Stat(309,39,188,100,137), // #511 Cricky
		new Stat(338,186,44,138,105), // #512 Humtea Jumtea
		new Stat(357,42,197,164,64), // #513 Snailspace
		new Stat(291,188,39,96,151), // #514 Putasockinit
		new Stat(418,229,42,100,167), // #515 Snidewinder
		new Stat(277,34,128,58,212), // #516 Noko
		new Stat(354,39,182,83,234), // #517 Bloominoko
		new Stat(392,131,112,78,216), // #518 Pandanoko
		new Stat(1,247,247,27,274), // #519 Starry Noko
		new Stat(316,183,113,66,115), // #520 Snaggly
		new Stat(428,224,136,73,152), // #521 Whinona
		new Stat(351,156,39,99,151), // #522 OMGator
		new Stat(422,125,56,211,86), // #523 Nautaloss
		new Stat(314,39,190,110,157), // #524 Shellebrity
		new Stat(352,39,169,176,120), // #525 Heheheel
		new Stat(386,193,78,128,135), // #526 Croonger
		new Stat(378,41,181,196,118), // #527 Urnaconda
		new Stat(396,147,43,186,104), // #528 Takoyakid
		new Stat(452,163,46,225,110), // #529 Takoyaking
		new Stat(365,220,42,149,80), // #530 Fishpicable
		new Stat(446,256,46,158,86), // #531 Rageon
		new Stat(451,51,274,179,105), // #532 Tunatic
		new Stat(402,41,210,173,60), // #533 Flushback
		new Stat(473,53,249,193,77), // #534 Vacuumory
		new Stat(372,182,52,116,146), // #535 Irewig
		new Stat(470,223,54,133,167), // #536 Firewig
		new Stat(321,155,155,85,112), // #537 Draggie
		new Stat(436,194,194,108,138), // #538 Dragon Lord
		new Stat(463,186,186,87,165), // #539 Azure Dragon
		new Stat(336,50,200,116,138), // #540 Mermaidyn
		new Stat(430,76,251,136,167), // #541 Mermadonna
		new Stat(456,54,270,158,140), // #542 Mermother
		new Stat(389,226,37,124,101), // #543 T-Wrecks
		new Stat(486,276,41,170,126), // #544 D-Stroy
		new Stat(514,253,49,194,109), // #545 Clodzilla
		new Stat(349,168,145,103,130), // #546 Lady Longnek
		new Stat(338,69,163,38,235), // #547 Whisper
		new Stat(376,56,177,47,214), // #548 Whispocrates
		new Stat(350,149,79,108,188), // #549 Snippity Cricket
		new Stat(408,207,39,122,154), // #550 Flocktopus
		new Stat(372,45,197,111,164), // #551 Bitter Batter
		new Stat(378,44,146,36,234), // #552 Daiz
		new Stat(371,79,180,43,223), // #553 Confuze
		new Stat(366,202,40,123,150), // #554 Chummer
		new Stat(507,54,195,162,117), // #555 Shrook
		new Stat(386,146,70,183,125), // #556 Spenp
		new Stat(433,164,64,211,110), // #557 Almi
		new Stat(374,217,41,118,150), // #558 Babblong
		new Stat(405,236,42,120,162), // #559 Bananose
		new Stat(441,243,40,170,130), // #560 Cocobanana
		new Stat(535,63,315,167,156), // #561 Draaagin
		new Stat(437,41,143,231,133), // #562 Robonoko
		new Stat(420,40,215,134,164), // #563 Robodraggie
		new Stat(527,87,156,202,76), // #564 Ooze Zat
		new Stat(387,209,42,126,166), // #565 Copperled
		new Stat(427,39,192,103,201), // #566 Cynake
		new Stat(441,238,76,130,142), // #567 Slitheref
		new Stat(454,44,250,116,166), // #568 SV Snaggerjag
		new Stat(446,41,266,170,104), // #569 Mython
		new Stat(378,207,52,110,230), // #570 Venoct
		new Stat(390,193,210,71,168), // #571 Shadow Venoct
		new Stat(461,42,261,155,163), // #572 Frogetmenot
		new Stat(400,140,140,140,140), // #573 Originyan
		new Stat(393,56,143,232,130), // #574 Sighborg Y
		new Stat(535,52,232,256,198), // #575 Unfairy
		new Stat(408,45,242,95,300), // #576 Unkaind
		new Stat(635,306,82,206,122), // #577 Untidy
		new Stat(463,45,323,145,199), // #578 Unpleasant
		new Stat(465,222,174,127,156), // #579 Unkeen
		new Stat(474,241,61,79,154), // #580 Grublappa
		new Stat(515,281,89,109,89), // #581 Madmunch
		new Stat(431,52,244,94,225), // #582 Badsmella
		new Stat(429,62,204,73,235), // #583 Mad Kappa
		new Stat(404,81,171,61,195), // #584 Shamasol
		new Stat(431,57,234,66,179), // #585 Gnomine
		new Stat(440,166,190,40,156), // #586 Defectabull
		new Stat(439,45,245,43,164), // #587 Feargus
		new Stat(441,71,243,51,171), // #588 Scaremaiden
		new Stat(445,211,171,54,161), // #589 Wrongnek
		new Stat(415,190,37,91,228), // #590 King Jibanyan
		new Stat(402,55,223,150,167), // #591 Qn. Usapyon
		new Stat(407,37,236,126,178), // #592 Jackomasan
		new Stat(433,231,48,139,167), // #593 Komajiro Ten
		new Stat(423,161,33,83,225), // #594 Acenyan
		new Stat(456,218,101,61,181), // #595 Josper
		new Stat(391,43,191,121,239), // #596 Benzaiten
		new Stat(416,49,246,137,186), // #597 Hotei
		new Stat(513,154,52,276,123), // #598 Daikokuten
		new Stat(433,51,240,182,156), // #599 Ebisu
		new Stat(447,267,46,162,150), // #600 Bishamonten
	};
}

private static Stat[] statEndTotal_6() {
	return new Stat[] {
		new Stat(447,216,77,151,183), // #601 Columbakat
		new Stat(459,66,270,167,138), // #602 T. Energison
		new Stat(404,51,256,211,140), // #603 Starwin
		new Stat(457,204,42,143,236), // #604 Last Nyanmurai
		new Stat(423,37,208,112,246), // #605 Koma Star
		new Stat(535,141,37,260,180), // #606 Platinos
		new Stat(697,57,251,84,177), // #607 Flash T. Cash
		new Stat(340,177,52,128,259), // #608 Shogunyan
		new Stat(405,63,318,157,140), // #609 Komashura
		new Stat(471,258,58,236,116), // #610 Gilgaros
		new Stat(320,44,207,110,261), // #611 Spoilerina
		new Stat(370,102,299,115,172), // #612 Elder Bloom
		new Stat(398,128,201,147,186), // #613 Poofessor
		new Stat(368,70,222,112,235), // #614 Dandoodle
		new Stat(503,283,115,140,113), // #615 Slurpent
		new Stat(508,45,281,180,141), // #616 Re-Q-Perate
		new Stat(461,43,227,134,240), // #617 Princess Pearl
		new Stat(490,275,36,168,173), // #618 Asura
		new Stat(342,187,44,268,181), // #619 Terminyanator
		new Stat(375,194,35,154,229), // #620 Supernyan
		new Stat(321,211,65,147,261), // #621 Hovernyan S
		new Stat(301,199,55,160,253), // #622 Hover. Cao Cao
		new Stat(339,43,221,158,124), // #623 Yoganalisten
		new Stat(500,142,43,289,58), // #624 Judgebrick
		new Stat(100,242,22,500,58), // #625 Urnfulfilled
		new Stat(582,87,43,241,103), // #626 Sad 2 the Bone
		new Stat(527,167,28,301,99), // #627 Venoctobot
		new Stat(489,259,50,249,106), // #628 Orcanos Lu Bu
		new Stat(541,28,167,296,99), // #629 Kyubot
		new Stat(600,184,43,253,152), // #630 Ult. Robonyan
		new Stat(205,64,201,102,119), // #631 Molar Petite
		new Stat(352,47,202,123,187), // #632 Life-is-Parfait
		new Stat(606,97,140,87,145), // #633 Mee 2
		new Stat(383,99,187,139,193), // #634 Koalanyan
		new Stat(389,206,49,102,224), // #635 Jibanyan T
		new Stat(373,61,208,116,201), // #636 Komasan T
		new Stat(468,29,219,235,79), // #637 Eggcelency
		new Stat(393,218,38,109,226), // #638 Deadcool
		new Stat(311,59,220,114,143), // #639 Sweattuce
		new Stat(375,46,202,105,168), // #640 Mr Blue-Shy
		new Stat(451,72,295,126,85), // #641 Amplifly
		new Stat(400,50,220,141,164), // #642 Ulteria
		new Stat(429,43,251,89,76), // #643 My-Baaad
		new Stat(445,41,41,175,176), // #644 Sunk'nsoul
		new Stat(100,280,280,100,100), // #645 Crummy Mum.
		new Stat(417,32,241,121,173), // #646 Kaped Koma.
		new Stat(408,159,128,142,163), // #647 Tofupyon
		new Stat(428,231,121,151,163), // #648 Ed Zoff
		new Stat(356,139,147,173,129), // #649 Gorgeous Amb.
		new Stat(508,159,381,88,65), // #650 Hinozall
		new Stat(471,55,281,155,137), // #651 Zazel
		new Stat(392,93,93,128,193), // #652 Procrastino.
		new Stat(413,153,28,210,129), // #653 Treasure Pest
		new Stat(402,78,219,98,224), // #654 J. Ne-Sais-Quoi
		new Stat(399,61,218,88,225), // #655 Whi. Kongming
		new Stat(382,44,186,122,235), // #656 Jurojin
		new Stat(387,98,300,123,159), // #657 Fukurokuju
		new Stat(473,45,217,217,78), // #658 Sarchopha.
		new Stat(469,218,43,223,82), // #659 King Deadward
		new Stat(436,38,237,72,221), // #660 Pandora
		new Stat(470,45,219,215,81), // #661 Comic Genieus
		new Stat(431,113,212,158,176), // #662 Bastnetnyan
		new Stat(432,108,220,159,177), // #663 Komanubis
		new Stat(430,46,262,143,176), // #664 Gabby
		new Stat(413,138,255,70,171), // #665 Teducator
		new Stat(391,102,249,131,132), // #666 Gentlemutt
		new Stat(553,281,107,145,101), // #667 City Licker
		new Stat(475,59,319,165,86), // #668 Whyvern King
		new Stat(460,260,190,200,200), // #669 Lord Enma
		new Stat(358,287,59,139,263), // #670 Rgt. Zazel
		new Stat(521,171,398,102,76), // #671 Hinozall Awk.
		new Stat(457,410,210,115,89), // #672 Ancient Enma
		new Stat(465,270,200,210,210), // #673 Enma Awk.
		new Stat(413,21,200,129,218), // #674 The Boracle
		new Stat(439,261,70,158,144), // #675 Rampajah
		new Stat(362,50,199,131,168), // #676 Cymbalina
		new Stat(438,98,62,267,179), // #677 Mumbles
		new Stat(438,183,183,183,179), // #678 Roary
		new Stat(382,76,185,150,171), // #679 Letsbifrenz
		new Stat(375,81,180,43,213), // #680 Wack o' Lantern
		new Stat(528,187,102,229,93), // #681 Moolinda
		new Stat(525,188,101,230,93), // #682 Neighthan
		new Stat(683,94,250,225,101), // #683 Big Fish
		new Stat(477,50,220,219,98), // #684 Alpina
		new Stat(392,201,114,40,291), // #685 Lunie
		new Stat(403,43,192,130,236), // #686 Blizzie
		new Stat(453,57,190,157,147), // #687 KJ
		new Stat(470,248,248,210,210), // #688 Solar Enma
		new Stat(455,204,272,205,300), // #689 Infinite Enma
		new Stat(465,275,210,220,210), // #690 Umbral Enma
		new Stat(501,222,49,121,193), // #691 Indiana Jaws
		new Stat(411,31,218,189,181), // #692 Shovulcan
		new Stat(487,229,48,120,208), // #693 Zomboy
		new Stat(421,39,231,139,234), // #694 Nyanses II
		new Stat(403,203,219,187,236), // #695 Meopatra
		new Stat(683,198,97,224,106), // #696 Fitwit
		new Stat(619,265,70,158,71), // #697 El Dorago
		new Stat(707,159,363,5,65), // #698 The Hinix
	};
}

// Merge all stat chunks into final arrays
public static Stat[] statFirstTotal = mergeStats(
	statFirstTotal_0(), statFirstTotal_1(), statFirstTotal_2(), statFirstTotal_3(), statFirstTotal_4(), statFirstTotal_5(), statFirstTotal_6()
);

public static Stat[] statEndTotal = mergeStats(
	statEndTotal_0(), statEndTotal_1(), statEndTotal_2(), statEndTotal_3(), statEndTotal_4(), statEndTotal_5(), statEndTotal_6()
);

private static Stat[] mergeStats(Stat[]... arrays) {
	int total = 0;
	for (Stat[] a : arrays) total += a.length;
	Stat[] result = new Stat[total];
	int i = 0;
	for (Stat[] a : arrays) for (Stat s : a) result[i++] = s;
	return result;
}

// ============================================================
// Yokai medaillum array - also chunked
// ============================================================

private static Yokai[] medaillum_0() {
	return new Yokai[] {
		new Yokai("Sigh-Durr", 1, E, Brave, false, statFirstTotal[0], statEndTotal[0], Earth, Wind, Earth, 1),
		new Yokai("Flippit", 2, E, Brave, false, statFirstTotal[1], statEndTotal[1], Earth, Wind, Earth, 1),
		new Yokai("Pandle", 3, E, Brave, false, statFirstTotal[2], statEndTotal[2], Fire, Water, Fire, 1),
		new Yokai("Undy", 4, C, Brave, false, statFirstTotal[3], statEndTotal[3], Fire, Water, Fire, 1),
		new Yokai("Tanbo", 5, B, Brave, false, statFirstTotal[4], statEndTotal[4], Earth, Wind, Earth, 2),
		new Yokai("Cutta-nah", 6, E, Brave, false, statFirstTotal[5], statEndTotal[5], Wind, Ice, Wind, 1),
		new Yokai("Cutta-nah-nah", 7, C, Brave, false, statFirstTotal[6], statEndTotal[6], Wind, Ice, Wind, 1),
		new Yokai("Slacka-slash", 8, B, Brave, false, statFirstTotal[7], statEndTotal[7], Ice, Fire, Ice, 1),
		new Yokai("Brushido", 9, E, Brave, false, statFirstTotal[8], statEndTotal[8], Ice, Fire, Ice, 1),
		new Yokai("Washogun", 10, B, Brave, false, statFirstTotal[9], statEndTotal[9], Ice, Fire, Ice, 1),
		new Yokai("Lie-in", 11, E, Brave, false, statFirstTotal[10], statEndTotal[10], Ice, Fire, Ice, 2),
		new Yokai("Lie-in Heart", 12, A, Brave, false, statFirstTotal[11], statEndTotal[11], Ice, Fire, Ice, 2),
		new Yokai("Hissfit", 13, E, Brave, false, statFirstTotal[12], statEndTotal[12], Fire, Water, Fire, 1),
		new Yokai("Zerberker", 14, A, Brave, false, statFirstTotal[13], statEndTotal[13], Fire, Water, Fire, 1),
		new Yokai("Snartle", 15, S, Brave, false, statFirstTotal[14], statEndTotal[14], Ice, Fire, Ice, 1),
		new Yokai("Brutle", 16, S, Brave, false, statFirstTotal[15], statEndTotal[15], Ice, Fire, Ice, 1),
		new Yokai("Mochismo", 17, D, Brave, false, statFirstTotal[16], statEndTotal[16], Earth, Wind, Earth, 2),
		new Yokai("Minochi", 18, D, Brave, false, statFirstTotal[17], statEndTotal[17], Fire, Water, Fire, 2),
		new Yokai("Minimoto", 19, D, Brave, false, statFirstTotal[18], statEndTotal[18], Wind, Ice, Wind, 1),
		new Yokai("Slumberhog", 20, D, Brave, false, statFirstTotal[19], statEndTotal[19], Fire, Water, Fire, 2),
		new Yokai("Snortlehog", 21, B, Brave, false, statFirstTotal[20], statEndTotal[20], Fire, Water, Fire, 1),
		new Yokai("Samureel", 22, D, Brave, false, statFirstTotal[21], statEndTotal[21], Water, Thunder, Water, 1),
		new Yokai("Time Keeler", 23, B, Brave, false, statFirstTotal[22], statEndTotal[22], Water, Thunder, Water, 1),
		new Yokai("Goofball", 24, D, Brave, false, statFirstTotal[23], statEndTotal[23], Ice, Fire, Ice, 1),
		new Yokai("Slugger", 25, B, Brave, false, statFirstTotal[24], statEndTotal[24], Ice, Fire, Ice, 1),
		new Yokai("Helmsman", 26, D, Brave, false, statFirstTotal[25], statEndTotal[25], Thunder, Earth, Thunder, 1),
		new Yokai("Reuknight", 27, A, Brave, false, statFirstTotal[26], statEndTotal[26], Thunder, Earth, Thunder, 1),
		new Yokai("Corptain", 28, S, Brave, false, statFirstTotal[27], statEndTotal[27], Fire, Water, Fire, 1),
		new Yokai("Slicenrice", 29, D, Brave, false, statFirstTotal[28], statEndTotal[28], Wind, Ice, Wind, 1),
		new Yokai("Flamurice", 30, A, Brave, false, statFirstTotal[29], statEndTotal[29], Fire, Water, Fire, 1),
		new Yokai("Tublappa", 31, D, Brave, false, statFirstTotal[30], statEndTotal[30], Thunder, Earth, Thunder, 1),
		new Yokai("Lappinitup", 32, A, Brave, false, statFirstTotal[31], statEndTotal[31], Thunder, Earth, Thunder, 1),
		new Yokai("El Gutso", 33, D, Brave, false, statFirstTotal[32], statEndTotal[32], Fire, Water, Fire, 1),
		new Yokai("Gutso Grande", 34, A, Brave, false, statFirstTotal[33], statEndTotal[33], Fire, Water, Fire, 1),
		new Yokai("Mudmunch", 35, C, Brave, false, statFirstTotal[34], statEndTotal[34], Earth, Wind, Earth, 1),
		new Yokai("BBQvil", 36, C, Brave, false, statFirstTotal[35], statEndTotal[35], Fire, Water, Fire, 1),
		new Yokai("Liarbird", 37, C, Brave, false, statFirstTotal[36], statEndTotal[36], Wind, Ice, Wind, 1),
		new Yokai("Benkei", 38, C, Brave, false, statFirstTotal[37], statEndTotal[37], Ice, Fire, Ice, 1),
		new Yokai("B3-NK1", 39, B, Brave, false, statFirstTotal[38], statEndTotal[38], Thunder, Earth, Thunder, 1),
		new Yokai("Blazion", 40, C, Brave, false, statFirstTotal[39], statEndTotal[39], Fire, Water, Fire, 1),
		new Yokai("Quaken", 41, B, Brave, false, statFirstTotal[40], statEndTotal[40], Earth, Wind, Earth, 1),
		new Yokai("Siro", 42, A, Brave, false, statFirstTotal[41], statEndTotal[41], Thunder, Earth, Thunder, 1),
		new Yokai("Chansin", 43, C, Brave, false, statFirstTotal[42], statEndTotal[42], Fire, Water, Fire, 1),
		new Yokai("Sheen", 44, A, Brave, false, statFirstTotal[43], statEndTotal[43], Wind, Ice, Wind, 1),
		new Yokai("Snee", 45, A, Brave, false, statFirstTotal[44], statEndTotal[44], Water, Thunder, Water, 1),
		new Yokai("Gleam", 46, S, Brave, false, statFirstTotal[45], statEndTotal[45], Thunder, Earth, Thunder, 1),
		new Yokai("Hovernyan", 47, B, Brave, false, statFirstTotal[46], statEndTotal[46], Wind, Ice, Wind, 1),
		new Yokai("Moximous N", 48, B, Brave, false, statFirstTotal[47], statEndTotal[47], Wind, Ice, Wind, 1),
		new Yokai("Moximous K", 49, B, Brave, false, statFirstTotal[48], statEndTotal[48], Water, Thunder, Water, 1),
		new Yokai("Hot Air Buffoon", 50, B, Brave, false, statFirstTotal[49], statEndTotal[49], Fire, Water, Fire, 1),
		new Yokai("Sushiyama", 51, B, Brave, false, statFirstTotal[50], statEndTotal[50], Ice, Fire, Ice, 1),
		new Yokai("Kapunki", 52, A, Brave, false, statFirstTotal[51], statEndTotal[51], Fire, Water, Fire, 1),
		new Yokai("Beetler", 53, B, Brave, false, statFirstTotal[52], statEndTotal[52], Earth, Wind, Earth, 1),
		new Yokai("Beetall", 54, A, Brave, false, statFirstTotal[53], statEndTotal[53], Ice, Fire, Ice, 1),
		new Yokai("Cruncha", 55, S, Brave, false, statFirstTotal[54], statEndTotal[54], Thunder, Earth, Thunder, 1),
		new Yokai("Machonyan", 56, A, Brave, false, statFirstTotal[55], statEndTotal[55], Thunder, Earth, Thunder, 1),
		new Yokai("Momonyan", 57, A, Brave, false, statFirstTotal[56], statEndTotal[56], Fire, Water, Fire, 1),
		new Yokai("Sir Nyansalot", 58, A, Brave, false, statFirstTotal[57], statEndTotal[57], Ice, Fire, Ice, 1),
		new Yokai("Sgt. Burly", 59, A, Brave, false, statFirstTotal[58], statEndTotal[58], Thunder, Earth, Thunder, 1),
		new Yokai("Bison Burly", 60, S, Brave, false, statFirstTotal[59], statEndTotal[59], Thunder, Earth, Thunder, 1),
		new Yokai("Demuncher", 61, S, Brave, false, statFirstTotal[60], statEndTotal[60], Earth, Wind, Earth, 1),
		new Yokai("Devourer", 62, S, Brave, false, statFirstTotal[61], statEndTotal[61], Ice, Fire, Ice, 1),
		new Yokai("Illuminoct", 63, S, Brave, false, statFirstTotal[62], statEndTotal[62], Thunder, Earth, Thunder, 1),
		new Yokai("Arachnevil", 64, S, Brave, false, statFirstTotal[63], statEndTotal[63], Fire, Water, Fire, 1),
		new Yokai("Shurikenny", 65, S, Brave, false, statFirstTotal[64], statEndTotal[64], Wind, Ice, Wind, 1),
		new Yokai("Nunchucky", 66, S, Brave, false, statFirstTotal[65], statEndTotal[65], Wind, Ice, Wind, 1),
		new Yokai("Camellia", 67, S, Brave, false, statFirstTotal[66], statEndTotal[66], Fire, Water, Fire, 1),
		new Yokai("Brokenbrella", 68, E, Mysterious, false, statFirstTotal[67], statEndTotal[67], Wind, Ice, Wind, 1),
		new Yokai("Pittapatt", 69, E, Mysterious, false, statFirstTotal[68], statEndTotal[68], Earth, Wind, Earth, 1),
		new Yokai("Zip Unlock", 70, E, Mysterious, false, statFirstTotal[69], statEndTotal[69], Thunder, Earth, Thunder, 1),
		new Yokai("Slippup", 71, E, Mysterious, false, statFirstTotal[70], statEndTotal[70], Ice, Fire, Ice, 1),
		new Yokai("Snotsolong", 72, E, Mysterious, false, statFirstTotal[71], statEndTotal[71], Water, Thunder, Water, 2),
		new Yokai("Duchoo", 73, D, Mysterious, false, statFirstTotal[72], statEndTotal[72], Ice, Fire, Ice, 2),
		new Yokai("D'wanna", 74, E, Mysterious, false, statFirstTotal[73], statEndTotal[73], Thunder, Earth, Thunder, 1),
		new Yokai("N'more", 75, C, Mysterious, false, statFirstTotal[74], statEndTotal[74], Thunder, Earth, Thunder, 1),
		new Yokai("Q'wit", 76, C, Mysterious, false, statFirstTotal[75], statEndTotal[75], Earth, Wind, Earth, 1),
		new Yokai("Wazzat", 77, E, Mysterious, false, statFirstTotal[76], statEndTotal[76], Wind, Ice, Wind, 1),
		new Yokai("Houzzat", 78, B, Mysterious, false, statFirstTotal[77], statEndTotal[77], Wind, Ice, Wind, 1),
		new Yokai("Dummkap", 79, E, Mysterious, false, statFirstTotal[78], statEndTotal[78], Thunder, Earth, Thunder, 2),
		new Yokai("Who-Me", 80, E, Mysterious, false, statFirstTotal[79], statEndTotal[79], Wind, Ice, Wind, 1),
		new Yokai("2-Much-2-Take", 81, A, Mysterious, false, statFirstTotal[80], statEndTotal[80], Wind, Ice, Wind, 1),
		new Yokai("Why Naant", 82, E, Mysterious, false, statFirstTotal[81], statEndTotal[81], Thunder, Earth, Thunder, 1),
		new Yokai("Naandhi", 83, A, Mysterious, false, statFirstTotal[82], statEndTotal[82], Thunder, Earth, Thunder, 1),
		new Yokai("Faysoff", 84, D, Mysterious, false, statFirstTotal[83], statEndTotal[83], Water, Thunder, Water, 2),
		new Yokai("Snottle", 85, D, Mysterious, false, statFirstTotal[84], statEndTotal[84], Fire, Fire, Fire, 1),
		new Yokai("Legsit", 86, D, Mysterious, false, statFirstTotal[85], statEndTotal[85], Water, Thunder, Water, 1),
		new Yokai("Chukket", 87, D, Mysterious, false, statFirstTotal[86], statEndTotal[86], Earth, Wind, Earth, 1),
		new Yokai("Cornfused", 88, D, Mysterious, false, statFirstTotal[87], statEndTotal[87], Thunder, Earth, Thunder, 1),
		new Yokai("Unshelltered", 89, D, Mysterious, false, statFirstTotal[88], statEndTotal[88], Ice, Fire, Ice, 1),
		new Yokai("Lafalotta", 90, D, Mysterious, false, statFirstTotal[89], statEndTotal[89], Earth, Wind, Earth, 1),
		new Yokai("Blips", 91, C, Mysterious, false, statFirstTotal[90], statEndTotal[90], Earth, Wind, Earth, 1),
		new Yokai("Tattletell", 92, D, Mysterious, false, statFirstTotal[91], statEndTotal[91], Ice, Fire, Ice, 1),
		new Yokai("Tattlecast", 93, B, Mysterious, false, statFirstTotal[92], statEndTotal[92], Ice, Fire, Ice, 1),
		new Yokai("Skranny", 94, C, Mysterious, false, statFirstTotal[93], statEndTotal[93], Water, Thunder, Water, 1),
		new Yokai("Cupistol", 95, D, Mysterious, false, statFirstTotal[94], statEndTotal[94], Wind, Ice, Wind, 1),
		new Yokai("Casanuva", 96, A, Mysterious, false, statFirstTotal[95], statEndTotal[95], Wind, Ice, Wind, 1),
		new Yokai("Casanono", 97, A, Mysterious, false, statFirstTotal[96], statEndTotal[96], Fire, Water, Fire, 1),
		new Yokai("So-Sorree", 98, D, Mysterious, false, statFirstTotal[97], statEndTotal[97], Thunder, Earth, Thunder, 1),
		new Yokai("Bowminos", 99, A, Mysterious, false, statFirstTotal[98], statEndTotal[98], Earth, Wind, Earth, 1),
		new Yokai("Smogling", 100, D, Mysterious, false, statFirstTotal[99], statEndTotal[99], Wind, Ice, Wind, 1),
	};
}

private static Yokai[] medaillum_1() {
	return new Yokai[] {
		new Yokai("Smogmella", 101, A, Mysterious, false, statFirstTotal[100], statEndTotal[100], Wind, Ice, Wind, 1),
		new Yokai("Signibble", 102, D, Mysterious, false, statFirstTotal[101], statEndTotal[101], Thunder, Earth, Thunder, 1),
		new Yokai("Signiton", 103, A, Mysterious, false, statFirstTotal[102], statEndTotal[102], Thunder, Earth, Thunder, 1),
		new Yokai("Master Oden", 104, A, Mysterious, false, statFirstTotal[103], statEndTotal[103], Thunder, Earth, Thunder, 1),
		new Yokai("Statiking", 105, S, Mysterious, false, statFirstTotal[104], statEndTotal[104], Thunder, Earth, Thunder, 1),
		new Yokai("Failian", 106, C, Mysterious, false, statFirstTotal[105], statEndTotal[105], Ice, Fire, Ice, 1),
		new Yokai("Apelican", 107, C, Mysterious, false, statFirstTotal[106], statEndTotal[106], Wind, Ice, Wind, 2),
		new Yokai("Fuu 2", 108, C, Mysterious, false, statFirstTotal[107], statEndTotal[107], Wind, Ice, Wind, 1),
		new Yokai("Shrillington", 109, C, Mysterious, false, statFirstTotal[108], statEndTotal[108], Thunder, Earth, Thunder, 1),
		new Yokai("House Partay", 110, C, Mysterious, false, statFirstTotal[109], statEndTotal[109], Fire, Water, Fire, 1),
		new Yokai("Skulleidoscope", 111, C, Mysterious, false, statFirstTotal[110], statEndTotal[110], Water, Thunder, Water, 1),
		new Yokai("Lionguist", 112, C, Mysterious, false, statFirstTotal[111], statEndTotal[111], Fire, Water, Fire, 1),
		new Yokai("Illoo", 113, C, Mysterious, false, statFirstTotal[112], statEndTotal[112], Water, Thunder, Water, 1),
		new Yokai("Elloo", 114, C, Mysterious, false, statFirstTotal[113], statEndTotal[113], Ice, Fire, Ice, 1),
		new Yokai("Alloo", 115, B, Mysterious, false, statFirstTotal[114], statEndTotal[114], Thunder, Earth, Thunder, 1),
		new Yokai("Espy", 116, C, Mysterious, false, statFirstTotal[115], statEndTotal[115], Earth, Wind, Earth, 1),
		new Yokai("Infour", 117, B, Mysterious, false, statFirstTotal[116], statEndTotal[116], Thunder, Earth, Thunder, 1),
		new Yokai("Mirapo", 118, C, Mysterious, false, statFirstTotal[117], statEndTotal[117], Thunder, Earth, Thunder, 1),
		new Yokai("Miradox", 119, A, Mysterious, false, statFirstTotal[118], statEndTotal[118], Thunder, Earth, Thunder, 1),
		new Yokai("Mircle", 120, A, Mysterious, false, statFirstTotal[119], statEndTotal[119], Thunder, Earth, Thunder, 1),
		new Yokai("Verygoodsir", 121, B, Mysterious, false, statFirstTotal[120], statEndTotal[120], Thunder, Earth, Thunder, 1),
		new Yokai("Statikid", 122, B, Mysterious, false, statFirstTotal[121], statEndTotal[121], Thunder, Earth, Thunder, 1),
		new Yokai("Prof. Plumage", 123, B, Mysterious, false, statFirstTotal[122], statEndTotal[122], Wind, Ice, Wind, 1),
		new Yokai("Throne Wiper", 124, B, Mysterious, false, statFirstTotal[123], statEndTotal[123], Fire, Water, Fire, 1),
		new Yokai("Imagenius", 125, B, Mysterious, false, statFirstTotal[124], statEndTotal[124], Wind, Ice, Wind, 1),
		new Yokai("Miss Teri", 126, B, Mysterious, false, statFirstTotal[125], statEndTotal[125], Ice, Fire, Ice, 1),
		new Yokai("Maginyan", 127, A, Mysterious, false, statFirstTotal[126], statEndTotal[126], Fire, Water, Fire, 1),
		new Yokai("Squandeer", 128, A, Mysterious, false, statFirstTotal[127], statEndTotal[127], Ice, Fire, Ice, 1),
		new Yokai("Tengu", 129, S, Mysterious, false, statFirstTotal[128], statEndTotal[128], Wind, Ice, Wind, 1),
		new Yokai("Flengu", 130, S, Mysterious, false, statFirstTotal[129], statEndTotal[129], Fire, Water, Fire, 1),
		new Yokai("Kyubi", 131, S, Mysterious, false, statFirstTotal[130], statEndTotal[130], Fire, Water, Fire, 1),
		new Yokai("Frostail", 132, S, Mysterious, false, statFirstTotal[131], statEndTotal[131], Ice, Fire, Ice, 1),
		new Yokai("Chymera", 133, S, Mysterious, false, statFirstTotal[132], statEndTotal[132], Thunder, Earth, Thunder, 1),
		new Yokai("Kingmera", 134, S, Mysterious, false, statFirstTotal[133], statEndTotal[133], Thunder, Earth, Thunder, 1),
		new Yokai("Toadal Demon", 135, S, Mysterious, false, statFirstTotal[134], statEndTotal[134], Wind, Ice, Wind, 1),
		new Yokai("Thurston", 136, S, Mysterious, false, statFirstTotal[135], statEndTotal[135], Fire, Water, Fire, 1),
		new Yokai("Spect-hare", 137, S, Mysterious, false, statFirstTotal[136], statEndTotal[136], Wind, Ice, Wind, 1),
		new Yokai("Sn. Spect-hare", 138, S, Mysterious, false, statFirstTotal[137], statEndTotal[137], Ice, Fire, Ice, 1),
		new Yokai("Oh Wheel", 139, E, Tough, false, statFirstTotal[138], statEndTotal[138], Fire, Water, Fire, 1),
		new Yokai("Dulluma", 140, E, Tough, false, statFirstTotal[139], statEndTotal[139], Earth, Wind, Earth, 1),
		new Yokai("Darumacho", 141, B, Tough, false, statFirstTotal[140], statEndTotal[140], Earth, Wind, Earth, 1),
		new Yokai("Goruma", 142, B, Tough, false, statFirstTotal[141], statEndTotal[141], Wind, Ice, Wind, 1),
		new Yokai("Wotchagot", 143, E, Tough, false, statFirstTotal[142], statEndTotal[142], Ice, Fire, Ice, 1),
		new Yokai("Pride Shrimp", 144, B, Tough, false, statFirstTotal[143], statEndTotal[143], Ice, Fire, Ice, 1),
		new Yokai("No-Go Kart", 145, E, Tough, false, statFirstTotal[144], statEndTotal[144], Earth, Wind, Earth, 1),
		new Yokai("Mistank", 146, B, Tough, false, statFirstTotal[145], statEndTotal[145], Earth, Wind, Earth, 1),
		new Yokai("Terrorpotta", 147, E, Tough, false, statFirstTotal[146], statEndTotal[146], Earth, Wind, Earth, 2),
		new Yokai("Blownhistoppa", 148, B, Tough, false, statFirstTotal[147], statEndTotal[147], Earth, Wind, Earth, 1),
		new Yokai("Noway", 149, E, Tough, false, statFirstTotal[148], statEndTotal[148], Earth, Wind, Earth, 1),
		new Yokai("Impass", 150, B, Tough, false, statFirstTotal[149], statEndTotal[149], Earth, Wind, Earth, 1),
		new Yokai("Walldin", 151, A, Tough, false, statFirstTotal[150], statEndTotal[150], Earth, Wind, Earth, 1),
		new Yokai("Roughraff", 152, E, Tough, false, statFirstTotal[151], statEndTotal[151], Earth, Wind, Earth, 1),
		new Yokai("Badude", 153, B, Tough, false, statFirstTotal[152], statEndTotal[152], Earth, Wind, Earth, 1),
		new Yokai("Bruff", 154, A, Tough, false, statFirstTotal[153], statEndTotal[153], Earth, Wind, Earth, 1),
		new Yokai("Roughgraff", 155, B, Tough, false, statFirstTotal[154], statEndTotal[154], Earth, Wind, Earth, 1),
		new Yokai("Chilled Cowcao", 156, E, Tough, false, statFirstTotal[155], statEndTotal[155], Earth, Wind, Earth, 1),
		new Yokai("Stircrazy Stu", 157, A, Tough, false, statFirstTotal[156], statEndTotal[156], Earth, Wind, Earth, 1),
		new Yokai("Nummskull", 158, E, Tough, false, statFirstTotal[157], statEndTotal[157], Earth, Wind, Earth, 1),
		new Yokai("Skillskull", 159, A, Tough, false, statFirstTotal[158], statEndTotal[158], Earth, Wind, Earth, 1),
		new Yokai("Armsman", 160, D, Tough, false, statFirstTotal[159], statEndTotal[159], Ice, Fire, Ice, 1),
		new Yokai("Mimikin", 161, D, Tough, false, statFirstTotal[160], statEndTotal[160], Ice, Fire, Ice, 1),
		new Yokai("Oh Bah Gah!", 162, D, Tough, false, statFirstTotal[161], statEndTotal[161], Thunder, Earth, Thunder, 1),
		new Yokai("Sp mountain", 163, D, Tough, false, statFirstTotal[162], statEndTotal[162], Earth, Wind, Earth, 1),
		new Yokai("Blowkade", 164, D, Tough, false, statFirstTotal[163], statEndTotal[163], Water, Thunder, Water, 1),
		new Yokai("Ledballoon", 165, C, Tough, false, statFirstTotal[164], statEndTotal[164], Water, Thunder, Water, 1),
		new Yokai("Sumodon", 166, D, Tough, false, statFirstTotal[165], statEndTotal[165], Water, Thunder, Water, 1),
		new Yokai("Yokozudon", 167, B, Tough, false, statFirstTotal[166], statEndTotal[166], Water, Thunder, Water, 1),
		new Yokai("Whateverest", 168, D, Tough, false, statFirstTotal[167], statEndTotal[167], Fire, Water, Fire, 1),
		new Yokai("Whatuption", 169, B, Tough, false, statFirstTotal[168], statEndTotal[168], Fire, Water, Fire, 1),
		new Yokai("Fidgephant", 170, D, Tough, false, statFirstTotal[169], statEndTotal[169], Water, Thunder, Water, 1),
		new Yokai("Touphant", 171, C, Tough, false, statFirstTotal[170], statEndTotal[170], Water, Thunder, Water, 1),
		new Yokai("Enduriphant", 172, A, Tough, false, statFirstTotal[171], statEndTotal[171], Water, Thunder, Water, 1),
		new Yokai("Zappary", 173, D, Tough, false, statFirstTotal[172], statEndTotal[172], Thunder, Earth, Thunder, 1),
		new Yokai("Frazzel", 174, A, Tough, false, statFirstTotal[173], statEndTotal[173], Thunder, Earth, Thunder, 1),
		new Yokai("Ship. Sailor", 175, D, Tough, false, statFirstTotal[174], statEndTotal[174], Water, Thunder, Water, 1),
		new Yokai("Adm. Admiral", 176, A, Tough, false, statFirstTotal[175], statEndTotal[175], Water, Thunder, Water, 1),
		new Yokai("Swelton", 177, C, Tough, false, statFirstTotal[176], statEndTotal[176], Fire, Water, Fire, 2),
		new Yokai("Sing Kong", 178, C, Tough, false, statFirstTotal[177], statEndTotal[177], Thunder, Earth, Thunder, 1),
		new Yokai("Slippy", 179, C, Tough, false, statFirstTotal[178], statEndTotal[178], Water, Thunder, Water, 1),
		new Yokai("Repossessor", 180, C, Tough, false, statFirstTotal[179], statEndTotal[179], Earth, Wind, Earth, 1),
		new Yokai("Mr. Blockhead", 181, C, Tough, false, statFirstTotal[180], statEndTotal[180], Fire, Water, Fire, 1),
		new Yokai("Mad Mountain", 182, C, Tough, false, statFirstTotal[181], statEndTotal[181], Ice, Fire, Ice, 1),
		new Yokai("Lava Lord", 183, B, Tough, false, statFirstTotal[182], statEndTotal[182], Thunder, Earth, Thunder, 1),
		new Yokai("Castelius III", 184, C, Tough, false, statFirstTotal[183], statEndTotal[183], Earth, Wind, Earth, 1),
		new Yokai("Castelius II", 185, B, Tough, false, statFirstTotal[184], statEndTotal[184], Ice, Fire, Ice, 1),
		new Yokai("Castelius I", 186, A, Tough, false, statFirstTotal[185], statEndTotal[185], Thunder, Earth, Thunder, 1),
		new Yokai("Castelius Max", 187, S, Tough, false, statFirstTotal[186], statEndTotal[186], Wind, Ice, Wind, 1),
		new Yokai("Puppynyan", 188, B, Tough, false, statFirstTotal[187], statEndTotal[187], Earth, Wind, Earth, 1),
		new Yokai("Rhinoggin", 189, B, Tough, false, statFirstTotal[188], statEndTotal[188], Earth, Wind, Earth, 1),
		new Yokai("Rhinormous", 190, A, Tough, false, statFirstTotal[189], statEndTotal[189], Earth, Wind, Earth, 1),
		new Yokai("Hornaplenty", 191, S, Tough, false, statFirstTotal[190], statEndTotal[190], Earth, Wind, Earth, 1),
		new Yokai("Kintaronyan", 192, A, Tough, false, statFirstTotal[191], statEndTotal[191], Earth, Wind, Earth, 1),
		new Yokai("Steaking", 193, A, Tough, false, statFirstTotal[192], statEndTotal[192], Fire, Water, Fire, 1),
		new Yokai("Robonyan", 194, A, Tough, false, statFirstTotal[193], statEndTotal[193], Ice, Fire, Ice, 1),
		new Yokai("Robonyan F", 195, A, Tough, false, statFirstTotal[194], statEndTotal[194], Fire, Water, Fire, 1),
		new Yokai("Showbonyan", 196, A, Tough, false, statFirstTotal[195], statEndTotal[195], Thunder, Earth, Thunder, 1),
		new Yokai("Goldenyan", 197, S, Tough, false, statFirstTotal[196], statEndTotal[196], Thunder, Earth, Thunder, 1),
		new Yokai("Dromp", 198, A, Tough, false, statFirstTotal[197], statEndTotal[197], Earth, Wind, Earth, 1),
		new Yokai("Swosh", 199, S, Tough, false, statFirstTotal[198], statEndTotal[198], Water, Thunder, Water, 1),
		new Yokai("Toadal Dude", 200, S, Tough, false, statFirstTotal[199], statEndTotal[199], Water, Thunder, Water, 1),
	};
}

private static Yokai[] medaillum_2() {
	return new Yokai[] {
		new Yokai("Uber Geeko", 201, S, Tough, false, statFirstTotal[200], statEndTotal[200], Fire, Water, Fire, 1),
		new Yokai("Gargaros", 202, S, Tough, false, statFirstTotal[201], statEndTotal[201], Fire, Water, Fire, 1),
		new Yokai("Ogralus", 203, S, Tough, false, statFirstTotal[202], statEndTotal[202], Water, Thunder, Water, 1),
		new Yokai("Orcanos", 204, S, Tough, false, statFirstTotal[203], statEndTotal[203], Earth, Wind, Earth, 1),
		new Yokai("Kabuking", 205, S, Tough, false, statFirstTotal[204], statEndTotal[204], Thunder, Earth, Thunder, 1),
		new Yokai("Jawsome Kid", 206, S, Tough, false, statFirstTotal[205], statEndTotal[205], Water, Thunder, Water, 1),
		new Yokai("El Sharkador", 207, S, Tough, false, statFirstTotal[206], statEndTotal[206], Water, Thunder, Water, 1),
		new Yokai("Silver Lining", 208, S, Tough, false, statFirstTotal[207], statEndTotal[207], Water, Thunder, Water, 1),
		new Yokai("Leggly", 209, E, Charming, false, statFirstTotal[208], statEndTotal[208], Fire, Water, Fire, 2),
		new Yokai("Twirly Pie", 210, E, Charming, false, statFirstTotal[209], statEndTotal[209], Thunder, Earth, Thunder, 1),
		new Yokai("Petty-Cake", 211, E, Charming, false, statFirstTotal[210], statEndTotal[210], Fire, Water, Fire, 1),
		new Yokai("Hoppy.", 212, E, Charming, false, statFirstTotal[211], statEndTotal[211], Wind, Ice, Wind, 1),
		new Yokai("Dazzabel", 213, E, Charming, false, statFirstTotal[212], statEndTotal[212], Fire, Water, Fire, 1),
		new Yokai("Rattelle", 214, C, Charming, false, statFirstTotal[213], statEndTotal[213], Fire, Water, Fire, 1),
		new Yokai("Skelebella", 215, B, Charming, false, statFirstTotal[214], statEndTotal[214], Water, Thunder, Water, 1),
		new Yokai("Cadin", 216, E, Charming, false, statFirstTotal[215], statEndTotal[215], Wind, Ice, Wind, 1),
		new Yokai("Cadable", 217, C, Charming, false, statFirstTotal[216], statEndTotal[216], Wind, Ice, Wind, 1),
		new Yokai("Singcada", 218, B, Charming, false, statFirstTotal[217], statEndTotal[217], Fire, Water, Fire, 1),
		new Yokai("Buttered Blue", 219, E, Charming, false, statFirstTotal[218], statEndTotal[218], Earth, Wind, Earth, 1),
		new Yokai("Pch. Baguette", 220, A, Charming, false, statFirstTotal[219], statEndTotal[219], Earth, Wind, Earth, 1),
		new Yokai("Pupsicle", 221, E, Charming, false, statFirstTotal[220], statEndTotal[220], Ice, Fire, Ice, 1),
		new Yokai("Chilhuahua", 222, A, Charming, false, statFirstTotal[221], statEndTotal[221], Ice, Fire, Ice, 1),
		new Yokai("Swelterrier", 223, S, Charming, false, statFirstTotal[222], statEndTotal[222], Fire, Water, Fire, 1),
		new Yokai("Unbelievaboy!", 224, E, Charming, false, statFirstTotal[223], statEndTotal[223], Fire, Water, Fire, 1),
		new Yokai("Unbearaboy!", 225, S, Charming, false, statFirstTotal[224], statEndTotal[224], Fire, Water, Fire, 1),
		new Yokai("Inflammaboy!", 226, S, Charming, false, statFirstTotal[225], statEndTotal[225], Fire, Water, Fire, 1),
		new Yokai("Jumbelina", 227, D, Charming, false, statFirstTotal[226], statEndTotal[226], Ice, Fire, Ice, 1),
		new Yokai("Boyclops", 228, D, Charming, false, statFirstTotal[227], statEndTotal[227], Ice, Fire, Ice, 2),
		new Yokai("Krystal Fox", 229, D, Charming, false, statFirstTotal[228], statEndTotal[228], Fire, Water, Fire, 1),
		new Yokai("Runsure", 230, D, Charming, false, statFirstTotal[229], statEndTotal[229], Wind, Ice, Wind, 1),
		new Yokai("Kittylumbus", 231, D, Charming, false, statFirstTotal[230], statEndTotal[230], Water, Thunder, Water, 1),
		new Yokai("Zest-a-Minute", 232, D, Charming, false, statFirstTotal[231], statEndTotal[231], Water, Thunder, Water, 1),
		new Yokai("Baku", 233, D, Charming, false, statFirstTotal[232], statEndTotal[232], Thunder, Earth, Thunder, 1),
		new Yokai("Whapir", 234, C, Charming, false, statFirstTotal[233], statEndTotal[233], Fire, Water, Fire, 1),
		new Yokai("Bakulia", 235, B, Charming, false, statFirstTotal[234], statEndTotal[234], Thunder, Earth, Thunder, 1),
		new Yokai("Panja Pupil", 236, D, Charming, false, statFirstTotal[235], statEndTotal[235], Ice, Fire, Ice, 1),
		new Yokai("Panja Pro", 237, B, Charming, false, statFirstTotal[236], statEndTotal[236], Ice, Fire, Ice, 1),
		new Yokai("Cue-Tee", 238, D, Charming, false, statFirstTotal[237], statEndTotal[237], Fire, Water, Fire, 1),
		new Yokai("Demandi", 239, B, Charming, false, statFirstTotal[238], statEndTotal[238], Fire, Water, Fire, 1),
		new Yokai("Walkappa", 240, D, Charming, false, statFirstTotal[239], statEndTotal[239], Water, Thunder, Water, 1),
		new Yokai("Appak", 241, A, Charming, false, statFirstTotal[240], statEndTotal[240], Water, Thunder, Water, 1),
		new Yokai("Supyo", 242, A, Charming, false, statFirstTotal[241], statEndTotal[241], Water, Thunder, Water, 1),
		new Yokai("Jibanyan", 243, D, Charming, false, statFirstTotal[242], statEndTotal[242], Fire, Water, Fire, 1),
		new Yokai("Jibanyan B", 244, B, Charming, false, statFirstTotal[243], statEndTotal[243], Fire, Water, Fire, 1),
		new Yokai("Jibanyan S", 245, S, Charming, false, statFirstTotal[244], statEndTotal[244], Fire, Water, Fire, 1),
		new Yokai("Jiban. Liu Bei", 246, S, Charming, false, statFirstTotal[245], statEndTotal[245], Fire, Water, Fire, 1),
		new Yokai("Rudy", 247, C, Charming, false, statFirstTotal[246], statEndTotal[246], Fire, Water, Fire, 1),
		new Yokai("Thornyan", 248, B, Charming, false, statFirstTotal[247], statEndTotal[247], Wind, Ice, Wind, 1),
		new Yokai("Baddinyan", 249, B, Charming, false, statFirstTotal[248], statEndTotal[248], Fire, Water, Fire, 1),
		new Yokai("Buchinyan", 250, A, Charming, false, statFirstTotal[249], statEndTotal[249], Thunder, Earth, Thunder, 1),
		new Yokai("Komasan", 251, D, Charming, false, statFirstTotal[250], statEndTotal[250], Fire, Water, Fire, 1),
		new Yokai("Komane", 252, A, Charming, false, statFirstTotal[251], statEndTotal[251], Fire, Water, Fire, 1),
		new Yokai("Komasan B", 253, B, Charming, false, statFirstTotal[252], statEndTotal[252], Fire, Water, Fire, 1),
		new Yokai("Komasan S", 254, S, Charming, false, statFirstTotal[253], statEndTotal[253], Fire, Water, Fire, 1),
		new Yokai("Koma. Sun Ce", 255, S, Charming, false, statFirstTotal[254], statEndTotal[254], Fire, Water, Fire, 1),
		new Yokai("Jibakoma", 256, A, Charming, false, statFirstTotal[255], statEndTotal[255], Fire, Water, Fire, 1),
		new Yokai("Komajiro", 257, D, Charming, false, statFirstTotal[256], statEndTotal[256], Thunder, Earth, Thunder, 1),
		new Yokai("Komiger", 258, A, Charming, false, statFirstTotal[257], statEndTotal[257], Thunder, Earth, Thunder, 1),
		new Yokai("Komajiro S", 259, S, Charming, false, statFirstTotal[258], statEndTotal[258], Thunder, Earth, Thunder, 1),
		new Yokai("Drizzelda", 260, C, Charming, false, statFirstTotal[259], statEndTotal[259], Water, Thunder, Water, 1),
		new Yokai("Nekidspeed", 261, C, Charming, false, statFirstTotal[260], statEndTotal[260], Ice, Fire, Ice, 1),
		new Yokai("Stinkeye", 262, C, Charming, false, statFirstTotal[261], statEndTotal[261], Ice, Fire, Ice, 1),
		new Yokai("Slackoon", 263, C, Charming, false, statFirstTotal[262], statEndTotal[262], Water, Thunder, Water, 1),
		new Yokai("Puppiccino", 264, C, Charming, false, statFirstTotal[263], statEndTotal[263], Ice, Fire, Ice, 1),
		new Yokai("Ballin", 265, C, Charming, false, statFirstTotal[264], statEndTotal[264], Wind, Ice, Wind, 1),
		new Yokai("Shmoopie", 266, C, Charming, false, statFirstTotal[265], statEndTotal[265], Water, Thunder, Water, 1),
		new Yokai("Pinkipoo", 267, B, Charming, false, statFirstTotal[266], statEndTotal[266], Water, Thunder, Water, 1),
		new Yokai("Pookivil", 268, A, Charming, false, statFirstTotal[267], statEndTotal[267], Water, Thunder, Water, 1),
		new Yokai("Harry Barry", 269, B, Charming, false, statFirstTotal[268], statEndTotal[268], Fire, Fire, Fire, 1),
		new Yokai("Wondernyan", 270, B, Charming, false, statFirstTotal[269], statEndTotal[269], Water, Thunder, Water, 1),
		new Yokai("Jetnyan", 271, B, Charming, false, statFirstTotal[270], statEndTotal[270], Wind, Ice, Wind, 1),
		new Yokai("Chimpanyan", 272, B, Charming, false, statFirstTotal[271], statEndTotal[271], Thunder, Earth, Thunder, 1),
		new Yokai("Tomnyan", 273, B, Charming, false, statFirstTotal[272], statEndTotal[272], Fire, Water, Fire, 1),
		new Yokai("Koma Knomads", 274, B, Charming, false, statFirstTotal[273], statEndTotal[273], Fire, Water, Fire, 1),
		new Yokai("Frostina", 275, B, Charming, false, statFirstTotal[274], statEndTotal[274], Ice, Fire, Ice, 1),
		new Yokai("Blizzaria", 276, S, Charming, false, statFirstTotal[275], statEndTotal[275], Ice, Fire, Ice, 1),
		new Yokai("Damona", 277, S, Charming, false, statFirstTotal[276], statEndTotal[276], Ice, Fire, Ice, 1),
		new Yokai("Melonyan", 278, A, Charming, false, statFirstTotal[277], statEndTotal[277], Ice, Fire, Ice, 1),
		new Yokai("Oranyan", 279, B, Charming, false, statFirstTotal[278], statEndTotal[278], Thunder, Earth, Thunder, 1),
		new Yokai("Kiwinyan", 280, B, Charming, false, statFirstTotal[279], statEndTotal[279], Earth, Wind, Earth, 1),
		new Yokai("Grapenyan", 281, B, Charming, false, statFirstTotal[280], statEndTotal[280], Water, Thunder, Water, 1),
		new Yokai("Strawbnyan", 282, B, Charming, false, statFirstTotal[281], statEndTotal[281], Fire, Water, Fire, 1),
		new Yokai("Watermelnyan", 283, A, Charming, false, statFirstTotal[282], statEndTotal[282], Wind, Ice, Wind, 1),
		new Yokai("Sapphinyan", 284, A, Charming, false, statFirstTotal[283], statEndTotal[283], Water, Thunder, Water, 1),
		new Yokai("Emenyan", 285, A, Charming, false, statFirstTotal[284], statEndTotal[284], Fire, Fire, Fire, 1),
		new Yokai("Rubinyan", 286, A, Charming, false, statFirstTotal[285], statEndTotal[285], Fire, Water, Fire, 1),
		new Yokai("Topanyan", 287, A, Charming, false, statFirstTotal[286], statEndTotal[286], Thunder, Earth, Thunder, 1),
		new Yokai("Dianyan", 288, A, Charming, false, statFirstTotal[287], statEndTotal[287], Ice, Fire, Ice, 1),
		new Yokai("Robokapp", 289, A, Charming, false, statFirstTotal[288], statEndTotal[288], Water, Thunder, Water, 1),
		new Yokai("Robokoma", 290, A, Charming, false, statFirstTotal[289], statEndTotal[289], Fire, Water, Fire, 1),
		new Yokai("Sailornyan", 291, A, Charming, false, statFirstTotal[290], statEndTotal[290], Ice, Fire, Ice, 1),
		new Yokai("Rubeus J", 292, A, Charming, false, statFirstTotal[291], statEndTotal[291], Fire, Water, Fire, 1),
		new Yokai("Hardy Hound", 293, A, Charming, false, statFirstTotal[292], statEndTotal[292], Ice, Fire, Ice, 1),
		new Yokai("Whirlweasel", 294, A, Charming, false, statFirstTotal[293], statEndTotal[293], Wind, Ice, Wind, 1),
		new Yokai("Chocobonyan", 295, A, Charming, false, statFirstTotal[294], statEndTotal[294], Wind, Ice, Wind, 1),
		new Yokai("Mooglenyan", 296, A, Charming, false, statFirstTotal[295], statEndTotal[295], Wind, Ice, Wind, 1),
		new Yokai("Wobblenyan", 297, A, Charming, false, statFirstTotal[296], statEndTotal[296], Water, Thunder, Water, 1),
		new Yokai("Wibblekoma", 298, A, Charming, false, statFirstTotal[297], statEndTotal[297], Wind, Ice, Wind, 1),
		new Yokai("Sushinyan", 299, A, Charming, false, statFirstTotal[298], statEndTotal[298], Fire, Water, Fire, 1),
		new Yokai("Tempurasan", 300, A, Charming, false, statFirstTotal[299], statEndTotal[299], Fire, Water, Fire, 1),
	};
}

private static Yokai[] medaillum_3() {
	return new Yokai[] {
		new Yokai("Faux Kappa", 301, A, Charming, false, statFirstTotal[300], statEndTotal[300], Water, Thunder, Water, 1),
		new Yokai("Tigappa", 302, S, Charming, false, statFirstTotal[301], statEndTotal[301], Water, Thunder, Water, 1),
		new Yokai("Master Nyada", 303, S, Charming, false, statFirstTotal[302], statEndTotal[302], Wind, Ice, Wind, 1),
		new Yokai("Tenguriginal", 304, S, Charming, false, statFirstTotal[303], statEndTotal[303], Wind, Ice, Wind, 1),
		new Yokai("Tengulightened", 305, S, Charming, false, statFirstTotal[304], statEndTotal[304], Fire, Water, Fire, 1),
		new Yokai("Pallysol", 306, E, Heartful, false, statFirstTotal[305], statEndTotal[305], Wind, Ice, Wind, 1),
		new Yokai("Bumblejack", 307, E, Heartful, false, statFirstTotal[306], statEndTotal[306], Earth, Wind, Earth, 1),
		new Yokai("In-Tune", 308, E, Heartful, false, statFirstTotal[307], statEndTotal[307], Ice, Fire, Ice, 1),
		new Yokai("Wantston", 309, E, Heartful, false, statFirstTotal[308], statEndTotal[308], Thunder, Earth, Thunder, 1),
		new Yokai("Grubsnitch", 310, D, Heartful, false, statFirstTotal[309], statEndTotal[309], Earth, Wind, Earth, 1),
		new Yokai("Wiglin", 311, E, Heartful, false, statFirstTotal[310], statEndTotal[310], Water, Thunder, Water, 1),
		new Yokai("Kelpacabana", 312, C, Heartful, false, statFirstTotal[311], statEndTotal[311], Wind, Ice, Wind, 1),
		new Yokai("Steppa", 313, E, Heartful, false, statFirstTotal[312], statEndTotal[312], Ice, Fire, Ice, 1),
		new Yokai("Rhyth", 314, D, Heartful, false, statFirstTotal[313], statEndTotal[313], Thunder, Earth, Thunder, 1),
		new Yokai("Seaweed Sns.", 315, C, Heartful, false, statFirstTotal[314], statEndTotal[314], Earth, Wind, Earth, 1),
		new Yokai("Hungramps", 316, E, Heartful, false, statFirstTotal[315], statEndTotal[315], Earth, Wind, Earth, 1),
		new Yokai("Hungorge", 317, B, Heartful, false, statFirstTotal[316], statEndTotal[316], Earth, Wind, Earth, 1),
		new Yokai("Grainpa", 318, B, Heartful, false, statFirstTotal[317], statEndTotal[317], Earth, Wind, Earth, 1),
		new Yokai("Supersize G.", 319, B, Heartful, false, statFirstTotal[318], statEndTotal[318], Earth, Wind, Earth, 1),
		new Yokai("Tongus", 320, E, Heartful, false, statFirstTotal[319], statEndTotal[319], Ice, Fire, Ice, 1),
		new Yokai("Nurse Tongus", 321, B, Heartful, false, statFirstTotal[320], statEndTotal[320], Ice, Fire, Ice, 1),
		new Yokai("Sandmeh", 322, E, Heartful, false, statFirstTotal[321], statEndTotal[321], Fire, Water, Fire, 1),
		new Yokai("Mr. Sandmeh", 323, B, Heartful, false, statFirstTotal[322], statEndTotal[322], Fire, Water, Fire, 1),
		new Yokai("Lil Blue Hood", 324, E, Heartful, false, statFirstTotal[323], statEndTotal[323], Water, Thunder, Water, 1),
		new Yokai("Bubble Beth", 325, A, Heartful, false, statFirstTotal[324], statEndTotal[324], Water, Thunder, Water, 1),
		new Yokai("Afronaut", 326, D, Heartful, false, statFirstTotal[325], statEndTotal[325], Ice, Fire, Ice, 1),
		new Yokai("Cereal Spiller", 327, D, Heartful, false, statFirstTotal[326], statEndTotal[326], Earth, Wind, Earth, 1),
		new Yokai("Tomorrow Gal", 328, D, Heartful, false, statFirstTotal[327], statEndTotal[327], Fire, Water, Fire, 1),
		new Yokai("Swaycorn", 329, D, Heartful, false, statFirstTotal[328], statEndTotal[328], Earth, Wind, Earth, 1),
		new Yokai("Push Pup", 330, D, Heartful, false, statFirstTotal[329], statEndTotal[329], Ice, Fire, Ice, 1),
		new Yokai("Happycane", 331, D, Heartful, false, statFirstTotal[330], statEndTotal[330], Wind, Ice, Wind, 1),
		new Yokai("Starrycane", 332, B, Heartful, false, statFirstTotal[331], statEndTotal[331], Wind, Ice, Wind, 1),
		new Yokai("Lodo", 333, D, Heartful, false, statFirstTotal[332], statEndTotal[332], Wind, Ice, Wind, 1),
		new Yokai("Supoor Hero", 334, A, Heartful, false, statFirstTotal[333], statEndTotal[333], Wind, Ice, Wind, 1),
		new Yokai("Chippa", 335, C, Heartful, false, statFirstTotal[334], statEndTotal[334], Water, Thunder, Water, 1),
		new Yokai("Gnomey", 336, D, Heartful, false, statFirstTotal[335], statEndTotal[335], Ice, Fire, Ice, 1),
		new Yokai("High Gnomey", 337, A, Heartful, false, statFirstTotal[336], statEndTotal[336], Ice, Fire, Ice, 1),
		new Yokai("Enerfly", 338, D, Heartful, false, statFirstTotal[337], statEndTotal[337], Water, Thunder, Water, 1),
		new Yokai("Enefly", 339, D, Heartful, false, statFirstTotal[338], statEndTotal[338], Thunder, Earth, Thunder, 1),
		new Yokai("Betterfly", 340, A, Heartful, false, statFirstTotal[339], statEndTotal[339], Wind, Ice, Wind, 1),
		new Yokai("Peppillon", 341, S, Heartful, false, statFirstTotal[340], statEndTotal[340], Thunder, Earth, Thunder, 1),
		new Yokai("Predictabull", 342, D, Heartful, false, statFirstTotal[341], statEndTotal[341], Fire, Water, Fire, 1),
		new Yokai("Smashibull", 343, S, Heartful, false, statFirstTotal[342], statEndTotal[342], Fire, Water, Fire, 1),
		new Yokai("DON-CHAN", 344, C, Heartful, false, statFirstTotal[343], statEndTotal[343], Earth, Wind, Earth, 1),
		new Yokai("Ray O'Light", 345, C, Heartful, false, statFirstTotal[344], statEndTotal[344], Fire, Water, Fire, 1),
		new Yokai("Ol' Saint Trick", 346, C, Heartful, false, statFirstTotal[345], statEndTotal[345], Wind, Ice, Wind, 1),
		new Yokai("Ol' Fortune", 347, C, Heartful, false, statFirstTotal[346], statEndTotal[346], Thunder, Earth, Thunder, 1),
		new Yokai("Ponderoo", 348, C, Heartful, false, statFirstTotal[347], statEndTotal[347], Water, Thunder, Water, 1),
		new Yokai("Tongue-Twister", 349, C, Heartful, false, statFirstTotal[348], statEndTotal[348], Fire, Water, Fire, 1),
		new Yokai("Lazy Sundae", 350, C, Heartful, false, statFirstTotal[349], statEndTotal[349], Ice, Fire, Ice, 1),
		new Yokai("Got It Maid", 351, C, Heartful, false, statFirstTotal[350], statEndTotal[350], Wind, Ice, Wind, 1),
		new Yokai("Greengramps", 352, C, Heartful, false, statFirstTotal[351], statEndTotal[351], Earth, Wind, Earth, 1),
		new Yokai("Right Brothers", 353, C, Heartful, false, statFirstTotal[352], statEndTotal[352], Water, Thunder, Water, 1),
		new Yokai("Tattlecakes", 354, C, Heartful, false, statFirstTotal[353], statEndTotal[353], Ice, Fire, Ice, 1),
		new Yokai("Happierre", 355, C, Heartful, false, statFirstTotal[354], statEndTotal[354], Thunder, Earth, Thunder, 1),
		new Yokai("Reversa", 356, A, Heartful, false, statFirstTotal[355], statEndTotal[355], Thunder, Earth, Thunder, 1),
		new Yokai("Reversette", 357, A, Heartful, false, statFirstTotal[356], statEndTotal[356], Wind, Ice, Wind, 1),
		new Yokai("Pheasanyan", 358, B, Heartful, false, statFirstTotal[357], statEndTotal[357], Wind, Ice, Wind, 1),
		new Yokai("Fundango", 359, B, Heartful, false, statFirstTotal[358], statEndTotal[358], Fire, Water, Fire, 1),
		new Yokai("Pearly White", 360, B, Heartful, false, statFirstTotal[359], statEndTotal[359], Water, Thunder, Water, 1),
		new Yokai("Robogramps", 361, B, Heartful, false, statFirstTotal[360], statEndTotal[360], Water, Thunder, Water, 1),
		new Yokai("Rollen", 362, B, Heartful, false, statFirstTotal[361], statEndTotal[361], Water, Thunder, Water, 1),
		new Yokai("Dubbles", 363, A, Heartful, false, statFirstTotal[362], statEndTotal[362], Water, Thunder, Water, 1),
		new Yokai("Scarasol", 364, A, Heartful, false, statFirstTotal[363], statEndTotal[363], Earth, Wind, Earth, 1),
		new Yokai("Odysseynyan", 365, A, Heartful, false, statFirstTotal[364], statEndTotal[364], Water, Thunder, Water, 1),
		new Yokai("Ghostess", 366, A, Heartful, false, statFirstTotal[365], statEndTotal[365], Wind, Ice, Wind, 1),
		new Yokai("Papa Bolt", 367, A, Heartful, false, statFirstTotal[366], statEndTotal[366], Thunder, Earth, Thunder, 1),
		new Yokai("Uncle Infinite", 368, S, Heartful, false, statFirstTotal[367], statEndTotal[367], Thunder, Earth, Thunder, 1),
		new Yokai("Mama Aura", 369, A, Heartful, false, statFirstTotal[368], statEndTotal[368], Wind, Ice, Wind, 1),
		new Yokai("Auntie Heart", 370, S, Heartful, false, statFirstTotal[369], statEndTotal[369], Wind, Ice, Wind, 1),
		new Yokai("Kyryn", 371, S, Heartful, false, statFirstTotal[370], statEndTotal[370], Thunder, Earth, Thunder, 1),
		new Yokai("Unikirin", 372, S, Heartful, false, statFirstTotal[371], statEndTotal[371], Ice, Fire, Ice, 1),
		new Yokai("Double Time", 373, S, Heartful, false, statFirstTotal[372], statEndTotal[372], Wind, Ice, Wind, 1),
		new Yokai("Sonic Bam", 374, S, Heartful, false, statFirstTotal[373], statEndTotal[373], Wind, Ice, Wind, 1),
		new Yokai("Neggplant", 375, E, Shady, false, statFirstTotal[374], statEndTotal[374], Earth, Wind, Earth, 1),
		new Yokai("Snitchin", 376, E, Shady, false, statFirstTotal[375], statEndTotal[375], Earth, Wind, Earth, 1),
		new Yokai("Messyrai", 377, E, Shady, false, statFirstTotal[376], statEndTotal[376], Fire, Water, Fire, 1),
		new Yokai("Leadoni", 378, E, Shady, false, statFirstTotal[377], statEndTotal[377], Ice, Fire, Ice, 2),
		new Yokai("Mynimo", 379, D, Shady, false, statFirstTotal[378], statEndTotal[378], Ice, Fire, Ice, 1),
		new Yokai("Ake", 380, E, Shady, false, statFirstTotal[379], statEndTotal[379], Earth, Wind, Earth, 1),
		new Yokai("Payn", 381, C, Shady, false, statFirstTotal[380], statEndTotal[380], Earth, Wind, Earth, 1),
		new Yokai("Agon", 382, B, Shady, false, statFirstTotal[381], statEndTotal[381], Earth, Wind, Earth, 1),
		new Yokai("Herbiboy", 383, E, Shady, false, statFirstTotal[382], statEndTotal[382], Water, Thunder, Water, 1),
		new Yokai("Carniboy", 384, B, Shady, false, statFirstTotal[383], statEndTotal[383], Fire, Water, Fire, 1),
		new Yokai("Wydeawake", 385, E, Shady, false, statFirstTotal[384], statEndTotal[384], Thunder, Earth, Thunder, 1),
		new Yokai("Allnyta", 386, B, Shady, false, statFirstTotal[385], statEndTotal[385], Thunder, Earth, Thunder, 1),
		new Yokai("Treetter", 387, E, Shady, false, statFirstTotal[386], statEndTotal[386], Earth, Wind, Earth, 1),
		new Yokai("Retreeter", 388, B, Shady, false, statFirstTotal[387], statEndTotal[387], Earth, Wind, Earth, 1),
		new Yokai("Negatibuzz", 389, E, Shady, false, statFirstTotal[388], statEndTotal[388], Wind, Ice, Wind, 1),
		new Yokai("Moskevil", 390, C, Shady, false, statFirstTotal[389], statEndTotal[389], Wind, Ice, Wind, 1),
		new Yokai("Scritchy", 391, A, Shady, false, statFirstTotal[390], statEndTotal[390], Thunder, Earth, Thunder, 1),
		new Yokai("Dimmy", 392, E, Shady, false, statFirstTotal[391], statEndTotal[391], Wind, Ice, Wind, 1),
		new Yokai("Blandon", 393, B, Shady, false, statFirstTotal[392], statEndTotal[392], Wind, Ice, Wind, 1),
		new Yokai("Nul", 394, A, Shady, false, statFirstTotal[393], statEndTotal[393], Wind, Ice, Wind, 1),
		new Yokai("Salty Bacon", 395, D, Shady, false, statFirstTotal[394], statEndTotal[394], Fire, Water, Fire, 1),
		new Yokai("Suspicioni", 396, D, Shady, false, statFirstTotal[395], statEndTotal[395], Water, Thunder, Water, 2),
		new Yokai("Tantroni", 397, D, Shady, false, statFirstTotal[396], statEndTotal[396], Fire, Water, Fire, 2),
		new Yokai("Contrarioni", 398, B, Shady, false, statFirstTotal[397], statEndTotal[397], Thunder, Earth, Thunder, 1),
		new Yokai("Grumpus Khan", 399, D, Shady, false, statFirstTotal[398], statEndTotal[398], Wind, Ice, Wind, 1),
		new Yokai("Groupus Khan", 400, B, Shady, false, statFirstTotal[399], statEndTotal[399], Wind, Ice, Wind, 1),
	};
}

private static Yokai[] medaillum_4() {
	return new Yokai[] {
		new Yokai("Hidabat", 401, D, Shady, false, statFirstTotal[400], statEndTotal[400], Wind, Ice, Wind, 1),
		new Yokai("Abodabat", 402, A, Shady, false, statFirstTotal[401], statEndTotal[401], Wind, Ice, Wind, 1),
		new Yokai("Belfree", 403, A, Shady, false, statFirstTotal[402], statEndTotal[402], Wind, Ice, Wind, 1),
		new Yokai("Yoink", 404, D, Shady, false, statFirstTotal[403], statEndTotal[403], Water, Thunder, Water, 1),
		new Yokai("Gimme", 405, A, Shady, false, statFirstTotal[404], statEndTotal[404], Water, Thunder, Water, 1),
		new Yokai("Indexter", 406, D, Shady, false, statFirstTotal[405], statEndTotal[405], Ice, Fire, Ice, 1),
		new Yokai("Hack King", 407, A, Shady, false, statFirstTotal[406], statEndTotal[406], Ice, Fire, Ice, 1),
		new Yokai("Yoodooit", 408, C, Shady, false, statFirstTotal[407], statEndTotal[407], Thunder, Earth, Thunder, 1),
		new Yokai("Count Zapaway", 409, C, Shady, false, statFirstTotal[408], statEndTotal[408], Ice, Fire, Ice, 1),
		new Yokai("Tyrat", 410, C, Shady, false, statFirstTotal[409], statEndTotal[409], Earth, Wind, Earth, 2),
		new Yokai("DisliKing", 411, C, Shady, false, statFirstTotal[410], statEndTotal[410], Ice, Fire, Ice, 1),
		new Yokai("Crook-a-doodle", 412, C, Shady, false, statFirstTotal[411], statEndTotal[411], Earth, Wind, Earth, 1),
		new Yokai("Rocky Badboya", 413, C, Shady, false, statFirstTotal[412], statEndTotal[412], Ice, Fire, Ice, 1),
		new Yokai("Injurnalist", 414, C, Shady, false, statFirstTotal[413], statEndTotal[413], Wind, Ice, Wind, 1),
		new Yokai("Misterr Typoo", 415, C, Shady, false, statFirstTotal[414], statEndTotal[414], Ice, Fire, Ice, 1),
		new Yokai("Tengloom", 416, C, Shady, false, statFirstTotal[415], statEndTotal[415], Wind, Ice, Wind, 1),
		new Yokai("Nird", 417, B, Shady, false, statFirstTotal[416], statEndTotal[416], Wind, Ice, Wind, 1),
		new Yokai("K'mon-K'mon", 418, C, Shady, false, statFirstTotal[417], statEndTotal[417], Wind, Ice, Wind, 1),
		new Yokai("Snobetty", 419, B, Shady, false, statFirstTotal[418], statEndTotal[418], Ice, Fire, Ice, 1),
		new Yokai("Dracunyan", 420, B, Shady, false, statFirstTotal[419], statEndTotal[419], Ice, Fire, Ice, 1),
		new Yokai("Lil Kappa", 421, B, Shady, false, statFirstTotal[420], statEndTotal[420], Water, Thunder, Water, 1),
		new Yokai("Horizontail", 422, B, Shady, false, statFirstTotal[421], statEndTotal[421], Thunder, Earth, Thunder, 1),
		new Yokai("Usapyon", 423, B, Shady, false, statFirstTotal[422], statEndTotal[422], Ice, Fire, Ice, 1),
		new Yokai("Usapyon Foot.", 424, B, Shady, false, statFirstTotal[423], statEndTotal[423], Thunder, Earth, Thunder, 1),
		new Yokai("Usapyon Scub.", 425, B, Shady, false, statFirstTotal[424], statEndTotal[424], Water, Thunder, Water, 1),
		new Yokai("Usapyon G.I.", 426, B, Shady, false, statFirstTotal[425], statEndTotal[425], Earth, Wind, Earth, 1),
		new Yokai("Usapyon Race.", 427, B, Shady, false, statFirstTotal[426], statEndTotal[426], Wind, Ice, Wind, 1),
		new Yokai("Usapyon B", 428, B, Shady, false, statFirstTotal[427], statEndTotal[427], Ice, Fire, Ice, 1),
		new Yokai("Usa. Zhongda", 429, S, Shady, false, statFirstTotal[428], statEndTotal[428], Ice, Fire, Ice, 1),
		new Yokai("Slimamander", 430, A, Shady, false, statFirstTotal[429], statEndTotal[429], Fire, Water, Fire, 1),
		new Yokai("Negasus", 431, A, Shady, false, statFirstTotal[430], statEndTotal[430], Wind, Ice, Wind, 1),
		new Yokai("Neighfarious", 432, A, Shady, false, statFirstTotal[431], statEndTotal[431], Thunder, Earth, Thunder, 1),
		new Yokai("Gutsy Bones", 433, A, Shady, false, statFirstTotal[432], statEndTotal[432], Wind, Ice, Wind, 1),
		new Yokai("Timidevil", 434, A, Shady, false, statFirstTotal[433], statEndTotal[433], Fire, Water, Fire, 1),
		new Yokai("Beelzebold", 435, S, Shady, false, statFirstTotal[434], statEndTotal[434], Fire, Water, Fire, 1),
		new Yokai("Count Cavity", 436, S, Shady, false, statFirstTotal[435], statEndTotal[435], Fire, Water, Fire, 1),
		new Yokai("Eyesoar", 437, A, Shady, false, statFirstTotal[436], statEndTotal[436], Earth, Wind, Earth, 1),
		new Yokai("Eyellure", 438, S, Shady, false, statFirstTotal[437], statEndTotal[437], Thunder, Earth, Thunder, 1),
		new Yokai("Greesel", 439, A, Shady, false, statFirstTotal[438], statEndTotal[438], Fire, Water, Fire, 1),
		new Yokai("Awevil", 440, S, Shady, false, statFirstTotal[439], statEndTotal[439], Water, Thunder, Water, 1),
		new Yokai("Wobblewok", 441, S, Shady, false, statFirstTotal[440], statEndTotal[440], Earth, Wind, Earth, 1),
		new Yokai("Darkyubi", 442, S, Shady, false, statFirstTotal[441], statEndTotal[441], Wind, Ice, Wind, 1),
		new Yokai("Dr. E. Raser", 443, S, Shady, false, statFirstTotal[442], statEndTotal[442], Fire, Water, Fire, 1),
		new Yokai("Dr. Nocturne", 444, S, Shady, false, statFirstTotal[443], statEndTotal[443], Fire, Water, Fire, 1),
		new Yokai("Tut 'n' K'mon", 445, S, Shady, false, statFirstTotal[444], statEndTotal[444], Wind, Ice, Wind, 1),
		new Yokai("Tie-red", 446, E, Eerie, false, statFirstTotal[445], statEndTotal[445], Fire, Water, Fire, 1),
		new Yokai("Love-Torn", 447, E, Eerie, false, statFirstTotal[446], statEndTotal[446], Wind, Ice, Wind, 1),
		new Yokai("Shakey", 448, E, Eerie, false, statFirstTotal[447], statEndTotal[447], Thunder, Earth, Thunder, 1),
		new Yokai("Quagmira", 449, E, Eerie, false, statFirstTotal[448], statEndTotal[448], Ice, Fire, Ice, 1),
		new Yokai("Coughkoff", 450, E, Eerie, false, statFirstTotal[449], statEndTotal[449], Water, Thunder, Water, 1),
		new Yokai("Hurchin", 451, D, Eerie, false, statFirstTotal[450], statEndTotal[450], Ice, Fire, Ice, 1),
		new Yokai("Droplette", 452, E, Eerie, false, statFirstTotal[451], statEndTotal[451], Water, Thunder, Water, 1),
		new Yokai("Drizzle", 453, B, Eerie, false, statFirstTotal[452], statEndTotal[452], Water, Thunder, Water, 1),
		new Yokai("Slush", 454, E, Eerie, false, statFirstTotal[453], statEndTotal[453], Ice, Fire, Ice, 1),
		new Yokai("Alhail", 455, B, Eerie, false, statFirstTotal[454], statEndTotal[454], Ice, Fire, Ice, 1),
		new Yokai("Gush", 456, D, Eerie, false, statFirstTotal[455], statEndTotal[455], Fire, Water, Fire, 1),
		new Yokai("Peckpocket", 457, E, Eerie, false, statFirstTotal[456], statEndTotal[456], Ice, Fire, Ice, 1),
		new Yokai("Robbinyu", 458, B, Eerie, false, statFirstTotal[457], statEndTotal[457], Ice, Fire, Ice, 1),
		new Yokai("Rockabelly", 459, D, Eerie, false, statFirstTotal[458], statEndTotal[458], Thunder, Earth, Thunder, 1),
		new Yokai("Squeeky", 460, E, Eerie, false, statFirstTotal[459], statEndTotal[459], Ice, Fire, Ice, 1),
		new Yokai("Rawry", 461, B, Eerie, false, statFirstTotal[460], statEndTotal[460], Ice, Fire, Ice, 1),
		new Yokai("Buhu", 462, E, Eerie, false, statFirstTotal[461], statEndTotal[461], Wind, Ice, Wind, 2),
		new Yokai("Flumpy", 463, C, Eerie, false, statFirstTotal[462], statEndTotal[462], Wind, Ice, Wind, 1),
		new Yokai("Skreek", 464, A, Eerie, false, statFirstTotal[463], statEndTotal[463], Wind, Ice, Wind, 1),
		new Yokai("Manjimutt", 465, E, Eerie, false, statFirstTotal[464], statEndTotal[464], Fire, Water, Fire, 1),
		new Yokai("Multimutt", 466, B, Eerie, false, statFirstTotal[465], statEndTotal[465], Fire, Water, Fire, 1),
		new Yokai("Sir Berus", 467, A, Eerie, false, statFirstTotal[466], statEndTotal[466], Earth, Wind, Earth, 1),
		new Yokai("Furgus", 468, E, Eerie, false, statFirstTotal[467], statEndTotal[467], Earth, Wind, Earth, 1),
		new Yokai("Furdinand", 469, A, Eerie, false, statFirstTotal[468], statEndTotal[468], Earth, Wind, Earth, 1),
		new Yokai("Pergushin", 470, E, Eerie, false, statFirstTotal[469], statEndTotal[469], Fire, Water, Fire, 1),
		new Yokai("Percrushionists", 471, A, Eerie, false, statFirstTotal[470], statEndTotal[470], Fire, Water, Fire, 1),
		new Yokai("Nosirs", 472, D, Eerie, false, statFirstTotal[471], statEndTotal[471], Fire, Fire, Fire, 1),
		new Yokai("Grubbles", 473, D, Eerie, false, statFirstTotal[472], statEndTotal[472], Thunder, Earth, Thunder, 1),
		new Yokai("Nervous Rex", 474, D, Eerie, false, statFirstTotal[473], statEndTotal[473], Ice, Fire, Ice, 1),
		new Yokai("Rinsin Repete", 475, D, Eerie, false, statFirstTotal[474], statEndTotal[474], Earth, Wind, Earth, 1),
		new Yokai("Chatalie", 476, D, Eerie, false, statFirstTotal[475], statEndTotal[475], Thunder, Earth, Thunder, 1),
		new Yokai("Nagatha", 477, C, Eerie, false, statFirstTotal[476], statEndTotal[476], Wind, Ice, Wind, 1),
		new Yokai("Dismarelda", 478, D, Eerie, false, statFirstTotal[477], statEndTotal[477], Earth, Wind, Earth, 1),
		new Yokai("Drenchetta", 479, C, Eerie, false, statFirstTotal[478], statEndTotal[478], Earth, Wind, Earth, 1),
		new Yokai("Danke Sand", 480, D, Eerie, false, statFirstTotal[479], statEndTotal[479], Earth, Wind, Earth, 1),
		new Yokai("No Sandkyu", 481, B, Eerie, false, statFirstTotal[480], statEndTotal[480], Earth, Wind, Earth, 1),
		new Yokai("Papa Windbag", 482, C, Eerie, false, statFirstTotal[481], statEndTotal[481], Thunder, Earth, Thunder, 1),
		new Yokai("Ben Tover", 483, C, Eerie, false, statFirstTotal[482], statEndTotal[482], Wind, Ice, Wind, 1),
		new Yokai("Compunzer", 484, C, Eerie, false, statFirstTotal[483], statEndTotal[483], Wind, Ice, Wind, 1),
		new Yokai("Lamedian", 485, B, Eerie, false, statFirstTotal[484], statEndTotal[484], Ice, Fire, Ice, 1),
		new Yokai("Soloman", 486, C, Eerie, false, statFirstTotal[485], statEndTotal[485], Thunder, Earth, Thunder, 1),
		new Yokai("Rhumbastiltskin", 487, C, Eerie, false, statFirstTotal[486], statEndTotal[486], Ice, Fire, Ice, 1),
		new Yokai("Slax", 488, C, Eerie, false, statFirstTotal[487], statEndTotal[487], Water, Thunder, Water, 1),
		new Yokai("Cheeksqueek", 489, C, Eerie, false, statFirstTotal[488], statEndTotal[488], Ice, Fire, Ice, 1),
		new Yokai("Cuttincheez", 490, A, Eerie, false, statFirstTotal[489], statEndTotal[489], Ice, Fire, Ice, 1),
		new Yokai("Toiletta", 491, C, Eerie, false, statFirstTotal[490], statEndTotal[490], Thunder, Earth, Thunder, 1),
		new Yokai("Foiletta", 492, A, Eerie, false, statFirstTotal[491], statEndTotal[491], Thunder, Earth, Thunder, 1),
		new Yokai("Robomutt", 493, B, Eerie, false, statFirstTotal[492], statEndTotal[492], Wind, Ice, Wind, 1),
		new Yokai("Shedwin", 494, B, Eerie, false, statFirstTotal[493], statEndTotal[493], Ice, Fire, Ice, 1),
		new Yokai("Glumdango", 495, B, Eerie, false, statFirstTotal[494], statEndTotal[494], Ice, Fire, Ice, 1),
		new Yokai("Spewart", 496, B, Eerie, false, statFirstTotal[495], statEndTotal[495], Water, Thunder, Water, 1),
		new Yokai("Grumples", 497, B, Eerie, false, statFirstTotal[496], statEndTotal[496], Water, Thunder, Water, 1),
		new Yokai("Everfore", 498, S, Eerie, false, statFirstTotal[497], statEndTotal[497], Water, Thunder, Water, 1),
		new Yokai("Eterna", 499, S, Eerie, false, statFirstTotal[498], statEndTotal[498], Thunder, Earth, Thunder, 1),
		new Yokai("Sproink", 500, A, Eerie, false, statFirstTotal[499], statEndTotal[499], Fire, Water, Fire, 1),
	};
}

private static Yokai[] medaillum_5() {
	return new Yokai[] {
		new Yokai("Darknyan", 501, A, Eerie, false, statFirstTotal[500], statEndTotal[500], Wind, Ice, Wind, 1),
		new Yokai("Decidevible", 502, A, Eerie, false, statFirstTotal[501], statEndTotal[501], Thunder, Earth, Thunder, 1),
		new Yokai("Hairum Scarum", 503, A, Eerie, false, statFirstTotal[502], statEndTotal[502], Earth, Wind, Earth, 1),
		new Yokai("Insomni", 504, A, Eerie, false, statFirstTotal[503], statEndTotal[503], Ice, Fire, Ice, 1),
		new Yokai("Sandi", 505, S, Eerie, false, statFirstTotal[504], statEndTotal[504], Wind, Ice, Wind, 1),
		new Yokai("Arachnus", 506, S, Eerie, false, statFirstTotal[505], statEndTotal[505], Earth, Wind, Earth, 1),
		new Yokai("Arachnia", 507, S, Eerie, false, statFirstTotal[506], statEndTotal[506], Earth, Wind, Earth, 1),
		new Yokai("Oridjinn", 508, S, Eerie, false, statFirstTotal[507], statEndTotal[507], Fire, Fire, Fire, 1),
		new Yokai("Horridjinn", 509, S, Eerie, false, statFirstTotal[508], statEndTotal[508], Fire, Fire, Fire, 1),
		new Yokai("Little Charrmer", 510, S, Eerie, false, statFirstTotal[509], statEndTotal[509], Fire, Water, Fire, 1),
		new Yokai("Cricky", 511, E, Slippery, false, statFirstTotal[510], statEndTotal[510], Water, Thunder, Water, 1),
		new Yokai("Humtea Jumtea", 512, E, Slippery, false, statFirstTotal[511], statEndTotal[511], Water, Thunder, Water, 1),
		new Yokai("Snailspace", 513, E, Slippery, false, statFirstTotal[512], statEndTotal[512], Water, Thunder, Water, 1),
		new Yokai("Putasockinit", 514, E, Slippery, false, statFirstTotal[513], statEndTotal[513], Thunder, Earth, Thunder, 1),
		new Yokai("Snidewinder", 515, B, Slippery, false, statFirstTotal[514], statEndTotal[514], Thunder, Earth, Thunder, 1),
		new Yokai("Noko", 516, E, Slippery, false, statFirstTotal[515], statEndTotal[515], Earth, Wind, Earth, 1),
		new Yokai("Bloominoko", 517, A, Slippery, false, statFirstTotal[516], statEndTotal[516], Earth, Wind, Earth, 1),
		new Yokai("Pandanoko", 518, A, Slippery, false, statFirstTotal[517], statEndTotal[517], Fire, Fire, Fire, 2),
		new Yokai("Starry Noko", 519, B, Slippery, false, statFirstTotal[518], statEndTotal[518], Fire, Fire, Fire, 1),
		new Yokai("Snaggly", 520, E, Slippery, false, statFirstTotal[519], statEndTotal[519], Thunder, Earth, Thunder, 1),
		new Yokai("Whinona", 521, A, Slippery, false, statFirstTotal[520], statEndTotal[520], Thunder, Earth, Thunder, 1),
		new Yokai("OMGator", 522, D, Slippery, false, statFirstTotal[521], statEndTotal[521], Water, Thunder, Water, 1),
		new Yokai("Nautaloss", 523, D, Slippery, false, statFirstTotal[522], statEndTotal[522], Water, Thunder, Water, 1),
		new Yokai("Shellebrity", 524, D, Slippery, false, statFirstTotal[523], statEndTotal[523], Water, Thunder, Water, 1),
		new Yokai("Heheheel", 525, D, Slippery, false, statFirstTotal[524], statEndTotal[524], Earth, Wind, Earth, 1),
		new Yokai("Croonger", 526, C, Slippery, false, statFirstTotal[525], statEndTotal[525], Ice, Fire, Ice, 1),
		new Yokai("Urnaconda", 527, C, Slippery, false, statFirstTotal[526], statEndTotal[526], Thunder, Earth, Thunder, 1),
		new Yokai("Takoyakid", 528, D, Slippery, false, statFirstTotal[527], statEndTotal[527], Fire, Water, Fire, 1),
		new Yokai("Takoyaking", 529, B, Slippery, false, statFirstTotal[528], statEndTotal[528], Fire, Water, Fire, 1),
		new Yokai("Fishpicable", 530, D, Slippery, false, statFirstTotal[529], statEndTotal[529], Thunder, Earth, Thunder, 1),
		new Yokai("Rageon", 531, B, Slippery, false, statFirstTotal[530], statEndTotal[530], Thunder, Earth, Thunder, 1),
		new Yokai("Tunatic", 532, A, Slippery, false, statFirstTotal[531], statEndTotal[531], Fire, Water, Fire, 1),
		new Yokai("Flushback", 533, D, Slippery, false, statFirstTotal[532], statEndTotal[532], Wind, Ice, Wind, 1),
		new Yokai("Vacuumory", 534, A, Slippery, false, statFirstTotal[533], statEndTotal[533], Wind, Ice, Wind, 1),
		new Yokai("Irewig", 535, D, Slippery, false, statFirstTotal[534], statEndTotal[534], Fire, Water, Fire, 1),
		new Yokai("Firewig", 536, A, Slippery, false, statFirstTotal[535], statEndTotal[535], Fire, Water, Fire, 1),
		new Yokai("Draggie", 537, D, Slippery, false, statFirstTotal[536], statEndTotal[536], Earth, Wind, Earth, 1),
		new Yokai("Dragon Lord", 538, S, Slippery, false, statFirstTotal[537], statEndTotal[537], Earth, Wind, Earth, 1),
		new Yokai("Azure Dragon", 539, S, Slippery, false, statFirstTotal[538], statEndTotal[538], Water, Thunder, Water, 1),
		new Yokai("Mermaidyn", 540, D, Slippery, false, statFirstTotal[539], statEndTotal[539], Water, Thunder, Water, 1),
		new Yokai("Mermadonna", 541, S, Slippery, false, statFirstTotal[540], statEndTotal[540], Water, Thunder, Water, 1),
		new Yokai("Mermother", 542, S, Slippery, false, statFirstTotal[541], statEndTotal[541], Water, Thunder, Water, 1),
		new Yokai("T-Wrecks", 543, D, Slippery, false, statFirstTotal[542], statEndTotal[542], Earth, Wind, Earth, 1),
		new Yokai("D-Stroy", 544, S, Slippery, false, statFirstTotal[543], statEndTotal[543], Earth, Wind, Earth, 1),
		new Yokai("Clodzilla", 545, S, Slippery, false, statFirstTotal[544], statEndTotal[544], Earth, Wind, Earth, 1),
		new Yokai("Lady Longnek", 546, C, Slippery, false, statFirstTotal[545], statEndTotal[545], Thunder, Earth, Thunder, 1),
		new Yokai("Whisper", 547, C, Slippery, false, statFirstTotal[546], statEndTotal[546], Thunder, Earth, Thunder, 1),
		new Yokai("Whispocrates", 548, C, Slippery, false, statFirstTotal[547], statEndTotal[547], Thunder, Earth, Thunder, 1),
		new Yokai("Snippity Cricket", 549, C, Slippery, false, statFirstTotal[548], statEndTotal[548], Wind, Ice, Wind, 1),
		new Yokai("Flocktopus", 550, C, Slippery, false, statFirstTotal[549], statEndTotal[549], Water, Thunder, Water, 1),
		new Yokai("Bitter Batter", 551, C, Slippery, false, statFirstTotal[550], statEndTotal[550], Fire, Water, Fire, 1),
		new Yokai("Daiz", 552, C, Slippery, false, statFirstTotal[551], statEndTotal[551], Fire, Fire, Fire, 1),
		new Yokai("Confuze", 553, B, Slippery, false, statFirstTotal[552], statEndTotal[552], Fire, Fire, Fire, 1),
		new Yokai("Chummer", 554, C, Slippery, false, statFirstTotal[553], statEndTotal[553], Water, Thunder, Water, 1),
		new Yokai("Shrook", 555, B, Slippery, false, statFirstTotal[554], statEndTotal[554], Water, Thunder, Water, 1),
		new Yokai("Spenp", 556, C, Slippery, false, statFirstTotal[555], statEndTotal[555], Wind, Ice, Wind, 1),
		new Yokai("Almi", 557, B, Slippery, false, statFirstTotal[556], statEndTotal[556], Water, Thunder, Water, 1),
		new Yokai("Babblong", 558, C, Slippery, false, statFirstTotal[557], statEndTotal[557], Water, Thunder, Water, 1),
		new Yokai("Bananose", 559, B, Slippery, false, statFirstTotal[558], statEndTotal[558], Water, Thunder, Water, 1),
		new Yokai("Cocobanana", 560, A, Slippery, false, statFirstTotal[559], statEndTotal[559], Thunder, Earth, Thunder, 1),
		new Yokai("Draaagin", 561, B, Slippery, false, statFirstTotal[560], statEndTotal[560], Ice, Fire, Ice, 2),
		new Yokai("Robonoko", 562, B, Slippery, false, statFirstTotal[561], statEndTotal[561], Earth, Wind, Earth, 1),
		new Yokai("Robodraggie", 563, B, Slippery, false, statFirstTotal[562], statEndTotal[562], Fire, Water, Fire, 1),
		new Yokai("Ooze Zat", 564, B, Slippery, false, statFirstTotal[563], statEndTotal[563], Ice, Fire, Ice, 1),
		new Yokai("Copperled", 565, B, Slippery, false, statFirstTotal[564], statEndTotal[564], Fire, Water, Fire, 1),
		new Yokai("Cynake", 566, B, Slippery, false, statFirstTotal[565], statEndTotal[565], Water, Thunder, Water, 1),
		new Yokai("Slitheref", 567, A, Slippery, false, statFirstTotal[566], statEndTotal[566], Thunder, Earth, Thunder, 1),
		new Yokai("SV Snaggerjag", 568, A, Slippery, false, statFirstTotal[567], statEndTotal[567], Water, Thunder, Water, 1),
		new Yokai("Mython", 569, A, Slippery, false, statFirstTotal[568], statEndTotal[568], Water, Thunder, Water, 1),
		new Yokai("Venoct", 570, S, Slippery, false, statFirstTotal[569], statEndTotal[569], Thunder, Earth, Thunder, 1),
		new Yokai("Shadow Venoct", 571, S, Slippery, false, statFirstTotal[570], statEndTotal[570], Fire, Water, Fire, 1),
		new Yokai("Frogetmenot", 572, S, Slippery, false, statFirstTotal[571], statEndTotal[571], Water, Thunder, Water, 1),
		new Yokai("Originyan", 573, E, Charming, false, statFirstTotal[572], statEndTotal[572], Fire, Water, Fire, 1),
		new Yokai("Sighborg Y", 574, B, Wandroid, false, statFirstTotal[573], statEndTotal[573], Fire, Fire, Fire, 1),
		new Yokai("Unfairy", 575, S, Wicked, false, statFirstTotal[574], statEndTotal[574], Fire, Water, Fire, 0),
		new Yokai("Unkaind", 576, S, Wicked, false, statFirstTotal[575], statEndTotal[575], Water, Thunder, Water, 0),
		new Yokai("Untidy", 577, S, Wicked, false, statFirstTotal[576], statEndTotal[576], Earth, Wind, Earth, 0),
		new Yokai("Unpleasant", 578, S, Wicked, false, statFirstTotal[577], statEndTotal[577], Wind, Ice, Wind, 0),
		new Yokai("Unkeen", 579, S, Wicked, false, statFirstTotal[578], statEndTotal[578], Thunder, Earth, Thunder, 0),
		new Yokai("Grublappa", 580, C, Wicked, false, statFirstTotal[579], statEndTotal[579], Thunder, Earth, Thunder, 0),
		new Yokai("Madmunch", 581, B, Wicked, false, statFirstTotal[580], statEndTotal[580], Earth, Wind, Earth, 0),
		new Yokai("Badsmella", 582, A, Wicked, false, statFirstTotal[581], statEndTotal[581], Wind, Ice, Wind, 0),
		new Yokai("Mad Kappa", 583, A, Wicked, false, statFirstTotal[582], statEndTotal[582], Water, Thunder, Water, 0),
		new Yokai("Shamasol", 584, D, Wicked, false, statFirstTotal[583], statEndTotal[583], Wind, Ice, Wind, 0),
		new Yokai("Gnomine", 585, C, Wicked, false, statFirstTotal[584], statEndTotal[584], Ice, Fire, Ice, 0),
		new Yokai("Defectabull", 586, C, Wicked, false, statFirstTotal[585], statEndTotal[585], Fire, Water, Fire, 0),
		new Yokai("Feargus", 587, D, Wicked, false, statFirstTotal[586], statEndTotal[586], Earth, Wind, Earth, 0),
		new Yokai("Scaremaiden", 588, C, Wicked, false, statFirstTotal[587], statEndTotal[587], Water, Thunder, Water, 0),
		new Yokai("Wrongnek", 589, B, Wicked, false, statFirstTotal[588], statEndTotal[588], Thunder, Earth, Thunder, 1),
		new Yokai("King Jibanyan", 590, A, Charming, false, statFirstTotal[589], statEndTotal[589], Fire, Water, Fire, 1),
		new Yokai("Qn. Usapyon", 591, A, Shady, false, statFirstTotal[590], statEndTotal[590], Ice, Fire, Ice, 1),
		new Yokai("Jackomasan", 592, A, Charming, false, statFirstTotal[591], statEndTotal[591], Fire, Water, Fire, 1),
		new Yokai("Komajiro Ten", 593, A, Charming, false, statFirstTotal[592], statEndTotal[592], Thunder, Earth, Thunder, 1),
		new Yokai("Acenyan", 594, A, Brave, false, statFirstTotal[593], statEndTotal[593], Wind, Ice, Wind, 1),
		new Yokai("Josper", 595, A, Slippery, false, statFirstTotal[594], statEndTotal[594], Thunder, Earth, Thunder, 1),
		new Yokai("Benzaiten", 596, S, Charming, false, statFirstTotal[595], statEndTotal[595], Thunder, Earth, Thunder, 1),
		new Yokai("Hotei", 597, S, Mysterious, false, statFirstTotal[596], statEndTotal[596], Wind, Ice, Wind, 1),
		new Yokai("Daikokuten", 598, S, Tough, false, statFirstTotal[597], statEndTotal[597], Earth, Wind, Earth, 1),
		new Yokai("Ebisu", 599, S, Slippery, false, statFirstTotal[598], statEndTotal[598], Water, Thunder, Water, 1),
		new Yokai("Bishamonten", 600, S, Brave, false, statFirstTotal[599], statEndTotal[599], Fire, Water, Fire, 1),
	};
}

private static Yokai[] medaillum_6() {
	return new Yokai[] {
		new Yokai("Columbakat", 601, S, Brave, false, statFirstTotal[600], statEndTotal[600], Water, Thunder, Water, 1),
		new Yokai("T. Energison", 602, S, Mysterious, false, statFirstTotal[601], statEndTotal[601], Thunder, Earth, Thunder, 1),
		new Yokai("Starwin", 603, S, Heartful, false, statFirstTotal[602], statEndTotal[602], Water, Thunder, Water, 1),
		new Yokai("Last Nyanmurai", 604, S, Brave, false, statFirstTotal[603], statEndTotal[603], Fire, Water, Fire, 1),
		new Yokai("Koma Star", 605, S, Mysterious, false, statFirstTotal[604], statEndTotal[604], Thunder, Earth, Thunder, 1),
		new Yokai("Platinos", 606, S, Tough, false, statFirstTotal[605], statEndTotal[605], Fire, Fire, Fire, 1),
		new Yokai("Flash T. Cash", 607, S, Heartful, false, statFirstTotal[606], statEndTotal[606], Earth, Wind, Earth, 1),
		new Yokai("Shogunyan", 608, S, Brave, false, statFirstTotal[607], statEndTotal[607], Wind, Ice, Wind, 1),
		new Yokai("Komashura", 609, S, Mysterious, false, statFirstTotal[608], statEndTotal[608], Fire, Water, Fire, 1),
		new Yokai("Gilgaros", 610, S, Tough, false, statFirstTotal[609], statEndTotal[609], Thunder, Earth, Thunder, 1),
		new Yokai("Spoilerina", 611, S, Charming, false, statFirstTotal[610], statEndTotal[610], Wind, Ice, Wind, 1),
		new Yokai("Elder Bloom", 612, S, Heartful, false, statFirstTotal[611], statEndTotal[611], Earth, Wind, Earth, 1),
		new Yokai("Poofessor", 613, S, Shady, false, statFirstTotal[612], statEndTotal[612], Earth, Wind, Earth, 1),
		new Yokai("Dandoodle", 614, S, Eerie, false, statFirstTotal[613], statEndTotal[613], Water, Thunder, Water, 1),
		new Yokai("Slurpent", 615, S, Slippery, false, statFirstTotal[614], statEndTotal[614], Fire, Water, Fire, 1),
		new Yokai("Re-Q-Perate", 616, S, Eerie, false, statFirstTotal[615], statEndTotal[615], Earth, Wind, Earth, 1),
		new Yokai("Princess Pearl", 617, S, Charming, false, statFirstTotal[616], statEndTotal[616], Water, Thunder, Water, 1),
		new Yokai("Asura", 618, S, Brave, false, statFirstTotal[617], statEndTotal[617], Fire, Water, Fire, 1),
		new Yokai("Terminyanator", 619, A, Tough, false, statFirstTotal[618], statEndTotal[618], Fire, Water, Fire, 1),
		new Yokai("Supernyan", 620, A, Brave, false, statFirstTotal[619], statEndTotal[619], Wind, Ice, Wind, 1),
		new Yokai("Hovernyan S", 621, S, Brave, false, statFirstTotal[620], statEndTotal[620], Wind, Ice, Wind, 1),
		new Yokai("Hover. Cao Cao", 622, S, Brave, false, statFirstTotal[621], statEndTotal[621], Wind, Ice, Wind, 2),
		new Yokai("Yoganalisten", 623, C, Mysterious, false, statFirstTotal[622], statEndTotal[622], Earth, Wind, Earth, 1),
		new Yokai("Judgebrick", 624, B, Tough, false, statFirstTotal[623], statEndTotal[623], Earth, Wind, Earth, 1),
		new Yokai("Urnfulfilled", 625, B, Tough, false, statFirstTotal[624], statEndTotal[624], Earth, Wind, Earth, 1),
		new Yokai("Sad 2 the Bone", 626, A, Tough, false, statFirstTotal[625], statEndTotal[625], Earth, Wind, Earth, 1),
		new Yokai("Venoctobot", 627, S, Tough, false, statFirstTotal[626], statEndTotal[626], Thunder, Earth, Thunder, 1),
		new Yokai("Orcanos Lu Bu", 628, S, Tough, false, statFirstTotal[627], statEndTotal[627], Earth, Wind, Earth, 1),
		new Yokai("Kyubot", 629, S, Tough, false, statFirstTotal[628], statEndTotal[628], Thunder, Earth, Thunder, 1),
		new Yokai("Ult. Robonyan", 630, S, Tough, false, statFirstTotal[629], statEndTotal[629], Wind, Ice, Wind, 1),
		new Yokai("Molar Petite", 631, D, Charming, false, statFirstTotal[630], statEndTotal[630], Fire, Water, Fire, 2),
		new Yokai("Life-is-Parfait", 632, B, Charming, false, statFirstTotal[631], statEndTotal[631], Water, Thunder, Water, 1),
		new Yokai("Mee 2", 633, B, Charming, false, statFirstTotal[632], statEndTotal[632], Fire, Water, Fire, 1),
		new Yokai("Koalanyan", 634, A, Charming, false, statFirstTotal[633], statEndTotal[633], Wind, Ice, Wind, 1),
		new Yokai("Jibanyan T", 635, A, Charming, false, statFirstTotal[634], statEndTotal[634], Earth, Wind, Earth, 1),
		new Yokai("Komasan T", 636, A, Charming, false, statFirstTotal[635], statEndTotal[635], Earth, Wind, Earth, 1),
		new Yokai("Eggcelency", 637, S, Charming, false, statFirstTotal[636], statEndTotal[636], Fire, Fire, Fire, 1),
		new Yokai("Deadcool", 638, S, Charming, false, statFirstTotal[637], statEndTotal[637], Thunder, Earth, Thunder, 2),
		new Yokai("Sweattuce", 639, C, Heartful, false, statFirstTotal[638], statEndTotal[638], Water, Thunder, Water, 1),
		new Yokai("Mr Blue-Shy", 640, C, Heartful, false, statFirstTotal[639], statEndTotal[639], Water, Thunder, Water, 1),
		new Yokai("Amplifly", 641, A, Heartful, false, statFirstTotal[640], statEndTotal[640], Wind, Ice, Wind, 1),
		new Yokai("Ulteria", 642, A, Heartful, false, statFirstTotal[641], statEndTotal[641], Ice, Fire, Ice, 1),
		new Yokai("My-Baaad", 643, C, Shady, false, statFirstTotal[642], statEndTotal[642], Water, Thunder, Water, 1),
		new Yokai("Sunk'nsoul", 644, C, Shady, false, statFirstTotal[643], statEndTotal[643], Earth, Wind, Earth, 1),
		new Yokai("Crummy Mum.", 645, B, Shady, false, statFirstTotal[644], statEndTotal[644], Ice, Fire, Ice, 2),
		new Yokai("Kaped Koma.", 646, A, Shady, false, statFirstTotal[645], statEndTotal[645], Fire, Water, Fire, 1),
		new Yokai("Tofupyon", 647, A, Shady, false, statFirstTotal[646], statEndTotal[646], Fire, Water, Fire, 1),
		new Yokai("Ed Zoff", 648, S, Shady, false, statFirstTotal[647], statEndTotal[647], Wind, Ice, Wind, 1),
		new Yokai("Gorgeous Amb.", 649, S, Shady, false, statFirstTotal[648], statEndTotal[648], Thunder, Earth, Thunder, 1),
		new Yokai("Hinozall", 650, S, Shady, false, statFirstTotal[649], statEndTotal[649], Thunder, Earth, Thunder, 1),
		new Yokai("Zazel", 651, S, Shady, false, statFirstTotal[650], statEndTotal[650], Fire, Fire, Fire, 1),
		new Yokai("Procrastino.", 652, C, Eerie, false, statFirstTotal[651], statEndTotal[651], Ice, Fire, Ice, 1),
		new Yokai("Treasure Pest", 653, C, Eerie, false, statFirstTotal[652], statEndTotal[652], Ice, Fire, Ice, 1),
		new Yokai("J. Ne-Sais-Quoi", 654, S, Eerie, false, statFirstTotal[653], statEndTotal[653], Wind, Ice, Wind, 2),
		new Yokai("Whi. Kongming", 655, A, Slippery, false, statFirstTotal[654], statEndTotal[654], Wind, Ice, Wind, 1),
		new Yokai("Jurojin", 656, S, Shady, false, statFirstTotal[655], statEndTotal[655], Wind, Ice, Wind, 1),
		new Yokai("Fukurokuju", 657, S, Heartful, false, statFirstTotal[656], statEndTotal[656], Thunder, Earth, Thunder, 1),
		new Yokai("Sarchopha.", 658, S, Mysterious, false, statFirstTotal[657], statEndTotal[657], Thunder, Earth, Thunder, 1),
		new Yokai("King Deadward", 659, S, Tough, false, statFirstTotal[658], statEndTotal[658], Earth, Wind, Earth, 1),
		new Yokai("Pandora", 660, S, Charming, false, statFirstTotal[659], statEndTotal[659], Fire, Water, Fire, 1),
		new Yokai("Comic Genieus", 661, S, Heartful, false, statFirstTotal[660], statEndTotal[660], Wind, Ice, Wind, 1),
		new Yokai("Bastnetnyan", 662, S, Shady, false, statFirstTotal[661], statEndTotal[661], Fire, Water, Fire, 1),
		new Yokai("Komanubis", 663, S, Eerie, false, statFirstTotal[662], statEndTotal[662], Fire, Water, Fire, 1),
		new Yokai("Gabby", 664, S, Charming, false, statFirstTotal[663], statEndTotal[663], Wind, Ice, Wind, 1),
		new Yokai("Teducator", 665, S, Shady, false, statFirstTotal[664], statEndTotal[664], Wind, Ice, Wind, 1),
		new Yokai("Gentlemutt", 666, S, Eerie, false, statFirstTotal[665], statEndTotal[665], Ice, Fire, Ice, 1),
		new Yokai("City Licker", 667, S, Slippery, false, statFirstTotal[666], statEndTotal[666], Fire, Water, Fire, 1),
		new Yokai("Whyvern King", 668, S, Slippery, false, statFirstTotal[667], statEndTotal[667], Ice, Fire, Ice, 1),
		new Yokai("Lord Enma", 669, S, Enma, false, statFirstTotal[668], statEndTotal[668], Fire, Fire, Fire, 1),
		new Yokai("Rgt. Zazel", 670, S, Brave, false, statFirstTotal[669], statEndTotal[669], Fire, Fire, Fire, 1),
		new Yokai("Hinozall Awk.", 671, S, Shady, false, statFirstTotal[670], statEndTotal[670], Thunder, Earth, Thunder, 1),
		new Yokai("Ancient Enma", 672, S, Enma, false, statFirstTotal[671], statEndTotal[671], Fire, Fire, Fire, 1),
		new Yokai("Enma Awk.", 673, S, Enma, false, statFirstTotal[672], statEndTotal[672], Thunder, Fire, Thunder, 1),
		new Yokai("The Boracle", 674, S, Slippery, false, statFirstTotal[673], statEndTotal[673], Ice, Fire, Ice, 1),
		new Yokai("Rampajah", 675, S, Brave, false, statFirstTotal[674], statEndTotal[674], Fire, Water, Fire, 1),
		new Yokai("Cymbalina", 676, B, Charming, false, statFirstTotal[675], statEndTotal[675], Earth, Wind, Earth, 1),
		new Yokai("Mumbles", 677, A, Tough, false, statFirstTotal[676], statEndTotal[676], Water, Thunder, Water, 1),
		new Yokai("Roary", 678, A, Tough, false, statFirstTotal[677], statEndTotal[677], Fire, Water, Fire, 1),
		new Yokai("Letsbifrenz", 679, A, Shady, false, statFirstTotal[678], statEndTotal[678], Wind, Ice, Wind, 1),
		new Yokai("Wack o' Lantern", 680, B, Eerie, false, statFirstTotal[679], statEndTotal[679], Fire, Water, Fire, 1),
		new Yokai("Moolinda", 681, S, Brave, false, statFirstTotal[680], statEndTotal[680], Earth, Wind, Earth, 1),
		new Yokai("Neighthan", 682, S, Brave, false, statFirstTotal[681], statEndTotal[681], Ice, Fire, Ice, 1),
		new Yokai("Big Fish", 683, S, Slippery, false, statFirstTotal[682], statEndTotal[682], Water, Thunder, Water, 1),
		new Yokai("Alpina", 684, S, Heartful, false, statFirstTotal[683], statEndTotal[683], Wind, Ice, Wind, 1),
		new Yokai("Lunie", 685, S, Shady, false, statFirstTotal[684], statEndTotal[684], Thunder, Earth, Thunder, 1),
		new Yokai("Blizzie", 686, S, Charming, false, statFirstTotal[685], statEndTotal[685], Ice, Fire, Ice, 1),
		new Yokai("KJ", 687, B, Charming, false, statFirstTotal[686], statEndTotal[686], Thunder, Earth, Thunder, 1),
		new Yokai("Solar Enma", 688, S, Enma, false, statFirstTotal[687], statEndTotal[687], Fire, Fire, Fire, 1),
		new Yokai("Infinite Enma", 689, S, Enma, false, statFirstTotal[688], statEndTotal[688], Thunder, Fire, Thunder, 1),
		new Yokai("Umbral Enma", 690, S, Enma, false, statFirstTotal[689], statEndTotal[689], Wind, Fire, Wind, 1),
		new Yokai("Indiana Jaws", 691, A, Slippery, false, statFirstTotal[690], statEndTotal[690], Water, Thunder, Water, 1),
		new Yokai("Shovulcan", 692, A, Mysterious, false, statFirstTotal[691], statEndTotal[691], Thunder, Earth, Thunder, 2),
		new Yokai("Zomboy", 693, A, Eerie, false, statFirstTotal[692], statEndTotal[692], Fire, Water, Fire, 1),
		new Yokai("Nyanses II", 694, A, Heartful, false, statFirstTotal[693], statEndTotal[693], Ice, Fire, Ice, 1),
		new Yokai("Meopatra", 695, S, Charming, false, statFirstTotal[694], statEndTotal[694], Wind, Ice, Wind, 1),
		new Yokai("Fitwit", 696, S, Slippery, false, statFirstTotal[695], statEndTotal[695], Earth, Wind, Earth, 1),
		new Yokai("El Dorago", 697, S, Brave, false, statFirstTotal[696], statEndTotal[696], Thunder, Earth, Thunder, 1),
		new Yokai("The Hinix", 698, S, Brave, false, statFirstTotal[697], statEndTotal[697], Fire, Water, Fire, 1),
	};
}
			public static Stat unknownStat = new Stat(0,0,0,0,0);
			public static Yokai unknownYokai = new Yokai("???", 0, E, Wicked, false, unknownStat, unknownStat, Fire, Fire, Fire, 1);
			public static Equipement unknowEquipement = new Equipement(0, 0, 0, 0, 0, 0, false, false);

public static Yokai[] medaillum = mergeYokai(
	medaillum_0(), medaillum_1(), medaillum_2(), medaillum_3(), medaillum_4(), medaillum_5(), medaillum_6()
);

private static Yokai[] mergeYokai(Yokai[]... arrays) {
	int total = 0;
	for (Yokai[] a : arrays) total += a.length;
	Yokai[] result = new Yokai[total];
	int i = 0;
	for (Yokai[] a : arrays) for (Yokai y : a) result[i++] = y;
	return result;
}

		
public static void printYokai()
    {
        System.out.printf("%-20s %-5s %-5s %10s%n", "Yo-kai", "Rang", "N° Medaillum", "Tribu");
			for(Yokai y : medaillum)
			{
				System.out.printf("%-20s %-5s %-5s %17s%n", y.GetName(), y.GetRank(), y.GetID(), y.GetTribe());
			}
    	}
	}

