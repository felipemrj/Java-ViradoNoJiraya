package aJavaExercícios.aExercíciosIntrodução.aBasicos;

/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
aJavaExercícios.bExerciciosPOO.b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a, b, c, triangle, circle, trapeze, square, rectangle;

        System.out.println("A: ");
        a = read.nextDouble();
        System.out.println("B: ");
        b = read.nextDouble();
        System.out.println("C: ");
        c = read.nextDouble();

        triangle = a * c / 2.0;
        circle = 3.14159 * c * c;
        trapeze = (a + b) / 2.0 * c;
        square = b * b;
        rectangle = a * b;

        System.out.printf("Triangle: %.3f\n", triangle);
        System.out.printf("Circle: %.3f\n", circle);
        System.out.printf("Trapeze: %.3f\n", trapeze);
        System.out.printf("Square: %.3f\n", square);
        System.out.printf("Rectangle: %.3f\n", rectangle);

    }
}
