package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain;

import java.sql.SQLOutput;

public class Hotel {
    private String nome;
    private String cidade;
    private Quarto[] quartos;

    public Hotel(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void imprime() {
        System.out.println("HOTEL");
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Quartos: ");
        for (Quarto quarto : quartos) {
            System.out.println("Tipo: " + quarto.getTipo() + " Nº: " + quarto.getNumero());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public Quarto[] getQuartos() {
        return quartos;
    }

    public void setQuartos(Quarto[] quartos) {
        this.quartos = quartos;
    }
}
