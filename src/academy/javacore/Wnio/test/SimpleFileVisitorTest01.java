package academy.javacore.Wnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleFileVisitorTest01 {
	public static void main(String[] args) {
		Path path = Paths.get(".");
		Files.walkFileTree(null, null);
	}

}
