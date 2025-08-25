package cJavaOrientaçãoObjetos.Aula24Polimorfismo.service;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Produto;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
