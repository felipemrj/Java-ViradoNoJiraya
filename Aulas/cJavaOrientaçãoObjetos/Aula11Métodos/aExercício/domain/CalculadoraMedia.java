package cJavaOrientaçãoObjetos.Aula11Métodos.aExercício.domain;

public class CalculadoraMedia {
    public void calcularMedia(double[] salarios) {
        double total = 0, media = 0;
        for (double salario : salarios) {
            total+= salario;
        }
        media = total / salarios.length;
        System.out.printf("Média salarial: %.2fR$", media);
    }
}