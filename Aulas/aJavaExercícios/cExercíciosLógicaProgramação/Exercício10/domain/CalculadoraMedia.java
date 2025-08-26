package aJavaExercícios.cExercíciosLógicaProgramação.Exercício10.domain;

public class CalculadoraMedia {
    public static void calculaMedia (double... notas) {
        double total = 0, media;
        for (double nota : notas) {
            total += nota;
        }
        media = total / notas.length;
        System.out.println("Média: " + media);
    }
}
