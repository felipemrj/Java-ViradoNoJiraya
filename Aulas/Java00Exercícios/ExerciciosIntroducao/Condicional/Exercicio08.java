package Java00Exercícios.ExerciciosIntroducao.Condicional;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;

        System.out.println("Num: ");
        num = read.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
