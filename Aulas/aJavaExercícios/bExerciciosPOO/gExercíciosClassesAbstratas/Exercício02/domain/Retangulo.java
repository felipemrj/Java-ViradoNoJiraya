package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício02.domain;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
