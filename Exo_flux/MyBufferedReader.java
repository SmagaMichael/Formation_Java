package Exo_flux;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader ("input.txt"))){
			String ligne;
			
			while((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
