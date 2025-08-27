package aJavaExercícios.cExercíciosLógicaProgramação.Exercício23.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício23.domain.CalculadoraSalario;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double valorAula, descontoInss, descontoInssPorCento, salarioBruto, salarioLiquido;
        int aulasLecionadas;

        System.out.println("Digite o valor da aula: ");
        valorAula = read.nextDouble();

        System.out.println("Digite a quantidade de aulas lecionadas: ");
        aulasLecionadas = read.nextInt();

        System.out.println("Digite o valor do desconto do INSS: ");
        descontoInss = read.nextDouble();

        descontoInssPorCento = descontoInss / 100;

        salarioBruto = CalculadoraSalario.calcularSalarioBruto(valorAula, aulasLecionadas);
        salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(salarioBruto, descontoInssPorCento);

        System.out.printf("Salário Líquido: %.2f R$", salarioLiquido);
    }
}
