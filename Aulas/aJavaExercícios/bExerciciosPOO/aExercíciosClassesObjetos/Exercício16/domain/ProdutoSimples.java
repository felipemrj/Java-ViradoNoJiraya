package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício16.domain;

public class ProdutoSimples {
    public String nome;
    public double preco;

    public void aplicarDescontoSePrecoAlto(double limite, double desconto) {
        if (preco < limite) {
            return;
        }
        double valorDesconto = preco * (desconto / 100);
        double precoComDesconto = preco - valorDesconto;

        System.out.printf("O valor do produto com desconto de %.0f%% é %.2f\n", desconto, precoComDesconto);
    }
}
