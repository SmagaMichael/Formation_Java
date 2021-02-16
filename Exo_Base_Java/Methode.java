package Exo_Base_Java;

public class Methode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setName();
		setName("Samuel");
		setName("Samuel", "Anass");
		
		setNote("s");
		setNote("s", 45);
		setNote("s", 34, 99);
		
	}
	
	
	
	public static void setName(String... names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	
	
	public static void setNote(String name, int... Notes) {
		for (int Note : Notes) {
			System.out.println(Note);
		}
	}
}
