package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício04.test;

import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício04.domain.Documento;
import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício04.domain.Foto;

public class ImprimivelTest01 {
    public static void main(String[] args) {
        Documento doc = new Documento();
        Foto foto = new Foto();

        doc.imprimir();
        foto.imprimir();
    }
}
