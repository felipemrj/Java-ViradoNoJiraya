package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício03.domain;

public class Suco {
    private String sabor;
    private Tamanho tamanho;

    public Suco(String sabor, Tamanho tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public void imprime() {
        System.out.printf("Sabor: %s Tamanho: %s\n", sabor, tamanho.getDescricao());
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
}
