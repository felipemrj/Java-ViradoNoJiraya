package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício13.domain;

public class ContaSimples {
    public String titular;
    public double saldo;

    public void depositosMultiplos(int... depositos) {
        for (int deposito : depositos) {
            saldo += deposito;
        }
    }
}
