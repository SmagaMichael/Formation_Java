package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
//		exceptionTest();

//		try {
//			division(10, 0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("je suis passé");

		FeuSignalisation feu = new FeuSignalisation();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Choisis parmis ces 3 couleurs :");
			System.out.println("\t1 - rouge");
			System.out.println("\t2 - orange");
			System.out.println("\t3 - vert");

			int color = sc.nextInt();

			System.out.println(color);

			feu.setCouleur("bleu");
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (FeuSignalisationException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void division(int i, int j) throws Exception {
		if (i == 0 || j == 0){
			throw new Exception("Attention, veux-tu vraiment diviser des 0.");
		}
	}

	private static void exceptionTest() {
		Scanner sc = new Scanner(System.in);
		try{
//			System.out.println(3/0);
			sc.nextInt();
		} catch (InputMismatchException i){
			System.out.println("C'est un nombre que je souhaite et pas autre chose");
		} catch (Exception e){
			System.out.println("Tu ne peux diviser par 0!!");
			e.printStackTrace();
		} finally {
			System.out.println("je suis dans le finally");
			sc.close();
		}

		System.out.println("hello");
	}

}
