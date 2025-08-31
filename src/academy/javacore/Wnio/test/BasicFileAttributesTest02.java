package academy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
	public static void main(String[] args) throws IOException {
		// BasicFileAttributesView, DosFileAttributesView, PosixFileAttributesView

		Path path = Paths.get("pasta2/novo_path.txt");
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastAcessTime = basicFileAttributes.lastAccessTime();
		FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
		
		System.out.println("creationTime: " + creationTime);
		System.out.println("lastAcessTime: " + lastAcessTime);
		System.out.println("lastModifiedTime: " + lastAcessTime);
		System.out.println("--------------------------------------");

		
		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		FileTime newCreationtime = FileTime.fromMillis(System.currentTimeMillis());
		fileAttributeView.setTimes(lastModifiedTime, newCreationtime, creationTime);
		
		creationTime = fileAttributeView.readAttributes().creationTime();
		lastAcessTime = fileAttributeView.readAttributes().lastModifiedTime();
		lastModifiedTime = fileAttributeView.readAttributes().lastAccessTime();
		
		System.out.println("creationTime: " + creationTime);
		System.out.println("lastAcessTime: " + lastAcessTime);
		System.out.println("lastModifiedTime: " + lastAcessTime);
		
	}

}
