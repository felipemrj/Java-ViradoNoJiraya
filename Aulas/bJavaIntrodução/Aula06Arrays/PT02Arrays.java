package bJavaIntrodução.Aula06Arrays;

public class PT02Arrays {
    public static void main(String[] args) {
        // Os valores padrões(quando não foram inicializados) alocados nos indices de uma array são:
        // byte, short, int, long, float e double: 0
        // char '\u0000' ' '
        // boolean: false
        // String ou qualquer outro tipo de referência: null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
