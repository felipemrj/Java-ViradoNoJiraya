package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício03.domain;

public interface Calculadora {
    double calcular(double a, double b);

    default void imprimirResultado(double a, double b) {
        System.out.println(calcular(a, b));
    }

    static void somar(double a, double b) {
        System.out.println(a + b);
    }
}
