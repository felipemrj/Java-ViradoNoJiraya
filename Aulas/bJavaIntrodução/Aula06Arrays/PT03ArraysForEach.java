package bJavaIntrodução.Aula06Arrays;

public class PT03ArraysForEach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int num : numeros2) {
            System.out.println(num);
        }


        for (int numero : numeros) {
            System.out.println(numero);
        }
        /*

        para cada numero na lista de numeros
        for each number in the list of numbers

        /* O for-each é uma forma simplificada de percorrer todos os elementos de um array ou coleção.
        Ele não usa índices, tornando o código mais limpo e fácil de ler.
        Exemplo: para cada elemento 'num' dentro do array 'numeros2', execute o bloco abaixo.
        Não é possível acessar o índice do elemento diretamente usando for-each. */

    }
}
