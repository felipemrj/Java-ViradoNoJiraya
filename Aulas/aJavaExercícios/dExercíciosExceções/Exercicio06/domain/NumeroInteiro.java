package aJavaExercícios.dExercíciosExceções.Exercicio06.domain;

public class NumeroInteiro {
    public static int recebeNumero(int numero) throws ValorZeroException {
        if (numero == 0) {
            throw new ValorZeroException();
        }
        return numero;
    }
}
