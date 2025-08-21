package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício03.domain;

public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + getSalario() * 0.2;
    }
}
