package Exo_flux_ville;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedReader {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(
			new FileReader ("villes_france.csv"))){
			String ligne = null;
			
			
			while((ligne = br.readLine()) != null) {
				String[] tab = ligne.split(",");
				
				Ville ville = new Ville();
				
				ville.departement = tab[1];
				ville.slug = tab[2];
				ville.nom = tab[3];
				ville.nomSimple = tab[4];
				ville.nomReel = tab[5];
				ville.nomSoundex = tab[6];
				ville.nomMetaphone = tab[7];
				ville.codePostal = tab[8];
				ville.numCommune = tab[9];
				ville.codeCommune = tab[10];
				ville.arrondissement = tab[11];
				ville.canton = tab[12];
				ville.population2010 = tab[13];
				ville.population1999 = tab[14];
				ville.population2012 = tab[15];
				ville.densite2010 = tab[16];
				ville.surface = tab[17];
				ville.superficie = tab[18];
				ville.longitudeDegre = tab[19];
				ville.latitudeDegre = tab[20];
				ville.longitudeGRD = tab[21];
				ville.latitudeGRD = tab[22];
				ville.longitudeDMS = tab[23];
				ville.latitudeDMS = tab[24];
				ville.altitudeMin = tab[25];
				ville.altitudeMax = tab[26];
		
				System.out.println(ville);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//--------------------------------------------------------------------------------
		
// Créer l'objet File Reader
	      FileReader fr = null;
					try {
						fr = new FileReader("villes_france.csv");
						} catch (FileNotFoundException e) {
						e.printStackTrace();
						}
		
					
// Créer l'objet BufferedReader  
	      BufferedReader br = new BufferedReader(fr);
	      
// Créer l'objet FileWriter
	      FileWriter fw = null;
					try {
						fw = new FileWriter("dep_59.csv");
						} catch (IOException e) {
						e.printStackTrace();
						}      
		
					
// Copie le contenu dans le nouveau fichier
					String texte = null;
					     try {
							while((texte = br.readLine()) != null)             
							  {
							     fw.write(texte);
							     fw.write("\n");
							     fw.flush();
							  }
						} catch (IOException e) {
							e.printStackTrace();
						}
					      try {
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}

	}
}