package Java00Exercícios.ExerciciosIntroducao.Repeticao;

/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.  */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x;

        System.out.println("X: ");
        x = read.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
