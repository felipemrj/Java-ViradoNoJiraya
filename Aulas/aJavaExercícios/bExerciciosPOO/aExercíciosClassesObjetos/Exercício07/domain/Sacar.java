package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício07.domain;

public class Sacar {
    public double sacarDinheiro(double valorSaldo, double valorSaque) {
        if (valorSaldo < valorSaque) {
            System.out.println("Saldo Insuficiente");
            return valorSaldo;
        }
        valorSaldo -= valorSaque;
        System.out.println("Saque de " + valorSaque + " realizado com sucesso. Novo saldo é: " + valorSaldo);
        return valorSaldo;
    }


}
