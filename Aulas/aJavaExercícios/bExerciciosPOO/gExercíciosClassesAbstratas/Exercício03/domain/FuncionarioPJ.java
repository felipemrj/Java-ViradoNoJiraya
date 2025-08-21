package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício03.domain;

public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + getSalario() * 0.1;
    }
}
