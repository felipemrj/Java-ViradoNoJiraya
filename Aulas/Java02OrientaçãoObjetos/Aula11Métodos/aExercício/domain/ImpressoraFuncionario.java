package Java02OrientaçãoObjetos.Aula11Métodos.aExercício.domain;

import java.sql.Array;

public class ImpressoraFuncionario {
    public void imprimirDados(Funcionario funcionario) {
        System.out.println(funcionario.nomeFuncionario);
        System.out.println(funcionario.idadeFuncionario);
        for (double salario : funcionario.salariosFuncionario) {
            System.out.printf("%.2fR$ ", salario);
        }
    }
}
