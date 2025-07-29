package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício08.domain;

public class ImprimeProduto {
    public void exibirProduto(Produto produto) {
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.quantidade);
        System.out.println(produto.valorTotal());
    }
}
