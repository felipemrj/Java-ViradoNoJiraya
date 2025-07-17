package Java01Introdução.Exercícios.Exercícios02Condicional;
/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Q1 X > 0  && Y > 0
        // Q2 X < 0 && Y > 0
        // Q3 X < 0 && Y < 0
        // Q4 X > 0 && Y < 0
        // ORIGEM X = 0 && Y == 0
        // EIXO X: (X > 0 || X < 0) && Y == 0
        // EIXO Y: (Y > 0 || Y < 0) && X == 0

        double x, y;

        System.out.println("X: ");
        x = read.nextDouble();
        System.out.println("Y: ");
        y = read.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if ((x > 0 || x < 0) && y == 0) {
            System.out.println("Eixo X");
        } else if ((y > 0 || y < 0) && x == 0) {
            System.out.println("Eixo Y");
        }
    }
}
