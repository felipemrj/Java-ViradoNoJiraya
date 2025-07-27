package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício02.domain;

import java.util.Objects;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public void imprimirResumo() {
        if (titulo.isEmpty()) {
            System.out.println("Livro inválido");
            return;
        }
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anoPublicacao);
    }
}
