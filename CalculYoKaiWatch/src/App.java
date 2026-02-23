import  static init.Init.*;
import init.calcul;
import yokai.*;


public class App {
    
	public static void main(String[] args) throws Exception {
        

		YokaiGeneral rorigoon = new YokaiGeneral(1, Komaous,  "rori's goon", 63, logical, yourIv, InvertedSpearOfHeaven);
        rorigoon.setIV(16, 8, 8, 8, 8);
		
      
        System.out.println("On va lancer le script de calcul");
        //rorigoon.setStat(calcul.calculStatsUncorrected(rorigoon));
        
        rorigoon.setStat(calcul.calculStatsCorrected(rorigoon));
        /*Attitude.creaAttitude();*/
    }
}
