package Java00Exercícios.ExercíciosIntrodução.dVetores;

// Dado um array de 5 números inteiros, encontre e imprima o maior e o menor valor contidos nele.

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] inteiros = new int[10];

        for (int i = 0; i < inteiros.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            inteiros[i] = read.nextInt();
        }

        int menor = inteiros[0], maior = inteiros[0];
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] > maior) {
                maior = inteiros[i];
            }
            if (inteiros[i] < menor) {
                menor = inteiros[i];
            }
        }
        System.out.println(menor);
        System.out.println(maior);

    }
}
