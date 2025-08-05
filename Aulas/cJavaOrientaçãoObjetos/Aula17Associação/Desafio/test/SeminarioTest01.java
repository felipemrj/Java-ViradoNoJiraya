package cJavaOrientaçãoObjetos.Aula17Associação.Desafio.test;

import cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain.Aluno;
import cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain.Local;
import cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain.Professor;
import cJavaOrientaçãoObjetos.Aula17Associação.Desafio.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua Vazia");
        Local local2 = new Local("Rua Mais ou Menos");
        Local local3 = new Local("Rua Cheia");

        Aluno aluno1 = new Aluno("Felipe", 30);
        Aluno aluno2 = new Aluno("Thamyres", 33);
        Aluno aluno3 = new Aluno("João", 18);

        Seminario seminario1 = new Seminario("Seminário sem alunos", local1);
        Seminario seminario2 = new Seminario("Seminário com 1 aluno", local2, new Aluno[]{aluno1});
        Seminario seminario3 = new Seminario("Seminário com vários alunos", local3, new Aluno[]{aluno1, aluno2, aluno3});

        Professor professor1 = new Professor("Wellington", "CyberSecurity", new Seminario[]{seminario1});
        Professor professor2 = new Professor("William Suane", "Java", new Seminario[]{seminario2, seminario3});

        System.out.println("Lista de Seminários: ");
        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();
        System.out.println("-----");
        System.out.println("Lista de Alunos: ");
        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        System.out.println("-----");
        System.out.println("Lista de Professores: ");
        professor1.imprime();
        professor2.imprime();
        System.out.println("-----");

    }
}
