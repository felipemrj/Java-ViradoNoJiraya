package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício03.domain;

public abstract class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
        this.salario = calcularSalario();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }

    public abstract double calcularSalario();

    public double getSalario() {
        return salario;
    }
}
