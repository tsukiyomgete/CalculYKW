package yokai;

public class StatA {
    int BaseHP;
    int BaseSTR;
    int BaseSPR;
    int BaseDEF;
    int BaseSPE;

    public StatA(int BaseHP, int BaseSTR, int BaseSPR, int BaseDEF, int BaseSPE) {
        this.BaseHP = BaseHP;
        this.BaseSTR = BaseSTR;
        this.BaseSPR = BaseSPR;
        this.BaseDEF = BaseDEF;
        this.BaseSPE = BaseSPE;
    }

    public int GetBaseHP() {
        return BaseHP;
    }

    public int GetBaseSTR() {
        return BaseSTR;
    }
    
    public int GetBaseSPR() {
        return BaseSPR;
    }

    public int GetBaseDEF() {
        return BaseHP;
    }

    public int GetBaseSPE() {
        return BaseHP;
    }
    
}