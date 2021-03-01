package Exo_Entreprise;

public class Ouvrier extends Employé {

	Ouvrier (int Matricule, String Name, String Firstname, int Birthday){
		super(Matricule, Name, Firstname, Birthday);
	}
	@Override
	public int GetSalaire() {
		// TODO Auto-generated method stub
		return 1300;
	}


	
	
}
