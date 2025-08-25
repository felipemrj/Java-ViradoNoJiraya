package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício03.domain;

public class Computador extends Produto {
    private final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
