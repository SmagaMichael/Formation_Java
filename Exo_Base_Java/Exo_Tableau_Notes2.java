package Exo_Base_Java;

public class Exo_Tableau_Notes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] notes = {10,8,13,14,18,3,6,11,17,9};
		
		
		int min = notes[0];
		int max = notes[0];
		int somme = 0;
		
		
		for (int note : notes) {
			
			//Si la valeur de "min" est supérieur a la valeur de "note" alors 
			//je lui met note sinon on le laisse dans min
			min = (min > note) ? note : min;
			max = (max < note) ? note : max;
					
			somme += note;
			
			
			
			
			
		}
		System.out.println("La note minimum est : " + min);
		System.out.println("La note maximum est : " + max);
		System.out.println("La moyenne est : " + somme / notes.length);
		
	}

}
