package aJavaExercícios.dExercíciosExceções.Exercicio04.test;

import aJavaExercícios.dExercíciosExceções.Exercicio04.domain.Leitura;

import java.io.IOException;

public class Exercicio04 {
    public static void main(String[] args) {
        try(Leitura leitor = new Leitura()) {
            System.out.println("Lendo arquivo");
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
    }
}
