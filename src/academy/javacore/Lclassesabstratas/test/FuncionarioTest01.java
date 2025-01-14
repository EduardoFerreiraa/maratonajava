package academy.javacore.Lclassesabstratas.test;

import academy.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
	public static void main(String[] args) {
		Gerente gerente  = new Gerente("Nami", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Eduardo", 2500);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		
	}

}
