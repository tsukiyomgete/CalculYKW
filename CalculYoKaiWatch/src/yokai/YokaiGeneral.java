package yokai;

public class YokaiGeneral {
    public int rang1;
    public Yokai yokai;
    public String surnom;

    Stat StatActu;
    Equipement ItemYokai;

    public int level;
    public int AttackLevel;
    public int TechniqueLevel;
    public int SoultimateLevel;
    Attitude attitudeYoKai;
    public int LoafLevel;
    public int TrainingCount;
    public IV ivYokai;
    public SportsClub SportsClub;

    public YokaiGeneral(int rang1, Yokai yokai, String surnom, int level, IV ivYokai) {
        this.rang1 = rang1;
        this.yokai = yokai;
        this.surnom = surnom;
        this.level = level;   
    }

    public YokaiGeneral(int rang1, Yokai yokai, String surnom,int level, Attitude attitudeYoKai, IV ivYokai, Equipement EquipYokai) {
        this.rang1 = rang1;
        this.yokai = yokai;
        this.surnom = surnom;
        this.ItemYokai = EquipYokai;
        this.level = level;

        this.attitudeYoKai = attitudeYoKai;
        this.ivYokai = ivYokai;

        this.SportsClub = new SportsClub(0,0,0,0);
    }

    public void setIV(int HP, int STR, int SPR, int DEF, int SPE)
    {
        this.ivYokai.HP = HP;
        this.ivYokai.STR = STR;
        this.ivYokai.SPR = SPR;
        this.ivYokai.DEF = DEF;
        this.ivYokai.SPE = SPE;

    }

    public void setStat(Stat stat)
    {
        this.StatActu.HP = stat.HP;
        this.StatActu.STR = stat.STR;
        this.StatActu.SPR = stat.SPR;
        this.StatActu.DEF = stat.DEF;
        this.StatActu.SPE = stat.SPE;
    }

    public Attitude GetAttitude()
    {
        return this.attitudeYoKai;
    }

    public Equipement GetEquipement()
    {
        return ItemYokai;
    }

    public SportsClub GetSportsClub()
    {
        return SportsClub;
    }
    

}