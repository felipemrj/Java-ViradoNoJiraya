package Java00Exercícios.ExerciciosIntroducao.Basicos;

/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double radius, area;

        System.out.println("Circle radius: ");
        radius = read.nextDouble();

        area = 3.14159 * (radius * 2);
        System.out.printf("Circle area: %.4f", area);
    }
}
