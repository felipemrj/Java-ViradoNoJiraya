package cJavaOrientaçãoObjetos.Aula11Métodos.test;

import cJavaOrientaçãoObjetos.Aula11Métodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(2, 2);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros(2, 2));
        System.out.println("-------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 5);
    }
}
