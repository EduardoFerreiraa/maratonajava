package academy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("");

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		return super.visitFile(file, attrs);
	}
	
}

public class PathMatcherTest02 {
	public static void main(String[] args) {
		
	}

}
