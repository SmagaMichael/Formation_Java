package Exo_societe;

public class TestSociete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Societe google = new Societe();
		
		google.setNom("Google");
		google.setVille("San Francisco");
		
		System.out.println(google.toString());
		//-------------------------------------------------------
		
		int postalCode = 59600;
		google.addNumber(postalCode);
		System.out.println(postalCode);
		
		//-------------------------------------------------------

		String pdg = "Sundar Pichai";
		google.addPdg(pdg);
		System.out.println(pdg);
		
		//-------------------------------------------------------
	}

}
