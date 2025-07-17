package Java01Introdução.Exercícios.Exercícios04Arrays;
/*
Crie um array de 10 inteiros e preencha-o com valores informados pelo usuário. Em seguida, imprima todos os valores do array.
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] inteiros = new int[10];

        for (int i = 0; i < inteiros.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            inteiros[i] = read.nextInt();
        }

        for (int inteiro : inteiros) {
            System.out.println(inteiro);
        }
    }
}
