package yokai;

public class Yokai {
    public String nom;
    public Rank rangYokai;
    public face_icon faceYoKai;
    public boolean canEvolve;
    public boolean canFusion;
    public boolean isLegendary;
    public FoodClass favFoodType;
    public int idMedallium;
    public StatA statInit;
    public StatB statEnd;
    
    public Elemental weakness;
    public Elemental resistance;

    public Item[] HoldingItem;

    public Yokai(String nom,int idMedallium, Rank rangYokai,boolean isLegendary, boolean canEvolve, boolean  canFusion, StatA statInit, StatB statEnd, Elemental weak, Elemental rest, int maxItem)
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
