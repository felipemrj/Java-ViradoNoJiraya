package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício07.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício07.domain.ContaBancaria;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício07.domain.Depositar;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício07.domain.Sacar;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria contaUm = new ContaBancaria();
        Sacar saque = new Sacar();
        Depositar deposito = new Depositar();

        contaUm.titular = "Felipe";
        contaUm.numeroConta = 123;
        contaUm.saldo = 2523.12;

        System.out.println(contaUm.titular);
        System.out.println(contaUm.numeroConta);
        System.out.println(contaUm.saldo);

        contaUm.saldo = saque.sacarDinheiro(contaUm.saldo, 3000);
        contaUm.saldo = saque.sacarDinheiro(contaUm.saldo, 2000);

        contaUm.saldo = deposito.depositarDinheiro(contaUm.saldo, 20000);

        contaUm.sacar(10000);
        System.out.println(contaUm.saldo);


    }
}
