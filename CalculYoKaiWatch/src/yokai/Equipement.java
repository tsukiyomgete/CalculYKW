package yokai;

public class Equipement{
     int IdEquipement;
     int BaseHP;
     int BaseSTR;
     int BaseSPR;
     int BaseDEF;
     int BaseSPE;
    public boolean IsFusable;
    public boolean IsHoldable;

    public Equipement(int IdEquipement, int BaseHP, int BaseSTR, int BaseSPR, int BaseDEF, int BaseSPE, boolean IsFusable, boolean IsHoldable) {
        this.IdEquipement = IdEquipement;
        this.BaseHP = BaseHP;
        this.BaseSTR = BaseSTR;
        this.BaseSPR = BaseSPR;
        this.BaseDEF = BaseDEF;
        this.BaseSPE = BaseSPE;
        this.IsFusable = IsFusable;
        this.IsHoldable = IsHoldable;
    }

    public int GetHP()
    {
        return BaseHP;
    }

    public int GetSTR()
    {
        return BaseSTR;
    }

    public int GetSPR()
    {
        return BaseSPR;
    }

    public int GetDEF()
    {
        return BaseDEF;
    }

    public int GetSPE()
    {
        return BaseSPE;
    }

    
}