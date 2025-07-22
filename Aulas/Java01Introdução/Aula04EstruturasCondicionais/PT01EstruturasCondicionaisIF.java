package Java01Introdução.Aula04EstruturasCondicionais;

public class PT01EstruturasCondicionaisIF {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Pode comprar bebida alcoolica");
        }

        boolean isAuthorized = age >= 18;
        if (isAuthorized) {
            System.out.println("Autorizado a comprar bebida");
        }

        if (!isAuthorized) {
            System.out.println("Não autorizado a comprar bebida");
        }

        /*
        O `if` é uma estrutura condicional que executa um bloco de código apenas se a condição especificada for verdadeira.
        No exemplo, verifica se a idade é maior ou igual a 18 para permitir a compra de bebida alcoólica.

        Se a condição dentro do `if` for verdadeira, o código dentro das chaves será executado.
        Caso contrário, será ignorado.
         */
    }
}
