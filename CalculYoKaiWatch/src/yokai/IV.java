package yokai;
import init.*;
import java.util.Scanner;

public class IV {
    final int MAXIVPOINTS = 40;
    int HP;
    int STR;
    int SPR;
    int DEF;
    int SPE;
    Scanner sc = new Scanner(System.in);

    
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
        System.out.println("Les IV de ton yokai disponible : " + (total-(HP/2 + STR + SPR + DEF +SPE)));
        System.out.println("Choisi le nombre de PV pour ton yokai (0-32)");
        int str = sc.nextInt();
        if(str<0 || str>32)
        {
            throw new IllegalArgumentException("Erreur, IV pas compris entre les bonnes valeurs");
        }
        else
        {
            HP = str/2;
            System.out.println("Choisi le nombre de STR (physique) pour ton yokai (0-16)");
            str = sc.nextInt();
            if(str<0 || str>16)
            {
                throw new IllegalArgumentException("Erreur, IV pas compris entre les bonnes valeurs");
            }
            else
            {
                total-=HP;
                System.out.println("Il te reste" + total);
                STR = str;
                System.out.println("Choisi le nombre d'IV SPR (spéciale) pour ton yokai (0-16)");
                str = sc.nextInt();
                if(str<0 || str>16)
                {
                    throw new IllegalArgumentException("Erreur, IV pas compris entre les bonnes valeurs");
                }
                else
                {
                    total-=STR;
                    SPR = str;
                    System.out.println("Choisi le nombre d'IV DEF pour ton yokai (0-16)");
                    str = sc.nextInt();
                    if(str<0 || str>16)
                    {
                        throw new IllegalArgumentException("Erreur, IV pas compris entre les bonnes valeurs");
                    }
                    else
                    {
                        DEF = str;
                        System.out.println("Choisi le nombre d'IV SPE pour ton yokai (0-16)");
                        str = sc.nextInt();
                        if(str<0 || str>16)
                        {
                            throw new IllegalArgumentException("Erreur, IV pas compris entre les bonnes valeurs");
                        }
                        else
                        {
                            SPE = str;
                        }
                    }
                }
            }   
        }
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