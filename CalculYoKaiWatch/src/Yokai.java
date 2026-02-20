public class Yokai {
    String nom;
    Rank rangYokai;
    face_icon faceYoKai;
    boolean canEvolve;
    boolean canFusion;
    boolean isLegendary;
    FoodClass favFoodType;
    
    int BaseHP;
    int BaseSTR;
    int BaseSPR;
    int BaseDEF;
    int BaseSPE;
    Elemental weakness;
    Elemental resistance;

    Item[] HoldingItem;

    Yokai(String nom, Rank rangYokai,boolean isLegendary, boolean canEvolve, boolean  canFusion,  int BaseHP, int BaseSTR, int BaseSPR, int BaseDEF, int BaseSPE, Elemental weak, Elemental rest, int maxItem)
    {
        this.nom = nom;
        this.rangYokai = rangYokai;
        this.canEvolve = canFusion;
        this.isLegendary = isLegendary;
        
        
        this.BaseSTR = BaseSTR;
        this.BaseSPR = BaseSPR;
        this.BaseDEF = BaseDEF;
        this.BaseSPE = BaseSPE;
        this.weakness = weak;
        this.resistance = rest;
        this.HoldingItem = new Item[maxItem];
    }



}
