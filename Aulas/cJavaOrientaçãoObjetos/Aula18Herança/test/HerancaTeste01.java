package cJavaOrientaçãoObjetos.Aula18Herança.test;

import cJavaOrientaçãoObjetos.Aula18Herança.domain.Endereco;
import cJavaOrientaçãoObjetos.Aula18Herança.domain.Funcionario;
import cJavaOrientaçãoObjetos.Aula18Herança.domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-123");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe");
        pessoa.setCpf("1234567890-1");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("José");
        funcionario.setCpf("987654321-0");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
