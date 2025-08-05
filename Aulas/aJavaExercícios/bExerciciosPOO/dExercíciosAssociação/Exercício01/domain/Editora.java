package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício01.domain;

public class Editora {
    private String nome;
    private String endereco;
    private Livro[] livros;

    public Editora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Editora(String nome, String endereco, Livro[] livros) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = livros;
    }

    public void imprime() {
        System.out.println("Editora: ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
