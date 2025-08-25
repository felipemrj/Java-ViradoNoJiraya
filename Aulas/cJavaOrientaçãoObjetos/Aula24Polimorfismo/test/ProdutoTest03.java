package cJavaOrientaçãoObjetos.Aula24Polimorfismo.test;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Computador;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Produto;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Tomate;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 20000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----");
        CalculadoraImposto.calcularImposto(produto);

    }
}
