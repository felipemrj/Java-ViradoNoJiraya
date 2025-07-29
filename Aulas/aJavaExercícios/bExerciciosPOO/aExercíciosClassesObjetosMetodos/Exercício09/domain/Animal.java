package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício09.domain;

public class Animal {
    public String especie;
    public int idade;
    public String habitat;

    public void emitirSom() {
        if (especie.equals("cachorro")) {
            System.out.println("au au!");
        } else if (especie.equals("gato")) {
            System.out.println("miau");
        } else {
            System.out.println("som desconhecido");
        }
    }
}
