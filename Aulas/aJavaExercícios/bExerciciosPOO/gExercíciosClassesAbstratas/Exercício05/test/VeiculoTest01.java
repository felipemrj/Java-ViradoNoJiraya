package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício05.test;

import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício05.domain.Carro;
import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício05.domain.Moto;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Carro c = new Carro("Audi", "TT", 86);
        Moto m = new Moto("Honda", "CG160", 30);

        c.abastecer(200);
        m.abastecer(20);

        System.out.println(c);
        System.out.println(m);
    }
}
