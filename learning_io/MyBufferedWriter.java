package learning_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedWriter {

	public static void main(String[] args) {

		//BufferedWriter bw = null;
		//append: true  = rajouter a la suite 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))){
			
			bw.newLine(); //permet aussi de passer a la line 
			bw.write("\n Hello world");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
