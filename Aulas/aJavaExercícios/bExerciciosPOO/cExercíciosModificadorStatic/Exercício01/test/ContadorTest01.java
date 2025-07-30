package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício01.domain.Contador;

public class ContadorTest01 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        Contador c5 = new Contador();

        System.out.println(Contador.getTotalContadores());
        System.out.println(c3.getTotalContadores());
    }
}
