package Exo_Entreprise;

public class Patron extends Employé {

	Patron(int Matricule, String Name, String Firstname, int Birthday){
		super(Matricule, Name, Firstname, Birthday);
	}

	@Override
	public int GetSalaire() {
		// TODO Auto-generated method stub
		return 5300;
	}
	


	
	
}
