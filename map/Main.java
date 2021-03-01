package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Lille", 1_000_000, "59000", 35));

		for (Ville ville: villes) {
			if (ville.nom.equals("Lille")){
				System.out.println(ville);
			}
		}

		HashMap<String, Ville> villeMap = new HashMap<>();
		villeMap.put("Lille", new Ville("Lille", 1_000_000, "59000", 35));

		System.out.println(villeMap.get("Lille"));


//		ArrayList<? extends Number> arrayList = new ArrayList<>();
//		arrayList.add(54);

	}
}
class Ville {
	String nom;
	int nbHabitants;
	String codePostal;
	int surface;

	public Ville(String nom, int nbHabitants, String codePostal, int surface) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.codePostal = codePostal;
		this.surface = surface;
	}

}
 