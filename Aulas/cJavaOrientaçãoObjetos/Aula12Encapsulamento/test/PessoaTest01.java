package cJavaOrientaçãoObjetos.Aula12Encapsulamento.test;

import cJavaOrientaçãoObjetos.Aula12Encapsulamento.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setNome("Jiraya");
        pessoaUm.setIdade(70);
        pessoaUm.imprime();
    }
}
