package aJavaExercícios.cExercíciosLógicaProgramação.Exercício19.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício19.domain.CalculadoraTabuada;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int valor;

        System.out.println("Digite o número que deseja calcular a tabuada: ");
        valor = read.nextInt();

        CalculadoraTabuada.calculaTabuada(valor);
    }
}
