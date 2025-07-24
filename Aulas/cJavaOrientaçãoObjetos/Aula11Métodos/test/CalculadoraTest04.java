package cJavaOrientaçãoObjetos.Aula11Métodos.test;

import cJavaOrientaçãoObjetos.Aula11Métodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("-------------");

        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
