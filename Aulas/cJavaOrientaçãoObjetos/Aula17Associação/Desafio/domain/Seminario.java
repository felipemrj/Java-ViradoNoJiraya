package cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
        for (Aluno aluno : alunos) {
            if (aluno.getSeminario() == null) {
                aluno.setSeminario(this);
            }
        }
    }

    public void imprime() {
        System.out.println();
        System.out.println("SEMINÁRIO: ");
        System.out.println("Título: " + titulo);
        System.out.println("Local: " + local.getEndereco());
        if (alunos == null) return;
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            if (aluno.getSeminario() == this) {
                System.out.println(aluno.getNome());
            }
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
