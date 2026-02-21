import yokai.*;

public class App {
    
	public static void main(String[] args) throws Exception {
        
         	Attitude gentle = new Attitude("gentle",26,0,13,0,0);
    		Attitude tender = new Attitude("tender",52,0,0,0,0);
    		Attitude grouchy = new Attitude("grouchy",26,13,0,0,0);
    		Attitude rough = new Attitude("rough",0,26,0,0,0);
    		Attitude logical = new Attitude("logical",0,0,13,0,13);
    		Attitude brainy = new Attitude("brainy",0,0,26,0,0);
    		Attitude careful = new Attitude("careful",0,0,13,13,0);
    		Attitude calm = new Attitude("calm",0,0,0,26,0);
    		Attitude twisted = new Attitude("twisted",0,0,0,0,13);
    		Attitude cruel = new Attitude("cruel",0,0,0,0,26);
    		Attitude helpful = new Attitude("helpful",26,0,0,0,13);
    		Attitude devoted = new Attitude("devoted",0,13,0,13,0);
		
			Elemental Fire = new Elemental("Fire");
			Elemental Water = new Elemental("Water");
			Elemental Wind = new Elemental("Wind");
			Elemental Ice = new Elemental("Ice");
			Elemental Earth = new Elemental("Earth");
			Elemental Thunder = new Elemental("Thunder");
			Elemental Heal = new Elemental("Heal");
			Elemental Absorb = new Elemental("Absorb");

			Rank E = new Rank('E');
			Rank D = new Rank('D');
			Rank C = new Rank('C');
			Rank B = new Rank('B');
			Rank A = new Rank('A');
			Rank S = new Rank('S');

			StatA[] statFirstTotal = 
			{
				new StatA(42,9,19,10,13)
			};

			StatB[] statEndTotal =
			{
				new StatB(310,103,162,114,149)
			};

			IV yourIv = new IV(0,0,0,0,0);

			Yokai Komasan = new Yokai("Komasan", 251, D, false, true, true, statFirstTotal[0], statEndTotal[0], Water, Fire, 1);

		YokaiGeneral rorigoon = new YokaiGeneral(1, Komasan,  "rori's goon", 60, 1, 1, 1, brainy, 1, 0, yourIv);
		
		rorigoon.setIV(15,15,15 ,15,15);
      
        System.out.println("On va lancer le script de calcul");
        calcul.calculStats(rorigoon);
        /*Attitude.creaAttitude();*/
    }
}
