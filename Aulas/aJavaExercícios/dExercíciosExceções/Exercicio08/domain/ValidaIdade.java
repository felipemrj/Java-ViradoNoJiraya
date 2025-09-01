package aJavaExercícios.dExercíciosExceções.Exercicio08.domain;

import java.util.Scanner;

public class ValidaIdade {
    public static int validaIdade() {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = read.nextInt();

        if (idade < 18 || idade > 120) {
            throw new IdadeInvalidaException();
        }
        return idade;
    }
}
