package yokai;

public class SportsClub {
    int nbHP;
    int nbSTR;
    int nbSPR;
    int nbDEF;
    int nbSPE;

    public SportsClub(int STR, int SPR, int DEF, int SPE) 
    {
        this.nbSTR = STR;
        this.nbSPR = SPR;
        this.nbDEF = DEF;
        this.nbSPE = SPE;
    }

    public void addSTR()
    {
        nbSTR += 5;
        nbDEF -= 2;
    }
    public void addSPR()
    {
        nbSPR+=5;
        nbSPE-=2;
    }
    public void addDEF()
    {
        nbDEF+=5;
        nbSPE-=2;
    }
    public void addSPE()
    {
        nbSPE+=5;
        nbDEF-=2;
    }

    public int nbGetSTR()
    {
        return nbSTR;
    }

    public int nbGetSPR()
    {
        return nbSPR;
    }

    public int nbGetDEF()
    {
        return nbDEF;
    }

    public int nbGetSPE()
    {
        return nbSPE;
    }

}