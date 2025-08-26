package aJavaExercícios.cExercíciosLógicaProgramação.Exercício14.test;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a, b, temp;

        System.out.println("Digite A: ");
        a = read.nextInt();

        System.out.println("Digite B: ");
        b = read.nextInt();

        temp = a;

        a = b;
        b = temp;

        System.out.println(a + ", " + b);
    }
}
