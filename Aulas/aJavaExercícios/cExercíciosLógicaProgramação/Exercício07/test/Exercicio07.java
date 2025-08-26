package aJavaExercícios.cExercíciosLógicaProgramação.Exercício07.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício07.domain.ValoresBooleanos;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        boolean a, b;

        System.out.println("Digite um valor lógico: ");
        a = read.nextBoolean();

        System.out.println("Digite um segundo valor lógico: ");
        b = read.nextBoolean();

        System.out.println(ValoresBooleanos.valoresBooleanos(a, b));


    }
}
