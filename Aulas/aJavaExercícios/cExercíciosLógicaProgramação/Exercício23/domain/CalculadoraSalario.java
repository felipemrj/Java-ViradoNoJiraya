package aJavaExercícios.cExercíciosLógicaProgramação.Exercício23.domain;

public class CalculadoraSalario {
    public static double calcularSalarioBruto(double valorAula, int numeroAulas) {
        return valorAula * numeroAulas;
    }

    public static double calcularSalarioLiquido(double salarioBruto, double descontoInssPorCento) {
        return salarioBruto - salarioBruto * descontoInssPorCento;
    }
}
