package yokai;

public class Equipement{
    public int IdEquipement;
    public int BaseSTR;
    public int BaseSPR;
    public int BaseDEF;
    public int BaseSPE;
    public boolean IsFusable;
    public boolean IsHoldable;

    public Equipement(int IdEquipement, int BaseSTR, int BaseSPR, int BaseDEF, int BaseSPE, boolean IsFusable, boolean IsHoldable) {
        this.IdEquipement = IdEquipement;
        this.BaseSTR = BaseSTR;
        this.BaseSPR = BaseSPR;
        this.BaseDEF = BaseDEF;
        this.BaseSPE = BaseSPE;
        this.IsFusable = IsFusable;
        this.IsHoldable = IsHoldable;
    }

    
}