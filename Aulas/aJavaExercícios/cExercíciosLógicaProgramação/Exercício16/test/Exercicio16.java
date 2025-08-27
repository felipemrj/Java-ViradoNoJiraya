package aJavaExercícios.cExercíciosLógicaProgramação.Exercício16.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício16.domain.ClassificaTriangulo;
import aJavaExercícios.cExercíciosLógicaProgramação.Exercício16.domain.ValidaTriangulo;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double ladoA, ladoB, ladoC;

        System.out.println("Digite o valor dos três lados do triângulo: ");
        ladoA = read.nextDouble();
        ladoB = read.nextDouble();
        ladoC = read.nextDouble();

        System.out.println(ClassificaTriangulo.classificarTriangulo(ladoA, ladoB, ladoC));
    }
}
