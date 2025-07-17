package Java01Introdução.Exercícios.Exercícios04Arrays;
/*
Peça para o usuário informar 10 números e armazene-os em um array. Em seguida, conte quantos números são pares e quantos são ímpares.
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] listaParImpar = new int[10];
        int totalPar = 0, totalImpar = 0;

        for (int i = 0; i < listaParImpar.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            listaParImpar[i] = read.nextInt();
            if (listaParImpar[i] % 2 == 0) {
                totalPar++;
            } else {
                totalImpar++;
            }
        }
        System.out.printf("Par: %d | Impar: %d", totalPar, totalImpar);
    }
}
