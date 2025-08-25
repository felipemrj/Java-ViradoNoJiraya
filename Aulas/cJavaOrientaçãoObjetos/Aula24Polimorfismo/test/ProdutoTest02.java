package cJavaOrientaçãoObjetos.Aula24Polimorfismo.test;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Computador;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Produto;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 20000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
