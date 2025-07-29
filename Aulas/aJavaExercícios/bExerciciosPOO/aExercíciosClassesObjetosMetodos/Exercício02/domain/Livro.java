package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício02.domain;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public void imprimirResumo() {
        if (titulo.isEmpty()) {
            System.out.println("Livro inválido");
            return;
        }
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anoPublicacao);
    }
}
