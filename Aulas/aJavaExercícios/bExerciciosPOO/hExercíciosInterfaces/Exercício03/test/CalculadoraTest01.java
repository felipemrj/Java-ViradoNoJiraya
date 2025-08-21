package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício03.domain.Calculadora;
import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício03.domain.Multiplicacao;
import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício03.domain.Soma;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora.somar(2, 2);

        Soma soma = new Soma();
        soma.imprimirResultado(28, 32);

        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.imprimirResultado(3, 3);
    }
}
