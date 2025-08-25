package academy.javacore.Vio.test;

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File fileDiretorio = new File("pasta");
		boolean isDiretorioCriado = fileDiretorio.mkdir();
		System.out.println(isDiretorioCriado);
		
	}

}
