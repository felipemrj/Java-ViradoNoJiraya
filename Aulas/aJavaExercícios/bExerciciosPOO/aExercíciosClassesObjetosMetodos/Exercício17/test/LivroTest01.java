package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício17.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício17.domain.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livroUm = new Livro();
        Livro livroDois = new Livro();
        Livro livroTres = new Livro();
        Livro livroQuatro = new Livro();

        livroUm.titulo = "Siddharta";
        livroUm.autor = "Herman Hesse";
        livroUm.anoPublicacao = 1946;

        livroDois.titulo = "Harry Potter";
        livroDois.autor = "J.K. Rowling";
        livroDois.anoPublicacao = 1998;

        livroTres.titulo = "Clean Code";
        livroTres.autor = "Robert Cecil Martin";
        livroTres.anoPublicacao = 2008;

        System.out.println(livroUm.titulo);
        System.out.println(livroUm.autor);
        System.out.println(livroUm.anoPublicacao);
        System.out.println("---------------");
        System.out.println(livroDois.titulo);
        System.out.println(livroDois.autor);
        System.out.println(livroDois.anoPublicacao);
        System.out.println("---------------");
        System.out.println(livroTres.titulo);
        System.out.println(livroTres.autor);
        System.out.println(livroTres.anoPublicacao);
        System.out.println();

        livroQuatro = livroTres;

        if (livroQuatro == livroTres) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();
    }
}
