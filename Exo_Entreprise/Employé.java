package Exo_Entreprise;

public abstract class Employé {

	private int Matricule;
	private String Name;
	private String Firstname;
	private int Birthday;
	
	public abstract int GetSalaire();
	
	//---------------------------------------------
	public Employé() {
	}

	public Employé(int matricule, String name, String firstname, int birthday) {
		Matricule = matricule;
		Name = name;
		Firstname = firstname;
		Birthday = birthday;
	}

	
	
	//---------------------------------------------
	public final int getMatricule() {
		return Matricule;
	}

	public final void setMatricule(int matricule) {
		Matricule = matricule;
	}

	public final String getName() {
		return Name;
	}

	public final void setName(String name) {
		Name = name;
	}

	public final String getFirstname() {
		return Firstname;
	}

	public final void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public final int getBirthday() {
		return Birthday;
	}

	public final void setBirthday(int birthday) {
		Birthday = birthday;
	}

	
	
	
	//---------------------------------------------
	@Override
	public String toString() {
		return "Employé [Matricule=" + Matricule + ", Name=" + Name + ", Firstname=" + Firstname + ", Birthday="
				+ Birthday + "]";
	}
	
	
	
	
	
	
	
	
}
