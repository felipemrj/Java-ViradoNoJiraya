package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício02.domain;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private Aluno[] alunos;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(String nome, int cargaHoraria, Aluno[] alunos) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Curso:");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
