package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício14.domain;

public class Professor {
    public String nome;
    public String disciplina;
    public int horasAula;

    public boolean comparaDisciplina (String disciplinaComparada) {
        if (disciplinaComparada.equals(disciplina)) {
            return true;
        }
        return false;
    }
}
