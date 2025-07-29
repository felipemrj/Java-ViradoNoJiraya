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

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return this.nome;
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private String getMatricula() {
        return this.matricula;
    }


}
