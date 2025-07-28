package cJavaOrientaçãoObjetos.Aula14Construtores.test;

import cJavaOrientaçãoObjetos.Aula14Construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
