package academy.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

public class FileWriterTest01 {
	public static void main(String[] args) {
		File file = new File("filee.txt");
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			fileWriter.write("O Dev dojo é o melhor youtuber do Brasilllll\n Continuando a cantoria na próxima linha");
			fileWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
