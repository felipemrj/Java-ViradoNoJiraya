package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício05.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício05.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double a = 4, b = 3;

        calculadora.somarDoisNum(a, b);
        calculadora.subtrairDoisNum(a, b);
        calculadora.multiplicarDoisNum(a, b);
        calculadora.dividirDoisNum(a, b);
    }
}
