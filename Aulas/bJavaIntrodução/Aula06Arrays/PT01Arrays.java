package bJavaIntrodução.Aula06Arrays;

public class PT01Arrays {
    public static void main(String[] args) {
        // Arrays são variáveis de tipo referência, utilizadas para armazenar mais de um valor                     0    1   2
        // Os espaços dentro de uma array são indexados, começando por 0. Um array com 3 espaços tem os índices:  {21, 15, 30}

        int[] idades = new int[3];

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 30;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
