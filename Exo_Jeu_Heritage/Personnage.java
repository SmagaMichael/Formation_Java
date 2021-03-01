package Exo_Jeu_Heritage;

public class Personnage {

	private String Nom;
	private int Vie;
	private int Attack;
	private int D�fense;
	
	
	public Personnage() {
	}


	public Personnage(String nom, int vie, int attack, int d�fense) {
		Nom = nom;
		Vie = vie;
		Attack = attack;
		D�fense = d�fense;
	}


	public final String getNom() {return Nom;}
	public final void setNom(String nom) {Nom = nom;}

	public final int getVie() {return Vie;}
	public final void setVie(int vie) {Vie = vie;}

	public final int getAttack() {return Attack;}
	public final void setAttack(int attack) {Attack = attack;}

	public final int getD�fense() {return D�fense;}
	public final void setD�fense(int d�fense) {D�fense = d�fense;}


	@Override
	public String toString() {
		return "Personnage [Nom=" + Nom + ", Vie=" + Vie + ", Attack=" + Attack + ", D�fense=" + D�fense + "]";
	}



	
	
	

	
	
		
}
