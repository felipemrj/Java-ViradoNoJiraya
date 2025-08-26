package aJavaExercícios.cExercíciosLógicaProgramação.Exercício11.domain;

public class CalculadoraMedia {
    public static double calculaMedia (double... notas) {
        double total = 0, media;
        for (double nota : notas) {
            total += nota;
        }
        media = total / notas.length;
        return media;
    }
}
