package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício03.domain;

public class Multiplicacao implements Calculadora {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
