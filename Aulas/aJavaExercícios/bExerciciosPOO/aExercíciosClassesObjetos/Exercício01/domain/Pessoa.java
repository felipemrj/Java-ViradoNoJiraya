package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício01.domain;

public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;

    public boolean maiorDeIdade() {
        if (idade >= 18) {
            return true;
        }
        else return false;
    }
}
