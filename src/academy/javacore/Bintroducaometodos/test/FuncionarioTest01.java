package academy.javacore.Bintroducaometodos.test;

import academy.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Eduardo");
		funcionario.setIdade(18);
		funcionario.setSalarios(new double[] {1200, 805.50, 2000});
		
		funcionario.imprime();
	}
}
