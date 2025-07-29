package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício17.domain;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public static boolean mesmoLivro (Livro l1, Livro l2) {
        if (l1.titulo.equals(l2.titulo) && l1.autor.equals(l2.autor)) {
            return true;
        }
        return false;
    }
}
