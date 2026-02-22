package yokai;

public class Stat {
    int HP;
    int STR;
    int SPR;
    int DEF;
    int SPE;

    public Stat(int HP, int STR, int SPR, int DEF, int SPE) {
        this.HP = HP;
        this.STR = STR;
        this.SPR = SPR;
        this.DEF = DEF;
        this.SPE = SPE;
    }

    public int GetHP() {
        return HP;
    }

    public int GetSTR() {
        return STR;
    }
    
    public int GetSPR() {
        return SPR;
    }

    public int GetDEF() {
        return DEF;
    }

    public int GetSPE() {
        return SPE;
    }
    
}