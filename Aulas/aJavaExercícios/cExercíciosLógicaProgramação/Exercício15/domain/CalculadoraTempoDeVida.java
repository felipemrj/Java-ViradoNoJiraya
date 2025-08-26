package aJavaExercícios.cExercíciosLógicaProgramação.Exercício15.domain;

public class CalculadoraTempoDeVida {
    public static final int ANO_ATUAL = 2025;

    public static void calculaTempoDeVida(int anoNascimento, boolean fezAniversario) {
        int anos;

        if (fezAniversario) {
            anos = ANO_ATUAL - anoNascimento;
        } else {
            anos = ANO_ATUAL - anoNascimento - 1;
        }


        System.out.println(anos);
    }
}

