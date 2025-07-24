package Java02OrientaçãoObjetos.Aula11Métodos.domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int numeroUm, int numeroDois) {
        System.out.println(numeroUm * numeroDois);
    }

    public double divideDoisNumeros(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            return 0;
        } else {
            return numeroUm / numeroDois;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(numeroUm / numeroDois);
    }

    public void alteraDoisNumeros(int numeroUm, int numeroDois) {
        numeroUm = 99;
        numeroDois = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numeroUm);
        System.out.println("Num2 " + numeroDois);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
