package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício02.domain.Circulo;
import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício02.domain.Retangulo;

public class FormaTest01 {
    public static void main(String[] args) {
        Circulo c = new Circulo(4);
        Retangulo r = new Retangulo(2, 7);

        System.out.println(c.calcularArea());
        System.out.println(r.calcularArea());
    }
}
