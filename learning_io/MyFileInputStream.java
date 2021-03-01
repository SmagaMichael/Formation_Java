package learning_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyFileInputStream {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("test.txt")){

			byte[] buffer = new byte[8];
			int n = 0;

			while ((n = fis.read(buffer)) >= 0) {
				System.out.print(new String(buffer, StandardCharsets.UTF_8));
			}

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
