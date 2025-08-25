package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.domain;

public class Televisao extends Produto {
    private final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
