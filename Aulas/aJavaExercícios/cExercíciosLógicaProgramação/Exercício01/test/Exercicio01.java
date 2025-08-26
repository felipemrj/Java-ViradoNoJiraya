package aJavaExercícios.cExercíciosLógicaProgramação.Exercício01.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício01.domain.CalcularSoma;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c, soma;

        System.out.println("Digite o valor de A: ");
        a = read.nextInt();

        System.out.println("Digite o valor de B: ");
        b = read.nextInt();

        System.out.println("Digite o valor de C: ");
        c = read.nextInt();

        soma = CalcularSoma.calcularSoma(a, b);

        System.out.println(a + " + " + b + " = " + soma);

        if (soma < c) {
            System.out.println("O resultado da soma é menor que C");
        } else if (soma == c) {
            System.out.println("O resultado da soma é igual a C");
        } else {
            System.out.println("O resultado da soma é maior que C");
        }


    }
}
