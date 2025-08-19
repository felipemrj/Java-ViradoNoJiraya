package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício01.domain;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au au!");
    }
}
