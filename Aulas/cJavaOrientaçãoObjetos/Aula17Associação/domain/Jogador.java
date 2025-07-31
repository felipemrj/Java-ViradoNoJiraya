package cJavaOrientaçãoObjetos.Aula17Associação.domain;

public class Jogador {
    private String nome;

    public void imprime() {
        System.out.println(this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
