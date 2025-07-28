package cJavaOrientaçãoObjetos.Aula12Encapsulamento.domain;

/* Crie uma classe funcionário com os seguintes atributos:
nome
idade
salario | três salários devem ser guardados

Crie dois métodos:

1. Para imprimir os dados
2. Para tirar a média dos salários e imprimir o resultado */

public class Funcionario {
    private String nomeFuncionario;
    private int idadeFuncionario;
    private double[] salariosFuncionario;
    private double media;

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public void setSalariosFuncionario(double[] salariosFuncionario) {
        this.salariosFuncionario = salariosFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public double[] getSalariosFuncionario() {
        return salariosFuncionario;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia(double[] salarios) {
        double total = 0;
        for (double salario : salarios) {
            total+= salario;
        }
        media = total / salarios.length;
        System.out.printf("Média salarial: %.2fR$", media);
    }

    public void imprimirDados(Funcionario funcionario) {
        System.out.println(funcionario.getNomeFuncionario());
        System.out.println(funcionario.getIdadeFuncionario());
        for (double salario : funcionario.getSalariosFuncionario()) {
            System.out.printf("%.2fR$ ", salario);
        }
        System.out.println();
        calcularMedia(funcionario.salariosFuncionario);
    }
}
