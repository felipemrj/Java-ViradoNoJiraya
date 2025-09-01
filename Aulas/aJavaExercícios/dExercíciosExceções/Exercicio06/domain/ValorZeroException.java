package aJavaExercícios.dExercíciosExceções.Exercicio06.domain;

public class ValorZeroException extends Exception {
    public ValorZeroException() {
        super("Erro: Valor igual a 0");
    }

    public ValorZeroException(String message) {
        super(message);
    }
}
