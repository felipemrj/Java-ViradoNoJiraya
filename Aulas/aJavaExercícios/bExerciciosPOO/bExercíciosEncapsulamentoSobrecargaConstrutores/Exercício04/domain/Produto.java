package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício04.domain;

public class Produto {
    private String nome;
    private int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        double valorDesconto = preco * (percentual / 100);
        System.out.printf("Preço com desconto de %.2f%%: %.2f\n", percentual, preco - valorDesconto);
    }

    public void aplicarDesconto(double valor, boolean isValorFixo) {
        if (isValorFixo) {
            System.out.printf("Preço com desconto de %.2fR$: %.2f\n", valor, preco - valor);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return this.preco;
    }


}
