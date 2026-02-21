package yokai;

public class StatB {
    public int finalHP;
    public int finalSTR;
    public int finalSPR;
    public int finalDEF;
    public int finalSPE;

    public StatB(int finalHP, int finalSTR, int finalSPR, int finalDEF, int finalSPE) {
        this.finalHP = finalHP;
        this.finalSTR = finalSTR;
        this.finalSPR = finalSPR;
        this.finalDEF = finalDEF;
        this.finalSPE = finalSPE;
    }

    public int GetFinalHP() {
        return finalHP;
    }

    public int GetFinalSTR() {
        return finalSTR;
    }
    
    public int GetFinalSPR() {
        return finalSPR;
    }

    public int GetFinalDEF() {
        return finalDEF;
    }

    public int GetFinalSPE() {
        return finalSPE;
    }

    
}