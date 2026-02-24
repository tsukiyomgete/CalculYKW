package yokai;
import init.*;

public class IV {
    final int MAXIVPOINTS = 40;
    int HP;
    int STR;
    int SPR;
    int DEF;
    int SPE;

    
    public IV()
    {
        HP=0;
        STR=0;
        SPR=0;
        DEF=0;
        SPE=0;
    }
    
    
    
    public IV(int HP, int STR, int SPR, int DEF, int SPE) {
        this.HP = HP;
        this.STR = STR;
        this.SPR = SPR;
        this.DEF = DEF;
        this.SPE = SPE;
    }

    public void GenerateIV()
    {   
        int total=MAXIVPOINTS;
        this.HP = calcul.randomGenerate(33);
        total -= this.HP;
        
        this.STR = calcul.randomGenerate(calcul.min(16, total));
        total -= this.STR;
        
        this.SPR = calcul.randomGenerate(calcul.min(16, total));
        total -= this.SPR;
        
        this.DEF = calcul.randomGenerate(calcul.min(16, total));
        total -= this.DEF;

        this.SPE = calcul.randomGenerate(calcul.min(16, total));
        total -= this.SPE;
    }

    public void setIV()
    {
        int total=MAXIVPOINTS;
        
    }

    public void print()
    {
        System.out.println("Les IV de ton yokai");
        System.out.println("HP" + HP);
        System.out.println("STR" + STR);
        System.out.println("SPR" + SPR);
        System.out.println("DEF" + DEF);
        System.out.println("SPE" + SPE);
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