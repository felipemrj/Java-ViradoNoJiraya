package Java01Introdução.Aula03Operadores;

public class PT01Aritméticos {
    public static void main(String[] args) {
        // Operadores Aritméticos: + / - * %
        int numberOne = 10;
        int numberTwo = 20;
        int result = numberTwo - numberOne;
        int module = 20 % 2;

        System.out.println(numberTwo - numberOne);
        System.out.println(numberTwo + numberOne);
        System.out.println(result);
        System.out.println(module);

        /* O operador "+" é um operador que realiza soma e também concatenação, caso haja uma String,
        a partir dela ele irá concatenar os valores invés de somar */
        System.out.println("Valor " + numberTwo + numberOne); // Saída: Valor 2010
        System.out.println(numberTwo + numberOne + " Valor " + numberTwo + numberOne); // Saída: 30 Valor 2010


        /* O resultado da divisão de números inteiros, sempre será um número inteiro.
         Se um dos dois números for double, o resultado será um número decimal. */
        double division = numberOne / numberTwo;
        System.out.println(division);
    }
}
