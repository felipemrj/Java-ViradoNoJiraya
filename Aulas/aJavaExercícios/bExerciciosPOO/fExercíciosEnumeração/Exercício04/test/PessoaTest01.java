package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício04.test;

import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício04.domain.EstadoCivil;
import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício04.domain.Pessoa;
import org.w3c.dom.ls.LSOutput;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Felipe", EstadoCivil.SOLTEIRO);
        Pessoa pessoa2 = new Pessoa("Elton", EstadoCivil.CASADO);

        System.out.println(pessoa1.getEstadoCivil().getNomeRelatorio());
        System.out.println(pessoa2.getEstadoCivil().getNomeRelatorio());
    }
}
