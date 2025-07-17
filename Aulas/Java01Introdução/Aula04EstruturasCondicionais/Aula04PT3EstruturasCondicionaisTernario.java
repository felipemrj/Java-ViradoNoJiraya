package Java01Introdução.Aula04EstruturasCondicionais;

public class Aula04PT3EstruturasCondicionaisTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000;
        double wage = 6000;
        String donateMessage = "Eu vou doar 500 pro DevDojo";
        String noDonateMessage = "Ainda não tenho condições, mas vou ter!";
        // (condicao) ? verdadeiro : falso
        String result = (wage > 5000) ? donateMessage : noDonateMessage;
        System.out.println(result);

        // else if no ternário
        // (condicao) ? verdadeiro : (condicao) ? verdadeiro : falso
        int age = 18;
        String categoria = (age < 15) ? "Categoria Infantil" : (age >= 15 && age < 18) ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

        // Operador ternário deve ser usado onde você tem uma situação de if else simples



    }
}
