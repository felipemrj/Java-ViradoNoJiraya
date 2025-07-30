package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício06.test;

import aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício06.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();

        System.out.println(Jogador.getQuantidadeJogadores());
    }
}
