package cJavaOrientaçãoObjetos.Aula21Enumeração.test;

import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.Cliente;
import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.TipoCliente;
import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c2 = new Cliente("Joao", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println(tipoCliente2);
    }
}
