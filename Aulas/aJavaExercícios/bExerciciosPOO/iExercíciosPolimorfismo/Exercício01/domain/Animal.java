package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.domain;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }
}
