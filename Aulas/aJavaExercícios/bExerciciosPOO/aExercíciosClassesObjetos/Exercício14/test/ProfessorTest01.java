package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício14.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício14.domain.ImprimeProfessor;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício14.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professorUm = new Professor();
        Professor professorDois = new Professor();
        ImprimeProfessor impressora = new ImprimeProfessor();

        double salarioHora = 20;

        professorUm.nome = "Felipe";
        professorUm.disciplina = "Lógica";
        professorUm.horasAula = 20;

        professorDois.nome = "Thamyres";
        professorDois.disciplina = "Perfusão";
        professorDois.horasAula = 65;

        impressora.exibeProfessor(professorUm, salarioHora);
        impressora.exibeProfessor(professorDois, salarioHora);
    }
}
