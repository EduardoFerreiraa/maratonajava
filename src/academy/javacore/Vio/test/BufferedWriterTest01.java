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
			bufferWriter.write("O Dev dojo é o melhor youtuber do Brasilllll");
			bufferWriter.newLine();
			bufferWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
