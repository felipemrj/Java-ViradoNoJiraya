package Java01Introdução.Aula04EstruturasCondicionais;

public class Aula04PT5EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo
        int day = 4;

        switch (day) {
            case 1,7:
                System.out.println("FDS");
                break;
            case 2,3,4,5,6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
