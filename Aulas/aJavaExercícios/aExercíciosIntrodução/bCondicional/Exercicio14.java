package aJavaExercícios.aExercíciosIntrodução.bCondicional;

/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

de 0 a 2000 Isento
de 2000.01 a 3000 8%
de 3000.01 a 4500 18%
acima de 4500 28% */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double wage, tax;
        System.out.println("Wage: ");
        wage = read.nextDouble();

        if (wage >= 0 && wage <= 2000) {
            System.out.println("Isento");
        } else if (wage > 2000 && wage <= 3000) {
            tax = wage * 0.08;
            System.out.printf("%.2f R$", tax);
        } else if (wage > 3000 && wage <= 4500) {
            tax = wage * 0.18;
            System.out.printf("%.2f R$", tax);
        } else {
            tax = wage * 0.28;
            System.out.printf("%.2f R$", tax);
        }



    }
}
