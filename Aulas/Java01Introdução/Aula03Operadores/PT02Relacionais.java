package Java01Introdução.Aula03Operadores;

public class PT02Relacionais {
    public static void main(String[] args) {
        /*
         Operadores relacionais: <, >, <=, >=, ==, !=
         São operadores utilizados para fazer comparações e sempre retornam valores booleanos(true or false)
        */

        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println(isTenGreaterThanTwenty);

        boolean isTenLessThanTwenty = 10 < 20;
        System.out.println(isTenLessThanTwenty);

        boolean isTenLessOrEqualToTwenty = 10 <= 20;
        System.out.println(isTenLessOrEqualToTwenty);

        boolean isTenGreaterOrEqualToTwenty = 10 >= 20;
        System.out.println(isTenGreaterOrEqualToTwenty);

        boolean isTenEqualToTwenty = 10 == 20;
        System.out.println(isTenEqualToTwenty);

        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println(isTenDifferentFromTwenty);

    }
}
