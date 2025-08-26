package aJavaExercícios.cExercíciosLógicaProgramação.Exercício03.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício03.domain.CalcularMultiplicacao;
import aJavaExercícios.cExercíciosLógicaProgramação.Exercício03.domain.CalcularSoma;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite A: ");
        a = read.nextInt();

        System.out.println("Digite B: ");
        b = read.nextInt();

        if (a == b) {
            c = CalcularSoma.calcularSoma(a, b);
            System.out.println("A soma é igual a " + c + ".");
        } else {
            c = CalcularMultiplicacao.calcularMultiplicacao(a, b);
            System.out.println("A multiplicação é igual a " + c + ".");
        }
    }
}
