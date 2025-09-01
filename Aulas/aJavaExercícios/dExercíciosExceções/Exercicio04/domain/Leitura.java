package aJavaExercícios.dExercíciosExceções.Exercicio04.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitura implements Closeable, AutoCloseable {
    public void lerArquivo() {
        System.out.println("Lendo arquivo");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Fechando arquivo");
    }
}
