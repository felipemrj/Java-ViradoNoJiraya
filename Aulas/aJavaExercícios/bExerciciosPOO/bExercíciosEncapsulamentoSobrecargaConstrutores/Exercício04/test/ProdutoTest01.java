package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício04.test;

import aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício04.domain.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produtoUm = new Produto("Escova", 100);

        produtoUm.aplicarDesconto(10);
        produtoUm.aplicarDesconto(20, true);
    }
}
