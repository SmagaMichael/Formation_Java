package Exo_Base_Java;

import java.util.Scanner;

public class Exo_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//écrire un algorithme qui demande un choix à l'utilisateur.
		//Ensuite , il l'informe d'un message
		
		//1.Ouvrir
		//2.Quitter
		//3.Sauver
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre un integer");
		System.out.println("1.Ouvrir");
		System.out.println("2.Quitter");
		System.out.println("3.Sauver");
		int i = sc.nextInt();
		
		switch(i) {
		  case 1:
			  System.out.println("Ouvrir");
		    break;
		    
		  case 2:
			  System.out.println("Quitter");
		    break;
		    
		  case 3:
			  System.out.println("Sauver");
			break;
			
			default:
				System.out.println("votre choix n'est pas correct , veuillez réessayer !");
				main(args); //Pour recommencer l'opération depuis le début
				
				
				
			//sc.close();	
		}
		
		
		
		
		
		
	}
}
