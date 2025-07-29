package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício02.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carroUm = new Carro("Audi", "TT");
        Carro carroDois = new Carro("Ferrari", "Super", 2025);

        carroUm.acelerar();
        carroDois.acelerar(200);
    }
}
