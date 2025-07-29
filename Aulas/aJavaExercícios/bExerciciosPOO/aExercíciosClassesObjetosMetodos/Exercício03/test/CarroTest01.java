package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício03.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carroUm = new Carro();
        Carro carroDois = new Carro();

        carroUm.modelo = "Audi";
        carroUm.ano = 1994;

        carroDois.modelo = "Ferrari";
        carroDois.ano = 2009;

        System.out.println(carroUm.modelo);
        System.out.println(carroUm.ano);

        if (carroUm.atualizarAno(1994)) {
            System.out.println("Ano atualizado com sucesso");
        } else {
            System.out.println("Ano inválido");
        }

        /* Ao atribuirmos carroUm a carroDois, não estamos atribuindo seus valores ao carroDois, e sim o mesmo local
        de referência na memória, portanto quando alteramos os valores de carroDois, os valores de carroUm também são alterados */
    }
}
