package aJavaExercícios.cExercíciosLógicaProgramação.Exercício02.domain;

public class PositivoNegativo {
    public static String positivoOuNegativo(int a) {
        if (a > 0) {
            return "positivo";
        } else if (a < 0) {
            return "negativo";
        }
        return "neutro";
    }
}
