package Exo_societe;

public class Societe {
	private String nom;
	private String ville;
	
	
	public void addNumber(int number) {
		number++;
		System.out.println(number);
		
	}
	
	//-------------------------------------------------------

	public void addPdg(String pdg) {
		pdg = pdg.toUpperCase();
		System.out.println(pdg);
	}
	
	//-------------------------------------------------------

	public  String getNom() {
		return nom;
	}
	public  void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public  String getVille() {
		return ville;
	}
	public  void setVille(String ville) {
		this.ville = ville;
	}
	
	
	@Override
	public String toString() {
		return "Societe [nom=" + nom + ", ville=" + ville + "]";
	}
	
	
	
}
