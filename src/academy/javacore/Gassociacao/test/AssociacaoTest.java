package academy.javacore.Gassociacao.test;

import academy.javacore.Gassociacao.dominio.Aluno;
import academy.javacore.Gassociacao.dominio.Local;
import academy.javacore.Gassociacao.dominio.Professor;
import academy.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
	public static void main(String[] args) {
		Local local = new Local("Praça das Nações");
		Aluno aluno = new Aluno("Goku", 100);
		Professor professor = new Professor("Barba Branca", "Pirata");
		Aluno[] alunosParaSeminario = {aluno};
		
		
		Seminario seminario = new Seminario("Onde achar Dragon Ball", alunosParaSeminario, local);
		
		Seminario[] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		professor.Imprime();
	}

}
