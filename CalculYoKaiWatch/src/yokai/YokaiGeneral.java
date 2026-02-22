package yokai;

public class YokaiGeneral {
    public int rang1;
    public Yokai yokai;
    public String surnom;

    Stat StatActu;


    public int level;
    public int AttackLevel;
    public int TechniqueLevel;
    public int SoultimateLevel;
    public Attitude attitudeYoKai;
    public int LoafLevel;
    public int TrainingCount;
    public IV ivYokai;
    public SportsClub SportsClub;

    public YokaiGeneral(int rang1, Yokai yokai, String surnom, int level, int AttackLevel, int TechniqueLevel, int SoultimateLevel, Attitude attitudeYoKai, int LoafLevel, int TrainingCount) {
        this.rang1 = rang1;
        this.yokai = yokai;
        this.surnom = surnom;
        this.level = level;
        this.AttackLevel = AttackLevel;
        this.TechniqueLevel = TechniqueLevel;
        this.SoultimateLevel = SoultimateLevel;
        this.attitudeYoKai = attitudeYoKai;
        this.LoafLevel = LoafLevel;
        this.TrainingCount = TrainingCount;
    
    }

    public YokaiGeneral(int rang1, Yokai yokai, int level, int AttackLevel, int TechniqueLevel, int SoultimateLevel, Attitude attitudeYoKai, int LoafLevel, int TrainingCount, IV ivYokai, SportsClub SportsClub) {
        this.rang1 = rang1;
        this.yokai = yokai;
        this.surnom = null;
        this.level = level;
        this.AttackLevel = AttackLevel;
        this.TechniqueLevel = TechniqueLevel;
        this.SoultimateLevel = SoultimateLevel;
        this.attitudeYoKai = attitudeYoKai;
        this.LoafLevel = LoafLevel;
        this.TrainingCount = TrainingCount;
        this.ivYokai = ivYokai;
        this.SportsClub = SportsClub;
    }

    public YokaiGeneral(int rang1, Yokai yokai, String surnom,int level, int AttackLevel, int TechniqueLevel, int SoultimateLevel, Attitude attitudeYoKai, int LoafLevel, int TrainingCount, IV ivYokai) {
        this.rang1 = rang1;
        this.yokai = yokai;
        this.surnom = surnom;
        this.level = level;
        this.AttackLevel = AttackLevel;
        this.TechniqueLevel = TechniqueLevel;
        this.SoultimateLevel = SoultimateLevel;
        this.attitudeYoKai = attitudeYoKai;
        this.LoafLevel = LoafLevel;
        this.TrainingCount = TrainingCount;
        this.ivYokai = ivYokai;
        
    }

    public  void setIV(int HP, int STR, int SPR, int DEF, int SPE)
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
    

}