package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício02.domain;

public class Usuario implements Identificavel, Registravel {
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void registrar(int id) {
        this.id = id;
    }
}
