package aJavaExercícios.cExercíciosLógicaProgramação.Exercício11.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício11.domain.CalculadoraMedia;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nomeAluno;
        double n1, n2, n3, n4, media;

        System.out.println("Digite o seu nome: ");
        nomeAluno = read.nextLine();

        System.out.println("Digite as quatro notas: ");
        n1 = read.nextDouble();
        n2 = read.nextDouble();
        n3 = read.nextDouble();
        n4 = read.nextDouble();

        media = CalculadoraMedia.calculaMedia(n1, n2, n3, n4);

        if (media >= 7) {
            System.out.println(nomeAluno + " aprovado com média " + media);
        } else {
            System.out.println(nomeAluno + " reprovado com média " + media);
        }
    }
}
