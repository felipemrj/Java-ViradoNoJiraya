package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício04.test;

import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício04.domain.PagamentoCartao;
import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício04.domain.PagamentoPix;

public class PagamentoTest01 {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        PagamentoPix pagamentoPix = new PagamentoPix();

        pagamentoCartao.realizarPagamento(200);
        pagamentoPix.realizarPagamento(359.99);
    }
}
