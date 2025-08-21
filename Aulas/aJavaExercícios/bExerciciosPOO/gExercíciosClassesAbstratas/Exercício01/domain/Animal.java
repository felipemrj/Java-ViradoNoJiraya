package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício01.domain;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}
