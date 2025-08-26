package aJavaExercícios.cExercíciosLógicaProgramação.Exercício07.domain;

public class ValoresBooleanos {
    public static String valoresBooleanos(boolean a, boolean b) {
        if (a && b) {
            return "Verdadeiros";
        } else if (!a && !b) {
            return "Falsos";
        } else if (!a) {
            return "Falso e Verdadeiro";
        }
        return "Verdadeiro e Falso";
    }
}
