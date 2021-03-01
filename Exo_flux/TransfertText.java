package Exo_flux;

import java.io.*;

public class TransfertText {

	public static void main(String[] args) {
	      File fichierSource = new File("input.txt"); 
	      File fichierDeDestination = new File("output.txt"); 
	            
	      // Créer l'objet File Reader
	      FileReader fr = null;
					try {
						fr = new FileReader(fichierSource);
						} catch (FileNotFoundException e) {
						e.printStackTrace();
						}
			
	
					// Créer l'objet BufferedReader  
	      BufferedReader br = new BufferedReader(fr);
	      
	      // Créer l'objet FileWriter
	      FileWriter fw = null;
					try {
						fw = new FileWriter(fichierDeDestination);
						} catch (IOException e) {
						e.printStackTrace();
						}      
		
	   String texte = null;
	      // Copie le contenu dans le nouveau fichier
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
