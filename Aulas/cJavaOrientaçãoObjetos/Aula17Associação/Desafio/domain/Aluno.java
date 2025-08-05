package cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println();
        System.out.println("ALUNO: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (seminario == null) return;
        System.out.println("Seminário: "+ seminario.getTitulo());

    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return this.seminario;
    }
}
