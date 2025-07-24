package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício14.domain;

public class ImprimeProfessor {
    public void exibeProfessor(Professor professor, double valorHora) {
        System.out.println("Professor: ");
        System.out.println(professor.nome);
        System.out.println(professor.disciplina);
        System.out.println(professor.horasAula);
        System.out.println("Salário: " + professor.horasAula * valorHora);
    }
}
