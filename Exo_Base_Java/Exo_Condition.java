package Exo_Base_Java;

import java.util.Scanner;

public class Exo_Condition {

	//écrire un algorithme qui demande 2 nombres en paramètre et l'informe ensuite 
	//si leur produit est négatif ou positif (On laisse de coté le cas où le produit est nul)
	//Attention : on ne doit pas calculer le  produit de 2 nombre
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre un integer");
		float i = sc.nextFloat();
		
		System.out.println("Entre un deuxième integer");
		float i2 = sc.nextFloat();
		
		
		//première version avec calcul -------------------------------------------
		if ((i * i2) > 0 ) {
			System.out.println("le produit est positif");
		}else {
			System.out.println("le produit est négatif");
		}
		
		//deuxième version sans calcul---------------------------------------------
		if((i > 0 && i2 > 0) || (i < 0 && i2 < 0)) {
			System.out.println("le produit est positif");
		}else {
			System.out.println("le produit est négatif");
		}
		
		//troisième version sans calcul avec un OU exclusif--(XOR)----------------------
		// i		i2		résultat
		//true		true	false 	si c'est positif et positif : on s'en fiche 
		//true		false	true 	si au moins un des deux est négatif on dit que le résultat sera négatif
		//false		true	true 	si au moins un des deux est négatif on dit que le résultat sera négatif
		//false		false	false	si c'est négatif et négatif : on s'en fiche
		
		// ^  = OU exclusif
		
		if(i > 0 ^ i2 > 0) {
			System.out.println("le produit est négatif ");
		}else {
			System.out.println("le produit est positif");
		}
		
		
	}

}
