package academy.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		try {
			boolean isCreated = file.createNewFile();
			boolean exists = file.exists();
			System.out.println("Created " +isCreated);
			System.out.println("path " +file.getPath());
			System.out.println("path Absolute " +file.getAbsolutePath());
			System.out.println("is directory " +file.isDirectory());
			System.out.println("is file " +file.isFile());
			System.out.println("is hiden " +file.isHidden());
			System.out.println("last modified " + new Date(file.lastModified()));

			if(exists) {
				System.out.println("Deleted " +file.delete());
			}
			System.out.println(isCreated);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
