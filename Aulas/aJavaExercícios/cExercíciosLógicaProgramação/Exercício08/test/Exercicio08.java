package aJavaExercícios.cExercíciosLógicaProgramação.Exercício08.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício08.domain.OrdemDecrescente;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite A: ");
        a = read.nextInt();

        System.out.println("Digite B: ");
        b = read.nextInt();

        System.out.println("Digite C: ");
        c = read.nextInt();

        OrdemDecrescente.organizaDecrescente(a, b, c);
    }
}
