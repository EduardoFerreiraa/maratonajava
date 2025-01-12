package academy.javacore.Kenum.test;

import academy.javacore.Kenum.dominio.Cliente;
import academy.javacore.Kenum.dominio.TipoPagamento;
import academy.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		Cliente cliente2 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente.getNomeRelatorio());
		TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
		System.out.println(tipoCliente2);
	}

}	
