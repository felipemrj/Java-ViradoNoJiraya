package aJavaExercícios.cExercíciosLógicaProgramação.Exercício24.test;

import aJavaExercícios.cExercíciosLógicaProgramação.Exercício24.domain.CalculadoraViagem;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double tempoViajado, velocidadeMedia, distanciaPercorrida, combustivelGasto;

        System.out.println("Digite o tempo viajado: ");
        tempoViajado = read.nextDouble();

        System.out.println("Digite a velocidade média: ");
        velocidadeMedia = read.nextDouble();

        distanciaPercorrida = CalculadoraViagem.calcularDistanciaPercorrida(tempoViajado, velocidadeMedia);

        combustivelGasto = CalculadoraViagem.calcularCombustivelGasto(distanciaPercorrida);

        System.out.printf("A viagem teve uma distância total de %.2f KM e foram gastos %.2f L de combustível", distanciaPercorrida, combustivelGasto);
    }
}
