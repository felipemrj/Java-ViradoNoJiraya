package cJavaOrientaçãoObjetos.Aula18Herança.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
