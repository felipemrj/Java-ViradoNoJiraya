package aJavaExercícios.cExercíciosLógicaProgramação.Exercício16.domain;

public class ClassificaTriangulo {
    public static String classificarTriangulo(double a, double b, double c) {
        if (ValidaTriangulo.validarTriangulo(a, b, c)) {
            if ((a == b && a == c)) {
                return "Triângulo equilátero";
            } else if (a == b || a == c || b == c) {
                return "Triângulo isósceles";
            } else {
                return "Triângulo escaleno";
            }
        } else {
            return "Não é um triângulo";
        }

    }
}
