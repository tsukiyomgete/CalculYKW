package yokai;

public class Yokai {
    String nom;
    Rank rangYokai;
    public face_icon faceYoKai;
    boolean canEvolve;
    boolean canFusion;
    public boolean isLegendary;
    
    int idMedallium;
    public Stat statInit;
    public Stat statEnd;
    
    public Elemental weakness;
    public Elemental resistance;

    public Equipement[] HoldingEquipement;

    public Yokai(String nom,int idMedallium, Rank rangYokai,boolean isLegendary, boolean canEvolve, boolean  canFusion, Stat statInit, Stat statEnd, Elemental weak, Elemental rest, int maxItem)
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
        this.HoldingEquipement = new Equipement[maxItem];
    }



    public String GetName()
    {
        return nom;
    }
    
    public char GetRank()
    {
        return rangYokai.GetRank();
    }

    public int GetID()
    {
        return idMedallium;
    }



}
