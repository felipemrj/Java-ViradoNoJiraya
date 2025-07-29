package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício07.domain;

public class Depositar {
    public double depositarDinheiro(double valorSaldo, double valorDeposito) {
        valorSaldo += valorDeposito;
        System.out.println("Depósito de " + valorDeposito + " realizado com sucesso. Novo saldo é: " + valorSaldo);
        return valorSaldo;
    }
}
