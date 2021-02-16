package Exo_Base_Java;

import java.util.Random;
import java.util.Scanner;
//ctrl + shift + O

public class Exo_JustePrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in); 
			Random rd = new Random();
			
			//System.out.println("Joueur 1 : Saisissez le nombre a trouver entre 1 et 100");
			int nombreATrouver = rd.nextInt(101);
			System.out.println("Nombre aléatoire a trouver : "+nombreATrouver+"");
			
			
			System.out.println("Joueur 2 : Saisissez un nombre entre 1 et 100");
			int nombreSaisi = sc.nextInt();
			
			int Count = 0;
			
			
			while(nombreSaisi != nombreATrouver || Count > 7){
				
				        if (nombreSaisi < nombreATrouver){
				        	System.out.println("le nombre à trouver est plus grand");
							 nombreSaisi = sc.nextInt();
							 Count += 1;
							}
				           
				        if (nombreSaisi > nombreATrouver){
				        	System.out.println("le nombre a trouver est plus petit");
							 nombreSaisi = sc.nextInt();
							 Count += 1;
							}
				        if(Count == 7-1) {
							System.out.println("Tu as perdu");
							break;
						}
				        			        				  				        				        
				}
			
			if(nombreSaisi == nombreATrouver) {
				Count += 1;
				System.out.println("bien joué tu as trouvé le nombre en "+Count+" fois");			
			}
			
		
	}

}
