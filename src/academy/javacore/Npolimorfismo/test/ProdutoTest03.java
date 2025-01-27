package academy.javacore.Npolimorfismo.test;

import academy.javacore.Npolimorfismo.dominio.Computador;
import academy.javacore.Npolimorfismo.dominio.Produto;
import academy.javacore.Npolimorfismo.dominio.Tomate;
import academy.javacore.Npolimorfismo.servico.Calculadoraimposto;

public class ProdutoTest03 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		Tomate tomate = new Tomate("Americano", 20);
		tomate.setDataValidade("11/12/2021");
		
		Calculadoraimposto.calcularImposto(tomate);
		System.out.println("---------------------");
		Calculadoraimposto.calcularImposto(produto);

	}
}
