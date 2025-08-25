package cJavaOrientaçãoObjetos.Aula24Polimorfismo.test;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Computador;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Tomate;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Windows", 2500);
        Tomate tomate = new Tomate("Cereja", 5);


        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
