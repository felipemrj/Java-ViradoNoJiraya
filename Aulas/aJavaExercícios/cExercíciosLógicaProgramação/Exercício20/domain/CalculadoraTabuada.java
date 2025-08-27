package aJavaExercícios.cExercíciosLógicaProgramação.Exercício20.domain;

public class CalculadoraTabuada {
    public static void calculaTabuada(int valor) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
    }
}
