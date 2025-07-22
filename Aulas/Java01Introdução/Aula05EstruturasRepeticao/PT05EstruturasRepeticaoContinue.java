package Java01Introdução.Aula05EstruturasRepeticao;

public class PT05EstruturasRepeticaoContinue {
    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcela = 50000; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Dividido em " + parcela + "x, o valor da parcela é de " + valorParcela + "R$");
        }
    }
}
