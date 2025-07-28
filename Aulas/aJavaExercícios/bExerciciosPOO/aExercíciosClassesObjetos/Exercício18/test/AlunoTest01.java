package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício18.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício18.domain.Aluno;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int quantidadeAlunos = 5;
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i] = new Aluno();
            System.out.println("Digite o nome do aluno: ");
            alunos[i].nome = read.nextLine();
            System.out.println("Digite a nota do aluno: ");
            alunos[i].nota = read.nextInt();
            read.nextLine();
        }

        System.out.println(Aluno.mediaNotas(alunos[0].nota, alunos[1].nota, alunos[2].nota, alunos[3].nota, alunos[4].nota));
    }
}
