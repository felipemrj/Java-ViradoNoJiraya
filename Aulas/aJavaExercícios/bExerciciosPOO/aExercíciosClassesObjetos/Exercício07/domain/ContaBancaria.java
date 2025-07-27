package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício07.domain;

public class ContaBancaria {
    public String titular;
    public double saldo;
    public int numeroConta;

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
