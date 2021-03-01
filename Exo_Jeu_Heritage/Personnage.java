package Exo_Jeu_Heritage;

public class Personnage {

	private String Nom;
	private int Vie;
	private int Attack;
	private int Défense;
	
	
	public Personnage() {
	}


	public Personnage(String nom, int vie, int attack, int défense) {
		Nom = nom;
		Vie = vie;
		Attack = attack;
		Défense = défense;
	}


	public final String getNom() {return Nom;}
	public final void setNom(String nom) {Nom = nom;}

	public final int getVie() {return Vie;}
	public final void setVie(int vie) {Vie = vie;}

	public final int getAttack() {return Attack;}
	public final void setAttack(int attack) {Attack = attack;}

	public final int getDéfense() {return Défense;}
	public final void setDéfense(int défense) {Défense = défense;}


	@Override
	public String toString() {
		return "Personnage [Nom=" + Nom + ", Vie=" + Vie + ", Attack=" + Attack + ", Défense=" + Défense + "]";
	}



	
	
	

	
	
		
}
