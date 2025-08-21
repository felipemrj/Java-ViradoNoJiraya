package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício02.domain;

public class Circulo extends Forma {
    private double raio;
    private final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * (this.raio * this.raio);
    }
}
