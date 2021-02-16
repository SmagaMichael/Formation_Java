package Exo_Ecole;

public class Eleve {

	private String nom;
	private String prenom;
	private int age;
	private int année;
	
	
	
//constructeur vide pour utiliser les setters 
	public Eleve() {
	}
	
//source => generate constructor using fields	
	public Eleve(String nom, String prenom, int age, int année) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.année = année;
	}
	
	
	
	
// sources = generate getter / setter 
	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
	}
	public final String getPrenom() {
		return prenom;
	}
	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	public final int getAnnée() {
		return année;
	}
	public final void setAnnée(int année) {
		this.année = année;
	}

	
//source => generateToString
	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", année=" + année + "]";
	}
		
	
	
	
	
	
	
	
	
}
