package Exceptions;

public class FeuSignalisation {
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) throws FeuSignalisationException {
		if (    !couleur.toLowerCase().equals("rouge")
				&& !couleur.toLowerCase().equals("vert")
				&& !couleur.toLowerCase().equals("orange")){
			throw new FeuSignalisationException("La couleur n'est pas bonne");
		}
		this.couleur = couleur;
	}
	
}
