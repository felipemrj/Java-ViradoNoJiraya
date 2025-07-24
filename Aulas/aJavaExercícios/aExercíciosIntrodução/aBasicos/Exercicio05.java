package aJavaExercícios.aExercíciosIntrodução.aBasicos;

/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idProductOne, idProductTwo, productOneAmount, productTwoAmount;
        double productOnePrice, productTwoPrice, totalPrice;

        System.out.println("ID 1: ");
        idProductOne = read.nextInt();
        System.out.println("Amount: ");
        productOneAmount = read.nextInt();
        System.out.println("Price: ");
        productOnePrice = read.nextDouble();

        System.out.println("ID 2: ");
        idProductTwo = read.nextInt();
        System.out.println("Amount: ");
        productTwoAmount = read.nextInt();
        System.out.println("Price: ");
        productTwoPrice = read.nextDouble();

        totalPrice = (productOneAmount * productOnePrice) + (productTwoAmount * productTwoPrice);
        System.out.printf("Total: %.2f U$", totalPrice);

    }
}
