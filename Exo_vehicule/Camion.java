package Exo_vehicule;

public class Camion extends Véhicule {

	@Override
	public String Demarrer() {
		//System.out.println("Le camion démarre lentement");
		return "Ce camion démarre lentement";

	}

	@Override
	public void Accelerer() {
		System.out.println("Le camion accèlère");		
		
	}

	
	
	
}
