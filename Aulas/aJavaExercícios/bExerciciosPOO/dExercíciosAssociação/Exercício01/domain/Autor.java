package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.domain;

public class Autor {
    private String nome;
    private String nacionalidade;
    private Livro[] livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome, String nacionalidade, Livro[] livros) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = livros;
    }

    public void imprime() {
        System.out.println("Autor: ");
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade:" + nacionalidade);
        System.out.println("Livros publicados:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
