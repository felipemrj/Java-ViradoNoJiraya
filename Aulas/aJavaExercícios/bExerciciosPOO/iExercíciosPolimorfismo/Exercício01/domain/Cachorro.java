package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.domain;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau!");
    }
}
