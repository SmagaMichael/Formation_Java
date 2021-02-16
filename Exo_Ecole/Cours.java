package Exo_Ecole;

import java.util.ArrayList;

public class Cours {

		private String nom;
		private int nbHeures;
		private int année;
		private ArrayList<Eleve>eleves = new ArrayList<>();
		
		
		
//constructeur vide pour utiliser les setters 
		public Cours() {
				}


//source => generate constructor using fields
		public Cours(String nom, int nbHeures, int année) {
			this.nom = nom;
			this.nbHeures = nbHeures;
			this.année = année;
		}
	
		public void inscription(Eleve eleve){
			this.eleves.add(eleve);
		}
		
// sources = generate getter / setter 
		public final String getNom() {
			return nom;
		}
	
		public final void setNom(String nom) {
			this.nom = nom;
		}
		
		
		public final int getNbHeures() {
			return nbHeures;
		}
		public final void setNbHeures(int nbHeures) {
			this.nbHeures = nbHeures;
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
			return "Cours{" +
					"nom='" + nom + '\'' +
					", nbHeures=" + nbHeures +
					", annee=" + année +
					", eleves=" + eleves +
					'}';
		}

		
	

}
