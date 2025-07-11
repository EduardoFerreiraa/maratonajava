package academy.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
	public static void main(String[] args) {
		File file = new File("filee.txt");
		
		try (FileReader fr = new FileReader(file)) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
