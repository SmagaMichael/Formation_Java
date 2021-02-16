package Exo_Base_Java;

import java.util.Scanner;

public class Exo_calcul {

	//main ctrl+space
	public static void main(String[] args) {
	//Lire deux entiers  x et y
	//Calculer et afficher leur somme, leur différence,
	//leur produit, le quotient de x/y et les afficher.
	
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Entre un integer");
	int i = sc.nextInt();
	
	System.out.println("Entre un deuxième integer");
	int i2 = sc.nextInt();
	
	
	int somme = i + i2;
	int difference = i - i2;
	int produit = i * i2;
	float quotient = (i / i2);
	int reste = (i % i2);

	
	System.out.println("i = " + i);
	System.out.println("i2 = " + i2);
	
	System.out.println("la somme de "+ i +" et "+ i2 +" = " + somme);
	System.out.println("la différence de "+ i +" - "+ i2 +" = " + difference);
	System.out.println("le produit de "+ i +" x "+ i2 +" = " + produit);
	System.out.println("le quotient de "+ i +" / "+ i2 +" = " + quotient);
	System.out.println("le reste de "+ i +" / "+ i2 +" = " + reste);

	

	
	
	
	
	}
}
