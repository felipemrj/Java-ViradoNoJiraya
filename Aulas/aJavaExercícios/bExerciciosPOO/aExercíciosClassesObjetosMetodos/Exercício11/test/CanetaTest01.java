package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício11.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício11.domain.Caneta;

public class CanetaTest01 {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta();
        Caneta canetaDois = new Caneta();

        canetaUm.cor = "Azul";
        canetaUm.espessuraPonta = 12.5;

        System.out.println("Caneta 1: ");
        System.out.println(canetaUm.cor);
        System.out.println(canetaUm.espessuraPonta);

        canetaDois = canetaUm;
        canetaDois.cor = "Vermelho";

        System.out.println("\nCaneta 1: ");
        System.out.println(canetaUm.cor);
        System.out.println(canetaUm.espessuraPonta);

        canetaUm.trocarCor("Laranja");

        // Ao atribuir canetaUm a canetaDois, estamos atribuindo à variável de referência canetaDois
        // o mesmo espaço de memória onde está a canetaUm, portanto ao modificar atributos de canetaDois
        // o atributo de canetaUm também é alterado




    }
}
