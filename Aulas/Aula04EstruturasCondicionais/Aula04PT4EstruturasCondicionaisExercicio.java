package Aula04EstruturasCondicionais;

import java.util.Scanner;
public class Aula04PT4EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double yearlyWage, tax;
        System.out.println("Type your yearly wage: ");
        yearlyWage = read.nextDouble();

        if (yearlyWage > 0 && yearlyWage <= 34712) {
            tax = yearlyWage * 0.097;
        } else if (yearlyWage > 34712 && yearlyWage <= 68507) {
            tax = yearlyWage * 0.3735;
        } else {
            tax = yearlyWage * 0.4950;
        }

        System.out.printf("Tax: %.2f", tax);


    }
}
