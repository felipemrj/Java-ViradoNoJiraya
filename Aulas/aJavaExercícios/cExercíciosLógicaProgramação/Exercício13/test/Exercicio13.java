package aJavaExercícios.cExercíciosLógicaProgramação.Exercício13.test;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = read.nextLine();

        System.out.println("Digite sua idade: ");
        idade = read.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}
