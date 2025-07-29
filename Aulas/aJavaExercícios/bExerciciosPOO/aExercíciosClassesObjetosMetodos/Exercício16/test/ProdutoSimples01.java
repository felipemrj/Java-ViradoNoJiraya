package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício16.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício16.domain.Desconto;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício16.domain.ProdutoSimples;

public class ProdutoSimples01 {
    public static void main(String[] args) {
        ProdutoSimples produtoUm = new ProdutoSimples();
        ProdutoSimples produtoDois = new ProdutoSimples();
        ProdutoSimples produtoTres = new ProdutoSimples();
        Desconto desconto = new Desconto();

        produtoUm.nome = "Teclado";
        produtoUm.preco = 500;

        produtoDois.nome = "Mouse";
        produtoDois.preco = 290;

        produtoTres.nome = "Fone";
        produtoTres.preco = 199;

        desconto.aplicaDesconto(produtoUm, 10);
        desconto.aplicaDesconto(produtoDois, 10);
        desconto.aplicaDesconto(produtoTres, 10);

        produtoUm.aplicarDescontoSePrecoAlto(200, 10);
        produtoDois.aplicarDescontoSePrecoAlto(200, 10);
        produtoTres.aplicarDescontoSePrecoAlto(200, 10);

    }
}
