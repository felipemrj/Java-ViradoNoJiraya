package Java00Exercícios.ExercíciosIntrodução.bCondicional;

/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valueToCheck;

        System.out.println("Value: ");
        valueToCheck = read.nextDouble();

        if (valueToCheck >= 0 && valueToCheck <= 25) {
            System.out.println("Interval [0, 25]");
        } else if (valueToCheck > 25 && valueToCheck <= 50) {
            System.out.println("Interval [25, 50]");
        } else if (valueToCheck > 50 && valueToCheck <= 75) {
            System.out.println("Interval [50, 75]");
        } else if (valueToCheck > 75 && valueToCheck <= 100) {
            System.out.println("Interval [75, 100]");
        } else {
            System.out.println("Out of Interval");
        }

    }
}
