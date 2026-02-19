public class Attitude {
    String nom;
    int hp;
    int str;
    int spr;
    int def;
    int spe;

    Attitude[] attitude = {
    		new Attitude("gentle",26,0,13,0,0),
    		new Attitude("tender",52,0,0,0,0),
    		new Attitude("grouchy",26,13,0,0,0),
    		new Attitude("rough",0,26,0,0,0),
    		new Attitude("logical",0,0,13,0,13),
    		new Attitude("brainy",0,26,0,0,0),
    		new Attitude("careful",0,0,13,13,0),
    		new Attitude("calm",0,0,0,26,0),
    		new Attitude("twisted",0,0,0,0,13),
    		new Attitude("cruel",0,0,0,0,26),
    		new Attitude("helpful",26,0,0,0,13),
    		new Attitude("devoted",0,13,0,13,0)
		};
    

    Attitude(String nom, int Health, int Strength, int Spirit, int Defense, int Speed)
    {
        this.nom = nom;
        this.hp = Health;
        this.str = Strength;
        this.spr = Spirit;
        this.def = Defense;
        this.spe = Speed;
    }


}
