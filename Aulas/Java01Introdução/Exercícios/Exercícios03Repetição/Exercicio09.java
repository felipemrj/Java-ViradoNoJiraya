package Java01Introdução.Exercícios.Exercícios03Repetição;
/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x;
        System.out.println("X: ");
        x = read.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }

    }
}
