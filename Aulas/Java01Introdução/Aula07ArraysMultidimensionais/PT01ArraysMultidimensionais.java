package Java01Introdução.Aula07ArraysMultidimensionais;

public class PT01ArraysMultidimensionais {
    public static void main(String[] args) {
        // Arrays multidimensionais são arrays de arrays, estão linkados e podemos navegar entre todas as posições que eles tem automaticamente
        // 1, 2, 3 meses
        // 31, 28, 31dias
        // Quando declaramos um array multidimensional o primeiro [] é a base e o que ele armazena é outro array
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

        // Laço externo: percorre cada linha do array 'dias'.
        // 'i' representa o índice da linha atual.
        for (int i = 0; i < dias.length; i++) {
            // Laço interno: percorre cada coluna da linha atual.
            // 'j' representa o índice da coluna atual dentro da linha 'i'.
            for (int j = 0; j < dias[i].length; j++) {
                // Aqui acessamos o elemento na posição [i][j] do array.
                // Ou seja, estamos pegando o valor da linha 'i' e coluna 'j'.
                System.out.println(dias[i][j]); // Exibe o valor encontrado
            }
        }

        /*
        Teste de mesa do laço duplo:

        i=0, j=0 -> dias[0][0] = 31
        i=0, j=1 -> dias[0][1] = 28
        i=0, j=2 -> dias[0][2] = 31

        i=1, j=0 -> dias[1][0] = 31
        i=1, j=1 -> dias[1][1] = 28
        i=1, j=2 -> dias[1][2] = 31

        i=2, j=0 -> dias[2][0] = 31
        i=2, j=1 -> dias[2][1] = 28
        i=2, j=2 -> dias[2][2] = 31

        */

        /*
       Exemplo visual de um array multidimensional int[3][3]:

                               0   1   2
                             ┌───┬───┬───┐
                             │   │   │   │   ← Array externo (linha)
                             └─┬─┴─┬─┴─┬─┘
                   ____________│   │   │___________
                   │               │               │
                   ▼               ▼               ▼
            ┌───┬───┬───┐    ┌───┬───┬───┐    ┌───┬───┬───┐
        0 → │ 0 │ 0 │ 0 │ 1 →│ 0 │ 0 │ 0 │ 2 →│ 0 │ 0 │ 0 │
            └───┴───┴───┘    └───┴───┴───┘    └───┴───┴───┘
              0   1   2        0   1   2        0   1   2

       Para acessar um elemento: dias[linha][coluna]
       Ex: dias[1][2] → acessa o elemento da linha 1, coluna 2

    */
    }
}
