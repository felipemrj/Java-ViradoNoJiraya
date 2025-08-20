package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício01.domain.DiaSemana;

public class DiaSemanaTest01 {
    public static void main(String[] args) {
        DiaSemana.imprimeVALOR();
        System.out.println("---");
        System.out.println(DiaSemana.buscaPorNome("Segunda-Feira"));
        System.out.println("---");
        System.out.println(DiaSemana.buscaPorValor(7));
    }
}
