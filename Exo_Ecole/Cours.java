package Exo_Ecole;

import java.util.ArrayList;

public class Cours {

		private String nom;
		private int nbHeures;
		private int ann�e;
		private ArrayList<Eleve>eleves = new ArrayList<>();
		
		
		
//constructeur vide pour utiliser les setters 
		public Cours() {
				}


//source => generate constructor using fields
		public Cours(String nom, int nbHeures, int ann�e) {
			this.nom = nom;
			this.nbHeures = nbHeures;
			this.ann�e = ann�e;
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
		
		
		public final int getAnn�e() {
			return ann�e;
		}
		public final void setAnn�e(int ann�e) {
			this.ann�e = ann�e;
		}
		
		
		
//source => generateToString
		@Override
		public String toString() {
			return "Cours{" +
					"nom='" + nom + '\'' +
					", nbHeures=" + nbHeures +
					", annee=" + ann�e +
					", eleves=" + eleves +
					'}';
		}

		
	

}
