package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício01.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa("Felipe", 30);
        Pessoa pessoaDois = new Pessoa();

        pessoaUm.imprimePessoa();

        pessoaDois.setNome("Thamyres");
        pessoaDois.setIdade(33);

        pessoaDois.imprimePessoa(false);

    }
}
