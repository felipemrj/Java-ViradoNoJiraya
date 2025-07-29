package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício19.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício19.domain.Computador;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício19.domain.ImprimeComputador;

public class ComputadorTest01 {
    public static void main(String[] args) {
        Computador computadorUm = new Computador();
        Computador computadorDois = new Computador();
        ImprimeComputador impressora = new ImprimeComputador();

        computadorUm.modelo = "Macbook";
        computadorUm.marca = "Apple";
        computadorUm.ano = 2019;

        computadorDois.modelo = "Macbook";
        computadorDois.marca = "Apple";
        computadorDois.ano = 2019;

        impressora.exibeComputador(computadorUm);
        impressora.exibeComputador(computadorDois);


        // Apesar de terem os mesmos dados, estão localizados em espaços diferentes na memória, e o comparador nesse caso está comparando
        // a localização da variável de referência
        if (computadorUm == computadorDois) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
