package Java00Exercícios.ExerciciosIntroducao.Vetores;

// Crie um array de 15 números inteiros e calcule a média dos números armazenados.

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] inteiros = new int[15];
        int total = 0, media;

        for (int i = 0; i < inteiros.length; i++) {
            System.out.printf("Número %d", i + 1);
            inteiros[i] = read.nextInt();
            total += inteiros[i];
        }
        media = total / 15;
        System.out.println(media);
    }
}
