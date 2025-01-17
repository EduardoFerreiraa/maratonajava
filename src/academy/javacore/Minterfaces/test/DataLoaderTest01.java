package academy.javacore.Minterfaces.test;

import academy.javacore.Minterfaces.dominio.DataLoader;
import academy.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileloader = new FileLoader();
		databaseLoader.load();
		fileloader.load();
		
		databaseLoader.remove();
		fileloader.remove();
		
		databaseLoader.checkPermission();
		fileloader.checkPermission();
		
		DataLoader.retrieveMaxDataSize();
		DatabaseLoader.retrieveMaxDataSize();
	}

}
