package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício02.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Curso[] cursos;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Curso[] cursos) {
        this.nome = nome;
        this.idade = idade;
        this.cursos = cursos;
    }

    public void imprime() {
        System.out.println("Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
}
