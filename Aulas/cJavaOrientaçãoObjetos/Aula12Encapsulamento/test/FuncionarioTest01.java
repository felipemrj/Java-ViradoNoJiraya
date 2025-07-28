package cJavaOrientaçãoObjetos.Aula12Encapsulamento.test;


import cJavaOrientaçãoObjetos.Aula12Encapsulamento.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario();

        funcionarioUm.setNomeFuncionario("Felipe");
        funcionarioUm.setIdadeFuncionario(30);
        funcionarioUm.setSalariosFuncionario(new double[]{3000, 5000, 10000});

        funcionarioUm.imprimirDados(funcionarioUm);
        System.out.println();
        System.out.println(funcionarioUm.getMedia());

    }
}
