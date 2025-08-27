package aJavaExercícios.cExercíciosLógicaProgramação.Exercício22.test;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a, b, quociente, resto;

        System.out.println("Digite o dividendo: ");
        a = read.nextInt();

        System.out.println("Digite o divisor: ");
        b = read.nextInt();

        quociente = a / b;
        resto = a % b;

        System.out.printf("Quociente: %d | Resto: %d", quociente, resto);
    }
}
