package cJavaOrientaçãoObjetos.Aula24Polimorfismo.service;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());
    }
}
