package aJavaExercícios.cExercíciosLógicaProgramação.Exercício18.test;

public class Exercicio18 {
    public static void main(String[] args) {
        double alturaFrancisco = 1.5, alturaSara = 1.1;
        int contador = 0, anos;

        while (alturaSara <= alturaFrancisco) {
            alturaSara += 0.03;
            alturaFrancisco += 0.02;
            contador++;
        }

        anos = contador;

        System.out.printf("Serão necessários %d anos para Sara ultrapassar a altura de Francisco.", anos);
    }
}
