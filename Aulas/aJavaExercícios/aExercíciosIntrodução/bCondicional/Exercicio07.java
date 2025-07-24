package aJavaExercícios.aExercíciosIntrodução.bCondicional;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;

        System.out.println("Num: ");
        num = read.nextInt();

        if (num < 0) {
            System.out.println("Número negativo");
        } else if (num > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número neutro");
        }

    }
}
