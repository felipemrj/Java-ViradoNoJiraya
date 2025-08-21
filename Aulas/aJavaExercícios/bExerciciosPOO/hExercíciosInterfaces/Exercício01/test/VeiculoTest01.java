package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício01.domain.Carro;
import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício01.domain.Motocicleta;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Carro c = new Carro();
        Motocicleta m = new Motocicleta();

        c.ligar();
        c.desligar();
        m.ligar();
        m.desligar();
    }
}
