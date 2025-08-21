package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício04.domain;

public class Documento implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento");
    }
}
