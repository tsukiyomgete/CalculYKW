public class YokaiGeneral {
    static int rang1;
    static Yokai yokai;
    static String surnom;
    static int level;
    static int AttackLevel;
    static int TechniqueLevel;
    static int SoultimateLevel;
    static Attitude attitudeYoKai;
    static int LoafLevel;
    static int TrainingCount;
    static IV ivYokai;
    static SportsClub SportsClub;

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

    public static void setIV(int HP, int STR, int SPR, int DEF, int SPE)
    {
        ivYokai.HP = HP;
        ivYokai.STR = STR;
        ivYokai.SPR = SPR;
        ivYokai.DEF = DEF;
        ivYokai.SPE = SPE;

    }
    

}