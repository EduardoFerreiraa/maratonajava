package academy.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderTest01 {
	public static void main(String[] args) {
		File file = new File("filee.txt");
		try (FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr)) {
			String linha;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
				
				
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
