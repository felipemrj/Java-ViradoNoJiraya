package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício18.domain;

public class Aluno {
    public String nome;
    public double nota;

    public static double mediaNotas(double... notas) {
        double total = 0;
        for (double nota : notas) {
             total += nota;
        }
        return total / notas.length;
    }
}
