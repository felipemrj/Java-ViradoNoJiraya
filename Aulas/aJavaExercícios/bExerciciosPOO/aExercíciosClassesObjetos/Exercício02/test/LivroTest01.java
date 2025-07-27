package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício02.domain.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livroUm = new Livro();
        Livro livroDois = new Livro();
        Livro livroTres = new Livro();

        livroUm.titulo = "";
        livroUm.autor = "Herman Hesse";
        livroUm.anoPublicacao = 1946;

        livroDois.titulo = "Harry Potter";
        livroDois.autor = "J.K. Rowling";
        livroDois.anoPublicacao = 1998;

        livroTres.titulo = "Clean Code";
        livroTres.autor = "Robert Cecil Martin";
        livroTres.anoPublicacao = 2008;

        livroUm.imprimirResumo();
        System.out.println("---------------");
        livroDois.imprimirResumo();
        System.out.println("---------------");
        livroTres.imprimirResumo();

    }
}
