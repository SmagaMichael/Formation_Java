package Exo_flux_ville;

public class Ville {
	
	
	String departement;
	String slug;
	String nom;
	String nomSimple;
	String nomReel;
	String nomSoundex;
	String nomMetaphone;
	String codePostal;
	String numCommune;
	String codeCommune;
	String arrondissement;
	String canton;
	String population2010;
	String population1999;
	String population2012;
	String densite2010;
	String surface;
	String superficie;
	String longitudeDegre;
	String latitudeDegre;
	String longitudeGRD;
	String latitudeGRD;
	String longitudeDMS;
	String latitudeDMS;
	String altitudeMin;
	String altitudeMax;

	
	
	@Override
	public String toString() {
		return "Ville [departement=" + departement + ", slug=" + slug + ", nom=" + nom + ", nomSimple=" + nomSimple
				+ ", nomReel=" + nomReel + ", nomSoundex=" + nomSoundex + ", nomMetaphone=" + nomMetaphone
				+ ", codePostal=" + codePostal + ", numCommune=" + numCommune + ", codeCommune=" + codeCommune
				+ ", arrondissement=" + arrondissement + ", canton=" + canton + ", population2010=" + population2010
				+ ", population1999=" + population1999 + ", population2012=" + population2012 + ", densite2010="
				+ densite2010 + ", surface=" + surface + ", superficie=" + superficie + ", longitudeDegre="
				+ longitudeDegre + ", latitudeDegre=" + latitudeDegre + ", longitudeGRD=" + longitudeGRD
				+ ", latitudeGRD=" + latitudeGRD + ", longitudeDMS=" + longitudeDMS + ", latitudeDMS=" + latitudeDMS
				+ ", altitudeMin=" + altitudeMin + ", altitudeMax=" + altitudeMax + "]";
	}
	
}

