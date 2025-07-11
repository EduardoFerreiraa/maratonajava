package academy.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
	public static void main(String[] args) {
		File file = new File("filee.txt");
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			fileWriter.write("O Dev dojo é o melhor youtuber do Brasilllll\n Continuando a cantoria na próxima linha");
			fileWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
