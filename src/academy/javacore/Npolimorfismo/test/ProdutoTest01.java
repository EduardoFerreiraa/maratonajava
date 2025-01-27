package academy.javacore.Npolimorfismo.test;

import academy.javacore.Npolimorfismo.dominio.Computador;
import academy.javacore.Npolimorfismo.dominio.Televisao;
import academy.javacore.Npolimorfismo.dominio.Tomate;
import academy.javacore.Npolimorfismo.servico.Calculadoraimposto;

public class ProdutoTest01 {
	public static void main(String[] args) {
		Computador computador = new Computador("NUC10i7", 11000);
		Tomate tomate = new Tomate("Tomate Siciliano", 10);
		Televisao televisao = new Televisao("Samsung 50\" ", 5000);
		
		Calculadoraimposto.calcularImposto(computador);
		System.out.println("----------------------------");
		Calculadoraimposto.calcularImposto(tomate);
		System.out.println("----------------------------");
		Calculadoraimposto.calcularImposto(televisao);
	}
	

}
