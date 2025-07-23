package Java00Exercícios.ExerciciosIntroducao.Repeticao;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. */

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("N: ");
        n = read.nextInt();

        for (int i = 1; i <= n; i++) {
            double total = 0;
            double media = 0;

            for (int j = 1; j <= 3; j++) {
                double x;
                System.out.println("X" + j + ":");
                x = read.nextDouble();
                if (j == 1) {
                    total += x * 2;
                } else if (j == 2) {
                    total += x * 3;
                } else {
                    total += x * 5;
                }
                media = total / 10;
            }
            System.out.println("Média " + i + ": " + media);
        }

    }
}
