package aJavaExercícios.cExercíciosLógicaProgramação.Exercício12.domain;

public class FormaPagamento {
    public static void selecionarForma(int opcao, double valor) {
        switch (opcao) {
            case 1:
                System.out.println(CalcularPagamento.A_VISTA_DINHEIRO_PIX.calcularPagamento(valor));
                break;
            case 2:
                System.out.println(CalcularPagamento.A_VISTA_CREDITO.calcularPagamento(valor));
                break;
            case 3:
                System.out.println(CalcularPagamento.PARCELADO_DUAS.calcularPagamento(valor));
                break;
            case 4:
                System.out.println(CalcularPagamento.PARCELADO_TRES_OU_MAIS.calcularPagamento(valor));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
