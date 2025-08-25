package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.domain.Animal;
import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.domain.Cachorro;
import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.domain.Gato;

public class AnimalTest {
    public static void main(String[] args) {
        Animal gato = new Gato("Garfield");
        Animal cachorro = new Cachorro("Rex");

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
