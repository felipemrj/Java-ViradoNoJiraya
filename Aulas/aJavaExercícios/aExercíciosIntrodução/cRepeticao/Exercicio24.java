package aJavaExercícios.aExercíciosIntrodução.cRepeticao;

/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. */

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("N: ");
        n = read.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadrado = i * i, cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }
    }
}