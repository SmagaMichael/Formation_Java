package Exo_Base_Java;

import java.util.Scanner;

public class Exo_Condition {

	//�crire un algorithme qui demande 2 nombres en param�tre et l'informe ensuite 
	//si leur produit est n�gatif ou positif (On laisse de cot� le cas o� le produit est nul)
	//Attention : on ne doit pas calculer le  produit de 2 nombre
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre un integer");
		float i = sc.nextFloat();
		
		System.out.println("Entre un deuxi�me integer");
		float i2 = sc.nextFloat();
		
		
		//premi�re version avec calcul -------------------------------------------
		if ((i * i2) > 0 ) {
			System.out.println("le produit est positif");
		}else {
			System.out.println("le produit est n�gatif");
		}
		
		//deuxi�me version sans calcul---------------------------------------------
		if((i > 0 && i2 > 0) || (i < 0 && i2 < 0)) {
			System.out.println("le produit est positif");
		}else {
			System.out.println("le produit est n�gatif");
		}
		
		//troisi�me version sans calcul avec un OU exclusif--(XOR)----------------------
		// i		i2		r�sultat
		//true		true	false 	si c'est positif et positif : on s'en fiche 
		//true		false	true 	si au moins un des deux est n�gatif on dit que le r�sultat sera n�gatif
		//false		true	true 	si au moins un des deux est n�gatif on dit que le r�sultat sera n�gatif
		//false		false	false	si c'est n�gatif et n�gatif : on s'en fiche
		
		// ^  = OU exclusif
		
		if(i > 0 ^ i2 > 0) {
			System.out.println("le produit est n�gatif ");
		}else {
			System.out.println("le produit est positif");
		}
		
		
	}

}
