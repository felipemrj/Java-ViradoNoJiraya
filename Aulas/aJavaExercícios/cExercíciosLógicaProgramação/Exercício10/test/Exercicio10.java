package aJavaExercícios.cExercíciosLógicaProgramação.Exercício10.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício10.domain.CalculadoraMedia;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite as três notas: ");
        n1 = read.nextDouble();
        n2 = read.nextDouble();
        n3 = read.nextDouble();

        CalculadoraMedia.calculaMedia(n1, n2, n3);
    }
}
