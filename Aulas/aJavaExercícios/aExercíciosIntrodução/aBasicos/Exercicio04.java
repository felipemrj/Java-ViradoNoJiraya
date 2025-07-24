package aJavaExercícios.aExercíciosIntrodução.aBasicos;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int employeeId, hoursWorked;
        double hourlyWage, totalWage;

        System.out.println("ID: ");
        employeeId = read.nextInt();
        System.out.println("Worked hours: ");
        hoursWorked = read.nextInt();
        System.out.println("Hourly wage: ");
        hourlyWage = read.nextDouble();

        totalWage = hoursWorked * hourlyWage;

        System.out.printf("Employee %d wage: %.2f U$", employeeId, totalWage);
    }
}
