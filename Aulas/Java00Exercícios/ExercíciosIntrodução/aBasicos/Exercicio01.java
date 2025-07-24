package Java00Exercícios.ExercíciosIntrodução.aBasicos;

/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int firstNum, secondNum, sum;

        System.out.println("Num 1: ");
        firstNum = read.nextInt();
        System.out.println("Num 2: ");
        secondNum = read.nextInt();

        sum = firstNum + secondNum;
        System.out.println("Sum: " + sum);
    }
}
