package Java00Exercícios.ExercíciosIntrodução.cRepeticao;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x = 1, y = 1;

        while (x != 0 && y != 0) {
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
            }
        }
    }
}


