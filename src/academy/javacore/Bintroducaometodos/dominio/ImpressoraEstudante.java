package academy.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
	public void imprime(Estudante estudante) {
		System.out.println("------------------");
		
		estudante.nome = "Goten";
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
	}
}
