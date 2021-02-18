package Exo_veto;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Chat persea = new Chat(Couleur.GRIS, "goutti�re", 1, "pers�a", 4);

		persea.setCouleur(Couleur.ROUX);

		System.out.println(persea);
		System.out.println(persea.getCouleur().getHex());
		System.out.println(persea.getCouleur().getRgb());

		persea.crier();

		persea.manger();
		
		persea.bouger();
		

		Cheval pegase = new Cheval();

		pegase.setNom("pegase");

		pegase.setAge(3);

		pegase.dormir();
		
		pegase.bouger();
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Quel animal vient d'arriver dans la clinique?");

		String choix = sc.nextLine();
		
		Animal animal = null;

		switch (choix) {
		case "cheval":
			animal = new Cheval();
			break;
		case "chat":
			animal = new Chat();
			break;
		case "chien":
			animal = new Chien();
			break;

		}

		System.out.println(animal instanceof Cheval);
		System.out.println(animal instanceof Chat);
		System.out.println(animal instanceof Chien);
		
		
		// instance de : Chien | Chat | Cheval
	}

}