package aJavaExercícios.dExercíciosExceções.Exercicio03.test;

import aJavaExercícios.dExercíciosExceções.Exercicio03.domain.Divisao;

public class Exercicio03 {
    public static void main(String[] args) {
        int x = 3, y = 0;

        try {
            System.out.println(Divisao.divideDoisNumeros(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão Por 0");
        } finally {
            System.out.println("Operação finalizada");
        }
    }
}
