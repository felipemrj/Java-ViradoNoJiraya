package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.domain.Computador;
import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.domain.Produto;
import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.domain.Televisao;
import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.domain.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto televisao = new Televisao("Samsung", 5000);
        Produto computador = new Computador("Macbook", 20000);
        Produto tomate = new Tomate("Tomate cereja", 20);

        System.out.println(televisao.calcularImposto());
        System.out.println(computador.calcularImposto());
        System.out.println(tomate.calcularImposto());
    }
}
