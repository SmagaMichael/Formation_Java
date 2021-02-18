package Exo_Entreprise;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employé  Michael = new Patron(123, "Smaga","Michael", 9 );
		
		System.out.println(Michael);
		System.out.println("Le salaire du Patron "+ Michael.getFirstname()+ " est de " + Michael.GetSalaire()+" €");
	}

}
