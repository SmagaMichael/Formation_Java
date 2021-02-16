package Exo_Base_Java;

public class Exo_Tableau_NotesMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//trouver le min, max.
		//Calculez la moyenne des notes
		
		int[] notes = {10,8,13,14,18,3,6,11,17,9};
		
		
		int min = notes[0];
		int max = notes[0];
		int somme = 0;
		
		
		for (int note : notes) {
			
			if (min > note) {
				min = note;
			}
			

			if (max < note) {
				max = note;
			}
			
			somme += note;
			
			
			
			
			
		}
		System.out.println("La note minimum est : " + min);
		System.out.println("La note maximum est : " + max);
		System.out.println("La moyenne est : " + somme / notes.length);
		
	}

}
