package Java01Introdução.Exercícios.Exercícios02Condicional;
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

| CÓDIGO |      ESPECIFICAÇÃO     |  PREÇO   |
|--------|------------------------|----------|
|   1    | Cachorro Quente        | R$ 4.00  |
|   2    | X-Salada               | R$ 4.50  |
|   3    | X-Bacon                | R$ 5.00  |
|  45    | Torrada simples        | R$ 2.00  |
|   5    | Refrigerante           | R$ 1.50  |

 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int productId, productQuantity;
        double productPrice = 0, totalPrice;
        String productName = "";
        boolean isValid = true;

        System.out.println("Product ID: ");
        productId = read.nextInt();
        System.out.println("Quantity: ");
        productQuantity = read.nextInt();

        switch (productId) {
            case 1:
                productName = "Cachorro Quente";
                productPrice = 4;
                break;
            case 2:
                productName = "X-Salada";
                productPrice = 4.5;
                break;
            case 3:
                productName = "X-Bacon";
                productPrice = 5;
                break;
            case 4:
                productName = "Torrada Simples";
                productPrice = 2;
                break;
            case 5:
                productName = "Refrigerante";
                productPrice = 1.5;
                break;
            default:
                isValid = false;
                break;
        }

        totalPrice = productPrice * productQuantity;

        if (isValid) {
            System.out.println("Conta:");
            if (productQuantity > 1) {
                System.out.printf("Consumido: %d %ss\n", productQuantity, productName);
            } else {
                System.out.printf("Consumido: %d %s\n", productQuantity, productName);
            }
            System.out.printf("Valor: %.2f", totalPrice);
        }
    }
}
