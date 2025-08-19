package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício01.domain.Cachorro;
import aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício01.domain.Gato;

public class Test01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 12);
        cachorro.emitirSom();

        Gato gato = new Gato("Garfield", 8);
        gato.emitirSom();
    }
}
