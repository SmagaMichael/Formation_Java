package Exo_Ecole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ecole {
	static List<Eleve> listeEleves = Arrays.asList(
			new Eleve("mich", "sam", 16, 2),
			new Eleve("toto", "titi", 17, 1),
			new Eleve("baffie", "laurent", 15, 2),
			new Eleve("duche", "jean-claude", 17, 3),
			new Eleve("beyonce", "beyonce", 17, 3),
			new Eleve("sartre", "jean-paul", 15, 1)
	);

	static ArrayList<Cours> listeCours = new ArrayList<>(Arrays.asList(
			new Cours("math", 150, 1),
			new Cours("math", 170, 2),
			new Cours("math", 205, 3),
			new Cours("anglais", 95, 1),
			new Cours("anglais", 105, 2),
			new Cours("anglais", 98, 3),
			new Cours("mécanique productique", 203, 1),
			new Cours("mécanique productique", 237, 2),
			new Cours("mécanique productique", 240, 3)
	));

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (Cours c: listeCours) {
			System.out.println("---------------- " + c.getNom() + " ----------------");

			for (Eleve el:listeEleves) {
				if (c.getAnnée() == el.getAnnée()){

					System.out.printf(
							"Est-ce que %s %s, c'est inscrit dans le cours de %s. [O/n] ",
							el.getPrenom(),
							el.getNom(),
							c.getNom()
							);
					String reponse = sc.nextLine();
					if (reponse.equals("") || reponse.toLowerCase().equals("o")){
						c.inscription(el);
					}
				}
			}

		}

		for (Cours c:listeCours) {
			System.out.println(c);
		}
	}
}