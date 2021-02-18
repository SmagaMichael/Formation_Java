package Exo_vehicule;

public class Voiture  extends Véhicule {

	public Voiture(String Name, int Matricule, int Years, float Price) {
	super(Name, Matricule, Years, Price);
	}

	@Override
	public String Demarrer() {
		//System.out.println("Cette voiture démarre rapidement");
		return "Cette voiture démarre rapidement";
	}

	@Override
	public void Accelerer() {
		System.out.println("Cette voiture accèlère");		
	}

	
	
	
	
}
