package aJavaExercícios.cExercíciosLógicaProgramação.Exercício12.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício12.domain.FormaPagamento;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double valor;
        int opcao;

        System.out.println("Digite o valor da compra: ");
        valor = read.nextDouble();

        System.out.println("Forma de pagamento: ");
        System.out.println("1. À vista em dinheiro ou pix");
        System.out.println("2. À vista no cartão de crédito");
        System.out.println("3. Parcelado no cartão em duas vezes");
        System.out.println("4. Parcelado no cartão em três vezes ou mais");
        System.out.println("Escolha 1, 2, 3 ou 4");
        opcao = read.nextInt();

        FormaPagamento.selecionarForma(opcao, valor);
    }
}
