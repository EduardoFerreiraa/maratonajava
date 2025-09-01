package academy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
	public static void main(String[] args) {
		Path path = Paths.get("/maratonajava");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
