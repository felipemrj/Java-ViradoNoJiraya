package cJavaOrientaçãoObjetos.Aula15BlocosInicialização.test;

import cJavaOrientaçãoObjetos.Aula15BlocosInicialização.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime animeUm = new Anime("One Piece");

        for (int episodio : animeUm.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
