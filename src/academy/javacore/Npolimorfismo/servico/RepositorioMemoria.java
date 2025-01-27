package academy.javacore.Npolimorfismo.servico;

import academy.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando em memória");

	}
	
}
