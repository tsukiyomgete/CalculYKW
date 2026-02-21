package yokai;

public class IV {
    int HP;
    int STR;
    int SPR;
    int DEF;
    int SPE;

    public IV(int HP, int STR, int SPR, int DEF, int SPE) {
        this.HP = HP;
        this.STR = STR;
        this.SPR = SPR;
        this.DEF = DEF;
        this.SPE = SPE;
    }

    public int GetIvHP() {
        return HP;
    }

    public int GetIvSTR() {
        return STR;
    }
    
    public int GetIvSPR() {
        return SPR;
    }

    public int GetIvDEF() {
        return DEF;
    }

    public int GetIvSPE() {
        return SPE;
    }

}