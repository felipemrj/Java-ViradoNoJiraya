package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício05.domain;

public class Calculadora {
    public void somarDoisNum(double numUm, double numDois) {
        System.out.println(numUm + numDois);
    }
    public void subtrairDoisNum(double numUm, double numDois) {
        System.out.println(numUm - numDois);
    }
    public void multiplicarDoisNum(double numUm, double numDois) {
        System.out.println(numUm * numDois);
    }
    public void dividirDoisNum(double numUm, double numDois) {
        if (numDois == 0){
            System.out.println("ERRO: Divisão por 0");
            return;
        }
        System.out.println(numUm / numDois);
    }
    public void somarNumeros(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
