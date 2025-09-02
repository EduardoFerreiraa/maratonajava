package academy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println(file.getFileName());
		return  FileVisitResult.CONTINUE;

	}
	
}

public class SimpleFileVisitorTest01 {
	public static void main(String[] args) {
		Path path = Paths.get(".");
		Files.walkFileTree(root, new ListAllFiles());
	}

}
