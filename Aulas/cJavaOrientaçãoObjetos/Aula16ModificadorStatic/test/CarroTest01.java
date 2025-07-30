package cJavaOrientaçãoObjetos.Aula16ModificadorStatic.test;

import cJavaOrientaçãoObjetos.Aula16ModificadorStatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carroUm = new Carro("BMW", 280);
        Carro carroDois = new Carro("AUDI", 300);
        Carro carroTres = new Carro("Porsche", 320);

        Carro.velocidadeLimite = 200;

        carroUm.imprime();
        carroDois.imprime();
        carroTres.imprime();
    }
}
