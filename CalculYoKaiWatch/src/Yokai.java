public class Yokai {
    String nom;
    Rank rangYokai;
    Attitude attitudeYoKai;
    face_icon faceYoKai;
    boolean canEvolve;
    boolean canFusion;
    FoodClass favFoodType;
    
    int BaseSTR;
    int BaseSPR;
    int BaseDEF;
    int BaseSPE;
    Elemental weakness;
    Elemental resistance;

    Item[] HoldingItem;

    Yokai(String nom, Rank rangYokai, Attitude attitudeYoKai, face_icon faceYoKai, boolean canEvolve, boolean  canFusion, FoodClass favFood, int BaseSTR, int BaseSPR, int BaseDEF, int BaseSPE, Elemental weak, Elemental rest, int maxItem)
    {
        this.nom = nom;
        this.rangYokai = rangYokai;
        this.attitudeYoKai = attitudeYoKai;
        this.faceYoKai = faceYoKai;
        this.canEvolve = canFusion;
        
        this.favFoodType = favFoodType;
        
        this.BaseSTR = BaseSTR;
        this.BaseSPR = BaseSPR;
        this.BaseDEF = BaseDEF;
        this.BaseSPE = BaseSPE;
        this.weakness = weak;
        this.resistance = rest;
        this.HoldingItem = new Item[maxItem];
    }



}
