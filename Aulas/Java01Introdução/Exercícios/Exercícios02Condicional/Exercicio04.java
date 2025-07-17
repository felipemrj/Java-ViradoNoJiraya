package Java01Introdução.Exercícios.Exercícios02Condicional;
/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int gameStartTime, gameEndTime, totalGameTime;

        System.out.println("Start: ");
        gameStartTime = read.nextInt();
        System.out.println("End: ");
        gameEndTime = read.nextInt();

        if (gameStartTime > gameEndTime) {
            totalGameTime = 24 - gameStartTime + gameEndTime;
        } else if (gameStartTime < gameEndTime) {
            totalGameTime = gameEndTime - gameStartTime;
        } else {
            totalGameTime = 0;
        }

        if (totalGameTime > 24 || totalGameTime <= 0) {
            System.out.println("Invalid game time");
        } else {
            System.out.printf("Total game time: %d", totalGameTime);
        }

    }
}
