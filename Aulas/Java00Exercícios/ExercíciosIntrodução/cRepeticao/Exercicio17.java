package Java00Exercícios.ExercíciosIntrodução.cRepeticao;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int fuelSupplied, totalEthanol = 0, totalGasoline = 0, totalDiesel = 0;

        while (true) {
            System.out.println("Choose the supplied fuel: ");
            System.out.println("1. Ethanol");
            System.out.println("2. Gasoline");
            System.out.println("3. Diesel");
            System.out.println("4. Exit");
            fuelSupplied = read.nextInt();

            if (fuelSupplied < 1 || fuelSupplied > 4) {
                System.out.println("Invalid input");
                continue;
            }

            switch (fuelSupplied) {
                case 1:
                    totalEthanol++;
                    break;
                case 2:
                    totalGasoline++;
                    break;
                case 3:
                    totalDiesel++;
                    break;
                default:
                    System.out.println("Thanks!");
                    break;
            }
            System.out.println();

            if (fuelSupplied == 4) {
                break;
            }
        }
        System.out.println("Total: ");
        System.out.println("Ethanol: " + totalEthanol);
        System.out.println("Gasoline: " + totalGasoline);
        System.out.println("Diesel: " + totalDiesel);
        System.out.println();
    }
}

