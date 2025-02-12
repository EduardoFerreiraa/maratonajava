package academy.javacore.Oexception.exception.test;

import java.io.FileNotFoundException;

import academy.javacore.Oexception.exception.dominio.Funcionario;
import academy.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		try {
			funcionario.salvar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
		
	}

}
