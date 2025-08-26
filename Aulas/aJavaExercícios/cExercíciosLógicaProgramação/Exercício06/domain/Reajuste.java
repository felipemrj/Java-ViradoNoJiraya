package aJavaExercícios.cExercíciosLógicaProgramação.Exercício06.domain;

public class Reajuste {
    private static final double REAJUSTE_POR_CENTO = 0.05;

    public static double reajuste(double a) {
        return a + a * REAJUSTE_POR_CENTO;
    }
}
