package Java00Exercícios.ExercíciosIntrodução.cRepeticao;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("N: ");
        n = read.nextInt();

        for (int i = 0; i < n; i++) {
            double a, b, division;
            System.out.println("A: ");
            a = read.nextDouble();
            System.out.println("B: ");
            b = read.nextDouble();

            if (b == 0) {
                System.out.println("divisão impossível");
            } else {
                division = a / b;
                System.out.println(division);
            }
        }
    }
}
