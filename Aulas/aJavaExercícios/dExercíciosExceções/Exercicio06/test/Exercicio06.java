package aJavaExercícios.dExercíciosExceções.Exercicio06.test;

import aJavaExercícios.dExercíciosExceções.Exercicio06.domain.NumeroInteiro;
import aJavaExercícios.dExercíciosExceções.Exercicio06.domain.ValorZeroException;

public class Exercicio06 {
    public static void main(String[] args) {
        int numeroInteiro = 0;

        try {
            NumeroInteiro.recebeNumero(numeroInteiro);
        } catch (ValorZeroException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Encerrando");
        }
    }
}
