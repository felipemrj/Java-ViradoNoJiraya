package aJavaExercícios.dExercíciosExceções.Exercicio07.test;

public class Exercicio07 {
    public static void main(String[] args) {
        int[] inteiros = {18, -3, 0};

        try {
            System.out.println(inteiros[0] / inteiros[2]);
            System.out.println(inteiros[9]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Erro: " + e);
        } finally {
            System.out.println("Encerrando");
        }
    }
}
