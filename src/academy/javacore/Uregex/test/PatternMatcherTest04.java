package academy.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
	public static void main(String[] args) {
		// \d = Todos os dígitos
		// \D = Tudo o que não for dígito
		// \s = Espaços em branco \t \n \f \r
		// \S = Todos os caracteres excluindo os brancos
		// \w = a-ZA-Z, dígitos, _
		// \W  = Tudo o que não for incluso no \w
		// [] 
		
		// QUANTIFICADORES
		
		// ? Zero ou uma ocorrência
		// * zero ou mais
		// + uma ou mais
		// {n,m} de n até m
		// ()
		// | o(v|c)o ovo | oco
		// $
		// . 1.3 = 123, 133, 1@3, 1A3
		
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+)+";
		String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com, sakura@mail";
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(texto);
	
		System.out.println("texto:  " + texto );
		System.out.println("indice: 0123456789");
		System.out.println("regex: " +regex);
		System.out.println("Posicoes encontradas");
		while (matcher.find()) {
			System.out.print(matcher.start()+" " + matcher.group() + "\n");
		}

		
	}

}
