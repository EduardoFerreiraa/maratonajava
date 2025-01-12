package academy.javacore.Bintroducaometodos.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salarios;
	private double media;
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		for(double salario: salarios) {
			System.out.println(salario);
		}
		imprimeMediaSalarial();
	}
	
	public void imprimeMediaSalarial() {
		for(double salario: salarios) {
			media += salario;
		}
		media /= salarios.length;
		System.out.println("\nMédia salarial " + media);
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}
	
	public double getMedia() {
		return media;
	}

}
