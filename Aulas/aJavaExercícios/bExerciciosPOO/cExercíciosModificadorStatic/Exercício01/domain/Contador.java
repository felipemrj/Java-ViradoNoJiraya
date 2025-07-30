package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício01.domain;

public class Contador {
    private static int totalContadores;

    public Contador() {
        totalContadores += 1;
    }

    public static int getTotalContadores() {
        return Contador.totalContadores;
    }
}
