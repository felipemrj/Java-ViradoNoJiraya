package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício01.domain.Cachorro;
import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício01.domain.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex", 8);
        Gato g = new Gato("Garfield", 5);

        c.emitirSom();
        g.emitirSom();
    }
}
