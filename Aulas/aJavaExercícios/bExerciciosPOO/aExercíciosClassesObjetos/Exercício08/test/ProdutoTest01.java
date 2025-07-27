package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício08.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício08.domain.ImprimeProduto;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício08.domain.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produtoUm = new Produto();
        Produto produtoDois = new Produto();
        Produto produtoTres = new Produto();
        ImprimeProduto impressora = new ImprimeProduto();

        produtoUm.nome = "Chinelo";
        produtoUm.preco = 45.50;
        produtoUm.quantidade = 20;

        produtoDois.nome = "Colher";
        produtoDois.preco = 15.50;
        produtoDois.quantidade = 50;

        produtoTres.nome = "Bola";
        produtoTres.preco = 99.99;
        produtoTres.quantidade = 10;

        impressora.exibirProduto(produtoUm);
        System.out.println("-------------");
        impressora.exibirProduto(produtoDois);
        System.out.println("-------------");
        impressora.exibirProduto(produtoTres);




    }


}
