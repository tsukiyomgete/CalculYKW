package yokai;

public class Yokai {
    String nom;
    Rank rangYokai;
    face_icon faceYoKai;
    boolean isLegendary;
    Tribe tribuYokai;
    int idMedallium;
    Stat statInit;
    Stat statEnd;
    
    Elemental type;
    Elemental weakness;
    Elemental resistance;


    public Equipement[] HoldingEquipement;

    public Yokai(String nom,int idMedallium, Rank rangYokai, Tribe tribuYokai,boolean isLegendary,Stat statInit, Stat statEnd, Elemental Type,Elemental weak, Elemental rest, int maxItem)
    {
        this.nom = nom;
        this.idMedallium = idMedallium;
        this.rangYokai = rangYokai;
        this.tribuYokai = tribuYokai;
        this.isLegendary = isLegendary;
        this.statInit = statInit;
        this.statEnd = statEnd;
        
        this.resistance = rest;
        this.weakness = weak;
        
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
    public String GetTribe()
    {
        return tribuYokai.GetTribe();
    }

    public Stat GetStatInit()
    {
        return statInit;
    }

    public Stat GetStatEnd()
    {
        return statEnd;
    }



}
