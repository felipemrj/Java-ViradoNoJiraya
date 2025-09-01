package aJavaExercícios.dExercíciosExceções.Exercicio01.domain;

public class Divisao {
    public static double divideDoisNumeros(double dividendo, double divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("Argumento inválido, divisor não pode ser 0.");
        }
        return dividendo / divisor;
    }
}
