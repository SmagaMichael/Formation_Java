package Exo_Base_Java;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//Entier primitif
		byte octet; //Byte -> version objet
		octet = 120;
		
		short s = 8; //Short
		
		int i = 0; //Integer
		
		long l = 154; //Long
		
		//flottant primitif
		float f = 40.4f; //float
		
		double d = 40.8; //Double
		
		
		
		char c = 'r'; //Character
		
		boolean bool = true; //Boolean
		
		
		//___________________________________________________________________________________________
		
		String str = "coucou";
		String str1 = "coucou";
		
		if (str.equals (str1)) {
			System.out.println("is Equal");
		}
		//___________________________________________________________________________________________
		
		Scanner sc = new Scanner(System.in);  //ctrl+shift+o pour avoir la selection des import 
		
		System.out.println("Entre un integer");
		//Sysout ctrl+space
		int i2 = sc.nextInt();
		
		System.out.println("Entre un double");
		double d2 = sc.nextDouble();
		
		System.out.println("Entre un long");
		long l2 = sc.nextLong();
		
		sc.nextLine();
		System.out.println("Entre un string");
		String str2 = sc.nextLine();
		
		
		System.out.println("l'entier vaut : " + i2);
		System.out.println("le double vaut : " + d2);
		System.out.println("le long vaut : " + l2);
		System.out.println("le string vaut : " + str2);

		
		//___________________________________________________________________________________________
		
		
		
		//___________________________________________________________________________________________
		
		
		
		
		//___________________________________________________________________________________________
		
		
		
		
		
		
		//___________________________________________________________________________________________
		
	}

}
