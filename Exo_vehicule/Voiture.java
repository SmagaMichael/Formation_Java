package Exo_vehicule;

public class Voiture  extends V�hicule {

	public Voiture(String Name, int Matricule, int Years, float Price) {
	super(Name, Matricule, Years, Price);
	}

	@Override
	public String Demarrer() {
		//System.out.println("Cette voiture d�marre rapidement");
		return "Cette voiture d�marre rapidement";
	}

	@Override
	public void Accelerer() {
		System.out.println("Cette voiture acc�l�re");		
	}

	
	
	
	
}
