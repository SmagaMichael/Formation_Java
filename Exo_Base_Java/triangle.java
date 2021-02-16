package Exo_Base_Java;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre un integer");
		int NbAsk = sc.nextInt();
	
		//nombre de ligne du triangle----------------------------------
		for (int i = 1; i <= NbAsk; i++){
			//j = nb d'étoile par rapport au nombre de ligne 
		    for (int j = 1; j <= i; j++){
		    	System.out.print(" * ");
		     }System.out.println();
		}
		
		System.out.println();//Passer à la ligne
		
		
		
		//nombre de ligne du carré/rectangle---------------------------
		for (int i = 1; i <= NbAsk; i++){
		    for (int j = 1; j <= NbAsk; j++){
		    	System.out.print(" * ");
		     }System.out.println();
		}
		
		System.out.println();//Passer à la ligne
		
		
		//ligne---------------------------------------------------------
		for (int k = 1; k <= NbAsk; k++){
	    	System.out.print(" * ");
		
		}
	}

}
