package aJavaExercícios.cExercíciosLógicaProgramação.Exercício09.domain;

public class IndiceMassaCorporal {
    public static void calculaImc(double peso, double altura) {
        double imc;
        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal(parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II(Severa)");
        } else {
            System.out.println("Obesidade grau III(Mórbida)");
        }
    }
}
