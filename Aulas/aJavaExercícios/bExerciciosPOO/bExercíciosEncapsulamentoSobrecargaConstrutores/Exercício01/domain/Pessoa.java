package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício01.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimePessoa(boolean mostrarIdade) {
        if (mostrarIdade) {
            imprimePessoa();
            return;
        }
        System.out.println(nome);
    }

    public void imprimePessoa() {
        System.out.println(nome);
        System.out.println(idade);
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
}
