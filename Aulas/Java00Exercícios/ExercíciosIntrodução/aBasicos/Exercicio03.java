package Java00Exercícios.ExercíciosIntrodução.aBasicos;

/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c, d, difference;

        System.out.println("A: ");
        a = read.nextInt();
        System.out.println("B: ");
        b = read.nextInt();
        System.out.println("C: ");
        c = read.nextInt();
        System.out.println("D: ");
        d = read.nextInt();

        difference = (a * b) - (c * d);
        System.out.println("Difference: " + difference);
    }
}
