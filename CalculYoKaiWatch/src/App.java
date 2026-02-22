import  static init.Init.*;
import init.calcul;
import yokai.*;


public class App {
    
	public static void main(String[] args) throws Exception {
        

		YokaiGeneral rorigoon = new YokaiGeneral(1, Komasan,  "rori's goon", 60, brainy, yourIv, InvertedSpearOfHeaven);
		
      
        System.out.println("On va lancer le script de calcul");
        //rorigoon.setStat(calcul.calculStatsUncorrected(rorigoon));
        
        rorigoon.setStat(calcul.calculStatsCorrected(rorigoon));
        /*Attitude.creaAttitude();*/
    }
}
