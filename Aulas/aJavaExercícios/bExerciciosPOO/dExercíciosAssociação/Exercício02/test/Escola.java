package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício02.domain.Aluno;
import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício02.domain.Curso;

public class Escola {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso1", 240);
        Curso curso2 = new Curso("Curso2", 240);
        Curso curso3 = new Curso("Curso3", 240);

        Aluno aluno1 = new Aluno("Aluno1", 18);
        Aluno aluno2 = new Aluno("Aluno2", 18);
        Aluno aluno3 = new Aluno("Aluno3", 18);

        aluno1.setCursos(new Curso[]{curso1, curso2, curso3});
        aluno2.setCursos(new Curso[]{curso1, curso2, curso3});
        aluno3.setCursos(new Curso[]{curso1, curso2, curso3});

        curso1.setAlunos(new Aluno[]{aluno1, aluno2, aluno3});
        curso2.setAlunos(new Aluno[]{aluno1, aluno2, aluno3});
        curso3.setAlunos(new Aluno[]{aluno1, aluno2, aluno3});

        aluno1.imprime();
        System.out.println("---");
        aluno2.imprime();
        System.out.println("---");
        aluno3.imprime();

        curso1.imprime();
        System.out.println("---");
        curso2.imprime();
        System.out.println("---");
        curso3.imprime();

    }
}
