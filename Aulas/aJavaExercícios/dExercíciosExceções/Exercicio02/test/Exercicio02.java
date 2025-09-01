package aJavaExercícios.dExercíciosExceções.Exercicio02.test;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] inteiros = null;

        try {
            System.out.println(inteiros[3]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Erro: " + e);
        }
    }
}
