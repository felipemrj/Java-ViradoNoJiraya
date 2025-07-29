package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício19.domain;

public class Computador {
    public String marca;
    public String modelo;
    public int ano;

    public void atualizarModelo(String novoModelo) {
        if (novoModelo.equals(modelo)) {
            return;
        }
        modelo = novoModelo;
    }
}
