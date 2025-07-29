package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício05.test;

import aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício05.domain.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno("Felipe", "123", 8);
        Aluno alunoDois = new Aluno("Thamyres", "321", 9);

        alunoUm.verificarAprovacao(9);
        alunoDois.verificarAprovacao();
    }
}
