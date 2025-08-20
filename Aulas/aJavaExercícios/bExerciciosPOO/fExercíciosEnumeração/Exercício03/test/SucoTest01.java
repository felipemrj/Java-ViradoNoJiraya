package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício03.domain.Suco;
import aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício03.domain.Tamanho;

public class SucoTest01 {
    public static void main(String[] args) {
        Suco suco1 = new Suco("Morango", Tamanho.PEQUENO);
        Suco suco2 = new Suco("Laranja", Tamanho.MEDIO);
        Suco suco3 = new Suco("Kiwi", Tamanho.GRANDE);

        suco1.imprime();
        suco2.imprime();
        suco3.imprime();
    }
}
