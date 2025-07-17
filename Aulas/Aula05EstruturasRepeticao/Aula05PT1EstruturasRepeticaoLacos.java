package Aula05EstruturasRepeticao;

public class Aula05PT1EstruturasRepeticaoLacos {
    public static void main(String[] args) {
        // Estruturas de Repetição: while, do while, for
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println();

        counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 10);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
