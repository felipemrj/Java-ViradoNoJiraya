package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício12.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício12.domain.Computador;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício12.domain.ImprimeComputador;

public class ComputadorTest01 {
    public static void main(String[] args) {
        Computador computadorUm = new Computador();
        Computador computadorDois = new Computador();
        ImprimeComputador impressora = new ImprimeComputador();

        computadorUm.modelo = "Macbook";
        computadorUm.marca = "Apple";
        computadorUm.ano = 2019;

        computadorDois.modelo = "GalaxyBook";
        computadorDois.marca = "Samsung";
        computadorDois.ano = 2024;

        impressora.exibeComputador(computadorUm);
        impressora.exibeComputador(computadorDois);

        if (computadorUm.estaAtualizado(2025)) {
            System.out.println("Está atualizado");
        } else {
            System.out.println("Está desatualizado");
        }

        if (computadorDois.estaAtualizado(2025)) {
            System.out.println("Está atualizado");
        } else {
            System.out.println("Está desatualizado");
        }

    }
}
