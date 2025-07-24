package bJavaIntrodução.Aula05EstruturasRepeticao;

public class PT04EstruturasRepeticaoExercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorCarro = 50000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            System.out.println("Dividido em " + parcela + "x, o valor da parcela é: " + valorParcela + " R$");
            if (valorParcela <= 1000) {
                break;
            }
        }


    }
}
