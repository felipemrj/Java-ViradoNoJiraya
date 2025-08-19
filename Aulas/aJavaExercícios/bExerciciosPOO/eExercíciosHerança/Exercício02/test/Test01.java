package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício02.domain.Carro;
import aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício02.domain.Moto;

public class Test01 {
    public static void main(String[] args) {
        Carro c = new Carro("Audi", "TT", "60");
        c.imprime();

        Moto m = new Moto("Honda", "CG160", "200");
        m.imprime();
    }
}
