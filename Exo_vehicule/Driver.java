package Exo_vehicule;

public class Driver {

	public static void main(String[] args) {

		
	Voiture C2 = new Voiture("Citroen C2", 123456, 2008, 5000f);	
	System.out.println(C2);
	System.out.println(C2.getName());
	System.out.println();
	
	Voiture C4 = new Voiture("Citroen C4 Cactus", 121212, 2018, 12000f);
	System.out.println(C4);
	System.out.println(C4.getPrice());
	System.out.println();

	
	System.out.print("la nouvelle " + C4.getName() + " vient de sortir . " );
	//C4.Demarrer();
	
	System.out.println();
	System.out.print("la nouvelle " + C4.getName() + " vient de sortir . " + C4.Demarrer() );

	}
	
	
	

}