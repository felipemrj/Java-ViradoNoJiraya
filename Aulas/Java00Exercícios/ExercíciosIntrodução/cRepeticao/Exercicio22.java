package Java00Exercícios.ExercíciosIntrodução.cRepeticao;

/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1. */

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n;
        System.out.println("N: ");
        n = read.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

    }
}
