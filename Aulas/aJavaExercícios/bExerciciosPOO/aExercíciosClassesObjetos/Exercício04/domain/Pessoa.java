package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício04.domain;

public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;

    public static boolean mesmaReferencia(Pessoa p1, Pessoa p2) {
        if (p1 == p2) {
            return true;
        }
        return false;
    }
}
