package aJavaExercícios.cExercíciosLógicaProgramação.Exercício17.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício17.domain.ConversorTemperatura;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = read.nextDouble();

        celsius = ConversorTemperatura.converteFahrenheitParaCelsius(fahrenheit);

        System.out.printf("F: %.2f | C: %.2f", fahrenheit, celsius);
    }
}
