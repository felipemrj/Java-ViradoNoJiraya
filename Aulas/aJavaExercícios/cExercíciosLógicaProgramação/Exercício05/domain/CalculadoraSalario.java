package aJavaExercícios.cExercíciosLógicaProgramação.Exercício05.domain;

public class CalculadoraSalario {
    private static final double SALARIO_MINIMO = 1293.20;

    public static double calcularSalarios(double salario) {
        return salario / SALARIO_MINIMO;
    }
}
