package com.m2iformation;

import java.util.ArrayList;
import java.util.Iterator;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-----------------------------------------------------------
		//---------------Tableau de taille NON dynamique------------------------
		//-----------------------------------------------------------
		String[] listeDeNoms = new String[10];
		
		listeDeNoms[0] = "Hello1";
		listeDeNoms[1] = "Hello2";
		listeDeNoms[2] = "Hello3";
		listeDeNoms[3] = "Hello4";
		listeDeNoms[4] = "Hello5";
		listeDeNoms[5] = "Hello6";
		listeDeNoms[6] = "Hello7";
		listeDeNoms[7] = "Hello8";
		listeDeNoms[8] = "Hello9";
		listeDeNoms[9] = "Hello10";
		System.out.println("On va cherche un élément du tableau");
		System.out.println(listeDeNoms[7]);
		System.out.println();
		
		//Parcourir un tableau NON dynamique grâce a une boucle ------------------------------
		System.out.println("On parcour le tableau NON dynamique grâce a une boucle FOR");
		for(int i = 0; i < listeDeNoms.length; i++) {
			System.out.println(listeDeNoms[i]);
		}
		System.out.println();

		// équivalent du foreach ----------------------------------------------------------
		System.out.println("On parcour le tableau NON dynamique grâce a une boucle FOREACH");
		for (String str : listeDeNoms) {
			System.out.println(str);
		}
		System.out.println();

		
		
		
		
		
		//-----------------------------------------------------------
		//---------------Tableau de taille dynamique------------------------
		//-----------------------------------------------------------
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("HelloList2 -0");
		list2.add("HelloList2 -1");
		
		System.out.println("On va cherche un élément du tableau");
		System.out.println(list2.get(0));
		System.out.println();

		
		//Parcourir un tableau  dynamique grâce a une boucle ------------------------------
		System.out.println("On parcour le tableau dynamique grâce a une boucle FOR");
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println();
		
				
		//Parcourir un tableau  dynamique grâce a une boucle d'une autre façon: ----------
		System.out.println("On parcour le tableau dynamique grâce a l'Iterator");
		Iterator<String> it = list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		//-----------------------------------------------------------
		//---------------Autre façon de voir chercher ------------------------
		//-----------------------------------------------------------
		System.out.println("foreach");
        list2.forEach((str) ->  System.out.println(str));

        System.out.println("foreach println");
        list2.forEach(System.out::println);
		
		
	}
	
}
