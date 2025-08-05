package cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println();
        System.out.println("PROFESSOR: ");
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (seminarios == null) return;
        System.out.println("Seminários: ");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
}
