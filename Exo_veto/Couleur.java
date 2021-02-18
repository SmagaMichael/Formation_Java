package Exo_veto;

public enum Couleur {	
	BLANC("#ecf", "rgb(236,240,241)"),
	NOIR("#2c3e50","rgb(44,62,80)"),
	ROUX("#d35400","rgb(211,84,0)"),
	MARRON("#61471f","rgb(97,71,31)"),
	GRIS("#bdc3c7","rgb(189,195,199)"),
	FAUVE("#eccc68","rgb(236,204,104)");
	
	private String  hex;
	private String  rgb;
	
	//-------CONSTRUCTEUR
	Couleur(String hex, String rgb){
		this.hex = hex;
		this.rgb = rgb;
	}
	
	//-------GETTER
	public String getHex() {
		return hex;
	}
	
	public String getRgb() {
		return rgb;
	}
	
}
