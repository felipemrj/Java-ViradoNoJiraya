package cJavaOrientaçãoObjetos.Aula13SobrecargaDeMétodos.test;

import cJavaOrientaçãoObjetos.Aula13SobrecargaDeMétodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        // CTRL + P para exibir parâmetros necessários
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
