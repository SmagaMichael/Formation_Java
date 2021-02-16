package Exo_Ecole;

public class Eleve {

	private String nom;
	private String prenom;
	private int age;
	private int ann�e;
	
	
	
//constructeur vide pour utiliser les setters 
	public Eleve() {
	}
	
//source => generate constructor using fields	
	public Eleve(String nom, String prenom, int age, int ann�e) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.ann�e = ann�e;
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
	public final int getAnn�e() {
		return ann�e;
	}
	public final void setAnn�e(int ann�e) {
		this.ann�e = ann�e;
	}

	
//source => generateToString
	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", ann�e=" + ann�e + "]";
	}
		
	
	
	
	
	
	
	
	
}
