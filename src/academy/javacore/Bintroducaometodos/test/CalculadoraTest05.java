package academy.javacore.Bintroducaometodos.test;

import academy.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		calculadora.somaArray(numeros);
		System.out.println("-----------");
		calculadora.somaVarargs(numeros);
	}
} 
