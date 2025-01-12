package academy.javacore.Gassociacao.test;
import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");

        String pergunta = input.nextLine();

        // Verificando se a pergunta é vazia ou contém apenas espaços
        if(pergunta.trim().isEmpty()) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        input.close(); // Fechar o scanner
    }
}
