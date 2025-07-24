package aJavaExercícios.aExercíciosIntrodução.cRepeticao;

/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password = 0, correctPassword = 2002;

        while (password != correctPassword) {
            System.out.println("Password: ");
            password = read.nextInt();
            if (password != correctPassword) {
                System.out.println("Invalid password");
            }
        }
        System.out.println("Acess granted");

    }
}
