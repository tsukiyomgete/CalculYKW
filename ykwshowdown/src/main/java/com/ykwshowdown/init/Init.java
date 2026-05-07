
package com.ykwshowdown.init;

import com.ykwshowdown.yokai.*;
import com.ykwshowdown.fightingdata.*;
import com.ykwshowdown.Talent.Talent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ykwshowdown.database.*;

public class Init {

	// === ELEMENTAUX ===
	public static Elemental Neutral = new Elemental("Neutral");
	public static Elemental Fire = new Elemental("Fire");
	public static Elemental Water = new Elemental("Water");
	public static Elemental Wind = new Elemental("Wind");
	public static Elemental Ice = new Elemental("Ice");
	public static Elemental Earth = new Elemental("Earth");
	public static Elemental Thunder = new Elemental("Thunder");
	public static Elemental Heal = new Elemental("Heal");
	public static Elemental Drain = new Elemental("Drain");

	// === TRIBUS ===
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

	// === RANGS ===
	public static Rank E = new Rank('E');
	public static Rank D = new Rank('D');
	public static Rank C = new Rank('C');
	public static Rank B = new Rank('B');
	public static Rank A = new Rank('A');
	public static Rank S = new Rank('S');

	// === TECHNIQUES ===
	static Technique[] ListTechnique = {
		new Technique(1, "Absorb", 20,90, 1, Drain),
		new Technique(2, "Blaze", 50,110, 1, Fire),
		new Technique(3, "Blizzard", 80,120, 1, Ice),
		new Technique(4, "Drain", 50,110, 1, Drain),
		new Technique(5, "Fire", 20,90, 1, Fire),
		new Technique(6, "Frost", 50,110, 1, Ice),
		new Technique(7, "Hail", 20,90, 1, Ice),
		new Technique(8, "Heal", 20,90, 1, Heal),
		new Technique(9, "Incinerate", 80,120, 1, Fire),
		new Technique(10, "Lightning", 50,110, 1, Thunder),
		new Technique(11, "Meteor", 80,120, 1, Earth),
		new Technique(12, "Paradise", 80,120, 1, Heal),
		new Technique(13, "Pebble", 20,90, 1, Earth),
		new Technique(14, "Rapids", 50,110, 1, Water),
		new Technique(15, "Reaper", 80,120, 1, Drain),
		new Technique(16, "Restore", 50,110, 1, Heal),
		new Technique(17, "Rockslide", 50,110, 1, Earth),
		new Technique(18, "Shock", 20,90, 1, Thunder),
		new Technique(19, "Storm", 80,120, 1, Wind),
		new Technique(20, "Tornado", 50,110, 1, Wind),
		new Technique(21, "Torrent", 20,90, 1, Water),
		new Technique(22, "Voltage", 80,120, 1, Thunder),
		new Technique(23, "Waterfall", 80,120, 1, Water),
		new Technique(24, "Whirlwind", 20,90, 1, Wind),
	};

	// === ATTAQUES PHYSIQUES ===
	static PhysicalAttack[] ListAttack = {
		new PhysicalAttack(1,"Batter",15,33,3,Neutral),
		new PhysicalAttack(2,"Beat",40,88,1,Neutral),
		new PhysicalAttack(3,"Bite",15,67,1,Neutral),
		new PhysicalAttack(4,"Body Bash",15,67,1,Neutral),
		new PhysicalAttack(5,"Bone Crusher",100,150,1,Neutral),
		new PhysicalAttack(6,"Bowshot",50,110,1,Neutral),
		new PhysicalAttack(7,"Chomp",45,99,1,Neutral),
		new PhysicalAttack(8,"Clobber",75,112,1,Neutral),
		new PhysicalAttack(9,"Double Slice",18,39,2,Neutral),
		new PhysicalAttack(10,"Earthsplitter",95,142,1,Neutral),
		new PhysicalAttack(11,"Flatten",30,66,1,Neutral),
		new PhysicalAttack(12,"Flip Kick",60,90,1,Neutral),
		new PhysicalAttack(13,"Fullswing",80,120,1,Neutral),
		new PhysicalAttack(14,"Guns Blazing",15,33,3,Neutral),
		new PhysicalAttack(15,"Headbuster",130,195,1,Neutral),
		new PhysicalAttack(16,"Headbutt",55,121,1,Neutral),
		new PhysicalAttack(17,"Headsmack",15,67,1,Neutral),
		new PhysicalAttack(18,"Hit",10,45,1,Neutral),
		new PhysicalAttack(19,"Kaboom!",50,110,1,Neutral),
		new PhysicalAttack(20,"Kick",15,67,1,Neutral),
		new PhysicalAttack(21,"Lightning Slash",20,44,3,Neutral),
		new PhysicalAttack(22,"Maul",80,120,1,Neutral),
		new PhysicalAttack(23,"Meteor Punch",20,30,3,Neutral),
		new PhysicalAttack(24,"Nasty Kick",100,150,1,Neutral),
		new PhysicalAttack(25,"Ninja Star",60,90,1,Neutral),
		new PhysicalAttack(26,"One-Two Punch",15,33,2,Neutral),
		new PhysicalAttack(27,"Palm Strike",60,90,1,Neutral),
		new PhysicalAttack(28,"Pesky Poke",15,67,1,Neutral),
		new PhysicalAttack(29,"Pinpoint Pierce",30,66,1,Neutral),
		new PhysicalAttack(30,"Pointy Pokes",12,26,3,Neutral),
		new PhysicalAttack(31,"Power Punch",50,110,1,Neutral),
		new PhysicalAttack(32,"Practiced Punch",90,135,1,Neutral),
		new PhysicalAttack(33,"Punch",15,67,1,Neutral),
		new PhysicalAttack(34,"Rocket Punch",100,150,1,Neutral),
		new PhysicalAttack(35,"Sharp Claws",10,45,2,Neutral),
		new PhysicalAttack(36,"Shoot",10,45,1,Neutral),
		new PhysicalAttack(37,"Slap",10,45,1,Neutral),
		new PhysicalAttack(38,"Slurp",50,110,1,Neutral),
		new PhysicalAttack(39,"Smack Down",20,44,2,Neutral),
		new PhysicalAttack(40,"Spraygun",100,150,1,Neutral),
		new PhysicalAttack(41,"Squish",10,45,1,Neutral),
		new PhysicalAttack(42,"Stab Storm",10,22,5,Neutral),
		new PhysicalAttack(43,"Steamroll",60,90,1,Neutral),
		new PhysicalAttack(44,"Stepping Slice",15,67,1,Neutral),
		new PhysicalAttack(45,"Tackle",60,90,1,Neutral),
		new PhysicalAttack(46,"Tail Slap",100,150,1,Neutral),
		new PhysicalAttack(47,"Ventilator",50,110,1,Neutral),
	};

	private static Inspirit[] inspiritList_0() {
		return new Inspirit[] {
			new Inspirit("Careless", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Defenseless", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Gutsiness", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Aimless", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Laziness", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Freshen Up", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Spruce Up", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Lionize", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Meltdown", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Berserk", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Frighten", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Mochi Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Jealousy", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Sick Lick", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Power Snack", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Power Lunch", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Helmet Defense", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Knight's Curse", "Reduces an enemy SPR (Tier:2)", 0.0, -0.2, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Stygian Curse", "Reduces an enemy SPR (Tier:2)", 0.0, -0.2, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Sucking Mud", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Fighting Fit", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:3)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Emblaze", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Lion's Pride", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Heart's Roar", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Bad Bet", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Fine Weapon", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Cursed Sword", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Holy Sword", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Clumsiness", "Reduces an enemy SPR (Tier:2)", 0.0, -0.2, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Cyborg Strength", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Samurai Spirit", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Kabuki Fun", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Stag Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Fighter Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Legend Power", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Fightamins", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Maulnutrition", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Tailwind", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Bless My Sole", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Runny Nose", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Catch Cold", "Reduces an enemy STR (Tier:3)", -0.1, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Full of Sighs", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Demotivator", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:1)", -0.1, -0.1, -0.1, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Memory Eater", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Memory Loss", "Confuses an enemy, making them attack their own allies sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Liven Up", "Increases an ally SPR (Tier:4)", 0.0, 0.1, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Losing Face", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Side Splitter", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Shivers", "Reduces an enemy SPR (Tier:3)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Disclose", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Face Paint", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Popularize", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Unpopularize", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Not So Sorry", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Amazing Haze", "Increases an ally SPR (Tier:2)", 0.0, 0.2, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Paralyze", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Electrocute", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Hot Pot", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Lying Saucer", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Stats 'n' Stripes", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Mirror Power", "Increases an ally SPR (Tier:3)", 0.0, 0.1, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Cursed Mirror", "Reduces an enemy SPR (Tier:3)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Illusion Power", "Increases an ally SPR (Tier:3)", 0.0, 0.1, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Haze Power", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Wanderlust", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Expose Weakness", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Mysterious Power", "Reduces an enemy SPR (Tier:4)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("At Your Service", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Tengu'd", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Burn", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Divine Protection", "Increases an ally SPR (Tier:2)", 0.0, 0.2, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Beastly Blare", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Royal Rush", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Crack Up", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Dullness", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Machismo", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Musclehead", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Envy", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Shrimpervious", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Get Lost", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Loose Cannon", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Refusal", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Castle Power", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Rebel Soul", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Enrage", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Armor Defense", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Copycat", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Needle Poke", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Big Needle Poke", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Fidgeting", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Shaking", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Thick Skin", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Lightning Speed", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Sweat It Out", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Perseverance", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Volcanic Blessing", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Bronze Power", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Silver Power", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Gold Power", "Increases an ally DEF (Tier:4)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Platinum Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
		};
	}

	private static Inspirit[] inspiritList_1() {
		return new Inspirit[] {
			new Inspirit("Rhino Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Peerless Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Steel Power", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Golden Power", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Earth Healing", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Ocean Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:1)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Big Shot", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Fade Away", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Leg Up", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Makeover", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("So Generous", "Inspirits an enemy, making them drop money and lose their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Cicada Ninjutsu", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Radical Ninjutsu", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Chills", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Freeze", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Blazing Heart", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Funny Face", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Eye-Eye", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Slow Down", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Delinquency", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("All Shook Up", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Nap Time", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Torrent Power", "Increases an ally SPR (Tier:2)", 0.0, 0.2, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Surf Power", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Tiger Power", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Bedtime", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Sweet Dreams", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Storm Drain", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Hot Stepper", "Increases an ally SPD (Tier:4)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Skip a Beat", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Trickery", "Confuses an enemy, making them attack their own allies sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Rustic Charm", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Numbify", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Curse of Darkness", "Reduces an enemy SPR (Tier:2)", 0.0, -0.2, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Kappa Quick", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Hose Be with You", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:3)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Gluttony", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Healthy Wakame", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Dance Party", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Kombu Energy", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Slippery Mekabu", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Starve", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Rice's Kindness", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Lick Your Wounds", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("A-meh-zing", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Undercover", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Deep Cover", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Poverty", "Inspirits an enemy, making them drop money and lose their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Big Spender", "Inspirits an enemy, making them drop money and lose their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Optimism", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Chin Up", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Cheer Up", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Energize", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:1)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Enemy Maker", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Feeling Fine", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Life Is Good", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Raging Bull", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Battle Beat", "Increases an ally STR (Tier:4)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Solar Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Cheerfulness", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Insecurity", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Luck's Smile", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Lucky Streak", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Dad's Support", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Uncle's Shout", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Mama's Warmth", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Auntie's Love", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Rest Aura", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Healing Horn", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Guide", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Bias", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Shoulder Pain", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Back Pain", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Restless Night", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Sleepless Night", "Reduces an enemy DEF (Tier:4)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Wilt", "Reduces an enemy STR (Tier:3)", -0.1, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Beef Up", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Negativize", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Itchy", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Absence", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Distrust", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Bratty", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Contrariness", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Shut Away", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Bad Influence", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Shakedown", "Inspirits an enemy, making them drop money and lose their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Hate to Wait", "Confuses an enemy, making them attack their own allies sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Helpless", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Spirit Zapper", "Reduces an enemy SPR (Tier:3)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Rat Fink", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Pessimism", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Prima Donna", "Confuses an enemy, making them attack their own allies sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Dracufang", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Negasus Waves", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Neighing Curse", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:3)", -0.1, -0.1, -0.1, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Scaredy-Cat", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Cavity", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Evil Eyes", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Stinginess", "Confuses an enemy, making them attack their own allies sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Darkness Power", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
		};
	}

	private static Inspirit[] inspiritList_2() {
		return new Inspirit[] {
			new Inspirit("Boil Away", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:3)", -0.1, -0.1, -0.1, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Sore Throat", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Headache", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Pruned", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Frozen Solid", "Reduces an enemy STR (Tier:4)", -0.1, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Nosebleed", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Snatch", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Tie Down", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Funky Dance", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Ba-Dum-Diss", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Vroom Vroom", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Depression", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Awkwardness", "Reduces an enemy DEF (Tier:2)", 0.0, 0.0, -0.2, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Despair", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Confusion", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Styx's Curse", "Reduces an enemy SPR (Tier:3)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Thatch", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Thicket", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Doubt It", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Overcast", "Reduces an enemy STR (Tier:3)", -0.1, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("All Talk", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Complaints", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Big Up", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:3)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Shirkster", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Stink Up", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Elementary Curse", "Reduces an enemy SPR (Tier:2)", 0.0, -0.2, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("High School Hex", "Reduces an enemy SPR (Tier:3)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Sweaty Swine", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:2)", -0.2, -0.2, -0.2, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Fall Flat", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Wrinkles", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Youth Drain", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:2)", -0.2, -0.2, -0.2, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Immortal Power", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Insomnia", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:3)", -0.1, -0.1, -0.1, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Entrap", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Pain in the Neck", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Fortunate", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:1)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Panda Cuteness", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Two to Tangle", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("What a Drag", "Reduces an enemy SPD (Tier:4)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Playfulness", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Power of Song", "Increases an ally SPR (Tier:2)", 0.0, 0.2, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Serpent's Power", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Hateful", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Detest", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Frenzy", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Happy Daze", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Bugged Out", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Wigged Out", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Dragon Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Cobalt Power", "Increases an ally SPR (Tier:2)", 0.0, 0.2, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Rejuvenate", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Necks Level", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Generous Heart", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Faltering Heart", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:2)", -0.2, -0.2, -0.2, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Loitering", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Amateur", "Reduces an enemy STR (Tier:3)", -0.1, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Wastefulness", "Inspirits an enemy, making them drop money and lose their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Keep Chatting", "Reduces an enemy SPD (Tier:2)", 0.0, 0.0, 0.0, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Banana Power", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Maybe Later", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Coast Guard", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Bossiness", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Sulky", "Confuses an enemy, making them attack their own allies sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Pit Viper Venom", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Venoct's Blessing", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Enshroud", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Heart of a Warrior", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Burly Power", "Increases an ally SPR (Tier:3)", 0.0, 0.1, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Power of Terror", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Spoiler Spiller", "Makes an ally taunt the enemies, becoming their main target", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Miracle Blossom", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Info Dump", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Healing Air", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Slurperpowers", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Sapphire Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Emerald Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Ruby Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Topaz Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Diamond Power", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:2)", 0.2, 0.2, 0.2, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Melon Juice", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Juiced Up", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Fur Coat", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Feeling Grape", "Increases an ally SPR (Tier:3)", 0.0, 0.1, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Strawburst", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Watermaulin'", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("System Upgrade", "Increases an ally DEF (Tier:3)", 0.0, 0.0, 0.1, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Girl Power", "An ally recovers HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Pal Power", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Jet Propulsion", "Increases an ally SPD (Tier:4)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Unfairy Power", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Unkaind Power", "Reduces an enemy STR (Tier:3)", -0.1, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Untidy Power", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Unpleasant Power", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Unkeen Power", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:2)", -0.2, -0.2, -0.2, -0.2, false, false, false, false, 0.0, false),
			new Inspirit("Awful Haze", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Wicked Tale", "Reduces an enemy SPR (Tier:3)", 0.0, -0.1, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Ruin", "Reduces an enemy DEF (Tier:3)", 0.0, 0.0, -0.1, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Chin Down", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Bad Fortune", "Reduces an enemy STR (Tier:2)", -0.2, 0.0, 0.0, 0.0, false, false, false, false, 0.0, false),
			new Inspirit("Gouge", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
		};
	}

	private static Inspirit[] inspiritList_3() {
		return new Inspirit[] {
			new Inspirit("Strained Neck", "An enemy loses HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Get Your Goat", "Confuses an enemy, making them attack their own allies sometimes (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, true, false, 0.0, false),
			new Inspirit("Festival Fun", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Panja Power", "Increases an ally SPD (Tier:2)", 0.0, 0.0, 0.0, 0.2, true, false, false, false, 0.0, false),
			new Inspirit("Eelectrify", "Increases an ally stats (STR, SPR, DEF and SPD) (Tier:1)", 0.1, 0.1, 0.1, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Octoplus", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Sanks So Much", "Makes an ally untargetable", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Suck It Up", "Increases an ally DEF (Tier:2)", 0.0, 0.0, 0.2, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Could Care Less", "Reduces an enemy stats (STR, SPR, DEF and SPD) (Tier:1)", -0.1, -0.1, -0.1, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Could Care More", "Increases an ally STR (Tier:3)", 0.1, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Sweet Relief", "An ally recovers HP on their turns (Tier:1)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
			new Inspirit("Dig Deep", "Increases an enemy loafing chances, making them unable to act sometimes (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, true, false, false, 0.0, false),
			new Inspirit("Moximous", "Increases an ally STR (Tier:2)", 0.2, 0.0, 0.0, 0.0, true, false, false, false, 0.0, false),
			new Inspirit("Slow Down S", "Reduces an enemy SPD (Tier:3)", 0.0, 0.0, 0.0, -0.1, false, false, false, false, 0.0, false),
			new Inspirit("Burn S", "An enemy loses HP on their turns (Tier:2)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.2, false),
			new Inspirit("Tiger Power S", "Increases an ally SPD (Tier:3)", 0.0, 0.0, 0.0, 0.1, true, false, false, false, 0.0, false),
			new Inspirit("Dark Descent", "An enemy loses HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, false, false, false, true, 0.1, false),
			new Inspirit("Light of Life", "An ally recovers HP on their turns (Tier:3)", 0.0, 0.0, 0.0, 0.0, true, false, false, false, 0.0, true),
		};
	}

	public static Inspirit[] inspiritList = mergeInspirits(inspiritList_0(), inspiritList_1(), inspiritList_2(), inspiritList_3());

	private static Inspirit[] mergeInspirits(Inspirit[]... arrays) {
		int total = 0; for (Inspirit[] a : arrays) total += a.length;
		Inspirit[] result = new Inspirit[total]; int i = 0;
		for (Inspirit[] a : arrays) for (Inspirit s : a) result[i++] = s; return result;
	}

	private static Stat[] statA_0() {
		return new Stat[] {
			new Stat(33,9,5,6,8), // #1 Pandle
			new Stat(40,11,5,6,8), // #2 Undy
			new Stat(49,14,10,9,12), // #3 Tanbo
			new Stat(31,9,4,6,5), // #4 Cutta-nah
			new Stat(40,16,12,13,14), // #5 Cutta-nah-nah
			new Stat(46,18,13,15,16), // #6 Slacka-slash
			new Stat(37,10,8,7,17), // #7 Brushido
			new Stat(41,17,12,15,14), // #8 Washogun
			new Stat(29,7,5,4,8), // #9 Lie-in
			new Stat(37,22,19,18,21), // #10 Lie-in Heart
			new Stat(29,9,4,6,7), // #11 Hissfit
			new Stat(45,23,16,19,20), // #12 Zerberker
			new Stat(55,27,11,22,25), // #13 Snartle
			new Stat(37,11,5,8,7), // #14 Mochismo
			new Stat(42,10,3,8,6), // #15 Minochi
			new Stat(32,10,7,9,8), // #16 Tublappa
			new Stat(34,10,5,6,8), // #17 Slicenrice (Fleshy Souls)
			new Stat(38,23,22,19,21), // #18 Flamurice (Fleshy Souls)
			new Stat(39,10,5,9,7), // #19 Helmsman
			new Stat(53,15,9,13,10), // #20 Reuknight
			new Stat(51,18,11,17,13), // #21 Corptain
			new Stat(41,12,8,11,9), // #22 Mudmunch
			new Stat(48,25,8,12,11), // #23 Sgt. Burly
			new Stat(38,12,11,8,10), // #24 Blazion
			new Stat(46,16,15,10,14), // #25 Quaken
			new Stat(44,11,12,7,9), // #26 Siro
			new Stat(42,13,10,11,12), // #27 Chansin
			new Stat(44,15,11,12,13), // #28 Sheen
			new Stat(48,16,14,11,15), // #29 Snee
			new Stat(48,22,12,11,13), // #30 Gleam
			new Stat(41,15,9,10,12), // #31 Benkei
			new Stat(55,13,3,6,8), // #32 B3-NK1
			new Stat(40,20,17,16,19), // #33 Sushiyama
			new Stat(47,16,11,12,13), // #34 Kapunki
			new Stat(41,14,10,13,12), // #35 Beetler (Bony Spirits)
			new Stat(49,22,16,21,18), // #36 Beetall (Bony Spirits)
			new Stat(50,21,18,20,19), // #37 Cruncha
			new Stat(50,27,24,25,23), // #38 Demuncher
			new Stat(56,18,15,13,14), // #39 Devourer
			new Stat(30,4,8,5,10), // #40 Brokenbrella
			new Stat(31,4,8,6,10), // #41 Pittapatt
			new Stat(32,5,10,6,8), // #42 Snotsolong
			new Stat(36,4,8,5,7), // #43 Duchoo
			new Stat(31,6,11,7,8), // #44 D'wanna
			new Stat(41,11,15,12,13), // #45 N'more
			new Stat(38,10,12,8,9), // #46 Q'wit
			new Stat(25,5,9,7,11), // #47 Wazzat
			new Stat(42,10,16,13,14), // #48 Houzzat
			new Stat(27,3,7,4,10), // #49 Dummkap
			new Stat(34,10,15,11,13), // #50 Faysoff
			new Stat(33,6,9,7,8), // #51 Lafalotta
			new Stat(40,14,16,14,15), // #52 Blips
			new Stat(40,7,16,9,13), // #53 Tattletell
			new Stat(44,9,16,11,14), // #54 Tattlecast
			new Stat(40,6,12,5,8), // #55 Skranny
			new Stat(33,8,11,9,13), // #56 Cupistol
			new Stat(50,18,23,19,22), // #57 Casanuva
			new Stat(39,19,23,18,21), // #58 Casanono
			new Stat(35,9,13,8,11), // #59 So-Sorree
			new Stat(43,18,22,19,17), // #60 Bowminos
			new Stat(30,9,13,10,14), // #61 Smogling
			new Stat(49,20,24,21,26), // #62 Smogmella
			new Stat(35,10,11,9,12), // #63 Signibble
			new Stat(39,14,16,11,9), // #64 Signiton
			new Stat(43,23,24,22,21), // #65 Statiking
			new Stat(39,13,11,10,8), // #66 Master Oden
			new Stat(33,3,10,9,11), // #67 Failian
			new Stat(34,14,16,15,16), // #68 Apelican
			new Stat(39,11,16,14,12), // #69 Mirapo
			new Stat(43,20,26,24,21), // #70 Miradox
			new Stat(50,12,16,18,13), // #71 Mircle
			new Stat(38,6,10,7,9), // #72 Illoo
			new Stat(33,7,11,5,10), // #73 Elloo
			new Stat(40,10,13,9,11), // #74 Alloo
			new Stat(39,12,15,13,11), // #75 Espy
			new Stat(42,11,16,12,14), // #76 Infour
			new Stat(40,11,14,8,12), // #77 Verygoodsir
			new Stat(36,16,28,24,23), // #78 Tengu
			new Stat(55,22,23,21,20), // #79 Flengu
			new Stat(48,16,38,18,20), // #80 Kyubi
			new Stat(44,21,27,23,24), // #81 Frostail
			new Stat(49,20,21,18,20), // #82 Chymera
			new Stat(42,12,21,11,13), // #83 Kingmera
			new Stat(23,8,7,9,10), // #84 Terrorpotta
			new Stat(35,7,4,10,5), // #85 Dulluma
			new Stat(45,19,13,22,15), // #86 Darumacho
			new Stat(50,11,5,10,6), // #87 Goruma
			new Stat(26,5,8,12,11), // #88 Wotchagot
			new Stat(43,11,15,18,14), // #89 Pride Shrimp
			new Stat(29,6,3,8,10), // #90 No-Go Kart
			new Stat(43,16,12,14,18), // #91 Mistank
			new Stat(36,6,4,8,3), // #92 Noway (Bony Spirits)
			new Stat(49,19,15,22,17), // #93 Impass (Bony Spirits)
			new Stat(54,14,12,18,16), // #94 Walldin
			new Stat(52,17,5,18,10), // #95 Roughraff
			new Stat(55,25,5,23,11), // #96 Badude
			new Stat(53,23,18,22,21), // #97 Bruff
			new Stat(38,12,9,13,10), // #98 Armsman
			new Stat(40,17,4,18,10), // #99 Mimikin
			new Stat(40,7,4,9,6), // #100 Blowkade
		};
	}

	private static Stat[] statA_1() {
		return new Stat[] {
			new Stat(42,13,4,14,10), // #101 Ledballoon
			new Stat(37,11,9,12,10), // #102 Fidgephant
			new Stat(32,6,8,9,7), // #103 Touphant
			new Stat(48,14,10,12,11), // #104 Enduriphant
			new Stat(26,13,16,12,15), // #105 Zappary
			new Stat(38,17,21,19,15), // #106 Frazzel
			new Stat(43,6,7,9,5), // #107 Swelton
			new Stat(41,11,7,10,9), // #108 Mad Mountain
			new Stat(52,12,8,13,10), // #109 Lava Lord
			new Stat(43,9,7,10,8), // #110 Castelius III
			new Stat(44,17,15,19,16), // #111 Castelius II
			new Stat(45,22,20,24,21), // #112 Castelius I
			new Stat(47,24,20,25,22), // #113 Castelius Max
			new Stat(48,10,8,11,7), // #114 Rhinoggin (Fleshy Souls)
			new Stat(56,15,11,17,14), // #115 Rhinormous (Fleshy Souls)
			new Stat(51,23,17,24,22), // #116 Hornaplenty
			new Stat(55,11,10,14,12), // #117 Robonyan
			new Stat(58,12,11,19,14), // #118 Goldenyan
			new Stat(47,10,7,12,6), // #119 Dromp
			new Stat(50,12,18,20,13), // #120 Swosh
			new Stat(69,48,24,27,25), // #121 Toadal Dude
			new Stat(44,17,19,22,18), // #122 Uber Geeko
			new Stat(31,9,6,5,11), // #123 Leggly
			new Stat(29,8,6,9,12), // #124 Dazzabel
			new Stat(36,12,9,11,14), // #125 Rattelle
			new Stat(46,11,10,14,12), // #126 Skelebella
			new Stat(30,8,7,6,10), // #127 Cadin
			new Stat(39,13,9,8,11), // #128 Cadable
			new Stat(46,9,8,6,10), // #129 Singcada
			new Stat(28,7,9,6,10), // #130 Pupsicle (Fleshy Souls)
			new Stat(37,22,23,20,21), // #131 Chilhuahua (Fleshy Souls)
			new Stat(37,22,24,19,20), // #132 Swelterrier
			new Stat(36,7,10,9,11), // #133 Jumbelina
			new Stat(32,11,7,9,13), // #134 Boyclops
			new Stat(38,14,7,8,13), // #135 Jibanyan
			new Stat(43,21,18,19,23), // #136 Thornyan
			new Stat(45,22,15,21,23), // #137 Baddinyan
			new Stat(50,22,12,11,20), // #138 Buchinyan
			new Stat(36,8,13,8,11), // #139 Walkappa (Bony Spirits)
			new Stat(40,12,15,9,11), // #140 Appak (Bony Spirits)
			new Stat(40,21,22,19,20), // #141 Supyo
			new Stat(42,9,19,10,13), // #142 Komasan
			new Stat(46,16,19,17,18), // #143 Komane
			new Stat(32,7,8,6,10), // #144 Komajiro (Fleshy Souls)
			new Stat(37,16,14,12,13), // #145 Komiger (Fleshy Souls)
			new Stat(32,6,13,7,11), // #146 Baku
			new Stat(44,14,16,15,17), // #147 Bakulia
			new Stat(30,13,16,12,15), // #148 Whapir (Bony Spirits)
			new Stat(33,3,12,7,9), // #149 Drizzelda
			new Stat(40,14,11,10,17), // #150 Nekidspeed
			new Stat(35,7,14,8,10), // #151 Shmoopie
			new Stat(45,15,19,13,16), // #152 Pinkipoo
			new Stat(46,11,10,9,13), // #153 Pookivil
			new Stat(54,22,19,20,18), // #154 Harry Barry
			new Stat(38,11,14,12,13), // #155 Frostina
			new Stat(51,12,24,13,16), // #156 Blizzaria
			new Stat(51,15,20,13,14), // #157 Damona
			new Stat(47,12,13,10,15), // #158 Faux Kappa
			new Stat(40,23,24,20,25), // #159 Tigappa
			new Stat(53,24,29,25,27), // #160 Master Nyada
			new Stat(29,8,7,6,10), // #161 Wantston
			new Stat(34,9,6,5,7), // #162 Grubsnitch
			new Stat(30,8,5,7,6), // #163 Wiglin
			new Stat(36,14,15,12,16), // #164 Kelpacabana
			new Stat(31,7,8,10,9), // #165 Steppa
			new Stat(29,8,11,9,12), // #166 Rhyth
			new Stat(32,5,8,7,9), // #167 Hungramps (Fleshy Souls)
			new Stat(45,15,17,14,16), // #168 Hungorge (Fleshy Souls)
			new Stat(39,17,16,14,16), // #169 Grainpa
			new Stat(42,3,18,5,15), // #170 Tongus
			new Stat(48,6,23,7,20), // #171 Nurse Tongus
			new Stat(29,10,5,6,7), // #172 Sandmeh (Bony Spirits)
			new Stat(42,16,14,12,13), // #173 Mr. Sandmeh (Bony Spirits)
			new Stat(29,7,10,12,8), // #174 Pallysol
			new Stat(41,15,11,13,10), // #175 Scarasol
			new Stat(37,7,10,9,11), // #176 Lodo
			new Stat(44,17,19,15,16), // #177 Supoor Hero
			new Stat(40,11,9,8,11), // #178 Chippa
			new Stat(32,9,15,13,12), // #179 Gnomey
			new Stat(42,17,21,18,20), // #180 High Gnomey
			new Stat(32,10,8,7,11), // #181 Enerfly
			new Stat(39,7,11,8,10), // #182 Enefly
			new Stat(40,13,16,12,15), // #183 Betterfly
			new Stat(43,12,15,11,14), // #184 Peppillon
			new Stat(30,8,10,6,11), // #185 Predictabull
			new Stat(42,18,16,12,13), // #186 Smashibull
			new Stat(36,6,16,10,14), // #187 Don Chan
			new Stat(38,13,10,8,11), // #188 Ray O'Light
			new Stat(33,13,15,12,14), // #189 Happierre
			new Stat(38,18,20,17,19), // #190 Reversa
			new Stat(38,22,18,17,19), // #191 Reversette
			new Stat(46,16,21,14,19), // #192 Ol' Saint Trick
			new Stat(40,15,13,8,11), // #193 Ol' Fortune
			new Stat(46,12,16,15,13), // #194 Rollen
			new Stat(55,33,22,44,11), // #195 Dubbles
			new Stat(58,16,14,15,18), // #196 Papa Bolt
			new Stat(55,18,15,16,17), // #197 Uncle Infinite
			new Stat(39,10,17,12,18), // #198 Mama Aura
			new Stat(44,18,24,13,16), // #199 Auntie Heart
			new Stat(38,17,22,16,19), // #200 Kyryn
		};
	}

	private static Stat[] statA_2() {
		return new Stat[] {
			new Stat(46,19,14,12,15), // #201 Unikirin
			new Stat(28,10,4,6,7), // #202 Leadoni
			new Stat(41,20,10,19,18), // #203 Mynimo
			new Stat(30,12,8,11,13), // #204 Ake
			new Stat(45,16,12,14,13), // #205 Payn
			new Stat(44,13,9,10,8), // #206 Agon
			new Stat(41,3,10,5,13), // #207 Wydeawake
			new Stat(51,5,15,6,14), // #208 Allnyta
			new Stat(38,9,8,7,10), // #209 Herbiboy
			new Stat(46,13,10,12,11), // #210 Carniboy
			new Stat(37,12,7,4,10), // #211 Negatibuzz
			new Stat(42,14,12,10,15), // #212 Moskevil
			new Stat(51,13,18,15,17), // #213 Scritchy
			new Stat(34,11,9,8,12), // #214 Dimmy (Bony Spirits)
			new Stat(39,22,21,18,23), // #215 Blandon (Bony Spirits)
			new Stat(53,10,11,9,11), // #216 Nul
			new Stat(37,11,12,10,13), // #217 Suspicioni (Bony Spirits)
			new Stat(29,15,7,11,9), // #218 Tantroni
			new Stat(41,12,13,14,15), // #219 Contrarioni
			new Stat(35,5,10,13,11), // #220 Hidabat
			new Stat(46,13,14,16,12), // #221 Abodabat
			new Stat(43,14,12,15,13), // #222 Belfree
			new Stat(33,13,10,12,11), // #223 Yoink
			new Stat(40,15,12,14,17), // #224 Gimme
			new Stat(36,14,11,10,9), // #225 K'mon-K'mon
			new Stat(37,11,13,12,10), // #226 Yoodooit
			new Stat(31,11,8,10,12), // #227 Count Zapaway
			new Stat(39,15,10,13,14), // #228 Tyrat
			new Stat(36,9,13,10,11), // #229 Tengloom
			new Stat(50,15,20,16,18), // #230 Nird
			new Stat(41,12,15,13,14), // #231 Snobetty
			new Stat(40,16,13,10,12), // #232 Slimamander
			new Stat(43,19,16,15,19), // #233 Dracunyan
			new Stat(37,6,16,7,10), // #234 Negasus
			new Stat(38,16,6,10,7), // #235 Neighfarious
			new Stat(42,36,13,14,35), // #236 Timidevil
			new Stat(46,37,15,16,17), // #237 Beelzebold
			new Stat(41,14,18,12,15), // #238 Count Cavity
			new Stat(38,18,17,16,15), // #239 Eyesoar
			new Stat(46,16,18,17,14), // #240 Eyellure
			new Stat(53,9,32,18,21), // #241 Greesel
			new Stat(49,11,14,13,19), // #242 Awevil
			new Stat(43,18,18,14,16), // #243 Wobblewok
			new Stat(36,15,10,14,13), // #244 Coughkoff
			new Stat(36,7,12,14,10), // #245 Hurchin
			new Stat(26,6,10,8,13), // #246 Droplette
			new Stat(38,9,16,11,14), // #247 Drizzle
			new Stat(26,7,11,10,12), // #248 Slush
			new Stat(39,11,15,17,14), // #249 Alhail
			new Stat(41,5,11,7,9), // #250 Gush
			new Stat(36,13,10,12,11), // #251 Peckpocket
			new Stat(48,22,18,19,20), // #252 Robbinyu
			new Stat(34,7,9,13,8), // #253 Rockabelly (Fleshy Souls)
			new Stat(37,12,10,9,13), // #254 Squeeky
			new Stat(45,16,12,11,19), // #255 Rawry
			new Stat(40,5,12,6,7), // #256 Buhu
			new Stat(50,6,12,7,8), // #257 Flumpy
			new Stat(54,20,17,14,18), // #258 Skreek
			new Stat(40,15,12,7,18), // #259 Manjimutt
			new Stat(42,25,18,11,23), // #260 Multimutt
			new Stat(43,14,23,20,22), // #261 Sir Berus
			new Stat(31,5,9,4,8), // #262 Furgus
			new Stat(38,6,15,8,13), // #263 Furdinand
			new Stat(35,12,14,8,10), // #264 Nosirs
			new Stat(36,9,12,11,10), // #265 Dismarelda
			new Stat(33,6,10,5,7), // #266 Chatalie
			new Stat(36,17,13,14,16), // #267 Nagatha (Fleshy Souls)
			new Stat(34,8,11,7,10), // #268 Papa Windbag
			new Stat(31,8,9,7,10), // #269 Ben Tover
			new Stat(46,18,17,16,19), // #270 Cheeksqueek
			new Stat(45,19,22,18,20), // #271 Cuttincheez
			new Stat(35,7,11,9,10), // #272 Toiletta
			new Stat(42,10,16,11,14), // #273 Foiletta
			new Stat(43,15,19,17,14), // #274 Sproink
			new Stat(51,12,16,13,14), // #275 Compunzer
			new Stat(41,18,12,10,14), // #276 Lamedian
			new Stat(46,12,20,13,14), // #277 Grumples
			new Stat(48,15,21,16,17), // #278 Everfore
			new Stat(47,16,22,15,17), // #279 Eterna
			new Stat(43,15,17,14,18), // #280 Insomni
			new Stat(43,9,13,12,16), // #281 Sandi
			new Stat(62,17,52,14,18), // #282 Arachnus
			new Stat(39,15,12,10,13), // #283 Arachnia
			new Stat(33,4,8,5,7), // #284 Cricky
			new Stat(39,7,15,12,27), // #285 Noko
			new Stat(51,14,18,13,40), // #286 Bloominoko
			new Stat(52,24,20,21,23), // #287 Pandanoko
			new Stat(35,10,7,8,12), // #288 Snaggly
			new Stat(42,15,12,11,13), // #289 Whinona
			new Stat(36,13,10,12,11), // #290 Heheheel
			new Stat(36,13,11,9,10), // #291 Croonger
			new Stat(45,16,12,14,13), // #292 Urnaconda
			new Stat(41,13,15,8,7), // #293 Fishpicable
			new Stat(46,14,18,12,10), // #294 Rageon
			new Stat(55,15,8,10,7), // #295 Tunatic
			new Stat(38,6,16,15,12), // #296 Flushback
			new Stat(42,9,18,17,13), // #297 Vacuumory
			new Stat(35,12,7,8,11), // #298 Irewig
			new Stat(47,13,8,6,11), // #299 Firewig
			new Stat(32,5,10,6,7), // #300 Draggie
		};
	}

	private static Stat[] statA_3() {
		return new Stat[] {
			new Stat(41,11,13,10,12), // #301 Dragon Lord
			new Stat(43,20,12,10,11), // #302 Azure Dragon
			new Stat(39,13,19,11,16), // #303 Mermaidyn
			new Stat(42,15,23,13,18), // #304 Mermadonna
			new Stat(43,14,25,14,17), // #305 Mermother
			new Stat(36,12,8,9,11), // #306 Lady Longnek
			new Stat(41,1,8,7,50), // #307 Daiz
			new Stat(39,10,12,9,15), // #308 Confuze
			new Stat(41,12,6,8,9), // #309 Chummer
			new Stat(50,19,14,18,16), // #310 Shrook
			new Stat(45,13,12,15,11), // #311 Spenp
			new Stat(39,11,12,13,9), // #312 Almi
			new Stat(39,22,19,19,20), // #313 Babblong
			new Stat(54,27,24,20,26), // #314 Bananose
			new Stat(33,18,21,19,16), // #315 Draaagin
			new Stat(39,13,18,11,15), // #316 SV Snaggerjag
			new Stat(43,16,15,14,18), // #317 Copperled
			new Stat(40,12,15,14,13), // #318 Cynake
			new Stat(43,10,7,12,8), // #319 Slitheref
			new Stat(46,23,22,20,36), // #320 Venoct
			new Stat(44,14,16,12,15), // #321 Shadow Venoct
			new Stat(56,55,15,17,20), // #322 Shogunyan
			new Stat(57,18,54,19,21), // #323 Komashura
			new Stat(96,97,5,18,15), // #324 Gilgaros
			new Stat(53,17,18,15,55), // #325 Spoilerina
			new Stat(57,15,50,16,21), // #326 Elder Bloom
			new Stat(56,50,20,15,22), // #327 Poofessor
			new Stat(53,17,19,15,57), // #328 Dandoodle
			new Stat(97,86,87,15,56), // #329 Slurpent
			new Stat(40,17,21,18,20), // #330 Sapphinyan
			new Stat(37,20,23,21,22), // #331 Emenyan
			new Stat(40,23,19,20,21), // #332 Rubinyan
			new Stat(45,16,13,18,15), // #333 Topanyan
			new Stat(47,18,16,15,21), // #334 Dianyan
			new Stat(35,15,16,13,14), // #335 Melonyan
			new Stat(43,16,14,12,15), // #336 Oranyan
			new Stat(35,16,11,13,14), // #337 Kiwinyan
			new Stat(34,11,15,12,14), // #338 Grapenyan
			new Stat(35,17,18,16,20), // #339 Strawbnyan
			new Stat(40,21,19,22,20), // #340 Watermelnyan
			new Stat(46,8,14,9,12), // #341 Robokapp
			new Stat(41,8,15,10,11), // #342 Robokoma
			new Stat(40,9,15,13,11), // #343 Robogramps
			new Stat(39,10,7,9,11), // #344 Robomutt
			new Stat(38,8,14,15,16), // #345 Robonoko
			new Stat(44,15,20,18,19), // #346 Robodraggie
			new Stat(47,25,20,8,21), // #347 Wondernyan
			new Stat(82,30,4,24,14), // #348 Robonyan F
			new Stat(45,9,27,17,22), // #349 Sailornyan
			new Stat(76,30,5,12,16), // #350 Machonyan
			new Stat(40,21,18,16,22), // #351 Hovernyan
			new Stat(37,11,18,14,16), // #352 Darknyan
			new Stat(46,29,27,7,21), // #353 Jibakoma
			new Stat(43,6,28,15,26), // #354 Jetnyan
			new Stat(189,33,62,125,58), // #355 Unfairy
			new Stat(180,36,74,31,95), // #356 Unkaind
			new Stat(215,125,31,91,25), // #357 Untidy
			new Stat(177,32,110,33,65), // #358 Unpleasant
			new Stat(188,105,105,53,93), // #359 Unkeen
			new Stat(89,59,26,25,47), // #360 Grublappa
			new Stat(92,49,27,66,40), // #361 Madmunch
			new Stat(102,27,74,28,51), // #362 Badsmella
			new Stat(87,34,76,28,56), // #363 Mad Kappa
			new Stat(86,71,24,22,45), // #364 Shamasol
			new Stat(88,25,73,21,47), // #365 Gnomine
			new Stat(85,70,26,22,48), // #366 Defectabull
			new Stat(82,39,36,22,48), // #367 Feargus
			new Stat(89,22,74,20,46), // #368 Scaremaiden
			new Stat(92,61,63,27,50), // #369 Wrongnek
			new Stat(29,14,7,8,10), // #370 Grumpus Khan
			new Stat(42,16,12,13,16), // #371 Groupus Khan
			new Stat(31,12,11,10,9), // #372 Slumberhog
			new Stat(39,21,17,20,16), // #373 Snortlehog
			new Stat(33,10,6,7,11), // #374 Panja Pupil
			new Stat(40,13,9,10,14), // #375 Panja Pro
			new Stat(35,9,4,7,6), // #376 Samureel
			new Stat(36,11,5,11,6), // #377 Time Keeler
			new Stat(33,12,8,11,9), // #378 Takoyakid
			new Stat(48,13,9,12,11), // #379 Takoyaking
			new Stat(34,6,10,9,7), // #380 Danke Sand
			new Stat(44,9,16,13,10), // #381 No Sandkyu
			new Stat(34,11,7,13,8), // #382 Sumodon
			new Stat(37,13,7,15,9), // #383 Yokozudon
			new Stat(34,4,12,10,5), // #384 Whateverest
			new Stat(48,6,13,14,8), // #385 Whatuption
			new Stat(29,7,13,9,11), // #386 Happycane
			new Stat(37,12,18,14,16), // #387 Starrycane
			new Stat(53,1,13,3,35), // #430 Snottle
			new Stat(54,6,37,18,3), // #431 Moximous N
			new Stat(50,18,34,13,3), // #432 Moximous K
			new Stat(47,32,22,14,28), // #433 Jibanyan S
			new Stat(52,13,32,22,24), // #434 Komasan S
			new Stat(54,1,32,29,27), // #435 Komajiro S
			new Stat(53,22,36,14,29), // #436 Darkyubi
			new Stat(51,36,12,23,32), // #437 Illuminoct
			new Stat(358,135,9,2,87), // #438 Gargaros
			new Stat(358,2,112,20,99), // #439 Ogralus
			new Stat(362,60,70,82,26), // #440 Orcanos
		};
	}

	public static Stat[] statA = mergeStats(statA_0(), statA_1(), statA_2(), statA_3());

	private static Stat[] statB_0() {
		return new Stat[] {
			new Stat(319,160,70,82,130), // #1 Pandle
			new Stat(378,189,84,89,150), // #2 Undy
			new Stat(430,205,99,93,151), // #3 Tanbo
			new Stat(297,155,79,111,101), // #4 Cutta-nah
			new Stat(374,172,96,128,131), // #5 Cutta-nah-nah
			new Stat(397,195,102,138,146), // #6 Slacka-slash
			new Stat(297,141,88,77,162), // #7 Brushido
			new Stat(351,197,108,156,137), // #8 Washogun
			new Stat(287,144,93,78,162), // #9 Lie-in
			new Stat(346,203,138,133,195), // #10 Lie-in Heart
			new Stat(277,148,95,103,133), // #11 Hissfit
			new Stat(421,208,126,129,146), // #12 Zerberker
			new Stat(453,232,111,112,174), // #13 Snartle
			new Stat(369,171,65,116,104), // #14 Mochismo
			new Stat(378,177,37,142,91), // #15 Minochi
			new Stat(312,156,102,134,120), // #16 Tublappa
			new Stat(320,171,83,98,142), // #17 Slicenrice (Fleshy Souls)
			new Stat(351,195,186,127,156), // #18 Flamurice (Fleshy Souls)
			new Stat(358,160,68,148,95), // #19 Helmsman
			new Stat(402,203,84,193,143), // #20 Reuknight
			new Stat(438,227,88,205,126), // #21 Corptain
			new Stat(347,172,95,156,109), // #22 Mudmunch
			new Stat(400,200,50,128,122), // #23 Sgt. Burly
			new Stat(379,169,149,78,116), // #24 Blazion
			new Stat(391,185,166,63,142), // #25 Quaken
			new Stat(415,178,198,104,149), // #26 Siro
			new Stat(373,168,107,112,146), // #27 Chansin
			new Stat(399,206,121,138,161), // #28 Sheen
			new Stat(395,198,165,97,170), // #29 Snee
			new Stat(428,222,140,128,183), // #30 Gleam
			new Stat(391,198,77,93,146), // #31 Benkei
			new Stat(437,205,52,111,161), // #32 B3-NK1
			new Stat(354,188,126,118,160), // #33 Sushiyama
			new Stat(368,229,143,145,162), // #34 Kapunki
			new Stat(361,180,103,167,146), // #35 Beetler (Bony Spirits)
			new Stat(426,215,106,195,148), // #36 Beetall (Bony Spirits)
			new Stat(435,206,137,182,151), // #37 Cruncha
			new Stat(396,210,156,173,148), // #38 Demuncher
			new Stat(408,216,173,139,166), // #39 Devourer
			new Stat(294,70,156,74,159), // #40 Brokenbrella
			new Stat(288,53,149,98,173), // #41 Pittapatt
			new Stat(302,74,154,87,148), // #42 Snotsolong
			new Stat(322,87,153,109,137), // #43 Duchoo
			new Stat(288,94,132,103,124), // #44 D'wanna
			new Stat(349,106,173,116,145), // #45 N'more
			new Stat(363,142,174,108,119), // #46 Q'wit
			new Stat(252,76,150,87,192), // #47 Wazzat
			new Stat(332,99,187,156,185), // #48 Houzzat
			new Stat(268,55,146,84,204), // #49 Dummkap
			new Stat(317,92,164,108,154), // #50 Faysoff
			new Stat(306,103,155,113,144), // #51 Lafalotta
			new Stat(339,111,152,126,147), // #52 Blips
			new Stat(316,84,178,115,145), // #53 Tattletell
			new Stat(370,113,201,124,170), // #54 Tattlecast
			new Stat(331,111,192,99,166), // #55 Skranny
			new Stat(324,97,153,101,158), // #56 Cupistol
			new Stat(358,124,205,133,193), // #57 Casanuva
			new Stat(378,121,221,119,183), // #58 Casanono
			new Stat(329,93,172,75,148), // #59 So-Sorree
			new Stat(402,144,180,176,141), // #60 Bowminos
			new Stat(297,77,164,89,170), // #61 Smogling
			new Stat(353,112,194,136,207), // #62 Smogmella
			new Stat(305,119,143,108,155), // #63 Signibble
			new Stat(380,178,186,158,110), // #64 Signiton
			new Stat(398,173,205,160,141), // #65 Statiking
			new Stat(389,186,178,162,127), // #66 Master Oden
			new Stat(307,46,178,167,207), // #67 Failian
			new Stat(318,117,162,143,163), // #68 Apelican
			new Stat(331,101,167,154,128), // #69 Mirapo
			new Stat(365,120,197,193,135), // #70 Miradox
			new Stat(373,120,194,196,123), // #71 Mircle
			new Stat(332,90,186,98,151), // #72 Illoo
			new Stat(315,82,208,81,171), // #73 Elloo
			new Stat(357,131,195,112,163), // #74 Alloo
			new Stat(363,148,182,151,118), // #75 Espy
			new Stat(381,101,202,122,156), // #76 Infour
			new Stat(326,156,182,108,176), // #77 Verygoodsir
			new Stat(356,133,134,135,114), // #78 Tengu
			new Stat(378,148,152,121,96), // #79 Flengu
			new Stat(393,128,227,166,193), // #80 Kyubi
			new Stat(406,127,235,150,187), // #81 Frostail
			new Stat(378,185,204,146,173), // #82 Chymera
			new Stat(381,168,231,137,189), // #83 Kingmera
			new Stat(234,134,97,148,150), // #84 Terrorpotta
			new Stat(329,135,71,140,90), // #85 Dulluma
			new Stat(392,174,97,185,104), // #86 Darumacho
			new Stat(411,191,92,173,94), // #87 Goruma
			new Stat(260,80,138,148,141), // #88 Wotchagot
			new Stat(344,118,163,198,152), // #89 Pride Shrimp
			new Stat(270,128,52,152,165), // #90 No-Go Kart
			new Stat(350,183,81,172,189), // #91 Mistank
			new Stat(338,122,66,168,65), // #92 Noway (Bony Spirits)
			new Stat(419,169,89,217,121), // #93 Impass (Bony Spirits)
			new Stat(426,138,95,226,148), // #94 Walldin
			new Stat(328,129,47,149,115), // #95 Roughraff
			new Stat(389,188,94,171,136), // #96 Badude
			new Stat(391,198,101,185,153), // #97 Bruff
			new Stat(381,133,78,152,84), // #98 Armsman
			new Stat(298,156,55,162,153), // #99 Mimikin
			new Stat(367,127,69,150,106), // #100 Blowkade
		};
	}

	private static Stat[] statB_1() {
		return new Stat[] {
			new Stat(381,155,77,174,97), // #101 Ledballoon
			new Stat(343,126,101,151,112), // #102 Fidgephant
			new Stat(322,111,169,173,114), // #103 Touphant
			new Stat(379,186,132,183,134), // #104 Enduriphant
			new Stat(239,143,156,142,155), // #105 Zappary
			new Stat(337,148,192,182,181), // #106 Frazzel
			new Stat(356,128,143,172,102), // #107 Swelton
			new Stat(387,153,88,149,114), // #108 Mad Mountain
			new Stat(407,143,134,147,136), // #109 Lava Lord
			new Stat(353,133,97,165,117), // #110 Castelius III
			new Stat(368,145,109,181,128), // #111 Castelius II
			new Stat(402,157,123,203,141), // #112 Castelius I
			new Stat(428,162,131,227,159), // #113 Castelius Max
			new Stat(402,163,105,182,102), // #114 Rhinoggin (Fleshy Souls)
			new Stat(429,184,107,210,155), // #115 Rhinormous (Fleshy Souls)
			new Stat(431,206,84,219,172), // #116 Hornaplenty
			new Stat(406,161,126,189,166), // #117 Robonyan
			new Stat(431,162,105,207,194), // #118 Goldenyan
			new Stat(426,178,93,228,93), // #119 Dromp
			new Stat(451,85,174,246,132), // #120 Swosh
			new Stat(388,217,145,197,168), // #121 Toadal Dude
			new Stat(391,154,198,204,157), // #122 Uber Geeko
			new Stat(294,134,78,65,177), // #123 Leggly
			new Stat(281,120,79,131,139), // #124 Dazzabel
			new Stat(346,145,108,141,159), // #125 Rattelle
			new Stat(378,143,129,164,156), // #126 Skelebella
			new Stat(289,135,102,90,138), // #127 Cadin
			new Stat(343,165,117,106,156), // #128 Cadable
			new Stat(385,169,141,101,181), // #129 Singcada
			new Stat(271,118,128,91,135), // #130 Pupsicle (Fleshy Souls)
			new Stat(343,167,203,136,163), // #131 Chilhuahua (Fleshy Souls)
			new Stat(370,186,196,151,179), // #132 Swelterrier
			new Stat(318,87,142,111,164), // #133 Jumbelina
			new Stat(307,152,88,122,160), // #134 Boyclops
			new Stat(322,153,90,108,165), // #135 Jibanyan
			new Stat(344,159,138,143,187), // #136 Thornyan
			new Stat(380,171,75,162,183), // #137 Baddinyan
			new Stat(313,174,139,97,185), // #138 Buchinyan
			new Stat(305,98,157,108,151), // #139 Walkappa (Bony Spirits)
			new Stat(368,176,179,119,162), // #140 Appak (Bony Spirits)
			new Stat(382,168,193,130,159), // #141 Supyo
			new Stat(310,103,162,114,149), // #142 Komasan
			new Stat(382,135,194,139,179), // #143 Komane
			new Stat(276,128,131,125,153), // #144 Komajiro (Fleshy Souls)
			new Stat(355,174,170,151,162), // #145 Komiger (Fleshy Souls)
			new Stat(306,105,148,121,143), // #146 Baku
			new Stat(358,121,169,145,172), // #147 Bakulia
			new Stat(298,130,175,129,173), // #148 Whapir (Bony Spirits)
			new Stat(327,67,182,134,176), // #149 Drizzelda
			new Stat(338,158,94,78,222), // #150 Nekidspeed
			new Stat(344,106,162,109,155), // #151 Shmoopie
			new Stat(367,126,189,113,174), // #152 Pinkipoo
			new Stat(381,182,148,143,188), // #153 Pookivil
			new Stat(342,192,146,168,130), // #154 Harry Barry
			new Stat(349,115,181,123,168), // #155 Frostina
			new Stat(373,128,214,147,200), // #156 Blizzaria
			new Stat(389,184,207,157,166), // #157 Damona
			new Stat(355,168,180,126,188), // #158 Faux Kappa
			new Stat(379,189,195,118,221), // #159 Tigappa
			new Stat(380,138,231,164,197), // #160 Master Nyada
			new Stat(281,129,116,98,136), // #161 Wantston
			new Stat(319,146,120,102,144), // #162 Grubsnitch
			new Stat(295,141,105,117,111), // #163 Wiglin
			new Stat(308,152,158,121,168), // #164 Kelpacabana
			new Stat(288,103,121,132,125), // #165 Steppa
			new Stat(267,98,153,111,176), // #166 Rhyth
			new Stat(300,85,133,108,142), // #167 Hungramps (Fleshy Souls)
			new Stat(368,136,184,132,155), // #168 Hungorge (Fleshy Souls)
			new Stat(357,181,154,127,156), // #169 Grainpa
			new Stat(296,63,158,68,153), // #170 Tongus
			new Stat(350,108,183,117,172), // #171 Nurse Tongus
			new Stat(273,147,100,102,136), // #172 Sandmeh (Bony Spirits)
			new Stat(357,165,153,138,153), // #173 Mr. Sandmeh (Bony Spirits)
			new Stat(285,105,123,134,118), // #174 Pallysol
			new Stat(394,186,143,182,120), // #175 Scarasol
			new Stat(331,111,131,125,135), // #176 Lodo
			new Stat(351,163,182,149,159), // #177 Supoor Hero
			new Stat(352,162,116,106,157), // #178 Chippa
			new Stat(301,89,150,138,133), // #179 Gnomey
			new Stat(378,118,197,137,178), // #180 High Gnomey
			new Stat(269,143,133,110,150), // #181 Enerfly
			new Stat(305,104,155,107,134), // #182 Enefly
			new Stat(366,142,195,119,179), // #183 Betterfly
			new Stat(387,153,215,149,194), // #184 Peppillon
			new Stat(298,131,136,101,143), // #185 Predictabull
			new Stat(408,203,176,151,159), // #186 Smashibull
			new Stat(317,82,186,159,162), // #187 Don Chan
			new Stat(333,167,148,103,150), // #188 Ray O'Light
			new Stat(332,119,164,116,147), // #189 Happierre
			new Stat(366,145,181,141,160), // #190 Reversa
			new Stat(379,181,166,135,169), // #191 Reversette
			new Stat(350,125,177,124,171), // #192 Ol' Saint Trick
			new Stat(339,177,148,139,144), // #193 Ol' Fortune
			new Stat(345,143,166,152,145), // #194 Rollen
			new Stat(333,177,166,188,155), // #195 Dubbles
			new Stat(364,165,141,148,176), // #196 Papa Bolt
			new Stat(422,191,160,161,182), // #197 Uncle Infinite
			new Stat(347,124,186,146,196), // #198 Mama Aura
			new Stat(401,159,207,134,200), // #199 Auntie Heart
			new Stat(371,165,206,143,199), // #200 Kyryn
		};
	}

	private static Stat[] statB_2() {
		return new Stat[] {
			new Stat(386,206,183,132,196), // #201 Unikirin
			new Stat(278,148,87,110,141), // #202 Leadoni
			new Stat(307,145,113,134,130), // #203 Mynimo
			new Stat(256,122,114,115,146), // #204 Ake
			new Stat(342,188,116,129,121), // #205 Payn
			new Stat(388,202,126,148,105), // #206 Agon
			new Stat(339,60,142,69,155), // #207 Wydeawake
			new Stat(399,83,200,97,196), // #208 Allnyta
			new Stat(278,131,130,90,136), // #209 Herbiboy
			new Stat(327,195,146,156,151), // #210 Carniboy
			new Stat(279,136,123,98,126), // #211 Negatibuzz
			new Stat(321,144,142,124,161), // #212 Moskevil
			new Stat(407,105,197,142,184), // #213 Scritchy
			new Stat(286,139,103,75,156), // #214 Dimmy (Bony Spirits)
			new Stat(349,186,154,90,191), // #215 Blandon (Bony Spirits)
			new Stat(361,161,183,134,186), // #216 Nul
			new Stat(288,126,149,123,133), // #217 Suspicioni (Bony Spirits)
			new Stat(290,161,94,144,130), // #218 Tantroni
			new Stat(312,136,153,172,183), // #219 Contrarioni
			new Stat(299,111,128,145,129), // #220 Hidabat
			new Stat(347,156,166,181,154), // #221 Abodabat
			new Stat(361,159,156,203,158), // #222 Belfree
			new Stat(317,146,96,143,127), // #223 Yoink
			new Stat(339,182,125,163,183), // #224 Gimme
			new Stat(316,163,156,140,124), // #225 K'mon-K'mon
			new Stat(325,121,173,153,120), // #226 Yoodooit
			new Stat(295,168,103,151,183), // #227 Count Zapaway
			new Stat(316,180,82,134,166), // #228 Tyrat
			new Stat(323,111,169,128,159), // #229 Tengloom
			new Stat(366,101,193,119,155), // #230 Nird
			new Stat(342,125,187,146,161), // #231 Snobetty
			new Stat(343,201,152,134,145), // #232 Slimamander
			new Stat(328,200,138,117,192), // #233 Dracunyan
			new Stat(343,118,202,145,199), // #234 Negasus
			new Stat(365,202,124,199,145), // #235 Neighfarious
			new Stat(322,212,144,158,209), // #236 Timidevil
			new Stat(359,213,158,172,184), // #237 Beelzebold
			new Stat(402,177,203,125,197), // #238 Count Cavity
			new Stat(356,192,186,169,131), // #239 Eyesoar
			new Stat(403,176,210,181,136), // #240 Eyellure
			new Stat(397,137,194,165,170), // #241 Greesel
			new Stat(421,141,205,148,195), // #242 Awevil
			new Stat(397,194,194,158,160), // #243 Wobblewok
			new Stat(348,145,48,120,106), // #244 Coughkoff
			new Stat(347,55,152,153,123), // #245 Hurchin
			new Stat(234,81,173,88,179), // #246 Droplette
			new Stat(346,106,204,141,148), // #247 Drizzle
			new Stat(259,62,143,138,153), // #248 Slush
			new Stat(367,76,166,195,141), // #249 Alhail
			new Stat(351,53,185,109,140), // #250 Gush
			new Stat(274,152,95,126,111), // #251 Peckpocket
			new Stat(341,193,122,145,158), // #252 Robbinyu
			new Stat(310,96,140,147,123), // #253 Rockabelly (Fleshy Souls)
			new Stat(276,143,103,78,156), // #254 Squeeky
			new Stat(346,183,116,97,206), // #255 Rawry
			new Stat(287,95,141,107,124), // #256 Buhu
			new Stat(327,116,164,119,152), // #257 Flumpy
			new Stat(375,189,173,124,177), // #258 Skreek
			new Stat(273,142,114,94,145), // #259 Manjimutt
			new Stat(351,200,137,132,158), // #260 Multimutt
			new Stat(379,135,197,144,171), // #261 Sir Berus
			new Stat(267,80,168,68,165), // #262 Furgus
			new Stat(359,126,192,152,188), // #263 Furdinand
			new Stat(290,155,163,89,132), // #264 Nosirs
			new Stat(323,91,155,145,120), // #265 Dismarelda
			new Stat(312,121,143,103,141), // #266 Chatalie
			new Stat(342,180,98,128,150), // #267 Nagatha (Fleshy Souls)
			new Stat(331,126,177,104,158), // #268 Papa Windbag
			new Stat(304,136,165,113,178), // #269 Ben Tover
			new Stat(313,157,133,112,165), // #270 Cheeksqueek
			new Stat(353,150,188,141,183), // #271 Cuttincheez
			new Stat(310,109,170,139,167), // #272 Toiletta
			new Stat(345,136,204,164,179), // #273 Foiletta
			new Stat(335,151,182,163,144), // #274 Sproink
			new Stat(352,140,185,158,182), // #275 Compunzer
			new Stat(387,186,139,131,174), // #276 Lamedian
			new Stat(321,110,194,121,166), // #277 Grumples
			new Stat(377,141,207,152,198), // #278 Everfore
			new Stat(413,170,199,132,191), // #279 Eterna
			new Stat(378,147,184,132,189), // #280 Insomni
			new Stat(421,138,199,146,204), // #281 Sandi
			new Stat(381,168,217,160,189), // #282 Arachnus
			new Stat(388,207,154,153,202), // #283 Arachnia
			new Stat(300,78,152,85,149), // #284 Cricky
			new Stat(299,57,156,60,196), // #285 Noko
			new Stat(377,121,200,116,221), // #286 Bloominoko
			new Stat(348,202,143,150,197), // #287 Pandanoko
			new Stat(287,131,98,102,145), // #288 Snaggly
			new Stat(366,176,168,145,172), // #289 Whinona
			new Stat(301,150,104,122,116), // #290 Heheheel
			new Stat(312,158,152,127,133), // #291 Croonger
			new Stat(336,176,106,143,121), // #292 Urnaconda
			new Stat(317,130,137,129,108), // #293 Fishpicable
			new Stat(351,153,179,152,126), // #294 Rageon
			new Stat(398,204,138,170,126), // #295 Tunatic
			new Stat(294,70,152,143,118), // #296 Flushback
			new Stat(364,141,200,182,145), // #297 Vacuumory
			new Stat(319,171,83,101,156), // #298 Irewig
			new Stat(434,214,123,86,183), // #299 Firewig
			new Stat(315,102,148,117,139), // #300 Draggie
		};
	}

	private static Stat[] statB_3() {
		return new Stat[] {
			new Stat(407,154,202,145,176), // #301 Dragon Lord
			new Stat(433,193,173,143,166), // #302 Azure Dragon
			new Stat(277,100,153,97,150), // #303 Mermaidyn
			new Stat(372,156,213,158,183), // #304 Mermadonna
			new Stat(382,143,221,179,177), // #305 Mermother
			new Stat(342,153,126,128,149), // #306 Lady Longnek
			new Stat(347,43,167,142,207), // #307 Daiz
			new Stat(331,141,186,124,172), // #308 Confuze
			new Stat(362,157,105,132,142), // #309 Chummer
			new Stat(408,181,87,161,123), // #310 Shrook
			new Stat(334,135,122,188,119), // #311 Spenp
			new Stat(351,126,175,199,116), // #312 Almi
			new Stat(347,152,96,140,147), // #313 Babblong
			new Stat(373,191,138,134,184), // #314 Bananose
			new Stat(327,158,192,167,126), // #315 Draaagin
			new Stat(337,139,201,135,163), // #316 SV Snaggerjag
			new Stat(378,143,119,138,172), // #317 Copperled
			new Stat(357,115,185,155,138), // #318 Cynake
			new Stat(384,168,149,170,158), // #319 Slitheref
			new Stat(389,202,172,130,214), // #320 Venoct
			new Stat(409,165,200,142,191), // #321 Shadow Venoct
			new Stat(389,219,135,143,238), // #322 Shogunyan
			new Stat(406,131,253,140,192), // #323 Komashura
			new Stat(465,253,78,198,151), // #324 Gilgaros
			new Stat(388,146,200,144,246), // #325 Spoilerina
			new Stat(363,138,236,153,233), // #326 Elder Bloom
			new Stat(424,201,197,103,198), // #327 Poofessor
			new Stat(417,148,211,126,222), // #328 Dandoodle
			new Stat(488,178,179,133,167), // #329 Slurpent
			new Stat(357,127,206,139,186), // #330 Sapphinyan
			new Stat(343,147,189,148,188), // #331 Emenyan
			new Stat(387,206,131,132,159), // #332 Rubinyan
			new Stat(410,157,101,206,141), // #333 Topanyan
			new Stat(369,154,145,141,206), // #334 Dianyan
			new Stat(354,167,168,161,165), // #335 Melonyan
			new Stat(372,169,132,106,166), // #336 Oranyan
			new Stat(334,192,108,149,162), // #337 Kiwinyan
			new Stat(328,115,194,138,170), // #338 Grapenyan
			new Stat(337,145,156,110,197), // #339 Strawbnyan
			new Stat(340,171,143,206,155), // #340 Watermelnyan
			new Stat(338,168,182,178,179), // #341 Robokapp
			new Stat(334,145,203,170,193), // #342 Robokoma
			new Stat(320,152,176,165,162), // #343 Robogramps
			new Stat(340,172,116,156,191), // #344 Robomutt
			new Stat(306,61,183,206,219), // #345 Robonoko
			new Stat(315,105,199,176,180), // #346 Robodraggie
			new Stat(357,184,146,115,173), // #347 Wondernyan
			new Stat(390,201,106,173,145), // #348 Robonyan F
			new Stat(349,131,199,147,189), // #349 Sailornyan
			new Stat(411,203,101,136,164), // #350 Machonyan
			new Stat(332,193,136,101,211), // #351 Hovernyan
			new Stat(340,148,203,154,195), // #352 Darknyan
			new Stat(335,198,186,120,176), // #353 Jibakoma
			new Stat(346,104,194,138,193), // #354 Jetnyan
			new Stat(514,110,193,247,166), // #355 Unfairy
			new Stat(469,176,183,152,250), // #356 Unkaind
			new Stat(522,254,86,218,150), // #357 Untidy
			new Stat(472,144,254,168,192), // #358 Unpleasant
			new Stat(461,215,211,138,205), // #359 Unkeen
			new Stat(384,186,118,104,138), // #360 Grublappa
			new Stat(423,204,112,123,138), // #361 Madmunch
			new Stat(424,88,217,102,223), // #362 Badsmella
			new Stat(389,189,203,64,205), // #363 Mad Kappa
			new Stat(344,158,120,89,149), // #364 Shamasol
			new Stat(359,151,173,85,162), // #365 Gnomine
			new Stat(369,176,154,78,158), // #366 Defectabull
			new Stat(335,107,189,52,179), // #367 Feargus
			new Stat(384,106,189,63,188), // #368 Scaremaiden
			new Stat(397,186,168,91,158), // #369 Wrongnek
			new Stat(280,166,99,110,150), // #370 Grumpus Khan
			new Stat(336,186,106,128,189), // #371 Groupus Khan
			new Stat(305,158,147,114,106), // #372 Slumberhog
			new Stat(343,177,150,166,109), // #373 Snortlehog
			new Stat(286,161,82,104,172), // #374 Panja Pupil
			new Stat(331,182,103,126,203), // #375 Panja Pro
			new Stat(319,175,75,147,114), // #376 Samureel
			new Stat(363,203,87,194,98), // #377 Time Keeler
			new Stat(320,169,74,135,107), // #378 Takoyakid
			new Stat(384,190,78,163,130), // #379 Takoyaking
			new Stat(325,73,156,148,103), // #380 Danke Sand
			new Stat(378,90,188,176,113), // #381 No Sandkyu
			new Stat(317,158,74,161,95), // #382 Sumodon
			new Stat(366,194,89,182,114), // #383 Yokozudon
			new Stat(326,54,178,172,75), // #384 Whateverest
			new Stat(368,62,207,216,92), // #385 Whatuption
			new Stat(284,85,163,123,150), // #386 Happycane
			new Stat(338,102,183,145,177), // #387 Starrycane
			new Stat(395,56,134,58,192), // #430 Snottle
			new Stat(366,189,116,121,171), // #431 Moximous N
			new Stat(351,106,205,114,187), // #432 Moximous K
			new Stat(411,194,168,114,193), // #433 Jibanyan S
			new Stat(417,101,222,163,207), // #434 Komasan S
			new Stat(431,72,205,202,200), // #435 Komajiro S
			new Stat(417,103,238,153,199), // #436 Darkyubi
			new Stat(413,216,103,177,201), // #437 Illuminoct
			new Stat(480,236,133,178,183), // #438 Gargaros
			new Stat(461,182,220,179,168), // #439 Ogralus
			new Stat(502,245,83,250,140), // #440 Orcanos
		};
	}

	public static Stat[] statB = mergeStats(statB_0(), statB_1(), statB_2(), statB_3());

	private static Stat[] mergeStats(Stat[]... arrays) {
		int total = 0; for (Stat[] a : arrays) total += a.length;
		Stat[] result = new Stat[total]; int i = 0;
		for (Stat[] a : arrays) for (Stat s : a) result[i++] = s; return result;
	}

	private static Yokai[] medaillum_0() {
		return new Yokai[] {
			new Yokai("Pandle", 1, E, Brave, false, statA[0], statB[0], ListAttack[27], ListTechnique[4], "Careless", inspiritList[0], Water, 1.3, Fire, 0.7, 0.6, 0.25, 0.1, 0.05, 0.7, 1),
			new Yokai("Undy", 2, C, Brave, false, statA[1], statB[1], ListAttack[29], ListTechnique[4], "Careless", inspiritList[1], Water, 1.5, Fire, 0.5, 0.65, 0.2, 0.1, 0.05, 0.75, 1),
			new Yokai("Tanbo", 3, B, Brave, false, statA[2], statB[2], ListAttack[29], ListTechnique[12], "Careless", inspiritList[2], Wind, 1.8, Earth, 0.5, 0.7, 0.15, 0.1, 0.05, 0.8, 2),
			new Yokai("Cutta-nah", 4, E, Brave, false, statA[3], statB[3], ListAttack[8], ListTechnique[23], "Bladed Body", inspiritList[3], Ice, 1.3, Wind, 0.7, 0.65, 0.15, 0.15, 0.05, 0.7, 1),
			new Yokai("Cutta-nah-nah", 5, C, Brave, false, statA[4], statB[4], ListAttack[8], ListTechnique[23], "Bladed Body", inspiritList[4], Ice, 1.5, Wind, 0.5, 0.65, 0.15, 0.1, 0.1, 0.75, 1),
			new Yokai("Slacka-slash", 6, B, Brave, false, statA[5], statB[5], ListAttack[8], ListTechnique[6], "Bladed Body", inspiritList[4], Fire, 1.3, Water, 0.7, 0.7, 0.1, 0.1, 0.1, 0.8, 1),
			new Yokai("Brushido", 7, E, Brave, false, statA[6], statB[6], ListAttack[27], ListTechnique[6], "Washed Out", inspiritList[5], Fire, 1.3, Ice, 0.7, 0.55, 0.25, 0.1, 0.1, 0.7, 1),
			new Yokai("Washogun", 8, B, Brave, false, statA[7], statB[7], ListAttack[39], ListTechnique[5], "Washed Out", inspiritList[6], Fire, 1.5, Ice, 0.5, 0.65, 0.25, 0.05, 0.05, 0.8, 1),
			new Yokai("Lie-in", 9, E, Brave, false, statA[8], statB[8], ListAttack[32], ListTechnique[6], "Hard Worker", inspiritList[7], Fire, 1.3, Ice, 0.7, 0.55, 0.1, 0.25, 0.1, 0.7, 2),
			new Yokai("Lie-in Heart", 10, A, Brave, false, statA[9], statB[9], ListAttack[20], ListTechnique[5], "Lie-in Wait", inspiritList[7], Fire, 1.5, Ice, 0.5, 0.65, 0.15, 0.15, 0.05, 0.85, 2),
			new Yokai("Hissfit", 11, E, Brave, false, statA[10], statB[10], ListAttack[8], ListTechnique[4], "Annoyance", inspiritList[8], Water, 1.3, Fire, 0.7, 0.6, 0.25, 0.1, 0.05, 0.7, 1),
			new Yokai("Zerberker", 12, A, Brave, false, statA[11], statB[11], ListAttack[20], ListTechnique[4], "Annoyance", inspiritList[9], Water, 1.5, Fire, 0.5, 0.75, 0.15, 0.05, 0.05, 0.85, 1),
			new Yokai("Snartle", 13, S, Brave, false, statA[12], statB[12], ListAttack[20], ListTechnique[5], "Sword Hunting", inspiritList[10], Fire, 1.3, Water, 0.7, 0.75, 0.1, 0.1, 0.05, 0.9, 1),
			new Yokai("Mochismo", 14, D, Brave, false, statA[13], statB[13], ListAttack[30], ListTechnique[12], "Soft Skin", inspiritList[11], Wind, 1.3, Earth, 0.7, 0.65, 0.2, 0.1, 0.05, 0.75, 2),
			new Yokai("Minochi", 15, D, Brave, false, statA[14], statB[14], ListAttack[30], ListTechnique[4], "Soft Skin", inspiritList[12], Water, 1.5, Fire, 0.5, 0.7, 0.15, 0.1, 0.05, 0.75, 2),
			new Yokai("Tublappa", 16, D, Brave, false, statA[15], statB[15], ListAttack[37], ListTechnique[17], "Lickaway", inspiritList[13], Earth, 1.3, Thunder, 0.7, 0.6, 0.2, 0.15, 0.05, 0.75, 1),
			new Yokai("Slicenrice", 17, D, Brave, false, statA[16], statB[16], ListAttack[8], ListTechnique[7], "Rice and Dice", inspiritList[14], Ice, 1.3, Fire, 0.7, 0.65, 0.15, 0.1, 0.1, 0.75, 1),
			new Yokai("Flamurice", 18, A, Brave, false, statA[17], statB[17], ListAttack[20], ListTechnique[1], "Rice and Dice", inspiritList[15], Water, 1.8, Fire, 0.3, 0.65, 0.25, 0.05, 0.05, 0.85, 1),
			new Yokai("Helmsman", 19, D, Brave, false, statA[18], statB[18], ListAttack[15], ListTechnique[17], "Spirit Guard", inspiritList[16], Earth, 1.3, Thunder, 0.7, 0.6, 0.2, 0.1, 0.1, 0.75, 1),
			new Yokai("Reuknight", 20, A, Brave, false, statA[19], statB[19], ListAttack[41], ListTechnique[9], "Spirit Guard", inspiritList[17], Earth, 1.5, Thunder, 0.5, 0.65, 0.15, 0.1, 0.1, 0.85, 1),
			new Yokai("Corptain", 21, S, Brave, false, statA[20], statB[20], ListAttack[41], ListTechnique[3], "Spirit Guard", inspiritList[18], Water, 1.5, Fire, 0.5, 0.65, 0.15, 0.15, 0.05, 0.9, 1),
			new Yokai("Mudmunch", 22, C, Brave, false, statA[21], statB[21], ListAttack[30], ListTechnique[16], "Sludge Grudge", inspiritList[19], Wind, 1.5, Earth, 0.5, 0.6, 0.15, 0.15, 0.1, 0.75, 1),
			new Yokai("Sgt. Burly", 23, C, Brave, false, statA[22], statB[22], ListAttack[30], ListTechnique[9], "Gimme Twenty", inspiritList[20], Earth, 1.5, Thunder, 0.5, 0.8, 0.1, 0.05, 0.05, 0.75, 1),
			new Yokai("Blazion", 24, C, Brave, false, statA[23], statB[23], ListAttack[31], ListTechnique[1], "Blazing Spirit", inspiritList[21], Water, 1.8, Fire, 0.3, 0.5, 0.35, 0.1, 0.05, 0.75, 1),
			new Yokai("Quaken", 25, B, Brave, false, statA[24], statB[24], ListAttack[31], ListTechnique[16], "Courageous Spirit", inspiritList[22], Water, 1.8, Earth, 0.3, 0.5, 0.35, 0.1, 0.05, 0.8, 1),
			new Yokai("Siro", 26, A, Brave, false, statA[25], statB[25], ListAttack[31], ListTechnique[9], "Shining Spirit", inspiritList[23], Earth, 1.8, Thunder, 0.5, 0.45, 0.4, 0.1, 0.05, 0.85, 1),
			new Yokai("Chansin", 27, C, Brave, false, statA[26], statB[26], ListAttack[25], ListTechnique[4], "Gambler", inspiritList[24], Water, 1.3, Fire, 0.7, 0.6, 0.2, 0.15, 0.05, 0.75, 1),
			new Yokai("Sheen", 28, A, Brave, false, statA[27], statB[27], ListAttack[20], ListTechnique[23], "Light Speed", inspiritList[25], Ice, 1.5, Wind, 0.5, 0.7, 0.15, 0.1, 0.05, 0.85, 1),
			new Yokai("Snee", 29, A, Brave, false, statA[28], statB[28], ListAttack[20], ListTechnique[0], "Cursed Skin", inspiritList[26], Thunder, 1.5, Ice, 0.5, 0.5, 0.25, 0.2, 0.05, 0.85, 1),
			new Yokai("Gleam", 30, S, Brave, false, statA[29], statB[29], ListAttack[20], ListTechnique[17], "Light Speed", inspiritList[27], Earth, 1.8, Thunder, 0.5, 0.75, 0.1, 0.1, 0.05, 0.9, 1),
			new Yokai("Benkei", 31, C, Brave, false, statA[30], statB[30], ListAttack[20], ListTechnique[6], "Sword Hunting", inspiritList[28], Fire, 1.8, Ice, 0.5, 0.7, 0.1, 0.15, 0.05, 0.75, 1),
			new Yokai("B3-NK1", 32, B, Brave, false, statA[31], statB[31], ListAttack[20], ListTechnique[17], "Sword Hunting", inspiritList[29], Earth, 1.8, Thunder, 0.5, 0.75, 0.1, 0.1, 0.05, 0.8, 1),
			new Yokai("Sushiyama", 33, B, Brave, false, statA[32], statB[32], ListAttack[14], ListTechnique[5], "Guard Break", inspiritList[30], Fire, 1.5, Ice, 0.5, 0.55, 0.25, 0.15, 0.05, 0.8, 1),
			new Yokai("Kapunki", 34, A, Brave, false, statA[33], statB[33], ListAttack[14], ListTechnique[1], "The Stand", inspiritList[31], Earth, 1.3, Thunder, 0.7, 0.5, 0.35, 0.1, 0.05, 0.85, 1),
			new Yokai("Beetler", 35, B, Brave, false, statA[34], statB[34], ListAttack[25], ListTechnique[12], "Too Serious", inspiritList[32], Wind, 1.5, Earth, 0.7, 0.65, 0.15, 0.1, 0.1, 0.8, 1),
			new Yokai("Beetall", 36, S, Brave, false, statA[35], statB[35], ListAttack[22], ListTechnique[5], "Intimidation", inspiritList[33], Fire, 1.5, Earth, 0.5, 0.75, 0.1, 0.05, 0.1, 0.9, 1),
			new Yokai("Cruncha", 37, S, Brave, false, statA[36], statB[36], ListAttack[22], ListTechnique[9], "Intimidation", inspiritList[34], Ice, 1.8, Thunder, 0.5, 0.7, 0.1, 0.1, 0.1, 0.9, 1),
			new Yokai("Demuncher", 38, S, Brave, false, statA[37], statB[37], ListAttack[21], ListTechnique[16], "Sneaky Snacker", inspiritList[35], Wind, 1.8, Earth, 0.3, 0.7, 0.15, 0.1, 0.05, 0.9, 1),
			new Yokai("Devourer", 39, S, Brave, false, statA[38], statB[38], ListAttack[21], ListTechnique[14], "Soul Snacker", inspiritList[36], Fire, 1.8, Water, 0.2, 0.65, 0.2, 0.1, 0.05, 0.9, 1),
			new Yokai("Brokenbrella", 40, E, Mysterious, false, statA[39], statB[39], ListAttack[3], ListTechnique[23], "Gust o' Gusto", inspiritList[37], Ice, 1.5, Wind, 0.5, 0.2, 0.65, 0.1, 0.05, 0.7, 1),
			new Yokai("Pittapatt", 41, E, Mysterious, false, statA[40], statB[40], ListAttack[3], ListTechnique[12], "Got Your Back", inspiritList[38], Wind, 1.3, Earth, 0.7, 0.15, 0.55, 0.2, 0.1, 0.7, 1),
			new Yokai("Snotsolong", 42, E, Mysterious, false, statA[41], statB[41], ListAttack[27], ListTechnique[20], "Water Play", inspiritList[39], Thunder, 1.5, Water, 0.5, 0.1, 0.6, 0.25, 0.05, 0.7, 2),
			new Yokai("Duchoo", 43, D, Mysterious, false, statA[42], statB[42], ListAttack[27], ListTechnique[5], "Snow Play", inspiritList[40], Fire, 2.0, Water, 0.5, 0.05, 0.7, 0.2, 0.05, 0.7, 2),
			new Yokai("D'wanna", 44, E, Mysterious, false, statA[43], statB[43], ListAttack[17], ListTechnique[7], "Soothing Rhythm", inspiritList[41], Earth, 1.3, Thunder, 0.7, 0.15, 0.6, 0.2, 0.05, 0.7, 1),
			new Yokai("N'more", 45, C, Mysterious, false, statA[44], statB[44], ListAttack[1], ListTechnique[15], "Soothing Rhythm", inspiritList[41], Earth, 1.3, Thunder, 0.7, 0.15, 0.6, 0.2, 0.05, 0.75, 1),
			new Yokai("Q'wit", 46, C, Mysterious, false, statA[45], statB[45], ListAttack[1], ListTechnique[16], "Soothing Rhythm", inspiritList[42], Wind, 1.5, Earth, 0.5, 0.2, 0.55, 0.2, 0.05, 0.75, 1),
			new Yokai("Wazzat", 47, E, Mysterious, false, statA[46], statB[46], ListAttack[2], ListTechnique[23], "Forgot to Guard", inspiritList[43], Ice, 1.5, Wind, 0.5, 0.1, 0.55, 0.3, 0.05, 0.7, 1),
			new Yokai("Houzzat", 48, B, Mysterious, false, statA[47], statB[47], ListAttack[6], ListTechnique[19], "Forgot to Guard", inspiritList[44], Ice, 1.8, Wind, 0.3, 0.05, 0.6, 0.25, 0.1, 0.75, 1),
			new Yokai("Dummkap", 49, E, Mysterious, false, statA[48], statB[48], ListAttack[2], ListTechnique[17], "Prediction", inspiritList[45], Earth, 1.5, Thunder, 0.7, 0.05, 0.6, 0.3, 0.05, 0.7, 2),
			new Yokai("Faysoff", 50, D, Mysterious, false, statA[49], statB[49], ListAttack[16], ListTechnique[20], "Bony Bond", inspiritList[46], Thunder, 1.3, Water, 0.7, 0.1, 0.6, 0.25, 0.05, 0.7, 2),
			new Yokai("Lafalotta", 51, D, Mysterious, false, statA[50], statB[50], ListAttack[16], ListTechnique[0], "Hanging In", inspiritList[47], Wind, 1.3, Earth, 0.7, 0.15, 0.6, 0.2, 0.05, 0.7, 1),
			new Yokai("Blips", 52, C, Mysterious, false, statA[51], statB[51], ListAttack[16], ListTechnique[3], "Hanging In", inspiritList[48], Wind, 1.3, Earth, 0.7, 0.15, 0.6, 0.2, 0.05, 0.75, 1),
			new Yokai("Tattletell", 53, D, Mysterious, false, statA[52], statB[52], ListAttack[36], ListTechnique[15], "Caring", inspiritList[49], Fire, 1.3, Ice, 0.7, 0.1, 0.7, 0.15, 0.05, 0.7, 1),
			new Yokai("Tattlecast", 54, B, Mysterious, false, statA[53], statB[53], ListAttack[1], ListTechnique[11], "Caring", inspiritList[49], Fire, 1.5, Ice, 0.5, 0.1, 0.75, 0.1, 0.05, 0.75, 1),
			new Yokai("Skranny", 55, C, Mysterious, false, statA[54], statB[54], ListAttack[36], ListTechnique[15], "Caring", inspiritList[50], Thunder, 1.3, Earth, 0.7, 0.1, 0.6, 0.25, 0.05, 0.75, 1),
			new Yokai("Cupistol", 56, D, Mysterious, false, statA[55], statB[55], ListAttack[35], ListTechnique[23], "Popularity", inspiritList[51], Ice, 1.3, Wind, 0.7, 0.15, 0.6, 0.2, 0.05, 0.7, 1),
			new Yokai("Casanuva", 57, A, Mysterious, false, statA[56], statB[56], ListAttack[13], ListTechnique[18], "Popularity", inspiritList[51], Ice, 1.5, Wind, 0.5, 0.15, 0.6, 0.2, 0.05, 0.8, 1),
			new Yokai("Casanono", 58, A, Mysterious, false, statA[57], statB[57], ListAttack[13], ListTechnique[1], "Unpopularity", inspiritList[52], Water, 1.5, Fire, 0.7, 0.1, 0.65, 0.2, 0.05, 0.8, 1),
			new Yokai("So-Sorree", 59, D, Mysterious, false, statA[58], statB[58], ListAttack[36], ListTechnique[17], "Make Amends", inspiritList[53], Earth, 1.3, Thunder, 0.5, 0.1, 0.6, 0.25, 0.05, 0.7, 1),
			new Yokai("Bowminos", 60, A, Mysterious, false, statA[59], statB[59], ListAttack[10], ListTechnique[10], "Make Amends", inspiritList[53], Water, 1.3, Earth, 0.5, 0.05, 0.6, 0.2, 0.15, 0.8, 1),
			new Yokai("Smogling", 61, D, Mysterious, false, statA[60], statB[60], ListAttack[3], ListTechnique[23], "Magic Mist", inspiritList[54], Ice, 1.5, Wind, 0.5, 0.1, 0.65, 0.2, 0.05, 0.7, 1),
			new Yokai("Smogmella", 62, A, Mysterious, false, statA[61], statB[61], ListAttack[38], ListTechnique[18], "Magic Mist", inspiritList[54], Ice, 1.8, Wind, 0.3, 0.05, 0.7, 0.2, 0.05, 0.8, 1),
			new Yokai("Signibble", 63, D, Mysterious, false, statA[62], statB[62], ListAttack[25], ListTechnique[9], "Lightning Play", inspiritList[55], Earth, 1.5, Thunder, 0.5, 0.15, 0.65, 0.15, 0.05, 0.7, 1),
			new Yokai("Signiton", 64, A, Mysterious, false, statA[63], statB[63], ListAttack[25], ListTechnique[21], "Lightning Play", inspiritList[55], Earth, 1.8, Thunder, 0.3, 0.3, 0.55, 0.1, 0.05, 0.8, 1),
			new Yokai("Statiking", 65, S, Mysterious, false, statA[64], statB[64], ListAttack[25], ListTechnique[21], "Long Lasting", inspiritList[56], Earth, 2.0, Thunder, 0.2, 0.25, 0.6, 0.1, 0.05, 0.85, 1),
			new Yokai("Master Oden", 66, A, Mysterious, false, statA[65], statB[65], ListAttack[1], ListTechnique[21], "Tasty Aroma", inspiritList[57], Earth, 1.8, Thunder, 0.2, 0.25, 0.6, 0.05, 0.1, 0.8, 1),
			new Yokai("Failian", 67, C, Mysterious, false, statA[66], statB[66], ListAttack[3], ListTechnique[2], "Electro Field", inspiritList[58], Fire, 1.5, Ice, 0.5, 0.2, 0.55, 0.15, 0.1, 0.75, 1),
			new Yokai("Apelican", 68, C, Mysterious, false, statA[67], statB[67], ListAttack[25], ListTechnique[19], "Number One!", inspiritList[59], Ice, 1.5, Wind, 0.5, 0.2, 0.65, 0.1, 0.05, 0.75, 2),
			new Yokai("Mirapo", 69, C, Mysterious, false, statA[68], statB[68], ListAttack[3], ListTechnique[3], "Mirror Body", inspiritList[60], Earth, 1.3, Thunder, 0.7, 0.1, 0.5, 0.3, 0.1, 0.75, 1),
			new Yokai("Miradox", 70, A, Mysterious, false, statA[69], statB[69], ListAttack[44], ListTechnique[14], "Mirror Body", inspiritList[60], Earth, 1.5, Thunder, 0.5, 0.05, 0.55, 0.25, 0.15, 0.8, 1),
			new Yokai("Mircle", 71, A, Mysterious, false, statA[70], statB[70], ListAttack[3], ListTechnique[14], "Mirror Body", inspiritList[61], Earth, 1.5, Thunder, 0.5, 0.1, 0.5, 0.3, 0.1, 0.8, 1),
			new Yokai("Illoo", 72, C, Mysterious, false, statA[71], statB[71], ListAttack[17], ListTechnique[13], "Brother's Vow", inspiritList[62], Thunder, 1.3, Earth, 0.7, 0.1, 0.7, 0.15, 0.05, 0.75, 1),
			new Yokai("Elloo", 73, C, Mysterious, false, statA[72], statB[72], ListAttack[17], ListTechnique[5], "Brother's Vow", inspiritList[63], Thunder, 1.3, Water, 0.7, 0.05, 0.7, 0.2, 0.05, 0.75, 1),
			new Yokai("Alloo", 74, B, Mysterious, false, statA[73], statB[73], ListAttack[17], ListTechnique[9], "Brother's Vow", inspiritList[64], Earth, 1.3, Thunder, 0.7, 0.15, 0.7, 0.1, 0.05, 0.75, 1),
			new Yokai("Espy", 75, B, Mysterious, false, statA[74], statB[74], ListAttack[16], ListTechnique[16], "Hanging In", inspiritList[65], Wind, 1.3, Earth, 0.7, 0.15, 0.6, 0.2, 0.05, 0.75, 1),
			new Yokai("Infour", 76, B, Mysterious, false, statA[75], statB[75], ListAttack[16], ListTechnique[3], "Hanging In", inspiritList[66], Earth, 1.3, Ice, 0.7, 0.1, 0.7, 0.15, 0.05, 0.75, 1),
			new Yokai("Verygoodsir", 77, B, Mysterious, false, statA[76], statB[76], ListAttack[38], ListTechnique[15], "Caring", inspiritList[67], Earth, 1.5, Fire, 0.5, 0.1, 0.6, 0.25, 0.05, 0.75, 1),
			new Yokai("Tengu", 78, S, Mysterious, false, statA[77], statB[77], ListAttack[23], ListTechnique[18], "Wind Play", inspiritList[68], Ice, 1.8, Wind, 0.3, 0.1, 0.7, 0.15, 0.05, 0.85, 1),
			new Yokai("Flengu", 79, S, Mysterious, false, statA[78], statB[78], ListAttack[23], ListTechnique[8], "Fire Play", inspiritList[69], Water, 2.0, Earth, 0.7, 0.15, 0.7, 0.1, 0.05, 0.85, 1),
			new Yokai("Kyubi", 80, S, Mysterious, false, statA[79], statB[79], ListAttack[45], ListTechnique[8], "Penetrate", inspiritList[69], Water, 1.8, Fire, 0.5, 0.1, 0.75, 0.1, 0.05, 0.85, 1),
			new Yokai("Frostail", 81, S, Mysterious, false, statA[80], statB[80], ListAttack[45], ListTechnique[2], "Sense of Smell", inspiritList[70], Fire, 1.8, Water, 0.7, 0.1, 0.7, 0.15, 0.05, 0.85, 1),
			new Yokai("Chymera", 82, S, Mysterious, false, statA[81], statB[81], ListAttack[6], ListTechnique[21], "In a Flash", inspiritList[71], Earth, 1.5, Thunder, 0.5, 0.2, 0.65, 0.1, 0.05, 0.85, 1),
			new Yokai("Kingmera", 83, S, Mysterious, false, statA[82], statB[82], ListAttack[6], ListTechnique[21], "In a Flash", inspiritList[72], Earth, 1.5, Thunder, 0.3, 0.2, 0.65, 0.1, 0.05, 0.85, 1),
			new Yokai("Terrorpotta", 84, E, Tough, false, statA[83], statB[83], ListAttack[3], ListTechnique[12], "Rest in Pieces", inspiritList[73], Wind, 1.5, Earth, 0.5, 0.4, 0.05, 0.35, 0.2, 0.7, 2),
			new Yokai("Dulluma", 85, E, Tough, false, statA[84], statB[84], ListAttack[3], ListTechnique[12], "Glossy Skin", inspiritList[74], Fire, 1.3, Earth, 0.7, 0.55, 0.2, 0.15, 0.1, 0.7, 1),
			new Yokai("Darumacho", 86, B, Tough, false, statA[85], statB[85], ListAttack[30], ListTechnique[12], "Glossy Skin", inspiritList[75], Fire, 1.5, Earth, 0.5, 0.7, 0.1, 0.1, 0.1, 0.85, 1),
			new Yokai("Goruma", 87, B, Tough, false, statA[86], statB[86], ListAttack[30], ListTechnique[23], "Glossy Skin", inspiritList[76], Thunder, 1.8, Earth, 0.7, 0.75, 0.05, 0.1, 0.1, 0.85, 1),
			new Yokai("Wotchagot", 88, E, Tough, false, statA[87], statB[87], ListAttack[3], ListTechnique[6], "Bitter Rice", inspiritList[77], Fire, 1.5, Ice, 0.5, 0.1, 0.45, 0.3, 0.15, 0.7, 1),
			new Yokai("Pride Shrimp", 89, B, Tough, false, statA[88], statB[88], ListAttack[44], ListTechnique[15], "Thick Crust", inspiritList[78], Fire, 1.8, Ice, 0.3, 0.05, 0.5, 0.2, 0.25, 0.85, 1),
			new Yokai("No-Go Kart", 90, E, Tough, false, statA[89], statB[89], ListAttack[3], ListTechnique[12], "Digging In", inspiritList[79], Wind, 1.5, Earth, 0.5, 0.45, 0.1, 0.3, 0.15, 0.7, 1),
			new Yokai("Mistank", 91, B, Tough, false, statA[90], statB[90], ListAttack[18], ListTechnique[16], "Earth Cannon", inspiritList[80], Wind, 1.8, Earth, 0.3, 0.5, 0.05, 0.2, 0.25, 0.85, 1),
			new Yokai("Noway", 92, E, Tough, false, statA[91], statB[91], ListAttack[3], ListTechnique[12], "Blocker", inspiritList[81], Water, 1.5, Earth, 0.5, 0.6, 0.1, 0.05, 0.25, 0.7, 1),
			new Yokai("Impass", 93, A, Tough, false, statA[92], statB[92], ListAttack[44], ListTechnique[16], "Blocker", inspiritList[81], Water, 1.8, Earth, 0.3, 0.55, 0.1, 0.05, 0.3, 0.85, 1),
			new Yokai("Walldin", 94, A, Tough, false, statA[93], statB[93], ListAttack[44], ListTechnique[16], "Blocker", inspiritList[82], Ice, 1.5, Earth, 0.3, 0.5, 0.1, 0.05, 0.35, 0.85, 1),
			new Yokai("Roughraff", 95, E, Tough, false, statA[94], statB[94], ListAttack[15], ListTechnique[12], "Revenge", inspiritList[83], Water, 1.3, Earth, 0.7, 0.7, 0.1, 0.1, 0.1, 0.7, 1),
			new Yokai("Badude", 96, B, Tough, false, statA[95], statB[95], ListAttack[14], ListTechnique[16], "Revenge", inspiritList[83], Water, 1.3, Earth, 0.5, 0.75, 0.05, 0.1, 0.1, 0.85, 1),
			new Yokai("Bruff", 97, A, Tough, false, statA[96], statB[96], ListAttack[14], ListTechnique[10], "Revenge", inspiritList[84], Wind, 2.0, Earth, 0.3, 0.75, 0.05, 0.1, 0.1, 0.85, 1),
			new Yokai("Armsman", 98, D, Tough, false, statA[97], statB[97], ListAttack[30], ListTechnique[6], "Spirit Guard", inspiritList[85], Earth, 1.5, Thunder, 0.5, 0.6, 0.15, 0.1, 0.15, 0.75, 1),
			new Yokai("Mimikin", 99, D, Tough, false, statA[98], statB[98], ListAttack[32], ListTechnique[5], "Me Too!", inspiritList[86], Fire, 1.5, Ice, 0.5, 0.4, 0.05, 0.35, 0.2, 0.75, 1),
			new Yokai("Blowkade", 100, D, Tough, false, statA[99], statB[99], ListAttack[26], ListTechnique[20], "The Stand", inspiritList[87], Thunder, 1.5, Water, 0.5, 0.6, 0.1, 0.15, 0.15, 0.75, 1),
		};
	}

	private static Yokai[] medaillum_1() {
		return new Yokai[] {
			new Yokai("Ledballoon", 101, C, Tough, false, statA[100], statB[100], ListAttack[26], ListTechnique[20], "The Stand", inspiritList[88], Thunder, 1.5, Water, 0.5, 0.55, 0.15, 0.15, 0.15, 0.8, 1),
			new Yokai("Fidgephant", 102, D, Tough, false, statA[101], statB[101], ListAttack[12], ListTechnique[20], "Endurance", inspiritList[89], Thunder, 1.3, Earth, 0.7, 0.5, 0.3, 0.1, 0.1, 0.75, 1),
			new Yokai("Touphant", 103, C, Tough, false, statA[102], statB[102], ListAttack[12], ListTechnique[13], "Endurance", inspiritList[90], Thunder, 1.3, Water, 0.7, 0.3, 0.5, 0.1, 0.1, 0.8, 1),
			new Yokai("Enduriphant", 104, A, Tough, false, statA[103], statB[103], ListAttack[46], ListTechnique[13], "Going Nowhere", inspiritList[91], Thunder, 1.5, Water, 0.5, 0.45, 0.3, 0.1, 0.15, 0.85, 1),
			new Yokai("Zappary", 105, D, Tough, false, statA[104], statB[104], ListAttack[27], ListTechnique[9], "In a Flash", inspiritList[92], Earth, 1.5, Thunder, 0.5, 0.4, 0.45, 0.05, 0.1, 0.75, 1),
			new Yokai("Frazzel", 106, A, Tough, false, statA[105], statB[105], ListAttack[28], ListTechnique[21], "Superconductor", inspiritList[92], Earth, 1.8, Thunder, 0.3, 0.3, 0.55, 0.05, 0.1, 0.85, 1),
			new Yokai("Swelton", 107, C, Tough, false, statA[106], statB[106], ListAttack[40], ListTechnique[1], "Oily Mess", inspiritList[93], Water, 1.5, Fire, 0.5, 0.1, 0.35, 0.35, 0.2, 0.8, 2),
			new Yokai("Mad Mountain", 108, C, Tough, false, statA[107], statB[107], ListAttack[26], ListTechnique[6], "The Stand", inspiritList[94], Fire, 1.5, Earth, 0.5, 0.55, 0.1, 0.15, 0.2, 0.8, 1),
			new Yokai("Castelius III", 110, C, Tough, false, statA[108], statB[108], ListAttack[3], ListTechnique[12], "Bronze Guard", inspiritList[96], Thunder, 1.5, Earth, 0.5, 0.55, 0.1, 0.2, 0.15, 0.8, 1),
			new Yokai("Castelius II", 111, B, Tough, false, statA[109], statB[109], ListAttack[44], ListTechnique[5], "Silver Guard", inspiritList[97], Fire, 1.5, Earth, 0.5, 0.55, 0.1, 0.2, 0.15, 0.85, 1),
			new Yokai("Castelius I", 112, A, Tough, false, statA[110], statB[110], ListAttack[4], ListTechnique[9], "Gold Guard", inspiritList[98], Earth, 1.5, Thunder, 0.5, 0.55, 0.1, 0.15, 0.2, 0.85, 1),
			new Yokai("Castelius Max", 113, S, Tough, false, statA[111], statB[111], ListAttack[4], ListTechnique[19], "Platinum Guard", inspiritList[99], Thunder, 1.5, Earth, 0.5, 0.55, 0.1, 0.1, 0.25, 0.9, 1),
			new Yokai("Rhinoggin", 114, B, Tough, false, statA[112], statB[112], ListAttack[12], ListTechnique[16], "Guard Break", inspiritList[100], Fire, 1.3, Earth, 0.7, 0.6, 0.15, 0.15, 0.1, 0.85, 1),
			new Yokai("Rhinormous", 115, S, Tough, false, statA[113], statB[113], ListAttack[14], ListTechnique[16], "Guard Break", inspiritList[101], Fire, 1.3, Earth, 0.7, 0.6, 0.1, 0.1, 0.2, 0.9, 1),
			new Yokai("Hornaplenty", 116, S, Tough, false, statA[114], statB[114], ListAttack[14], ListTechnique[10], "Guard Break", inspiritList[34], Thunder, 1.3, Earth, 0.5, 0.7, 0.05, 0.1, 0.15, 0.9, 1),
			new Yokai("Robonyan", 117, A, Tough, false, statA[115], statB[115], ListAttack[33], ListTechnique[5], "Blocker", inspiritList[102], Thunder, 1.5, Earth, 0.5, 0.55, 0.2, 0.15, 0.1, 0.85, 1),
			new Yokai("Goldenyan", 118, S, Tough, false, statA[116], statB[116], ListAttack[33], ListTechnique[9], "Gold Guard", inspiritList[103], Earth, 1.5, Thunder, 0.3, 0.65, 0.1, 0.15, 0.1, 0.9, 1),
			new Yokai("Dromp", 119, A, Tough, false, statA[117], statB[117], ListAttack[42], ListTechnique[16], "Insulator", inspiritList[104], Fire, 1.8, Earth, 0.3, 0.55, 0.1, 0.1, 0.25, 0.85, 1),
			new Yokai("Swosh", 120, S, Tough, false, statA[118], statB[118], ListAttack[42], ListTechnique[22], "Blessed Body", inspiritList[105], Thunder, 2.0, Water, 0.3, 0.1, 0.55, 0.1, 0.25, 0.9, 1),
			new Yokai("Toadal Dude", 121, S, Tough, false, statA[119], statB[119], ListAttack[7], ListTechnique[22], "Toadally Saved", inspiritList[106], Thunder, 1.8, Water, 0.3, 0.65, 0.15, 0.1, 0.1, 0.9, 1),
			new Yokai("Uber Geeko", 122, S, Tough, false, statA[120], statB[120], ListAttack[7], ListTechnique[8], "Geckstra Safe", inspiritList[107], Water, 1.8, Fire, 0.2, 0.15, 0.65, 0.1, 0.1, 0.9, 1),
			new Yokai("Leggly", 123, E, Charming, false, statA[121], statB[121], ListAttack[19], ListTechnique[7], "Great Legs", inspiritList[108], Water, 1.5, Wind, 0.5, 0.6, 0.15, 0.2, 0.05, 0.65, 2),
			new Yokai("Dazzabel", 124, E, Charming, false, statA[122], statB[122], ListAttack[27], ListTechnique[4], "Hanging In", inspiritList[109], Water, 1.3, Fire, 0.7, 0.5, 0.3, 0.15, 0.05, 0.65, 1),
			new Yokai("Rattelle", 125, C, Charming, false, statA[123], statB[123], ListAttack[41], ListTechnique[1], "Hanging In", inspiritList[110], Water, 1.5, Fire, 0.5, 0.65, 0.2, 0.1, 0.05, 0.75, 1),
			new Yokai("Skelebella", 126, B, Charming, false, statA[124], statB[124], ListAttack[29], ListTechnique[13], "Hanging In", inspiritList[110], Thunder, 1.8, Water, 0.5, 0.65, 0.15, 0.15, 0.05, 0.8, 1),
			new Yokai("Cadin", 127, E, Charming, false, statA[125], statB[125], ListAttack[43], ListTechnique[23], "Modest", inspiritList[111], Fire, 1.3, Earth, 0.7, 0.55, 0.3, 0.1, 0.05, 0.65, 1),
			new Yokai("Cadable", 128, C, Charming, false, statA[126], statB[126], ListAttack[8], ListTechnique[19], "Modest", inspiritList[111], Fire, 1.5, Earth, 0.5, 0.65, 0.2, 0.1, 0.05, 0.75, 1),
			new Yokai("Singcada", 129, B, Charming, false, statA[127], statB[127], ListAttack[8], ListTechnique[1], "Eyesight A", inspiritList[112], Water, 1.8, Earth, 0.5, 0.6, 0.25, 0.1, 0.05, 0.8, 1),
			new Yokai("Pupsicle", 130, E, Charming, false, statA[128], statB[128], ListAttack[2], ListTechnique[5], "Penetrate", inspiritList[113], Fire, 1.5, Ice, 0.5, 0.2, 0.55, 0.15, 0.1, 0.65, 1),
			new Yokai("Chilhuahua", 131, A, Charming, false, statA[129], statB[129], ListAttack[46], ListTechnique[2], "Penetrate", inspiritList[114], Fire, 1.8, Ice, 0.3, 0.25, 0.6, 0.1, 0.05, 0.8, 1),
			new Yokai("Swelterrier", 132, S, Charming, false, statA[130], statB[130], ListAttack[46], ListTechnique[8], "Fire Watchout", inspiritList[115], Water, 1.8, Fire, 0.5, 0.35, 0.5, 0.1, 0.05, 0.85, 1),
			new Yokai("Jumbelina", 133, D, Charming, false, statA[131], statB[131], ListAttack[36], ListTechnique[5], "Shuffle", inspiritList[116], Fire, 1.3, Ice, 0.7, 0.1, 0.5, 0.35, 0.05, 0.7, 1),
			new Yokai("Boyclops", 134, D, Charming, false, statA[132], statB[132], ListAttack[16], ListTechnique[5], "Soulful Promise", inspiritList[117], Fire, 1.3, Ice, 0.7, 0.5, 0.1, 0.35, 0.05, 0.7, 2),
			new Yokai("Jibanyan", 135, D, Charming, false, statA[133], statB[133], ListAttack[34], ListTechnique[4], "Adrenaline", inspiritList[118], Water, 1.3, Fire, 0.7, 0.55, 0.3, 0.1, 0.05, 0.7, 1),
			new Yokai("Thornyan", 136, B, Charming, false, statA[134], statB[134], ListAttack[46], ListTechnique[19], "Spiky Guard", inspiritList[87], Ice, 1.5, Wind, 0.5, 0.5, 0.35, 0.1, 0.05, 0.8, 1),
			new Yokai("Baddinyan", 137, B, Charming, false, statA[135], statB[135], ListAttack[23], ListTechnique[4], "Pompadour", inspiritList[119], Water, 1.5, Fire, 0.5, 0.7, 0.15, 0.1, 0.05, 0.8, 1),
			new Yokai("Buchinyan", 138, C, Charming, false, statA[136], statB[136], ListAttack[34], ListTechnique[9], "Soft Skin", inspiritList[120], Earth, 1.5, Thunder, 0.7, 0.6, 0.25, 0.1, 0.05, 0.75, 1),
			new Yokai("Walkappa", 139, D, Charming, false, statA[137], statB[137], ListAttack[32], ListTechnique[13], "Skilled Loafer", inspiritList[121], Thunder, 1.5, Water, 0.5, 0.1, 0.7, 0.15, 0.05, 0.7, 1),
			new Yokai("Appak", 140, A, Charming, false, statA[138], statB[138], ListAttack[8], ListTechnique[22], "Penetrate", inspiritList[122], Thunder, 1.5, Water, 0.2, 0.35, 0.5, 0.1, 0.05, 0.8, 1),
			new Yokai("Supyo", 141, A, Charming, false, statA[139], statB[139], ListAttack[8], ListTechnique[22], "Penetrate", inspiritList[123], Thunder, 1.5, Water, 0.3, 0.2, 0.65, 0.1, 0.05, 0.8, 1),
			new Yokai("Komasan", 142, D, Charming, false, statA[140], statB[140], ListAttack[32], ListTechnique[1], "Alpha", inspiritList[69], Water, 1.3, Fire, 0.7, 0.1, 0.75, 0.1, 0.05, 0.7, 1),
			new Yokai("Komane", 143, A, Charming, false, statA[141], statB[141], ListAttack[30], ListTechnique[8], "Alpha", inspiritList[69], Water, 1.8, Fire, 0.3, 0.15, 0.7, 0.1, 0.05, 0.8, 1),
			new Yokai("Komajiro", 144, D, Charming, false, statA[142], statB[142], ListAttack[32], ListTechnique[9], "Omega", inspiritList[124], Earth, 1.5, Thunder, 0.5, 0.35, 0.4, 0.2, 0.05, 0.7, 1),
			new Yokai("Komiger", 145, A, Charming, false, statA[143], statB[143], ListAttack[31], ListTechnique[21], "Omega", inspiritList[124], Earth, 1.8, Thunder, 0.3, 0.45, 0.35, 0.15, 0.05, 0.8, 1),
			new Yokai("Baku", 146, D, Charming, false, statA[144], statB[144], ListAttack[36], ListTechnique[3], "Grip on You", inspiritList[125], Earth, 1.3, Thunder, 0.7, 0.2, 0.55, 0.2, 0.05, 0.7, 1),
			new Yokai("Bakulia", 147, B, Charming, false, statA[145], statB[145], ListAttack[38], ListTechnique[14], "Grip on You", inspiritList[125], Earth, 1.5, Thunder, 0.5, 0.1, 0.65, 0.15, 0.1, 0.8, 1),
			new Yokai("Whapir", 148, C, Charming, false, statA[146], statB[146], ListAttack[36], ListTechnique[3], "Good Fortune", inspiritList[126], Water, 1.5, Thunder, 0.5, 0.2, 0.55, 0.2, 0.05, 0.75, 1),
			new Yokai("Drizzelda", 149, C, Charming, false, statA[147], statB[147], ListAttack[36], ListTechnique[13], "Downpour", inspiritList[127], Thunder, 1.8, Water, 0.3, 0.05, 0.65, 0.25, 0.05, 0.75, 1),
			new Yokai("Nekidspeed", 150, C, Charming, false, statA[148], statB[148], ListAttack[44], ListTechnique[5], "Step Up", inspiritList[128], Earth, 1.5, Ice, 0.5, 0.7, 0.1, 0.15, 0.05, 0.75, 1),
			new Yokai("Shmoopie", 151, C, Charming, false, statA[149], statB[149], ListAttack[2], ListTechnique[15], "Popularity", inspiritList[129], Thunder, 1.3, Water, 0.7, 0.1, 0.65, 0.2, 0.05, 0.75, 1),
			new Yokai("Pinkipoo", 152, B, Charming, false, statA[150], statB[150], ListAttack[1], ListTechnique[11], "Popularity", inspiritList[129], Thunder, 1.5, Water, 0.5, 0.15, 0.6, 0.2, 0.05, 0.8, 1),
			new Yokai("Pookivil", 153, A, Charming, false, statA[151], statB[151], ListAttack[1], ListTechnique[14], "Unpopularity", inspiritList[130], Thunder, 1.8, Earth, 0.5, 0.4, 0.45, 0.1, 0.05, 0.8, 1),
			new Yokai("Harry Barry", 154, B, Charming, false, statA[152], statB[152], ListAttack[30], ListTechnique[15], "Bear Care", inspiritList[131], Neutral, 1.0, Neutral, 1.0, 0.5, 0.4, 0.05, 0.05, 0.8, 1),
			new Yokai("Frostina", 155, B, Charming, false, statA[153], statB[153], ListAttack[36], ListTechnique[2], "Snow Play", inspiritList[132], Fire, 1.5, Ice, 0.5, 0.15, 0.6, 0.2, 0.05, 0.8, 1),
			new Yokai("Blizzaria", 156, S, Charming, false, statA[154], statB[154], ListAttack[38], ListTechnique[2], "Snow Play", inspiritList[132], Fire, 2.0, Ice, 0.2, 0.15, 0.65, 0.15, 0.05, 0.85, 1),
			new Yokai("Damona", 157, S, Charming, false, statA[155], statB[155], ListAttack[38], ListTechnique[2], "Cursed Skin", inspiritList[133], Fire, 2.0, Thunder, 0.7, 0.25, 0.5, 0.2, 0.05, 0.85, 1),
			new Yokai("Faux Kappa", 158, A, Charming, false, statA[156], statB[156], ListAttack[25], ListTechnique[22], "Intimidation", inspiritList[134], Thunder, 1.8, Water, 0.3, 0.3, 0.5, 0.15, 0.05, 0.8, 1),
			new Yokai("Tigappa", 159, S, Charming, false, statA[157], statB[157], ListAttack[25], ListTechnique[22], "Intimidation", inspiritList[134], Thunder, 1.5, Water, 0.3, 0.25, 0.6, 0.1, 0.05, 0.85, 1),
			new Yokai("Master Nyada", 160, S, Charming, false, statA[158], statB[158], ListAttack[1], ListTechnique[18], "Use the Hose", inspiritList[135], Ice, 1.8, Wind, 0.3, 0.05, 0.75, 0.15, 0.05, 0.85, 1),
			new Yokai("Wantston", 161, E, Heartful, false, statA[159], statB[159], ListAttack[36], ListTechnique[17], "Greed", inspiritList[77], Earth, 1.3, Thunder, 0.7, 0.4, 0.35, 0.2, 0.05, 0.65, 1),
			new Yokai("Grubsnitch", 162, D, Heartful, false, statA[160], statB[160], ListAttack[36], ListTechnique[16], "Snitch", inspiritList[136], Ice, 1.3, Earth, 0.7, 0.45, 0.3, 0.2, 0.05, 0.65, 1),
			new Yokai("Wiglin", 163, E, Heartful, false, statA[161], statB[161], ListAttack[36], ListTechnique[7], "Wavy Body", inspiritList[137], Thunder, 1.5, Water, 0.7, 0.5, 0.3, 0.15, 0.05, 0.65, 1),
			new Yokai("Kelpacabana", 164, C, Heartful, false, statA[162], statB[162], ListAttack[38], ListTechnique[11], "Seaweed Samba", inspiritList[138], Ice, 1.5, Water, 0.5, 0.35, 0.5, 0.1, 0.05, 0.7, 1),
			new Yokai("Steppa", 165, E, Heartful, false, statA[163], statB[163], ListAttack[36], ListTechnique[7], "Wavy Body", inspiritList[139], Fire, 1.5, Water, 0.7, 0.25, 0.4, 0.3, 0.05, 0.65, 1),
			new Yokai("Rhyth", 166, D, Heartful, false, statA[164], statB[164], ListAttack[36], ListTechnique[15], "Wavy Body", inspiritList[140], Earth, 1.5, Thunder, 0.7, 0.1, 0.6, 0.25, 0.05, 0.65, 1),
			new Yokai("Hungramps", 167, E, Heartful, false, statA[165], statB[165], ListAttack[16], ListTechnique[7], "Starver", inspiritList[141], Wind, 1.3, Earth, 0.7, 0.1, 0.6, 0.25, 0.05, 0.65, 1),
			new Yokai("Hungorge", 168, B, Heartful, false, statA[166], statB[166], ListAttack[6], ListTechnique[3], "Starver", inspiritList[141], Wind, 1.5, Earth, 0.5, 0.2, 0.6, 0.15, 0.05, 0.75, 1),
			new Yokai("Grainpa", 169, B, Heartful, false, statA[167], statB[167], ListAttack[16], ListTechnique[15], "Blessed Body", inspiritList[142], Wind, 1.8, Earth, 0.5, 0.3, 0.45, 0.2, 0.05, 0.75, 1),
			new Yokai("Tongus", 170, E, Heartful, false, statA[168], statB[168], ListAttack[37], ListTechnique[7], "Lick It Clean", inspiritList[143], Fire, 1.3, Thunder, 0.7, 0.1, 0.6, 0.25, 0.05, 0.65, 1),
			new Yokai("Nurse Tongus", 171, B, Heartful, false, statA[169], statB[169], ListAttack[37], ListTechnique[11], "Lick It Clean", inspiritList[143], Fire, 1.5, Thunder, 0.5, 0.05, 0.7, 0.2, 0.05, 0.75, 1),
			new Yokai("Sandmeh", 172, E, Heartful, false, statA[170], statB[170], ListAttack[16], ListTechnique[7], "Sand Still", inspiritList[144], Water, 1.5, Earth, 0.5, 0.55, 0.2, 0.15, 0.1, 0.65, 1),
			new Yokai("Mr. Sandmeh", 173, B, Heartful, false, statA[171], statB[171], ListAttack[16], ListTechnique[15], "Sand Still", inspiritList[144], Water, 1.8, Earth, 0.3, 0.45, 0.35, 0.1, 0.1, 0.75, 1),
			new Yokai("Pallysol", 174, E, Heartful, false, statA[172], statB[172], ListAttack[27], ListTechnique[23], "Sun Shield", inspiritList[145], Ice, 1.3, Wind, 0.7, 0.2, 0.45, 0.25, 0.1, 0.65, 1),
			new Yokai("Scarasol", 175, A, Heartful, false, statA[173], statB[173], ListAttack[46], ListTechnique[16], "Sun Shield", inspiritList[146], Wind, 1.5, Earth, 0.5, 0.45, 0.35, 0.1, 0.1, 0.8, 1),
			new Yokai("Lodo", 176, D, Heartful, false, statA[174], statB[174], ListAttack[19], ListTechnique[23], "Stealing", inspiritList[147], Ice, 1.3, Wind, 0.7, 0.35, 0.5, 0.1, 0.05, 0.65, 1),
			new Yokai("Supoor Hero", 177, A, Heartful, false, statA[175], statB[175], ListAttack[11], ListTechnique[18], "Acrobat", inspiritList[148], Ice, 1.5, Wind, 0.5, 0.35, 0.5, 0.1, 0.05, 0.8, 1),
			new Yokai("Chippa", 178, C, Heartful, false, statA[176], statB[176], ListAttack[11], ListTechnique[20], "Optimism Power", inspiritList[149], Thunder, 1.3, Water, 0.7, 0.45, 0.25, 0.25, 0.05, 0.7, 1),
			new Yokai("Gnomey", 179, D, Heartful, false, statA[177], statB[177], ListAttack[17], ListTechnique[7], "Good Fortune", inspiritList[150], Fire, 1.3, Earth, 0.7, 0.2, 0.6, 0.15, 0.05, 0.65, 1),
			new Yokai("High Gnomey", 180, A, Heartful, false, statA[178], statB[178], ListAttack[17], ListTechnique[11], "Golden Touch", inspiritList[151], Fire, 1.5, Earth, 0.5, 0.1, 0.7, 0.15, 0.05, 0.8, 1),
			new Yokai("Enerfly", 181, D, Heartful, false, statA[179], statB[179], ListAttack[36], ListTechnique[7], "Miraculous Scales", inspiritList[152], Thunder, 1.3, Water, 0.7, 0.3, 0.4, 0.25, 0.05, 0.65, 1),
			new Yokai("Enefly", 182, D, Heartful, false, statA[180], statB[180], ListAttack[36], ListTechnique[0], "Miraculous Scales", inspiritList[153], Earth, 1.3, Thunder, 0.7, 0.2, 0.5, 0.25, 0.05, 0.65, 1),
			new Yokai("Betterfly", 183, A, Heartful, false, statA[181], statB[181], ListAttack[36], ListTechnique[11], "Miraculous Scales", inspiritList[154], Ice, 1.5, Wind, 0.5, 0.2, 0.55, 0.2, 0.05, 0.8, 1),
			new Yokai("Peppillon", 184, S, Heartful, false, statA[182], statB[182], ListAttack[36], ListTechnique[11], "Miraculous Scales", inspiritList[155], Earth, 2.0, Thunder, 0.5, 0.25, 0.55, 0.15, 0.05, 0.85, 1),
			new Yokai("Predictabull", 185, D, Heartful, false, statA[183], statB[183], ListAttack[3], ListTechnique[7], "Clairvoidance", inspiritList[156], Water, 1.3, Earth, 0.7, 0.35, 0.4, 0.2, 0.05, 0.65, 1),
			new Yokai("Smashibull", 186, S, Heartful, false, statA[184], statB[184], ListAttack[4], ListTechnique[11], "Clairvoidance", inspiritList[156], Water, 1.5, Earth, 0.5, 0.5, 0.35, 0.05, 0.1, 0.85, 1),
			new Yokai("Don Chan", 187, C, Heartful, false, statA[185], statB[185], ListAttack[3], ListTechnique[15], "Feel the Beat", inspiritList[157], Water, 1.5, Earth, 0.5, 0.1, 0.7, 0.1, 0.1, 0.7, 1),
			new Yokai("Ray O'Light", 188, C, Heartful, false, statA[186], statB[186], ListAttack[11], ListTechnique[1], "Sunburn", inspiritList[158], Water, 1.8, Fire, 0.3, 0.5, 0.35, 0.1, 0.05, 0.7, 1),
			new Yokai("Happierre", 189, C, Heartful, false, statA[187], statB[187], ListAttack[3], ListTechnique[15], "Caring", inspiritList[159], Earth, 1.3, Thunder, 0.7, 0.15, 0.5, 0.3, 0.05, 0.7, 1),
			new Yokai("Reversa", 190, A, Heartful, false, statA[188], statB[188], ListAttack[44], ListTechnique[11], "Insecure", inspiritList[160], Earth, 1.5, Thunder, 0.5, 0.2, 0.5, 0.25, 0.05, 0.8, 1),
			new Yokai("Reversette", 191, A, Heartful, false, statA[189], statB[189], ListAttack[44], ListTechnique[18], "Insecure", inspiritList[160], Ice, 1.8, Thunder, 0.5, 0.35, 0.4, 0.2, 0.05, 0.8, 1),
			new Yokai("Ol' Saint Trick", 192, B, Heartful, false, statA[190], statB[190], ListAttack[12], ListTechnique[15], "Caring", inspiritList[110], Ice, 1.5, Wind, 0.5, 0.25, 0.6, 0.1, 0.05, 0.75, 1),
			new Yokai("Ol' Fortune", 193, B, Heartful, false, statA[191], statB[191], ListAttack[12], ListTechnique[9], "Penetrate", inspiritList[110], Earth, 1.5, Thunder, 0.5, 0.6, 0.25, 0.1, 0.05, 0.75, 1),
			new Yokai("Rollen", 194, B, Heartful, false, statA[192], statB[192], ListAttack[9], ListTechnique[13], "Gambler", inspiritList[161], Thunder, 1.5, Earth, 0.5, 0.3, 0.3, 0.3, 0.1, 0.75, 1),
			new Yokai("Dubbles", 195, A, Heartful, false, statA[193], statB[193], ListAttack[9], ListTechnique[22], "Gambler", inspiritList[162], Thunder, 1.5, Earth, 0.5, 0.3, 0.3, 0.3, 0.1, 0.8, 1),
			new Yokai("Papa Bolt", 196, A, Heartful, false, statA[194], statB[194], ListAttack[31], ListTechnique[21], "Strict", inspiritList[163], Earth, 1.8, Thunder, 0.3, 0.4, 0.45, 0.1, 0.05, 0.8, 1),
			new Yokai("Uncle Infinite", 197, S, Heartful, false, statA[195], statB[195], ListAttack[31], ListTechnique[21], "Intimidation", inspiritList[164], Earth, 1.8, Thunder, 0.2, 0.5, 0.35, 0.1, 0.05, 0.85, 1),
			new Yokai("Mama Aura", 198, A, Heartful, false, statA[196], statB[196], ListAttack[36], ListTechnique[11], "Prayer", inspiritList[165], Ice, 1.5, Wind, 0.5, 0.15, 0.65, 0.15, 0.05, 0.8, 1),
			new Yokai("Auntie Heart", 199, S, Heartful, false, statA[197], statB[197], ListAttack[36], ListTechnique[11], "Prayer", inspiritList[166], Ice, 1.5, Thunder, 0.7, 0.2, 0.6, 0.15, 0.05, 0.85, 1),
			new Yokai("Kyryn", 200, S, Heartful, false, statA[198], statB[198], ListAttack[6], ListTechnique[11], "Second Wind", inspiritList[167], Earth, 1.5, Thunder, 0.5, 0.25, 0.55, 0.15, 0.05, 0.85, 1),
			new Yokai("Unikirin", 201, S, Heartful, false, statA[199], statB[199], ListAttack[6], ListTechnique[11], "Second Wind", inspiritList[168], Fire, 1.5, Thunder, 0.5, 0.5, 0.35, 0.1, 0.05, 0.85, 1),
		};
	}

	private static Yokai[] medaillum_2() {
		return new Yokai[] {
			new Yokai("Leadoni", 202, E, Shady, false, statA[200], statB[200], ListAttack[36], ListTechnique[6], "Windshield", inspiritList[169], Fire, 1.3, Ice, 0.7, 0.55, 0.2, 0.2, 0.05, 0.6, 2),
			new Yokai("Mynimo", 203, D, Shady, false, statA[201], statB[201], ListAttack[36], ListTechnique[0], "Windshield", inspiritList[170], Fire, 1.5, Ice, 0.5, 0.5, 0.25, 0.2, 0.05, 0.6, 1),
			new Yokai("Ake", 204, E, Shady, false, statA[202], statB[202], ListAttack[19], ListTechnique[12], "Extreme Critical", inspiritList[171], Wind, 1.3, Earth, 0.7, 0.4, 0.3, 0.25, 0.05, 0.6, 1),
			new Yokai("Payn", 205, C, Shady, false, statA[203], statB[203], ListAttack[30], ListTechnique[16], "Extreme Critical", inspiritList[171], Wind, 1.5, Earth, 0.5, 0.65, 0.1, 0.2, 0.05, 0.65, 1),
			new Yokai("Agon", 206, B, Shady, false, statA[204], statB[204], ListAttack[30], ListTechnique[10], "Extreme Critical", inspiritList[172], Wind, 1.8, Earth, 0.5, 0.7, 0.05, 0.2, 0.05, 0.65, 1),
			new Yokai("Wydeawake", 207, E, Shady, false, statA[205], statB[205], ListAttack[32], ListTechnique[17], "Night Life", inspiritList[173], Earth, 1.3, Thunder, 0.7, 0.1, 0.55, 0.3, 0.05, 0.6, 1),
			new Yokai("Allnyta", 208, B, Shady, false, statA[206], statB[206], ListAttack[32], ListTechnique[9], "Night Life", inspiritList[174], Earth, 1.5, Thunder, 0.5, 0.05, 0.6, 0.3, 0.05, 0.65, 1),
			new Yokai("Herbiboy", 209, E, Shady, false, statA[207], statB[207], ListAttack[3], ListTechnique[20], "Herbivaura", inspiritList[175], Thunder, 1.3, Water, 0.7, 0.55, 0.1, 0.3, 0.05, 0.6, 1),
			new Yokai("Carniboy", 210, B, Shady, false, statA[208], statB[208], ListAttack[11], ListTechnique[1], "Carnivaura", inspiritList[176], Water, 1.5, Fire, 0.5, 0.6, 0.05, 0.3, 0.05, 0.65, 1),
			new Yokai("Negatibuzz", 211, E, Shady, false, statA[209], statB[209], ListAttack[27], ListTechnique[0], "Vampiric", inspiritList[177], Ice, 1.3, Wind, 0.7, 0.4, 0.35, 0.2, 0.05, 0.6, 1),
			new Yokai("Moskevil", 212, C, Shady, false, statA[210], statB[210], ListAttack[28], ListTechnique[3], "Vampiric", inspiritList[177], Ice, 1.5, Wind, 0.5, 0.4, 0.35, 0.2, 0.05, 0.65, 1),
			new Yokai("Scritchy", 213, A, Shady, false, statA[211], statB[211], ListAttack[28], ListTechnique[21], "Vampiric", inspiritList[178], Earth, 1.8, Thunder, 0.5, 0.15, 0.6, 0.2, 0.05, 0.7, 1),
			new Yokai("Dimmy", 214, E, Shady, false, statA[212], statB[212], ListAttack[43], ListTechnique[23], "Secrecy", inspiritList[107], Ice, 1.3, Wind, 0.7, 0.7, 0.2, 0.05, 0.05, 0.6, 1),
			new Yokai("Blandon", 215, B, Shady, false, statA[213], statB[213], ListAttack[24], ListTechnique[19], "Secrecy", inspiritList[107], Ice, 1.5, Wind, 0.5, 0.6, 0.3, 0.05, 0.05, 0.65, 1),
			new Yokai("Nul", 216, A, Shady, false, statA[214], statB[214], ListAttack[24], ListTechnique[18], "Secrecy", inspiritList[179], Ice, 1.8, Wind, 0.3, 0.3, 0.6, 0.05, 0.05, 0.7, 1),
			new Yokai("Suspicioni", 217, D, Shady, false, statA[215], statB[215], ListAttack[28], ListTechnique[20], "Suspicion", inspiritList[180], Thunder, 1.3, Water, 0.7, 0.25, 0.4, 0.3, 0.05, 0.6, 2),
			new Yokai("Tantroni", 218, D, Shady, false, statA[216], statB[216], ListAttack[28], ListTechnique[4], "Suspicion", inspiritList[181], Water, 1.3, Fire, 0.7, 0.55, 0.15, 0.25, 0.05, 0.6, 2),
			new Yokai("Contrarioni", 219, B, Shady, false, statA[217], statB[217], ListAttack[28], ListTechnique[9], "Suspicion", inspiritList[182], Earth, 1.5, Thunder, 0.5, 0.3, 0.4, 0.25, 0.05, 0.65, 1),
			new Yokai("Hidabat", 220, D, Shady, false, statA[218], statB[218], ListAttack[36], ListTechnique[19], "Vampiric", inspiritList[183], Ice, 1.3, Wind, 0.7, 0.25, 0.35, 0.35, 0.05, 0.6, 1),
			new Yokai("Abodabat", 221, A, Shady, false, statA[219], statB[219], ListAttack[44], ListTechnique[19], "Vampiric", inspiritList[183], Ice, 1.5, Wind, 0.5, 0.2, 0.35, 0.4, 0.05, 0.7, 1),
			new Yokai("Belfree", 222, A, Shady, false, statA[220], statB[220], ListAttack[44], ListTechnique[18], "Vampiric", inspiritList[183], Ice, 1.7, Earth, 0.7, 0.35, 0.2, 0.4, 0.05, 0.7, 1),
			new Yokai("Yoink", 223, D, Shady, false, statA[221], statB[221], ListAttack[2], ListTechnique[0], "Sticky Fingers", inspiritList[184], Thunder, 1.3, Ice, 0.7, 0.5, 0.1, 0.35, 0.05, 0.6, 1),
			new Yokai("Gimme", 224, A, Shady, false, statA[222], statB[222], ListAttack[30], ListTechnique[3], "Sticky Fingers", inspiritList[185], Thunder, 1.5, Ice, 0.5, 0.55, 0.05, 0.35, 0.05, 0.7, 1),
			new Yokai("K'mon-K'mon", 225, C, Shady, false, statA[223], statB[223], ListAttack[25], ListTechnique[19], "Me First!", inspiritList[186], Ice, 1.5, Wind, 0.5, 0.35, 0.3, 0.3, 0.05, 0.65, 1),
			new Yokai("Yoodooit", 226, C, Shady, false, statA[224], statB[224], ListAttack[17], ListTechnique[3], "You First", inspiritList[187], Earth, 1.5, Fire, 0.5, 0.1, 0.4, 0.45, 0.05, 0.65, 1),
			new Yokai("Count Zapaway", 227, C, Shady, false, statA[225], statB[225], ListAttack[44], ListTechnique[5], "Zap Away", inspiritList[188], Fire, 1.5, Ice, 0.5, 0.4, 0.2, 0.3, 0.1, 0.65, 1),
			new Yokai("Tyrat", 228, C, Shady, false, statA[226], statB[226], ListAttack[6], ListTechnique[3], "Dirty Rat", inspiritList[189], Wind, 1.5, Fire, 0.5, 0.5, 0.1, 0.35, 0.05, 0.65, 2),
			new Yokai("Tengloom", 229, C, Shady, false, statA[227], statB[227], ListAttack[11], ListTechnique[19], "Windshield", inspiritList[190], Ice, 1.3, Wind, 0.7, 0.2, 0.5, 0.25, 0.05, 0.65, 1),
			new Yokai("Nird", 230, B, Shady, false, statA[228], statB[228], ListAttack[11], ListTechnique[18], "Death Sphere", inspiritList[18], Ice, 1.5, Wind, 0.5, 0.15, 0.6, 0.2, 0.05, 0.65, 1),
			new Yokai("Snobetty", 231, B, Shady, false, statA[229], statB[229], ListAttack[38], ListTechnique[2], "Know Your Place", inspiritList[191], Fire, 1.5, Ice, 0.5, 0.15, 0.5, 0.3, 0.05, 0.65, 1),
			new Yokai("Slimamander", 232, B, Shady, false, statA[230], statB[230], ListAttack[7], ListTechnique[8], "Triple-Header", inspiritList[69], Water, 1.5, Fire, 0.3, 0.5, 0.35, 0.1, 0.05, 0.65, 1),
			new Yokai("Dracunyan", 233, B, Shady, false, statA[231], statB[231], ListAttack[21], ListTechnique[14], "Bloodsucker", inspiritList[192], Fire, 1.5, Thunder, 0.3, 0.6, 0.15, 0.2, 0.05, 0.65, 1),
			new Yokai("Negasus", 234, A, Shady, false, statA[232], statB[232], ListAttack[6], ListTechnique[19], "Hanging In", inspiritList[193], Ice, 1.5, Thunder, 0.7, 0.1, 0.65, 0.2, 0.05, 0.7, 1),
			new Yokai("Neighfarious", 235, A, Shady, false, statA[233], statB[233], ListAttack[6], ListTechnique[3], "Cursed Skin", inspiritList[194], Earth, 1.8, Thunder, 0.7, 0.65, 0.1, 0.2, 0.05, 0.7, 1),
			new Yokai("Timidevil", 236, A, Shady, false, statA[234], statB[234], ListAttack[41], ListTechnique[1], "Too Afraid", inspiritList[195], Water, 1.3, Fire, 0.7, 0.75, 0.1, 0.1, 0.05, 0.7, 1),
			new Yokai("Beelzebold", 237, S, Shady, false, statA[235], statB[235], ListAttack[41], ListTechnique[8], "Intimidation", inspiritList[195], Water, 1.5, Fire, 0.5, 0.55, 0.2, 0.2, 0.05, 0.75, 1),
			new Yokai("Count Cavity", 238, S, Shady, false, statA[236], statB[236], ListAttack[41], ListTechnique[8], "Extreme Critical", inspiritList[196], Water, 1.8, Fire, 0.5, 0.25, 0.5, 0.2, 0.05, 0.75, 1),
			new Yokai("Eyesoar", 239, A, Shady, false, statA[237], statB[237], ListAttack[22], ListTechnique[10], "Eye See You", inspiritList[197], Wind, 1.5, Earth, 0.3, 0.4, 0.35, 0.2, 0.05, 0.7, 1),
			new Yokai("Eyellure", 240, S, Shady, false, statA[238], statB[238], ListAttack[22], ListTechnique[21], "Eye See You", inspiritList[197], Earth, 1.5, Thunder, 0.3, 0.3, 0.4, 0.25, 0.05, 0.75, 1),
			new Yokai("Greesel", 241, S, Shady, false, statA[239], statB[239], ListAttack[7], ListTechnique[8], "Mine", inspiritList[198], Water, 1.3, Fire, 0.7, 0.05, 0.55, 0.35, 0.05, 0.75, 1),
			new Yokai("Awevil", 242, S, Shady, false, statA[240], statB[240], ListAttack[7], ListTechnique[13], "Ultimate Dark", inspiritList[199], Thunder, 1.8, Water, 0.5, 0.1, 0.45, 0.4, 0.05, 0.75, 1),
			new Yokai("Wobblewok", 243, S, Shady, false, statA[241], statB[241], ListAttack[4], ListTechnique[10], "Ultimate Dark", inspiritList[200], Wind, 1.5, Earth, 0.3, 0.15, 0.15, 0.6, 0.1, 0.75, 1),
			new Yokai("Coughkoff", 244, E, Eerie, false, statA[242], statB[242], ListAttack[27], ListTechnique[20], "Spiky Guard", inspiritList[201], Thunder, 2.0, Earth, 0.7, 0.4, 0.05, 0.45, 0.1, 0.6, 1),
			new Yokai("Hurchin", 245, D, Eerie, false, statA[243], statB[243], ListAttack[27], ListTechnique[5], "Spiky Guard", inspiritList[202], Fire, 2.0, Thunder, 0.7, 0.05, 0.4, 0.45, 0.1, 0.65, 1),
			new Yokai("Droplette", 246, E, Eerie, false, statA[244], statB[244], ListAttack[3], ListTechnique[13], "Moist Skin", inspiritList[203], Thunder, 1.8, Water, 0.3, 0.05, 0.7, 0.2, 0.05, 0.6, 1),
			new Yokai("Drizzle", 247, B, Eerie, false, statA[245], statB[245], ListAttack[3], ListTechnique[22], "Moist Skin", inspiritList[203], Thunder, 2.0, Water, 0.2, 0.05, 0.75, 0.15, 0.05, 0.75, 1),
			new Yokai("Slush", 248, E, Eerie, false, statA[246], statB[246], ListAttack[3], ListTechnique[5], "Stiff Skin", inspiritList[132], Fire, 1.8, Ice, 0.3, 0.05, 0.7, 0.2, 0.05, 0.6, 1),
			new Yokai("Alhail", 249, B, Eerie, false, statA[247], statB[247], ListAttack[3], ListTechnique[2], "Stiff Skin", inspiritList[204], Fire, 2.0, Ice, 0.2, 0.05, 0.75, 0.15, 0.05, 0.75, 1),
			new Yokai("Gush", 250, D, Eerie, false, statA[248], statB[248], ListAttack[3], ListTechnique[1], "Good Fortune", inspiritList[205], Water, 2.0, Thunder, 0.7, 0.05, 0.7, 0.2, 0.05, 0.65, 1),
			new Yokai("Peckpocket", 251, E, Eerie, false, statA[249], statB[249], ListAttack[40], ListTechnique[0], "Glossy Skin", inspiritList[206], Fire, 1.3, Ice, 0.7, 0.5, 0.15, 0.25, 0.1, 0.6, 1),
			new Yokai("Robbinyu", 252, B, Eerie, false, statA[250], statB[250], ListAttack[1], ListTechnique[3], "Glossy Skin", inspiritList[207], Fire, 1.5, Ice, 0.5, 0.6, 0.1, 0.25, 0.05, 0.75, 1),
			new Yokai("Rockabelly", 253, D, Eerie, false, statA[251], statB[251], ListAttack[40], ListTechnique[3], "Glossy Skin", inspiritList[208], Earth, 1.5, Thunder, 0.5, 0.15, 0.5, 0.25, 0.1, 0.65, 1),
			new Yokai("Squeeky", 254, E, Eerie, false, statA[252], statB[252], ListAttack[17], ListTechnique[6], "Noise Pollution", inspiritList[209], Fire, 1.3, Ice, 0.7, 0.45, 0.2, 0.3, 0.05, 0.6, 1),
			new Yokai("Rawry", 255, B, Eerie, false, statA[253], statB[253], ListAttack[44], ListTechnique[5], "Noise Pollution", inspiritList[210], Fire, 1.5, Ice, 0.5, 0.55, 0.15, 0.25, 0.05, 0.75, 1),
			new Yokai("Buhu", 256, E, Eerie, false, statA[254], statB[254], ListAttack[27], ListTechnique[23], "Wind Play", inspiritList[211], Ice, 1.3, Wind, 0.7, 0.1, 0.55, 0.3, 0.05, 0.6, 2),
			new Yokai("Flumpy", 257, C, Eerie, false, statA[255], statB[255], ListAttack[27], ListTechnique[19], "Wind Play", inspiritList[212], Ice, 1.5, Wind, 0.5, 0.1, 0.55, 0.3, 0.05, 0.7, 1),
			new Yokai("Skreek", 258, A, Eerie, false, statA[256], statB[256], ListAttack[27], ListTechnique[18], "Penetrate", inspiritList[213], Ice, 1.5, Fire, 0.7, 0.45, 0.25, 0.25, 0.05, 0.8, 1),
			new Yokai("Manjimutt", 259, E, Eerie, false, statA[257], statB[257], ListAttack[6], ListTechnique[1], "Mutt's Paradise", inspiritList[214], Water, 1.3, Fire, 0.7, 0.5, 0.35, 0.1, 0.05, 0.6, 1),
			new Yokai("Multimutt", 260, B, Eerie, false, statA[258], statB[258], ListAttack[6], ListTechnique[8], "Mutt's Paradise", inspiritList[214], Water, 1.5, Fire, 0.5, 0.7, 0.1, 0.15, 0.05, 0.75, 1),
			new Yokai("Sir Berus", 261, A, Eerie, false, statA[259], statB[259], ListAttack[6], ListTechnique[10], "Mutt's Paradise", inspiritList[215], Wind, 1.8, Earth, 0.5, 0.3, 0.5, 0.15, 0.05, 0.8, 1),
			new Yokai("Furgus", 262, E, Eerie, false, statA[260], statB[260], ListAttack[45], ListTechnique[12], "Hairnet", inspiritList[216], Wind, 1.3, Earth, 0.7, 0.05, 0.4, 0.45, 0.1, 0.6, 1),
			new Yokai("Furdinand", 263, A, Eerie, false, statA[261], statB[261], ListAttack[44], ListTechnique[10], "Haiwax", inspiritList[217], Wind, 1.5, Earth, 0.5, 0.05, 0.5, 0.35, 0.1, 0.8, 1),
			new Yokai("Nosirs", 264, D, Eerie, false, statA[262], statB[262], ListAttack[36], ListTechnique[15], "Spin-no-rama", inspiritList[218], Earth, 1.3, Water, 0.7, 0.25, 0.25, 0.25, 0.25, 0.65, 1),
			new Yokai("Dismarelda", 265, D, Eerie, false, statA[263], statB[263], ListAttack[40], ListTechnique[16], "Cursed Skin", inspiritList[219], Wind, 1.3, Earth, 0.7, 0.1, 0.5, 0.35, 0.05, 0.65, 1),
			new Yokai("Chatalie", 266, D, Eerie, false, statA[264], statB[264], ListAttack[2], ListTechnique[17], "Skilled Loafer", inspiritList[220], Earth, 1.3, Thunder, 0.7, 0.25, 0.4, 0.3, 0.05, 0.65, 1),
			new Yokai("Nagatha", 267, C, Eerie, false, statA[265], statB[265], ListAttack[2], ListTechnique[3], "Skilled Loafer", inspiritList[221], Fire, 1.3, Thunder, 0.7, 0.6, 0.15, 0.2, 0.05, 0.7, 1),
			new Yokai("Papa Windbag", 268, C, Eerie, false, statA[266], statB[266], ListAttack[11], ListTechnique[9], "Center Stage", inspiritList[222], Earth, 1.5, Thunder, 0.5, 0.1, 0.5, 0.35, 0.05, 0.7, 1),
			new Yokai("Ben Tover", 269, C, Eerie, false, statA[267], statB[267], ListAttack[3], ListTechnique[19], "Dodge", inspiritList[223], Ice, 1.5, Wind, 0.5, 0.2, 0.4, 0.3, 0.1, 0.7, 1),
			new Yokai("Cheeksqueek", 270, C, Eerie, false, statA[268], statB[268], ListAttack[15], ListTechnique[5], "Gassy Sphere", inspiritList[224], Fire, 1.3, Ice, 0.7, 0.4, 0.3, 0.25, 0.05, 0.7, 1),
			new Yokai("Cuttincheez", 271, A, Eerie, false, statA[269], statB[269], ListAttack[15], ListTechnique[5], "Sense of Smell", inspiritList[224], Fire, 1.5, Ice, 0.5, 0.3, 0.4, 0.25, 0.05, 0.8, 1),
			new Yokai("Toiletta", 272, C, Eerie, false, statA[270], statB[270], ListAttack[36], ListTechnique[3], "Curse Worsener", inspiritList[225], Earth, 1.5, Water, 0.5, 0.1, 0.65, 0.2, 0.05, 0.7, 1),
			new Yokai("Foiletta", 273, A, Eerie, false, statA[271], statB[271], ListAttack[38], ListTechnique[14], "Curse Worsener", inspiritList[226], Earth, 1.8, Water, 0.3, 0.05, 0.7, 0.2, 0.05, 0.8, 1),
			new Yokai("Sproink", 274, B, Eerie, false, statA[272], statB[272], ListAttack[1], ListTechnique[8], "Pigskin", inspiritList[227], Water, 1.5, Fire, 0.3, 0.3, 0.5, 0.1, 0.1, 0.75, 1),
			new Yokai("Compunzer", 275, A, Eerie, false, statA[273], statB[273], ListAttack[1], ListTechnique[3], "Hanging In", inspiritList[228], Ice, 1.3, Wind, 0.7, 0.25, 0.45, 0.25, 0.05, 0.8, 1),
			new Yokai("Lamedian", 276, A, Eerie, false, statA[274], statB[274], ListAttack[1], ListTechnique[14], "Hanging In", inspiritList[228], Fire, 1.5, Thunder, 0.5, 0.4, 0.25, 0.3, 0.05, 0.8, 1),
			new Yokai("Grumples", 277, B, Eerie, false, statA[275], statB[275], ListAttack[17], ListTechnique[0], "Oldness Zone", inspiritList[229], Thunder, 1.3, Water, 0.7, 0.1, 0.35, 0.5, 0.05, 0.75, 1),
			new Yokai("Everfore", 278, S, Eerie, false, statA[276], statB[276], ListAttack[1], ListTechnique[14], "Oldness Zone", inspiritList[230], Thunder, 1.5, Water, 0.5, 0.1, 0.55, 0.3, 0.05, 0.8, 1),
			new Yokai("Eterna", 279, S, Eerie, false, statA[277], statB[277], ListAttack[1], ListTechnique[14], "Oldness Zone", inspiritList[231], Earth, 1.5, Thunder, 0.7, 0.25, 0.4, 0.3, 0.05, 0.8, 1),
			new Yokai("Insomni", 280, A, Eerie, false, statA[278], statB[278], ListAttack[36], ListTechnique[2], "Insecure", inspiritList[232], Earth, 1.3, Thunder, 0.7, 0.25, 0.35, 0.35, 0.05, 0.8, 1),
			new Yokai("Sandi", 281, S, Eerie, false, statA[279], statB[279], ListAttack[36], ListTechnique[14], "Grip on You", inspiritList[125], Ice, 1.5, Thunder, 0.5, 0.1, 0.45, 0.4, 0.05, 0.8, 1),
			new Yokai("Arachnus", 282, S, Eerie, false, statA[280], statB[280], ListAttack[25], ListTechnique[10], "Highlander", inspiritList[233], Wind, 1.8, Earth, 0.3, 0.1, 0.7, 0.15, 0.05, 0.8, 1),
			new Yokai("Arachnia", 283, S, Eerie, false, statA[281], statB[281], ListAttack[25], ListTechnique[10], "Highlander", inspiritList[233], Wind, 1.8, Earth, 0.2, 0.7, 0.1, 0.15, 0.05, 0.8, 1),
			new Yokai("Cricky", 284, E, Slippery, false, statA[282], statB[282], ListAttack[16], ListTechnique[13], "Rest Less", inspiritList[234], Thunder, 1.5, Water, 0.5, 0.2, 0.6, 0.15, 0.05, 0.4, 1),
			new Yokai("Noko", 285, E, Slippery, false, statA[283], statB[283], ListAttack[2], ListTechnique[16], "Good Fortune", inspiritList[235], Wind, 1.5, Earth, 0.5, 0.05, 0.55, 0.3, 0.1, 0.4, 1),
			new Yokai("Bloominoko", 286, A, Slippery, false, statA[284], statB[284], ListAttack[21], ListTechnique[10], "Good Fortune", inspiritList[235], Wind, 1.8, Earth, 0.3, 0.1, 0.65, 0.2, 0.05, 0.6, 1),
			new Yokai("Pandanoko", 287, A, Slippery, false, statA[285], statB[285], ListAttack[21], ListTechnique[2], "Summon", inspiritList[236], Neutral, 1.0, Earth, 0.8, 0.6, 0.05, 0.3, 0.05, 0.6, 2),
			new Yokai("Snaggly", 288, E, Slippery, false, statA[286], statB[286], ListAttack[17], ListTechnique[17], "Hassle", inspiritList[237], Earth, 1.3, Thunder, 0.7, 0.5, 0.3, 0.15, 0.05, 0.4, 1),
			new Yokai("Whinona", 289, A, Slippery, false, statA[287], statB[287], ListAttack[44], ListTechnique[9], "Hassle", inspiritList[238], Earth, 1.5, Thunder, 0.5, 0.45, 0.35, 0.1, 0.1, 0.6, 1),
			new Yokai("Heheheel", 290, D, Slippery, false, statA[288], statB[288], ListAttack[6], ListTechnique[7], "Jar Guard", inspiritList[239], Wind, 1.3, Fire, 0.7, 0.5, 0.2, 0.25, 0.05, 0.45, 1),
			new Yokai("Croonger", 291, C, Slippery, false, statA[289], statB[289], ListAttack[6], ListTechnique[3], "Jar Guard", inspiritList[240], Fire, 1.3, Ice, 0.7, 0.4, 0.3, 0.25, 0.05, 0.5, 1),
			new Yokai("Urnaconda", 292, C, Slippery, false, statA[290], statB[290], ListAttack[6], ListTechnique[15], "Jar Guard", inspiritList[241], Earth, 1.3, Thunder, 0.7, 0.6, 0.1, 0.25, 0.05, 0.5, 1),
			new Yokai("Fishpicable", 293, D, Slippery, false, statA[291], statB[291], ListAttack[0], ListTechnique[9], "Waterproof", inspiritList[242], Earth, 1.3, Thunder, 0.7, 0.4, 0.45, 0.1, 0.05, 0.45, 1),
			new Yokai("Rageon", 294, B, Slippery, false, statA[292], statB[292], ListAttack[8], ListTechnique[9], "Waterproof", inspiritList[243], Earth, 1.5, Thunder, 0.5, 0.3, 0.45, 0.2, 0.05, 0.55, 1),
			new Yokai("Tunatic", 295, A, Slippery, false, statA[293], statB[293], ListAttack[8], ListTechnique[8], "Fire Play", inspiritList[244], Water, 1.8, Earth, 0.5, 0.65, 0.15, 0.15, 0.05, 0.6, 1),
			new Yokai("Flushback", 296, D, Slippery, false, statA[294], statB[294], ListAttack[3], ListTechnique[7], "Windbreaker", inspiritList[245], Ice, 1.3, Water, 0.7, 0.1, 0.65, 0.15, 0.1, 0.45, 1),
			new Yokai("Vacuumory", 297, A, Slippery, false, statA[295], statB[295], ListAttack[1], ListTechnique[11], "Windbreaker", inspiritList[245], Earth, 1.5, Water, 0.5, 0.15, 0.65, 0.15, 0.05, 0.6, 1),
			new Yokai("Irewig", 298, D, Slippery, false, statA[296], statB[296], ListAttack[1], ListTechnique[4], "Revenge", inspiritList[246], Water, 1.3, Fire, 0.7, 0.6, 0.15, 0.15, 0.1, 0.45, 1),
			new Yokai("Firewig", 299, A, Slippery, false, statA[297], statB[297], ListAttack[7], ListTechnique[8], "Revenge", inspiritList[247], Water, 1.5, Fire, 0.5, 0.65, 0.15, 0.1, 0.1, 0.6, 1),
			new Yokai("Draggie", 300, D, Slippery, false, statA[298], statB[298], ListAttack[16], ListTechnique[16], "Hard Worker", inspiritList[248], Water, 1.3, Earth, 0.7, 0.2, 0.55, 0.2, 0.05, 0.45, 1),
			new Yokai("Dragon Lord", 301, S, Slippery, false, statA[299], statB[299], ListAttack[21], ListTechnique[10], "Dragon Force", inspiritList[248], Water, 1.5, Earth, 0.5, 0.15, 0.65, 0.15, 0.05, 0.65, 1),
		};
	}

	private static Yokai[] medaillum_3() {
		return new Yokai[] {
			new Yokai("Azure Dragon", 302, S, Slippery, false, statA[300], statB[300], ListAttack[21], ListTechnique[22], "Dragon Force", inspiritList[249], Thunder, 1.8, Water, 0.5, 0.5, 0.35, 0.1, 0.05, 0.65, 1),
			new Yokai("Mermaidyn", 303, D, Slippery, false, statA[301], statB[301], ListAttack[45], ListTechnique[13], "Saintly Scales", inspiritList[250], Thunder, 1.5, Water, 0.5, 0.15, 0.65, 0.15, 0.05, 0.45, 1),
			new Yokai("Mermadonna", 304, S, Slippery, false, statA[302], statB[302], ListAttack[45], ListTechnique[22], "Saintly Scales", inspiritList[250], Thunder, 1.8, Water, 0.3, 0.2, 0.65, 0.1, 0.05, 0.65, 1),
			new Yokai("Mermother", 305, S, Slippery, false, statA[303], statB[303], ListAttack[45], ListTechnique[22], "Saintly Scales", inspiritList[34], Thunder, 1.8, Water, 0.2, 0.15, 0.7, 0.1, 0.05, 0.65, 1),
			new Yokai("Lady Longnek", 306, C, Slippery, false, statA[304], statB[304], ListAttack[17], ListTechnique[15], "Rubberneck", inspiritList[251], Earth, 1.5, Ice, 0.5, 0.45, 0.3, 0.2, 0.05, 0.5, 1),
			new Yokai("Daiz", 307, C, Slippery, false, statA[305], statB[305], ListAttack[3], ListTechnique[3], "Dodge", inspiritList[252], Neutral, 1.0, Earth, 0.8, 0.05, 0.7, 0.2, 0.05, 0.5, 1),
			new Yokai("Confuze", 308, B, Slippery, false, statA[306], statB[306], ListAttack[3], ListTechnique[3], "Dodge", inspiritList[253], Neutral, 1.0, Earth, 0.8, 0.2, 0.45, 0.3, 0.05, 0.55, 1),
			new Yokai("Chummer", 309, C, Slippery, false, statA[307], statB[307], ListAttack[21], ListTechnique[13], "Loiterer", inspiritList[254], Thunder, 1.3, Water, 0.7, 0.65, 0.15, 0.15, 0.05, 0.5, 1),
			new Yokai("Shrook", 310, B, Slippery, false, statA[308], statB[308], ListAttack[21], ListTechnique[13], "Shark Skin", inspiritList[255], Thunder, 1.5, Water, 0.5, 0.7, 0.1, 0.15, 0.05, 0.55, 1),
			new Yokai("Spenp", 311, C, Slippery, false, statA[309], statB[309], ListAttack[6], ListTechnique[19], "Matchless Shell", inspiritList[256], Ice, 1.3, Wind, 0.7, 0.4, 0.3, 0.1, 0.2, 0.5, 1),
			new Yokai("Almi", 312, B, Slippery, false, statA[310], statB[310], ListAttack[6], ListTechnique[13], "Matchless Shell", inspiritList[110], Thunder, 1.8, Water, 0.5, 0.2, 0.6, 0.05, 0.15, 0.55, 1),
			new Yokai("Babblong", 313, C, Slippery, false, statA[311], statB[311], ListAttack[12], ListTechnique[13], "Skilled Loafer", inspiritList[257], Thunder, 1.3, Water, 0.7, 0.55, 0.15, 0.25, 0.05, 0.5, 1),
			new Yokai("Bananose", 314, A, Slippery, false, statA[312], statB[312], ListAttack[12], ListTechnique[22], "Skilled Loafer", inspiritList[258], Thunder, 1.8, Water, 0.5, 0.6, 0.2, 0.15, 0.05, 0.6, 1),
			new Yokai("Draaagin", 315, B, Slippery, false, statA[313], statB[313], ListAttack[21], ListTechnique[2], "Just a Minute", inspiritList[259], Fire, 1.5, Ice, 0.5, 0.25, 0.45, 0.2, 0.1, 0.55, 2),
			new Yokai("SV Snaggerjag", 316, B, Slippery, false, statA[314], statB[314], ListAttack[1], ListTechnique[22], "Waterworks", inspiritList[260], Thunder, 1.5, Water, 0.3, 0.25, 0.65, 0.05, 0.05, 0.55, 1),
			new Yokai("Copperled", 317, B, Slippery, false, statA[315], statB[315], ListAttack[0], ListTechnique[1], "Fire Watchout", inspiritList[261], Water, 1.5, Fire, 0.5, 0.55, 0.2, 0.2, 0.05, 0.55, 1),
			new Yokai("Cynake", 318, B, Slippery, false, statA[316], statB[316], ListAttack[0], ListTechnique[13], "Greed", inspiritList[262], Thunder, 1.5, Water, 0.5, 0.1, 0.65, 0.2, 0.05, 0.55, 1),
			new Yokai("Slitheref", 319, A, Slippery, false, statA[317], statB[317], ListAttack[0], ListTechnique[21], "Too Serious", inspiritList[263], Earth, 1.5, Thunder, 0.5, 0.4, 0.35, 0.2, 0.05, 0.6, 1),
			new Yokai("Venoct", 320, S, Slippery, false, statA[318], statB[318], ListAttack[21], ListTechnique[21], "Venocharge", inspiritList[264], Earth, 1.8, Thunder, 0.5, 0.55, 0.3, 0.1, 0.05, 0.65, 1),
			new Yokai("Shadow Venoct", 321, S, Slippery, false, statA[319], statB[319], ListAttack[21], ListTechnique[11], "Secrecy", inspiritList[265], Thunder, 1.5, Fire, 0.5, 0.3, 0.55, 0.1, 0.05, 0.65, 1),
			new Yokai("Shogunyan", 322, S, Brave, false, statA[320], statB[320], ListAttack[20], ListTechnique[18], "Extreme Critical", inspiritList[266], Ice, 1.8, Wind, 0.2, 0.7, 0.15, 0.1, 0.05, 0.9, 1),
			new Yokai("Komashura", 323, S, Mysterious, false, statA[321], statB[321], ListAttack[31], ListTechnique[8], "Blazing Spirit", inspiritList[267], Water, 1.8, Fire, 0.2, 0.1, 0.75, 0.1, 0.05, 0.9, 1),
			new Yokai("Gilgaros", 324, S, Tough, false, statA[322], statB[322], ListAttack[7], ListTechnique[9], "Extreme Critical", inspiritList[268], Earth, 1.8, Thunder, 0.2, 0.75, 0.05, 0.1, 0.1, 0.9, 1),
			new Yokai("Spoilerina", 325, S, Charming, false, statA[323], statB[323], ListAttack[38], ListTechnique[18], "Twinkle Toes", inspiritList[269], Ice, 1.8, Wind, 0.2, 0.05, 0.75, 0.15, 0.05, 0.9, 1),
			new Yokai("Elder Bloom", 326, S, Heartful, false, statA[324], statB[324], ListAttack[16], ListTechnique[11], "Caring", inspiritList[270], Wind, 1.8, Earth, 0.2, 0.05, 0.75, 0.15, 0.05, 0.9, 1),
			new Yokai("Poofessor", 327, S, Shady, false, statA[325], statB[325], ListAttack[29], ListTechnique[14], "Biochemistry", inspiritList[271], Wind, 1.8, Fire, 0.2, 0.35, 0.3, 0.3, 0.05, 0.9, 1),
			new Yokai("Dandoodle", 328, S, Eerie, false, statA[326], statB[326], ListAttack[44], ListTechnique[11], "Popularity", inspiritList[272], Thunder, 1.8, Water, 0.2, 0.1, 0.65, 0.2, 0.05, 0.9, 1),
			new Yokai("Slurpent", 329, S, Slippery, false, statA[327], statB[327], ListAttack[21], ListTechnique[14], "Tongue Twister", inspiritList[273], Water, 1.8, Fire, 0.2, 0.4, 0.4, 0.1, 0.1, 0.7, 1),
			new Yokai("Sapphinyan", 330, A, Charming, false, statA[328], statB[328], ListAttack[34], ListTechnique[22], "Linked Together", inspiritList[274], Thunder, 1.8, Water, 0.3, 0.3, 0.55, 0.1, 0.05, 0.8, 1),
			new Yokai("Emenyan", 331, A, Charming, false, statA[329], statB[329], ListAttack[34], ListTechnique[11], "Linked Together", inspiritList[275], Neutral, 1.0, Neutral, 1.0, 0.2, 0.6, 0.15, 0.05, 0.8, 1),
			new Yokai("Rubinyan", 332, A, Charming, false, statA[330], statB[330], ListAttack[34], ListTechnique[8], "Linked Together", inspiritList[276], Water, 1.8, Fire, 0.3, 0.65, 0.2, 0.1, 0.05, 0.8, 1),
			new Yokai("Topanyan", 333, A, Charming, false, statA[331], statB[331], ListAttack[34], ListTechnique[21], "Linked Together", inspiritList[277], Earth, 1.8, Thunder, 0.3, 0.6, 0.2, 0.05, 0.15, 0.8, 1),
			new Yokai("Dianyan", 334, A, Charming, false, statA[332], statB[332], ListAttack[34], ListTechnique[2], "Linked Together", inspiritList[278], Fire, 1.8, Ice, 0.3, 0.4, 0.35, 0.2, 0.05, 0.8, 1),
			new Yokai("Melonyan", 335, A, Charming, false, statA[333], statB[333], ListAttack[34], ListTechnique[5], "Juicy Goodness", inspiritList[279], Fire, 1.5, Ice, 0.3, 0.35, 0.35, 0.2, 0.1, 0.8, 1),
			new Yokai("Oranyan", 336, B, Charming, false, statA[334], statB[334], ListAttack[34], ListTechnique[9], "Juicy Goodness", inspiritList[280], Earth, 1.5, Thunder, 0.3, 0.45, 0.35, 0.15, 0.05, 0.8, 1),
			new Yokai("Kiwinyan", 337, B, Charming, false, statA[335], statB[335], ListAttack[34], ListTechnique[16], "Juicy Goodness", inspiritList[281], Wind, 1.5, Earth, 0.3, 0.6, 0.25, 0.1, 0.05, 0.8, 1),
			new Yokai("Grapenyan", 338, B, Charming, false, statA[336], statB[336], ListAttack[34], ListTechnique[13], "Juicy Goodness", inspiritList[282], Thunder, 1.5, Water, 0.3, 0.25, 0.6, 0.1, 0.05, 0.8, 1),
			new Yokai("Strawbnyan", 339, B, Charming, false, statA[337], statB[337], ListAttack[34], ListTechnique[1], "Juicy Goodness", inspiritList[283], Water, 1.5, Fire, 0.3, 0.35, 0.45, 0.15, 0.05, 0.8, 1),
			new Yokai("Watermelnyan", 340, A, Charming, false, statA[338], statB[338], ListAttack[34], ListTechnique[19], "Juicy Goodness", inspiritList[284], Ice, 1.5, Wind, 0.3, 0.5, 0.15, 0.2, 0.15, 0.8, 1),
			new Yokai("Robokapp", 341, A, Charming, false, statA[339], statB[339], ListAttack[32], ListTechnique[13], "Polarity", inspiritList[102], Thunder, 1.5, Water, 0.3, 0.3, 0.55, 0.05, 0.1, 0.8, 1),
			new Yokai("Robokoma", 342, A, Charming, false, statA[340], statB[340], ListAttack[32], ListTechnique[1], "Polarity", inspiritList[102], Thunder, 1.5, Fire, 0.3, 0.2, 0.65, 0.05, 0.1, 0.8, 1),
			new Yokai("Robogramps", 343, B, Heartful, false, statA[341], statB[341], ListAttack[16], ListTechnique[15], "Polarity", inspiritList[102], Thunder, 1.5, Ice, 0.3, 0.35, 0.5, 0.1, 0.05, 0.75, 1),
			new Yokai("Robomutt", 344, B, Eerie, false, statA[342], statB[342], ListAttack[6], ListTechnique[19], "Polarity", inspiritList[102], Thunder, 1.5, Earth, 0.5, 0.6, 0.15, 0.15, 0.1, 0.75, 1),
			new Yokai("Robonoko", 345, B, Slippery, false, statA[343], statB[343], ListAttack[2], ListTechnique[16], "Polarity", inspiritList[102], Thunder, 1.5, Earth, 0.3, 0.05, 0.75, 0.05, 0.15, 0.55, 1),
			new Yokai("Robodraggie", 346, B, Slippery, false, statA[344], statB[344], ListAttack[16], ListTechnique[1], "Polarity", inspiritList[102], Thunder, 1.5, Fire, 0.3, 0.1, 0.7, 0.1, 0.1, 0.55, 1),
			new Yokai("Wondernyan", 347, B, Charming, false, statA[345], statB[345], ListAttack[20], ListTechnique[0], "Long Lasting", inspiritList[64], Thunder, 1.3, Ice, 0.5, 0.6, 0.25, 0.1, 0.05, 0.8, 1),
			new Yokai("Robonyan F", 348, A, Tough, false, statA[346], statB[346], ListAttack[33], ListTechnique[1], "Polarity", inspiritList[285], Water, 1.3, Fire, 0.5, 0.8, 0.05, 0.05, 0.1, 0.85, 1),
			new Yokai("Sailornyan", 349, A, Charming, false, statA[347], statB[347], ListAttack[34], ListTechnique[11], "Healer Moon", inspiritList[286], Fire, 1.3, Ice, 0.5, 0.15, 0.65, 0.15, 0.05, 0.8, 1),
			new Yokai("Machonyan", 350, A, Brave, false, statA[348], statB[348], ListAttack[34], ListTechnique[17], "Purrsistence", inspiritList[124], Earth, 1.3, Thunder, 0.5, 0.7, 0.15, 0.1, 0.05, 0.85, 1),
			new Yokai("Hovernyan", 351, B, Brave, false, statA[349], statB[349], ListAttack[34], ListTechnique[19], "Acrobat", inspiritList[287], Ice, 1.5, Wind, 0.3, 0.65, 0.2, 0.1, 0.05, 0.8, 1),
			new Yokai("Darknyan", 352, A, Eerie, false, statA[350], statB[350], ListAttack[34], ListTechnique[18], "Night Guard", inspiritList[133], Ice, 1.5, Wind, 0.3, 0.2, 0.45, 0.3, 0.05, 0.8, 1),
			new Yokai("Jibakoma", 353, A, Charming, false, statA[351], statB[351], ListAttack[32], ListTechnique[8], "Fire Play", inspiritList[120], Water, 1.3, Fire, 0.5, 0.1, 0.7, 0.15, 0.05, 0.8, 1),
			new Yokai("Jetnyan", 354, B, Charming, false, statA[352], statB[352], ListAttack[34], ListTechnique[18], "Number One!", inspiritList[288], Ice, 1.3, Wind, 0.5, 0.1, 0.65, 0.2, 0.05, 0.8, 1),
			new Yokai("Unfairy", 355, S, Wicked, false, statA[353], statB[353], ListAttack[34], ListTechnique[14], "Grip on You", inspiritList[289], Water, 1.5, Fire, 0.3, 0.05, 0.75, 0.1, 0.1, 0.35, 0),
			new Yokai("Unkaind", 356, S, Wicked, false, statA[354], statB[354], ListAttack[38], ListTechnique[22], "Curse Worsener", inspiritList[290], Thunder, 1.5, Water, 0.3, 0.3, 0.5, 0.15, 0.05, 0.35, 0),
			new Yokai("Untidy", 357, S, Wicked, false, statA[355], statB[355], ListAttack[4], ListTechnique[10], "Extreme Critical", inspiritList[291], Wind, 1.5, Earth, 0.3, 0.8, 0.05, 0.1, 0.05, 0.35, 0),
			new Yokai("Unpleasant", 358, S, Wicked, false, statA[356], statB[356], ListAttack[1], ListTechnique[18], "Soothing Rhythm", inspiritList[292], Ice, 1.5, Wind, 0.3, 0.05, 0.8, 0.1, 0.05, 0.35, 0),
			new Yokai("Unkeen", 359, S, Wicked, false, statA[357], statB[357], ListAttack[31], ListTechnique[21], "Guard Break", inspiritList[293], Earth, 1.5, Thunder, 0.3, 0.45, 0.4, 0.1, 0.05, 0.1, 0),
			new Yokai("Grublappa", 360, C, Wicked, false, statA[358], statB[358], ListAttack[37], ListTechnique[9], "Lickaway", inspiritList[13], Earth, 1.5, Thunder, 0.5, 0.85, 0.05, 0.05, 0.05, 0.2, 0),
			new Yokai("Madmunch", 361, B, Wicked, false, statA[359], statB[359], ListAttack[30], ListTechnique[16], "Sludge Grudge", inspiritList[19], Wind, 1.8, Earth, 0.3, 0.8, 0.1, 0.05, 0.05, 0.25, 0),
			new Yokai("Badsmella", 362, A, Wicked, false, statA[360], statB[360], ListAttack[38], ListTechnique[18], "Magic Mist", inspiritList[294], Ice, 1.5, Wind, 0.5, 0.05, 0.8, 0.1, 0.05, 0.3, 0),
			new Yokai("Mad Kappa", 363, A, Wicked, false, statA[361], statB[361], ListAttack[25], ListTechnique[22], "Intimidation", inspiritList[295], Thunder, 2.0, Water, 0.2, 0.3, 0.6, 0.05, 0.05, 0.3, 0),
			new Yokai("Shamasol", 364, D, Wicked, false, statA[362], statB[362], ListAttack[27], ListTechnique[19], "Sun Shield", inspiritList[296], Ice, 1.5, Wind, 0.5, 0.05, 0.45, 0.45, 0.05, 0.15, 0),
			new Yokai("Gnomine", 365, C, Wicked, false, statA[363], statB[363], ListAttack[17], ListTechnique[15], "Good Fortune", inspiritList[297], Fire, 1.5, Earth, 0.5, 0.1, 0.8, 0.05, 0.05, 0.25, 0),
			new Yokai("Defectabull", 366, C, Wicked, false, statA[364], statB[364], ListAttack[3], ListTechnique[15], "Clairvoidance", inspiritList[298], Water, 1.5, Earth, 0.5, 0.5, 0.4, 0.05, 0.05, 0.25, 0),
			new Yokai("Feargus", 367, D, Wicked, false, statA[365], statB[365], ListAttack[45], ListTechnique[16], "Hairnet", inspiritList[216], Wind, 1.5, Earth, 0.5, 0.05, 0.4, 0.5, 0.05, 0.15, 0),
			new Yokai("Scaremaiden", 368, C, Wicked, false, statA[366], statB[366], ListAttack[45], ListTechnique[13], "Saintly Scales", inspiritList[299], Thunder, 1.8, Water, 0.3, 0.05, 0.85, 0.05, 0.05, 0.2, 0),
			new Yokai("Wrongnek", 369, B, Wicked, false, statA[367], statB[367], ListAttack[17], ListTechnique[15], "Rubberneck", inspiritList[300], Earth, 1.8, Ice, 0.3, 0.5, 0.4, 0.05, 0.05, 0.25, 1),
			new Yokai("Grumpus Khan", 370, D, Shady, false, statA[368], statB[368], ListAttack[2], ListTechnique[23], "Breaking Baaad", inspiritList[301], Ice, 1.3, Wind, 0.5, 0.5, 0.2, 0.25, 0.05, 0.6, 1),
			new Yokai("Groupus Khan", 371, B, Shady, false, statA[369], statB[369], ListAttack[5], ListTechnique[19], "Breaking Baaad", inspiritList[301], Ice, 1.5, Wind, 0.3, 0.55, 0.1, 0.3, 0.05, 0.65, 1),
			new Yokai("Slumberhog", 372, D, Brave, false, statA[370], statB[370], ListAttack[3], ListTechnique[4], "Fast Asleep", inspiritList[125], Water, 1.3, Fire, 0.5, 0.5, 0.2, 0.2, 0.1, 0.75, 2),
			new Yokai("Snortlehog", 373, B, Brave, false, statA[371], statB[371], ListAttack[8], ListTechnique[1], "Extreme Critical", inspiritList[302], Water, 1.5, Fire, 0.3, 0.65, 0.15, 0.15, 0.05, 0.8, 1),
			new Yokai("Panja Pupil", 374, D, Charming, false, statA[372], statB[372], ListAttack[17], ListTechnique[6], "Secrecy", inspiritList[303], Fire, 1.3, Ice, 0.5, 0.6, 0.15, 0.2, 0.05, 0.7, 1),
			new Yokai("Panja Pro", 375, B, Charming, false, statA[373], statB[373], ListAttack[8], ListTechnique[5], "Secrecy", inspiritList[303], Fire, 1.5, Ice, 0.3, 0.7, 0.15, 0.1, 0.05, 0.8, 1),
			new Yokai("Samureel", 376, D, Brave, false, statA[374], statB[374], ListAttack[1], ListTechnique[20], "Skilled Loafer", inspiritList[304], Thunder, 1.3, Water, 0.5, 0.6, 0.1, 0.1, 0.2, 0.75, 1),
			new Yokai("Time Keeler", 377, B, Brave, false, statA[375], statB[375], ListAttack[20], ListTechnique[13], "Skilled Loafer", inspiritList[304], Thunder, 1.5, Water, 0.3, 0.7, 0.05, 0.05, 0.2, 0.8, 1),
			new Yokai("Takoyakid", 378, D, Slippery, false, statA[376], statB[376], ListAttack[29], ListTechnique[4], "Killer Comeback", inspiritList[305], Water, 1.3, Fire, 0.5, 0.6, 0.15, 0.15, 0.1, 0.45, 1),
			new Yokai("Takoyaking", 379, B, Slippery, false, statA[377], statB[377], ListAttack[41], ListTechnique[1], "Killer Comeback", inspiritList[305], Water, 1.5, Fire, 0.3, 0.65, 0.15, 0.1, 0.1, 0.55, 1),
			new Yokai("Danke Sand", 380, D, Eerie, false, statA[378], statB[378], ListAttack[30], ListTechnique[12], "Sandbag", inspiritList[306], Wind, 1.3, Earth, 0.5, 0.05, 0.35, 0.5, 0.1, 0.65, 1),
			new Yokai("No Sandkyu", 381, B, Eerie, false, statA[379], statB[379], ListAttack[31], ListTechnique[16], "Sandbag", inspiritList[81], Wind, 1.5, Earth, 0.3, 0.05, 0.35, 0.5, 0.1, 0.75, 1),
			new Yokai("Sumodon", 382, D, Tough, false, statA[380], statB[380], ListAttack[26], ListTechnique[7], "The Stand", inspiritList[307], Thunder, 1.3, Water, 0.5, 0.6, 0.1, 0.2, 0.1, 0.75, 1),
			new Yokai("Yokozudon", 383, B, Tough, false, statA[381], statB[381], ListAttack[26], ListTechnique[15], "The Stand", inspiritList[307], Thunder, 1.5, Water, 0.3, 0.65, 0.1, 0.1, 0.15, 0.85, 1),
			new Yokai("Whateverest", 384, D, Tough, false, statA[382], statB[382], ListAttack[3], ListTechnique[4], "Eruption", inspiritList[308], Water, 1.5, Fire, 0.3, 0.05, 0.6, 0.15, 0.2, 0.75, 1),
			new Yokai("Whatuption", 385, B, Tough, false, statA[383], statB[383], ListAttack[44], ListTechnique[1], "Eruption", inspiritList[309], Water, 1.8, Fire, 0.2, 0.05, 0.6, 0.1, 0.25, 0.85, 1),
			new Yokai("Happycane", 386, D, Heartful, false, statA[384], statB[384], ListAttack[3], ListTechnique[7], "How Sweet", inspiritList[310], Ice, 1.3, Wind, 0.5, 0.1, 0.65, 0.2, 0.05, 0.65, 1),
			new Yokai("Starrycane", 387, B, Heartful, false, statA[385], statB[385], ListAttack[44], ListTechnique[15], "How Sweet", inspiritList[310], Ice, 1.5, Wind, 0.3, 0.1, 0.7, 0.15, 0.05, 0.75, 1),
			new Yokai("Snottle", 430, D, Mysterious, false, statA[386], statB[386], ListAttack[28], ListTechnique[3], "He Just Nose", inspiritList[311], Neutral, 1.0, Neutral, 1.0, 0.05, 0.2, 0.7, 0.05, 0.7, 1),
			new Yokai("Moximous N", 431, B, Brave, false, statA[387], statB[387], ListAttack[31], ListTechnique[18], "Born Winner", inspiritList[312], Water, 1.5, Fire, 0.3, 0.7, 0.15, 0.1, 0.05, 0.8, 1),
			new Yokai("Moximous K", 432, B, Brave, false, statA[388], statB[388], ListAttack[31], ListTechnique[22], "Born Lucky", inspiritList[312], Thunder, 1.8, Water, 0.3, 0.15, 0.7, 0.1, 0.05, 0.8, 1),
			new Yokai("Jibanyan S", 433, S, Charming, false, statA[389], statB[389], ListAttack[34], ListTechnique[1], "All or Nothing", inspiritList[313], Water, 1.5, Fire, 0.2, 0.7, 0.15, 0.1, 0.05, 0.7, 1),
			new Yokai("Komasan S", 434, S, Charming, false, statA[390], statB[390], ListAttack[30], ListTechnique[8], "Firewall", inspiritList[314], Water, 1.8, Fire, 0.1, 0.15, 0.7, 0.1, 0.05, 0.85, 1),
			new Yokai("Komajiro S", 435, S, Charming, false, statA[391], statB[391], ListAttack[31], ListTechnique[21], "Superconductor", inspiritList[315], Earth, 2.0, Thunder, 0.1, 0.15, 0.7, 0.1, 0.05, 0.85, 1),
			new Yokai("Darkyubi", 436, S, Shady, false, statA[392], statB[392], ListAttack[45], ListTechnique[14], "Darkness Falls", inspiritList[316], Ice, 1.5, Thunder, 0.7, 0.05, 0.55, 0.35, 0.05, 0.75, 1),
			new Yokai("Illuminoct", 437, S, Brave, false, statA[393], statB[393], ListAttack[21], ListTechnique[21], "Lord of Light", inspiritList[317], Earth, 1.5, Thunder, 0.5, 0.65, 0.2, 0.1, 0.05, 0.9, 1),
			new Yokai("Gargaros", 438, S, Tough, false, statA[394], statB[394], ListAttack[7], ListTechnique[8], "Guard Break", inspiritList[268], Water, 1.5, Fire, 0.5, 0.7, 0.1, 0.1, 0.1, 0.9, 1),
			new Yokai("Ogralus", 439, S, Tough, false, statA[395], statB[395], ListAttack[7], ListTechnique[22], "Water Play", inspiritList[268], Thunder, 1.5, Water, 0.5, 0.1, 0.7, 0.1, 0.1, 0.9, 1),
			new Yokai("Orcanos", 440, S, Tough, false, statA[396], statB[396], ListAttack[7], ListTechnique[14], "Thick Crust", inspiritList[268], Wind, 1.5, Fire, 0.7, 0.7, 0.1, 0.1, 0.1, 0.9, 1),
		};
	}

	public static Yokai[] medaillum = mergeYokai(medaillum_0(), medaillum_1(), medaillum_2(), medaillum_3());

	private static Yokai[] mergeYokai(Yokai[]... arrays) {
		int total = 0; for (Yokai[] a : arrays) total += a.length;
		Yokai[] result = new Yokai[total]; int i = 0;
		for (Yokai[] a : arrays) for (Yokai y : a) result[i++] = y; return result;
	}

	public static Stat unknownStat = new Stat(0,0,0,0,0);
	public static Yokai unknownYokai = new Yokai("???", 0, E, Wicked, false, unknownStat, unknownStat, ListAttack[0], ListTechnique[0], "???", inspiritList[0], Neutral, 1.0, Neutral, 1.0, 0.25, 0.25, 0.25, 0.25, 0.5, 1);
	public static Equipement unknowEquipement = new Equipement(0, 0, 0, 0, 0, 0, false, false);

	// === METHODES D'INSERTION ===
	public static void insererTribe(Tribe tribu) {
		try { DataBase.insertTribe(tribu); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererElement(Elemental element) {
		try { DataBase.insertElemental(element); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererRang(Rank rang) {
		try { DataBase.insertRank(rang); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererTier(Tier tier) {
		try { DataBase.insertTier(tier); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererStatA(Stat statA) {
		try { DataBase.insertStatA(statA); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererStatB(Stat statB) {
		try { DataBase.insertStatB(statB); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererTechnique(Technique technique) {
		try { DataBase.insertTechnique(technique); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererAttack(PhysicalAttack atk) {
		try { DataBase.insertAttack(atk); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererInspirit(Inspirit inspirit) {
		try { DataBase.insertInspirit(inspirit); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererYokai(Yokai yT) {
		try { DataBase.insertYokai(yT); } catch (SQLException e) {
			System.out.println("Erreur DB : " + e.getMessage());
		}
	}

	public static void insererLesElements() {
		insererElement(Neutral); insererElement(Fire); insererElement(Water);
		insererElement(Wind); insererElement(Ice); insererElement(Earth);
		insererElement(Thunder); insererElement(Heal); insererElement(Drain);
	}

	public static void insererLesTribus() {
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

	public static void insererLesRangs() {
		insererRang(E);
		insererRang(D);
		insererRang(C);
		insererRang(B);
		insererRang(A);
		insererRang(S);
	}

	public static void insererLesTiers() {
		insererTier(Tier.Ubers);
		insererTier(Tier.OUBL);
		insererTier(Tier.OU);
		insererTier(Tier.UU);
		insererTier(Tier.RU);
		insererTier(Tier.NU);
		insererTier(Tier.PU);
		insererTier(Tier.ZU);
	}

	public static void insererLesTechniques() { for (int i=0;i<ListTechnique.length;i++) insererTechnique(ListTechnique[i]); }
	public static void insererLesAttacks() { for (int i=0;i<ListAttack.length;i++) insererAttack(ListAttack[i]); }
	public static void insererLesInspirits() { for (int i=0;i<inspiritList.length;i++) insererInspirit(inspiritList[i]); }
	public static void insererStatATotal() { for (int i=0;i<statA.length;i++) insererStatA(statA[i]); }
	public static void insererStatBTotal() { for (int i=0;i<statB.length;i++) insererStatB(statB[i]); }

	public static void insererYokaiTotal() {
		for (Yokai y : medaillum_0()) insererYokai(y);
		for (Yokai y : medaillum_1()) insererYokai(y);
		for (Yokai y : medaillum_2()) insererYokai(y);
		for (Yokai y : medaillum_3()) insererYokai(y);
	}

	public static void printYokai() {
		System.out.printf("%-20s %-5s %-5s %10s%n", "Yo-kai", "Rang", "N° Medaillum", "Tribu");
		for (Yokai y : medaillum) {
			System.out.printf("%-20s %-5s %-5s %17s%n", y.GetName(), y.GetRank(), y.GetID(), y.GetTribe());
		}
	}

}