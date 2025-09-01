package aJavaExercícios.dExercíciosExceções.Exercicio08.domain;

public class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException() {
        super("Idade inválida, valor deve ser maior que 18 e menor que 120.");
    }

}
