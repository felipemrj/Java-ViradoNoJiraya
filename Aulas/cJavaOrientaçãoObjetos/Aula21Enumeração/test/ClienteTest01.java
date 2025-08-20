package cJavaOrientaçãoObjetos.Aula21Enumeração.test;


import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.Cliente;
import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.TipoCliente;
import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Jiraya", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);

    }
}
