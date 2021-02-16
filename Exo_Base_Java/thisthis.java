package Exo_Base_Java;

public class thisthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//samsam = objet  
		//On instancie la classe personne 
		Personne samsam = new Personne();
		
		samsam.prenom = "samuel";
		samsam.nom ="michaux";
		
		samsam.getNom();
		
		
		Personne toto = new Personne();
        toto.prenom = "toto";
        toto.nom = "titi";

        toto.getNom();

		
	}
}
	


class Personne {
	String nom;
	String prenom;
	
	
	public void getNom() {
		System.out.println(this.nom +" "+ this.prenom);
	}
	
	
}


