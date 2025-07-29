package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício16.domain;

public class Desconto {
    public void aplicaDesconto(ProdutoSimples produto, double desconto) {
        double valorDesconto = produto.preco * (desconto / 100);
        double precoComDesconto = produto.preco - valorDesconto;

        System.out.printf("O valor do produto com desconto de %.0f%% é %.2f\n", desconto, precoComDesconto);
    }


}
