package Exo_Entreprise;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employé  Michael = new Patron(1, "Smaga","Michael", 9 );
		Employé  Julien = new Cadre(2, "Boulanger","Julien", 9 );
		Employé  Augustin = new Cadre(3, "Dupuis","Augustin", 9 );
		Employé  Anass = new Ouvrier(4, "Tamsouri","Anass", 9 );
		
		System.out.println(Michael);
		System.out.println("Le salaire du Patron "+ Michael.getFirstname()+ " est de " + Michael.GetSalaire()+" €");
		System.out.println();

		System.out.println(Julien);
		System.out.println("Le salaire du Cadre "+ Julien.getFirstname()+ " est de " + Julien.GetSalaire()+" €");
		System.out.println();

		System.out.println(Augustin);
		System.out.println("Le salaire du Cadre "+ Augustin.getFirstname()+ " est de " + Augustin.GetSalaire()+" €");
		System.out.println();

		System.out.println(Anass);
		System.out.println("Le salaire du Ouvrier "+ Anass.getFirstname()+ " est de " + Anass.GetSalaire()+" €");
		System.out.println();

		
	
	
	}

}
