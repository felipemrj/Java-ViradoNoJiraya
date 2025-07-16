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



    }
}
