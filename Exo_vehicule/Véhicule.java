package Exo_vehicule;

public abstract class Véhicule implements IActionVéhicule {
	private String Name;
	private int Matricule;
	private int Years;
	private float Price;
	
	
	public Véhicule() {
	}

	public Véhicule(String name, int matricule, int years, float price) {
		this.Name = name;
		this.Matricule = matricule;
		this.Years = years;
		this.Price = price;
	}

	
	public final String getName() {
		return Name;
	}

	public final void setName(String name) {
		Name = name;
	}

	public final int getMatricule() {
		return Matricule;
	}

	public final void setMatricule(int matricule) {
		Matricule = matricule;
	}

	public final int getYears() {
		return Years;
	}

	public final void setYears(int years) {
		Years = years;
	}

	public final float getPrice() {
		return Price;
	}

	public final void setPrice(float price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Véhicule [Name=" + Name + ", Matricule=" + Matricule + ", Years=" + Years + ", Price=" + Price + "]";
	}
	
	
	
	
	
	
	
	
}
