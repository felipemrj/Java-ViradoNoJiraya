package aJavaExercícios.cExercíciosLógicaProgramação.Exercício09.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício09.domain.IndiceMassaCorporal;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double peso, altura;

        System.out.println("Digite o seu peso: ");
        peso = read.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = read.nextDouble();

        IndiceMassaCorporal.calculaImc(peso, altura);
    }
}
