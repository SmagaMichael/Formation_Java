package Exo_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int tableauDeNombre[] = {1,2,-2,32,5,999,7,8,9,10};
		
		for (int nombre:tableauDeNombre) {
			System.out.print(nombre + " | ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < tableauDeNombre.length; i++) {
			if (tableauDeNombre[i] < max) {
				max = tableauDeNombre[i];
			}
			if(tableauDeNombre[i] > min) {
				min = tableauDeNombre[i];
			}
		}
		
		System.out.println("la valeur minimal est : " +max);
		System.out.println("la valeur maximal est : " +min);
		
		
		
		//Collections.swap(tableauDeNombre, 2, 9);
		//System.out.println(tableauDeNombre[]);
		

	}
	
	private static void exercice2(){
		ArrayList<Integer> tab = new ArrayList<>(Arrays.asList(
				15, 654, 512, 13, 84, 3544, 6453, 75, 354, 876, 7896, 13541, 1145, 654, 231, 45
		));

		// changer l'index 3 et 9
		int num1 = tab.get(3);
		int num2 = tab.get(9);
		tab.set(3, num2);
		tab.set(9, num1);
		System.out.println(tab);

		Collections.swap(tab, 3, 9);
		System.out.println(tab);
	}

	private static void exercice1() {
		ArrayList<Integer> tab = new ArrayList<>(Arrays.asList(
				15, 654, 512, 13, 84, 3544, 6453, 75, 354, 876, 7896, 13541, 1145, 654, 231, 45
		));

		int max = tab.get(0);
		for (Integer nb : tab) {
			if (nb > max) {
				max = nb;
			}
		}
		System.out.println("Le max est : " + max);

		TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(
				15, 654, 512, 13, 84, 3544, 6453, 75, 354, 876, 7896, 13541, 1145, 654, 231, 45
		));
		System.out.println(treeSet.last());

		System.out.println(Collections.max(tab));
	}

}
