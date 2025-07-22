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
}
