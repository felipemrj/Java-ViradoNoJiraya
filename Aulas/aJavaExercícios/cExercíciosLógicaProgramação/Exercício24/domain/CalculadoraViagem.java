package aJavaExercícios.cExercíciosLógicaProgramação.Exercício24.domain;

public class CalculadoraViagem {
    public static final int CONSUMO_COMBUSTIVEL = 12;

    public static double calcularDistanciaPercorrida(double tempo, double velocidade) {
        return tempo * velocidade;
    }

    public static double calcularCombustivelGasto(double distancia) {
        return distancia / CONSUMO_COMBUSTIVEL;
    }
}
