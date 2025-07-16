public class Aula03PT3OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores Lógicos: && (and) || (or) ! (not)
        int age = 35;
        double wage = 3500;
        boolean isInsideLawGreaterThanThirty = age > 30 && wage >= 4612;
        boolean isInsideLawLesserThanThirty = age < 30 && wage >= 3381;
        System.out.println(isInsideLawGreaterThanThirty);
        System.out.println(isInsideLawLesserThanThirty);

        double totalValueChecking = 200;
        double totalValueSavings = 3000;
        double valuePlaystation = 5000;
        boolean isPlaystationBuyable = totalValueChecking > valuePlaystation || totalValueSavings > valuePlaystation;
        System.out.println(isPlaystationBuyable);

        /*
        Os operadores lógicos em Java permitem combinar ou inverter condições booleanas:

        && (E lógico): retorna true apenas se ambas as condições forem verdadeiras.
        Exemplo: age > 30 && wage >= 4612 só será true se age > 30 e wage >= 4612.

        || (OU lógico): retorna true se pelo menos uma das condições for verdadeira.
        Exemplo: totalValueChecking > valuePlaystation || totalValueSavings > valuePlaystation será true se uma das contas tiver saldo suficiente.

        ! (NÃO lógico): inverte o valor booleano da condição.
        Exemplo: !isPlaystationBuyable será true se isPlaystationBuyable for false.

        Esses operadores são usados para criar regras de decisão mais complexas em programas.

        Tabela da verdade dos operadores lógicos em Java:

        |   A    |   B    | A && B | A || B |  !A   |
        |--------|--------|--------|-------|-------|
        | true   | true   | true   | true  | false |
        | true   | false  | false  | true  | false |
        | false  | true   | false  | true  | true  |
        | false  | false  | false  | false | true  |

        - && (E lógico): true apenas se ambos forem true.
        - || (OU lógico): true se pelo menos um for true.
        - ! (NÃO lógico): inverte o valor booleano.
        */

    }
}
