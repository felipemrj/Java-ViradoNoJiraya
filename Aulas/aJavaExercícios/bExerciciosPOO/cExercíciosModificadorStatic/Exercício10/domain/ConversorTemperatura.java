package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício10.domain;

public class ConversorTemperatura {
    public static void converteCelsius(double valorCelsius) {
        double fahrenheit = (valorCelsius * (9.0 / 5) + 32);
        System.out.printf("%.2fºC são %.2fºF", valorCelsius, fahrenheit);
    }

    public static void converteFahrenheit(double valorFahrenheit) {
        double celsius = (valorFahrenheit - 32) * 5 / 9;
        System.out.printf("%.2fº F são %.2fº C", valorFahrenheit, celsius);

    }
}
