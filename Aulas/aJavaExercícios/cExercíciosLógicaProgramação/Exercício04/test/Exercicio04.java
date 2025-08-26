package aJavaExercícios.cExercíciosLógicaProgramação.Exercício04.test;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num, antecessor, sucessor;

        System.out.println("Digite um número: ");
        num = read.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println("Antecessor: " + antecessor + " Sucessor: " + sucessor);
    }
}
