package academy.javacore.Hheranca.test;

import academy.javacore.Hheranca.dominio.Endereco;
import academy.javacore.Hheranca.dominio.Funcionario;
import academy.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");
		endereco.setCep("012345-09");
		
		Pessoa pessoa = new Pessoa("Tohoyisa Shimazu");
		pessoa.setCpf("111111");
		pessoa.setEndereco(endereco);
		pessoa.Imprime();
		
		Funcionario funcionario = new Funcionario("Oda nobunaga");
		funcionario.setCpf("22222");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		System.out.println("------------");
		funcionario.Imprime();
	}

}
