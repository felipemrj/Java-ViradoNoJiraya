package aJavaExercícios.cExercíciosLógicaProgramação.Exercício05.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício05.domain.CalculadoraSalario;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double valorSalario, salariosMinimos;

        System.out.println("Digite o valor do seu salário: ");
        valorSalario = read.nextDouble();

        salariosMinimos = CalculadoraSalario.calcularSalarios(valorSalario);

        System.out.println("Você recebe um total de " + salariosMinimos + " salários mínimos.");


    }
}
