package cJavaOrientaçãoObjetos.Aula11Métodos.aExercício.test;

import cJavaOrientaçãoObjetos.Aula11Métodos.aExercício.domain.CalculadoraMedia;
import cJavaOrientaçãoObjetos.Aula11Métodos.aExercício.domain.Funcionario;
import cJavaOrientaçãoObjetos.Aula11Métodos.aExercício.domain.ImpressoraFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario();
        ImpressoraFuncionario impressora = new ImpressoraFuncionario();
        CalculadoraMedia calculadora = new CalculadoraMedia();

        funcionarioUm.nomeFuncionario = "Felipe";
        funcionarioUm.idadeFuncionario = 30;
        funcionarioUm.salariosFuncionario = new double[]{3000, 5000, 10000};

        impressora.imprimirDados(funcionarioUm);
        System.out.println();
        calculadora.calcularMedia(funcionarioUm.salariosFuncionario);

    }
}
