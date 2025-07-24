package Java00Exercícios.ExercíciosIntrodução.bCondicional;

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b;

        System.out.println("A: ");
        a = read.nextInt();
        System.out.println("B: ");
        b = read.nextInt();

        if (a % b == 0 || b % a == a) {
            System.out.println("Múltiplos");
        } else {
            System.out.println("Não múltiplos");
        }

    }
}
