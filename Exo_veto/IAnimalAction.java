package Exo_veto;

public interface IAnimalAction {
	
	String str = "";

	void crier();
	
	void manger();
	
	void dormir();
	
	default void bouger() {
		System.out.println("je marche");
	}
	
}
