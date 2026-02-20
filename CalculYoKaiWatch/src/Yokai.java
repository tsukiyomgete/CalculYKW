public class Yokai {
    String nom;
    Rank rangYokai;
    face_icon faceYoKai;
    boolean canEvolve;
    boolean canFusion;
    boolean isLegendary;
    FoodClass favFoodType;
    int idMedallium;
    StatA statInit;
    StatB statEnd;
    
    Elemental weakness;
    Elemental resistance;

    Item[] HoldingItem;

    Yokai(String nom,int idMedallium, Rank rangYokai,boolean isLegendary, boolean canEvolve, boolean  canFusion, StatA statInit, StatB statEnd, Elemental weak, Elemental rest, int maxItem)
    {
        this.nom = nom;
        this.idMedallium = idMedallium;
        this.rangYokai = rangYokai;
        this.canEvolve = canFusion;
        this.isLegendary = isLegendary;
        
        
        this.statInit = statInit;
        this.statEnd = statEnd;
        this.weakness = weak;
        this.resistance = rest;
        this.HoldingItem = new Item[maxItem];
    }



}
