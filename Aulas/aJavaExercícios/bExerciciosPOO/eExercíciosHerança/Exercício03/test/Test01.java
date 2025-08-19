package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício03.domain.Guerreiro;
import aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício03.domain.Mago;

public class Test01 {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro(300, 100, "Espada");
        g.imprime();

        Mago m = new Mago(100, 300, "Fogo");
        m.imprime();
    }
}
