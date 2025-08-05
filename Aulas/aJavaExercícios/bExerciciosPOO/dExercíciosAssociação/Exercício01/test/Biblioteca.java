package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.test;

import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.domain.Autor;
import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.domain.Editora;
import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.domain.Livro;

public class Biblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Jorge", "Brasileiro");

        Editora editora1 = new Editora("Editora1", "Rua 1");

        Livro livro1 = new Livro("Harry Potter", "Ficção", autor1, editora1);
        Livro livro2 = new Livro("Naruto", "Ficção", autor1, editora1);
        Livro livro3 = new Livro("One Piece", "Ficção", autor1, editora1);

        autor1.setLivros(new Livro[]{livro1,livro2, livro3});
        editora1.setLivros(new Livro[]{livro1, livro2, livro3});

        autor1.imprime();
        System.out.println("---");
        editora1.imprime();
        System.out.println("---");
        livro1.imprime();
        System.out.println("---");
        livro2.imprime();
        System.out.println("---");
        livro3.imprime();
        System.out.println("---");


    }
}
