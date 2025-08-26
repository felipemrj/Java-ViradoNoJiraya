package aJavaExercícios.cExercíciosLógicaProgramação.Exercício06.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício06.domain.Reajuste;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor: ");
        valor = read.nextDouble();

        System.out.println("Valor reajustado: " + Reajuste.reajuste(valor));

    }
}
