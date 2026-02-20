public class Equipement{
    int IdEquipement;
    int BaseSTR;
    int BaseSPR;
    int BaseDEF;
    int BaseSPE;
    boolean IsFusable;
    boolean IsHoldable;

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