public class App {
    public static void main(String[] args) throws Exception {
        
        Attitude[] attitude = {
    		new Attitude("gentle",26,0,13,0,0),
    		new Attitude("tender",52,0,0,0,0),
    		new Attitude("grouchy",26,13,0,0,0),
    		new Attitude("rough",0,26,0,0,0),
    		new Attitude("logical",0,0,13,0,13),
    		new Attitude("brainy",0,26,0,0,0),
    		new Attitude("careful",0,0,13,13,0),
    		new Attitude("calm",0,0,0,26,0),
    		new Attitude("twisted",0,0,0,0,13),
    		new Attitude("cruel",0,0,0,0,26),
    		new Attitude("helpful",26,0,0,0,13),
    		new Attitude("devoted",0,13,0,13,0)
		};
      
        System.out.println("On va lancer le script de calcul");
        calcul.calculStats();
        /*Attitude.creaAttitude();*/
    }
}
