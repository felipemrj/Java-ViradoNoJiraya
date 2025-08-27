package aJavaExercícios.cExercíciosLógicaProgramação.Exercício16.domain;

public class ValidaTriangulo {
    public static boolean validarTriangulo(double a, double b, double c) {
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            return true;
        }
        return false;
    }
}
