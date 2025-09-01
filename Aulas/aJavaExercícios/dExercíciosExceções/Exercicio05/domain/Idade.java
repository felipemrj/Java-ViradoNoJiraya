package aJavaExercícios.dExercíciosExceções.Exercicio05.domain;

import java.util.Scanner;

public class Idade {
    public static int recebeIdade(int idade) {
        if (idade < 1) {
            throw new IllegalArgumentException("Idade inválida");
        }
        return idade;
    }
}
