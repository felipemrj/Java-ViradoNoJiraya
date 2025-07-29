package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício01.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        Pessoa pessoaDois = new Pessoa();

        pessoaUm.nome = "Felipe";
        pessoaUm.idade = 10;
        pessoaUm.sexo = 'M';

        pessoaDois.nome = "Thamyres";
        pessoaDois.idade = 33;
        pessoaDois.sexo = 'F';

        System.out.println(pessoaUm.nome);
        System.out.println(pessoaUm.idade);
        System.out.println(pessoaUm.sexo);
        System.out.println("-------------");
        System.out.println(pessoaDois.nome);
        System.out.println(pessoaDois.idade);
        System.out.println(pessoaDois.sexo);

        if (pessoaUm.maiorDeIdade()) {
            System.out.println(pessoaUm.nome + " é maior de idade.");
        } else {
            System.out.println(pessoaUm.nome + " é menor de idade.");
        }

    }
}
