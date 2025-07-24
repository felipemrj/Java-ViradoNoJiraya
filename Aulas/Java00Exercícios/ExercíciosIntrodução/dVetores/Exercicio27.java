package Java00Exercícios.ExercíciosIntrodução.dVetores;

/* Leia dois arrays de 5 posições cada, some os valores das mesmas posições e armazene o resultado em um terceiro array.
Imprima o terceiro array. */

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] listaUm = new int[5];
        int[] listaDois = new int[5];
        int[] listaTres = new int[5];

        for (int i = 0; i < listaUm.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            listaUm[i] = read.nextInt();
        }

        for (int i = 0; i < listaDois.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            listaDois[i] = read.nextInt();
        }

        for (int i = 0; i < listaTres.length; i++) {
            listaTres[i] = listaUm[i] + listaDois[i];
        }

        for (int num : listaTres) {
            System.out.println(num);
        }
    }
}
