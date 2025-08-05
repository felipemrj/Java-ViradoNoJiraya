package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.domain;

public class Livro {
    private String titulo;
    private String genero;
    private Autor autor;
    private Editora editora;

    public Livro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Livro(String titulo, String genero, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
    }

    public void imprime() {
        System.out.println("Livro: ");
        System.out.println("Título: " + titulo);
        System.out.println("Gênero" + genero);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Editora: "+editora.getNome());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
