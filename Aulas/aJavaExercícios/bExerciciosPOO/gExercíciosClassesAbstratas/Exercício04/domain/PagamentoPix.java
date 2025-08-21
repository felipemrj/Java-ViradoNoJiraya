package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício04.domain;

public class PagamentoPix extends Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println(valor + "R$ pago com pix.");
    }
}
