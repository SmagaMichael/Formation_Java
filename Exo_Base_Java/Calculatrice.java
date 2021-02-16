package Exo_Base_Java;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		
		//Nous allons réaliser une calculatrice.
		//Vous allez demander à l’utilisateur deux fois un nombre réel ou entier.
		//Puis lui demander si il veut addition, multiplier, soustraire ou diviser.

		//Faites le petit programme java.
		
		
		
		
		System.out.println("Entre un integer");
		int nb1 = sc.nextInt();
		
		System.out.println("Entrez le symbole de votre calcul (+ - / *)");
		char calcul = sc.next().charAt(0);
		
		System.out.println("Entre un deuxième integer");
		int nb2 = sc.nextInt();
		
		
		
		if (calcul == '+' ) {
			int total = nb1 + nb2;
			System.out.println("la somme de "+ nb1 +" et "+ nb2 +" = " + total);
		}
		
		if (calcul == '-') {
			int total = nb1 - nb2;
			System.out.println("la différence de "+ nb1 +" et "+ nb2 +" = " + total);
		}
		
		if (calcul == '/') {
			float total = nb1 / nb2;
			int reste = (nb1 % nb2);
			System.out.println("le quotien de "+ nb1 +" et "+ nb2 +" = " + total+ " il reste " + reste );
		}
		
		if (calcul == '*') {
			int total = nb1 * nb2;
			System.out.println("le produit de "+ nb1 +" et "+ nb2 +" = " + total);
		}
				
	}

}
