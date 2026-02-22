package yokai;

public class Attitude {
     String nom;
     int hp;
     int str;
     int spr;
     int def;
     int spe;

    public Attitude(String nom, int Health, int Strength, int Spirit, int Defense, int Speed)
    {
        this.nom = nom;
        this.hp = Health;
        this.str = Strength;
        this.spr = Spirit;
        this.def = Defense;
        this.spe = Speed;
    }

    public int GetHP()
    {
        return hp;
    }
    public int GetSTR()
    {
        return str;
    }
    public int GetSPR()
    {
        return spr;
    }
    public int GetDEF()
    {
        return def;
    }
    public int GetSPE()
    {
        return spe;
    }
}
