package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício05.domain;
/*
Crie uma classe chamada Aluno com os atributos privados nome (String), matricula (String) e nota (double).
Implemente os métodos getters e setters e construtores. Implemente um método chamado verificarAprovacao()
que retorna se o aluno está aprovado (nota >= 7). Sobrecargue esse método para permitir definir o valor mínimo de aprovação.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private int nota;

    public Aluno(String nome, String matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void verificarAprovacao() {
        if (nota < 7) {
            System.out.println("Reprovado");
            return;
        }
        System.out.println("Aprovado");
    }

    public void verificarAprovacao(int notaMinima) {
        if (nota < notaMinima) {
            System.out.println("Reprovado");
            return;
        }
        System.out.println("Aprovado");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return this.nota;
    }


}
