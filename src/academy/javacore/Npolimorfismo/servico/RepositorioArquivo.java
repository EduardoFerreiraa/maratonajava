package academy.javacore.Npolimorfismo.servico;

import academy.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo");

	}
	
}
