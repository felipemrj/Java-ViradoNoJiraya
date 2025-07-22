package Java01Introdução.Aula03Operadores;

public class PT04Atribuição {
    public static void main(String[] args) {
        // Operadores de Atribuição: =, +=, -=, *=, /=, %=
        double wageBonus = 1800;
        wageBonus += 1000;
        wageBonus -= 1000;
        wageBonus *= 2;
        wageBonus /= 2;
        wageBonus %= 2;
        System.out.println(wageBonus);

        // Operadores Unários: ++, --
        int counter = 1;
        counter++;
        counter--;
        System.out.println(counter);

        int counterTwo = 0;
        System.out.println(counterTwo++);
        System.out.println(counterTwo);

        int counterThree = 0;
        System.out.println(++counterThree);

        /*
        O operador `++` pode ser usado antes (pré-incremento) ou depois (pós-incremento) da variável.

        - Pré-incremento (`++variável`): incrementa o valor antes de usar na expressão.
        - Pós-incremento (`variável++`): usa o valor atual na expressão e só depois incrementa.

        Exemplo:

        int x = 5;
        System.out.println(++x); // Imprime 6 (incrementa antes)
        System.out.println(x++); // Imprime 6 (incrementa depois)
        System.out.println(x);   // Imprime 7

         */

    }
}
