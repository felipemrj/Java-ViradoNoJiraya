package bJavaIntrodução.Aula04EstruturasCondicionais;

public class PT05EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Sábado");
                break;
            case 3:
                System.out.println("Segunda");
                break;
            case 4:
                System.out.println("Terça");
                break;
            case 5:
                System.out.println("Quarta");
                break;
            case 6:
                System.out.println("Quinta");
                break;
            case 7:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
