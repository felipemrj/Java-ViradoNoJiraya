package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício04.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício04.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        Pessoa pessoaDois = pessoaUm;
        Pessoa pessoaTres = new Pessoa();

        pessoaUm.nome = "Felipe";
        pessoaUm.idade = 30;
        pessoaUm.sexo = 'M';

        pessoaTres.nome = "Felipe";
        pessoaTres.idade = 30;
        pessoaTres.sexo = 'M';

        System.out.println("Pessoa 1");
        System.out.println(pessoaUm.nome);
        System.out.println(pessoaUm.idade);
        System.out.println(pessoaUm.sexo);
        System.out.println("\nPessoa 2");
        System.out.println(pessoaDois.nome);
        System.out.println(pessoaDois.idade);
        System.out.println(pessoaDois.sexo);
        System.out.println("\nPessoa 3");
        System.out.println(pessoaTres.nome);
        System.out.println(pessoaTres.idade);
        System.out.println(pessoaTres.sexo);
        System.out.println();


        // Apesar de pessoaUm e pessoaDois terem os mesmos valores de atributos, não é por isso que o bloco if retorna true
        // pessoaUm e pessoaDois apontam para o mesmo espaço na memória, e é isso que está sendo comparado
        if (Pessoa.mesmaReferencia(pessoaUm, pessoaDois)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Isso é comprovado com o seguinte if, em que os dois objetos também possuem os mesmos valores, mas como estão alocados
        // em espaços diferentes na memória o if retorna false
        if (Pessoa.mesmaReferencia(pessoaUm, pessoaTres)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
