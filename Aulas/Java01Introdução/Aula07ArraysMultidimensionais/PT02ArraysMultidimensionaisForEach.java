package Java01Introdução.Aula07ArraysMultidimensionais;

public class PT02ArraysMultidimensionaisForEach {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // Laço for-each externo: percorre cada array interno presente em 'dias'.
        // A variável temporária 'arrBase' referencia, a cada iteração, um dos arrays internos (ou seja, uma linha do array multidimensional).
        for (int[] arrBase : dias) {
            // Laço for-each interno: percorre cada elemento do array referenciado por 'arrBase'.
            // A variável temporária 'num' referencia, a cada iteração, um valor inteiro presente na linha atual.
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        /* Teste de mesa do for-each:

        Iteração 1:
        arrBase referencia dias[0] -> [31, 28, 31]
            num = 31
            num = 28
            num = 31

        Iteração 2:
        arrBase referencia dias[1] -> [31, 28, 31]
            num = 31
            num = 28
            num = 31

        Iteração 3:
        arrBase referencia dias[2] -> [31, 28, 31]
            num = 31
            num = 28
            num = 31 */

    }
}
