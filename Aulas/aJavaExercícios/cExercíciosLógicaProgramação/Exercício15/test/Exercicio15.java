package aJavaExercícios.cExercíciosLógicaProgramação.Exercício15.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício15.domain.CalculadoraTempoDeVida;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int anoNascimento, opcao;
        boolean fezAniversario = true;

        System.out.println("Em que ano nasceu? ");
        anoNascimento = read.nextInt();

        System.out.println("Já fez aniversário esse ano? ");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        opcao = read.nextInt();

        if (opcao == 2) {
            fezAniversario = false;
        }

        CalculadoraTempoDeVida.calculaTempoDeVida(anoNascimento, fezAniversario);



    }
}
