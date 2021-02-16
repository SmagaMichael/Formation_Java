package Exo_Gestion_De_Stock;

public class Article {

	
	private int ref;
	private String name;
	private Float price;
	private int quantity;
	
//constructeur vide pour utiliser les setters 	
public Article() {
	}


//source => generate constructor using fields	
public Article(int ref, String name, Float price, int quantity) {
		this.ref = ref;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

// sources = generate getter / setter 
	public final int getRef() {
		return ref;
	}
	public final void setRef(int ref) {
		this.ref = ref;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final Float getPrice() {
		return price;
	}
	public final void setPrice(Float price) {
		this.price = price;
	}
	public final int getQuantity() {
		return quantity;
	}
	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
//source => generateToString
	@Override
	public String toString() {
		return "Article [ref=" + ref + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
		
}
