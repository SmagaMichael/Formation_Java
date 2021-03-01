package learning_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyFileOutputStream {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("test.txt", true)){
			
		fos.write("\r\n Coucou, c'est nous".getBytes(StandardCharsets.UTF_8));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
