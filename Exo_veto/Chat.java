package Exo_veto;

public class Chat extends Animal{
	
	Chat(){
		super("noir", 
				"gouttière", 
				1, 
				"gros minet",
				5);
	}
	
	Chat(String couleur, String race, int age, String nom, float poids){
		super(couleur, race, age, nom, poids);
	}

	@Override
	public void crier() {
		System.out.println("Je miaule");
	}

	@Override
	public void manger() {
		System.out.println("Je mange des croquettes");
	}

	@Override
	public void dormir() {
		System.out.println("je dors 18h");
	}
	
	
}