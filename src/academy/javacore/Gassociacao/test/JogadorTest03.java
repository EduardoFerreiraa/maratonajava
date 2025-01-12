package academy.javacore.Gassociacao.test;

import academy.javacore.Gassociacao.dominio.Jogador;
import academy.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
	public static void main(String[] args) {
		Jogador jogador = new Jogador("Cafu");
		Jogador jogador2 = new Jogador("Pelé");
		
		Time time = new Time("Brasil");
		Jogador[] jogadores = {jogador, jogador2};
		
		jogador.setTime(time);
		jogador2.setTime(time);
		
		time.setJogadores(jogadores);
		
		System.out.println("------- Jogador -------");
		
		jogador.imprime();
		
		System.out.println("------- Time -------");
		
		time.Imprime();
	}

}
