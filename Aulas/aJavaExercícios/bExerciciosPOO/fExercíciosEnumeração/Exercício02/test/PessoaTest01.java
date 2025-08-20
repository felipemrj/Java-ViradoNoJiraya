package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício02.domain.Pessoa;
import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício02.domain.Sexo;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Felipe", Sexo.MASCULINO);
        Pessoa pessoa2 = new Pessoa("Thamyres", Sexo.FEMININO);

        System.out.println(pessoa1);
        System.out.println(pessoa2);

    }
}
