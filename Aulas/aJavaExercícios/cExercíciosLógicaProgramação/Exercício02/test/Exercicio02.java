package aJavaExercícios.cExercíciosLógicaProgramação.Exercício02.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício02.domain.ParImpar;
import aJavaExercícios.cExercíciosLógicaProgramação.Exercício02.domain.PositivoNegativo;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num = read.nextInt();

        System.out.println("O número " + num + " é " + ParImpar.parOuImpar(num) + " e " + PositivoNegativo.positivoOuNegativo(num) + ".");

    }
}
