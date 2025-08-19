package cJavaOrientaçãoObjetos.Aula21Enumeração.test;

import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.Cliente;
import cJavaOrientaçãoObjetos.Aula21Enumeração.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);
        Cliente c2 = new Cliente("Joao", TipoCliente.PESSOA_JURIDICA);
        Cliente c3 = new Cliente("João", TipoCliente.PESSOA_FISICA);
        Cliente c4 = new Cliente("João", TipoCliente.PESSOA_JURIDICA);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
