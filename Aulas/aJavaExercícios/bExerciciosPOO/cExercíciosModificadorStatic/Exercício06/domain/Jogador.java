package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício06.domain;

public class Jogador {
    private static int quantidadeJogadores = 11;

    public static int getQuantidadeJogadores() {
        return Jogador.quantidadeJogadores;
    }
}
