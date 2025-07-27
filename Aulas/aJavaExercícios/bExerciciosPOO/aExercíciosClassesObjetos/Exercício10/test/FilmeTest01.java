package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício10.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício10.domain.Filme;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício10.domain.ImprimeFilme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        Filme filmeDois = new Filme();
        ImprimeFilme impressora = new ImprimeFilme();

        filmeUm.titulo = "Velozes e Furiosos";
        filmeUm.diretor = "Paul Walker";
        filmeUm.ano = 2005;

        filmeDois.titulo = "Mr Nobody";
        filmeDois.diretor = "Jared Leto";
        filmeDois.ano = 2013;

        impressora.exibeFilme(filmeUm);
        System.out.println("----------");
        impressora.exibeFilme(filmeDois);

        filmeUm.compararAno(filmeDois);
    }
}
